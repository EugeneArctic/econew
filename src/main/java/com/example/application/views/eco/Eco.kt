package com.example.application.views.eco

import com.example.application.views.MainLayout
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.HasStyle
import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.dialog.Dialog
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.littemplate.LitTemplate
import com.vaadin.flow.component.menubar.MenuBar
import com.vaadin.flow.component.menubar.MenuBarVariant
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.select.Select
import com.vaadin.flow.component.template.Id
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias


@PageTitle("Eco")
@Route(value = "eco", layout = MainLayout::class)
@RouteAlias(value = "", layout = MainLayout::class)
@Tag("hello-world-view")
@JsModule("./views/helloworld/hello-world-view.ts")
class Eco : LitTemplate(), HasComponents, HasStyle {
    @Id
    private val sortBy: Select<String>? = null

    init {

        add(VerticalLayout().apply {
            val menuBar = MenuBar()
            val wasteItem = menuBar.addItem("Waste and recycling").apply { width = "20em" }
            val waterItem =  menuBar.addItem("Water and sewers").apply { width = "20em" }
            val newsItem  = menuBar.addItem("News").apply { width = "20em" }
            val homeLandItem  = menuBar.addItem("District").apply { width = "20em" }
            val loginItem  =menuBar.addItem("Login").apply { width = "20em" }

            val menuLayout = HorizontalLayout().apply {
                menuBar.addThemeVariants(MenuBarVariant.LUMO_TERTIARY)
                addAndExpand(menuBar)
                defaultVerticalComponentAlignment = FlexComponent.Alignment.CENTER
                maxWidth = "50%"
            }

            loginItem.addClickListener {
                val enter = Button("Enter")
                val login = TextField("Login")
                val pass = TextField("Password")
                val dialog =  ecoDialogFinal(ecoDialog("DIGIWASTE",p="Personal account",login,pass,enter))
                dialog.open()
                val map = mapOf<String,String>("Eugene" to "1111", "Danches" to "1111", "Vava" to "111" , "Alex" to "1111")


                enter.addClickListener {
                    if (login.value in map.keys && pass.value in map.values){
                        dialog.close()
                    } else {Notification.show("Invalid password", 700, Notification.Position.MIDDLE)}
                }
            }


            add(menuLayout)


            addClassNames("hello-world-view", "flex", "flex-col", "h-full")
//            sortBy!!.setItems("Popularity", "Newest first", "Oldest first")
//            sortBy.value = "Popularity"
            add(
                EcoCard(
                    "Biowaste",
                    "https://www.hsy.fi/globalassets/jatteet-ja-kierratys/kuvat/jate-9150.jpg?w=1600",
                    "Biowaste is decomposing and compostable food and kitchen waste. Easily decomposed fibrous materials can also be sorted into biowaste."
                )
            )
        add(
            EcoCard(
                   "Map",
                 "https://www.hsy.fi/globalassets/jatteet-ja-kierratys/kuvat/jate-9150.jpg?w=1600",
            "This is map"
            )
        )
//        add(
//            EcoCard(
//                 "River between mountains",
//                  "https://images.unsplash.com/photo-1536048810607-3dc7f86981cb?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=375&q=80"
//            )
//        )
//        add(
//            EcoCard(
//                 "Milky way on mountains",
//                  "https://images.unsplash.com/photo-1515705576963-95cad62945b6?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=750&q=80"
//            )
//        )
//        add(
//            EcoCard(
//                 "Mountain with fog",
//                  "https://images.unsplash.com/photo-1513147122760-ad1d5bf68cdb?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"
//            )
//        )
//        add(
//            EcoCard(
//                 "Mountain at night",
//                  "https://images.unsplash.com/photo-1562832135-14a35d25edef?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=815&q=80"
//            )
//        )
        })
    }
}

class ecoDialogFinal (component: Component): Dialog() {
    init {
        isCloseOnEsc = false
        isCloseOnOutsideClick = false
        add(component)

    }


}private fun ecoDialog(t: String, p: String, login: TextField,pass:TextField ,buttonOk: Button): VerticalLayout {
    return VerticalLayout(H2(t), Paragraph(p),login, pass, HorizontalLayout().apply {
        addAndExpand(buttonOk)

    })
}