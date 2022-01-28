package com.example.application.views.eco.pages

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

@Route (value = "acc")
@Viewport(value = "1024")

class PersonalAccount():VerticalLayout()
{
    init {
        add(menuLayout())
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

}

