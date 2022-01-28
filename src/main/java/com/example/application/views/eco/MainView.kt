package com.example.application.views.eco

import com.example.application.views.eco.service.*
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.dialog.Dialog
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Header
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.menubar.MenuBar
import com.vaadin.flow.component.menubar.MenuBarVariant
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias


@PageTitle("Eco")
@Route(value = "eco")
@RouteAlias(value = "")
//@Tag("hello-world-view")
//@JsModule("./views/helloworld/hello-world-view.ts")
class MainView:VerticalLayout()  {

    //LitTemplate(), HasComponents, HasStyle
    init {

        val menuLayout = menuLayout()

        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER

        val mainVerticalLayout = VerticalLayout().apply {
            defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
        //style["margin-left"] = "10em"
        maxWidth = "70%"
       // style["margin-bottom"]= "1em"
        //style["background"]= "linear-gradient(to top left, #ffffff 0%, #ccffcc 100%"
        //style["background-image"]= "https://images.unsplash.com/photo-1617957718587-60a442884bee?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=3132&q=80"
        style["border-radius"] ="16px"
        style["box-shadow"] ="3px 42px 22px 35px rgba(127, 180, 145, 0.27)"
        style["background-color"]= "transparent"

        val firstCard = EcoCard(
            TopicEnum.FirstTopic.title,
            TopicEnum.FirstTopic.Text,
            TopicEnum.FirstTopic.Text,
            TopicEnum.FirstTopic.ImageUrl
        )

        val secondCard = EcoCard(
            TopicEnum.SecondTopic.title,
            TopicEnum.SecondTopic.Text,
            TopicEnum.SecondTopic.Text,
            TopicEnum.SecondTopic.ImageUrl
        )


        val thirdCard = EcoCard(
            TopicEnum.ThirdTopic.title,
            TopicEnum.ThirdTopic.Text,
            TopicEnum.ThirdTopic.Text,
            TopicEnum.ThirdTopic.ImageUrl
        )

        val fourthCard = EcoCard(
            TopicEnum.FourthTopic.title,
            TopicEnum.FourthTopic.Text,
            TopicEnum.FourthTopic.Text,
            TopicEnum.FourthTopic.ImageUrl
        )


        val firstLineCard = HorizontalLayout().apply {
            maxWidth = "50%"
        }
        val firstRowCard = VerticalLayout().apply {
            maxWidth = "50%"
            add(firstCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.FirstTopic.route)
            }
        }

        val secondRowCard = VerticalLayout().apply {
            maxWidth = "50%"
            add(secondCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.FirstTopic.route)
            }
        }

        val secondLineCard = HorizontalLayout().apply {
            maxWidth = "50%"
        }

        val thirdRowCard = VerticalLayout().apply {
            maxWidth = "50%"
            add(thirdCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.FirstTopic.route)
            }
        }

        val fourthRowCard = VerticalLayout().apply {
            maxWidth = "50%"
            add(fourthCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.FirstTopic.route)
            }
        }
        firstLineCard.addAndExpand(firstRowCard,secondRowCard)
        secondLineCard.addAndExpand(thirdRowCard,fourthRowCard)
            add(firstLineCard,secondLineCard)
        }

        add(menuLayout,mainVerticalLayout)

    }

//    class DialogFromLayout(component: Component) : Dialog() {
//        init {
//            isCloseOnEsc = false
//            isCloseOnOutsideClick = false
//            add(component)
//        }
//    }
//
//    private fun ecoDialog(t: String, p: String, login: TextField, pass: TextField, buttonOk: Button): VerticalLayout {
//        return VerticalLayout(H2(t), Paragraph(p), login, pass, HorizontalLayout().apply {
//            addAndExpand(buttonOk)
//        })
//    }
//
//    private fun checkPassword(funOnClick:()->Unit) {
//        val enter = Button("Enter")
//        val login = TextField("Login")
//        val pass = TextField("Password")
//        val dialog = DialogFromLayout(ecoDialog("DIGIWASTE", p = "Personal account", login, pass, enter))
//        dialog.open()
//        enter.addClickListener {
//            if (login.value in LoginEnum.values().map { it.login } && pass.value in LoginEnum.values()
//                    .map { it.pass }) {
//                dialog.close()
//                funOnClick()
//            } else {
//                Notification.show("Invalid password", 700, Notification.Position.MIDDLE)
//            }
//        }
//    }
//
//   fun menuLayout():HorizontalLayout
//    {
//        val header = H2("DIGIWASTE").apply { style["color"] = "#7fb491"
//            style["margin-top"] ="0"
//            style["margin-bottom"] ="0"}
//
//    val img =
//        Image().apply { src = "https://i.postimg.cc/xddMqyfZ/photo-2022-01-28-19-57-53-removebg-preview.png"
//    style["width"]="50px"
//        style["height"]="50px"
//        style["margin-top"] ="0"
//            style["margin-bottom"] ="0"
//    }
//
//        val buttonHome = Button("Home").apply {
//            addThemeVariants(ButtonVariant.LUMO_TERTIARY)
//            style["color"] = "#7fb491"
//            icon = Icon(VaadinIcon.HOME)
//            isIconAfterText = true
//
//        }
//        val newsHome = Button("News").apply {
//            addThemeVariants(ButtonVariant.LUMO_TERTIARY)
//            style["color"] = "#7fb491"
//            icon = Icon(VaadinIcon.NEWSPAPER)
//            isIconAfterText = true
//        }
//        val loginItem = Button("Login").apply {
//            addThemeVariants(ButtonVariant.LUMO_TERTIARY)
//            style["color"] = "#7fb491"
//            icon = Icon(VaadinIcon.KEY)
//            isIconAfterText = true
//
//
//        }
//
//        loginItem.addClickListener {
//            checkPassword { UI.getCurrent().navigate(Routes.PersonalAccount.route) }
//        }
//        return HorizontalLayout(img,header,buttonHome, newsHome, loginItem).apply {  style["margin-top"] ="4em"
//            style["margin-bottom"] ="2em"}
//    }

}