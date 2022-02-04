package com.example.application.views.eco.pages

import com.example.application.views.MainLayout
import com.example.application.views.eco.MainView
import com.example.application.views.eco.mutablePersonList
import com.example.application.views.eco.service.*
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.grid.Grid
import com.vaadin.flow.component.grid.GridVariant
import com.vaadin.flow.component.html.*
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.page.Viewport
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.data.provider.DataProvider
import com.vaadin.flow.data.provider.ListDataProvider
import com.vaadin.flow.router.Route

@Route (value = "acc",layout = MainLayout::class)

class PersonalAccount():VerticalLayout()
{
    init {

        val enter = Button("Enter")
        val login = TextField("Login")
        val pass = TextField("Password")

        val dialog = DialogFromLayout(ecoDialog("DIGIWASTE", p = "Personal account", login, pass, enter))
        dialog.open()
        enter.addClickListener {
            if (login.value in LoginEnum.values().map { it.login } && pass.value in LoginEnum.values()
                    .map { it.pass }) {
                dialog.close()
            } else {
                Notification.show("Invalid password", 700, Notification.Position.MIDDLE)
            }
        }

        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
        val header = H1("Welcome to your personal account")
        add(header)


        add(mainVerticalLayout().apply {
        add(HorizontalLayout().apply {
            add(VerticalLayout().apply {
               add(Image().apply { src = "https://images.unsplash.com/photo-1599202889720-cd3c0833efa1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=80" })
                add(Paragraph("See you on the future meeting in our community on 28th January 2022!"))
            })


            add(VerticalLayout().apply {
             val p = Paragraph("Here you can meet people, who wants to care about nature too.\n" +
            "Also we add people which are near you:\n")
            val grid = Grid(Person::class.java).apply {   addThemeVariants(GridVariant.LUMO_NO_BORDER) }
            grid.dataProvider = ListDataProvider(mutablePersonList)
                grid.setColumns("name","adress","phone")
            add(p,grid)
            })
         })
        })

    }
    private fun ecoDialog(t: String, p: String, login: TextField, pass: TextField, buttonOk: Button): VerticalLayout {
        return VerticalLayout(H2(t), Paragraph(p), login, pass, HorizontalLayout().apply {
            addAndExpand(buttonOk)
        })}

}

