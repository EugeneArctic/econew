package com.example.application.views.eco.service

import com.example.application.views.eco.MainView
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.dialog.Dialog
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.notification.Notification
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.textfield.TextField



class DialogFromLayout(component: Component) : Dialog() {
    init {
        isCloseOnEsc = false
        isCloseOnOutsideClick = false
        add(component)
    }
}


fun menuLayout(): HorizontalLayout
{
    val header = H2("DIGIWASTE").apply { style["color"] = "#7fb491"
        style["margin-top"] ="0"
        style["margin-bottom"] ="0"}

    val img =
        Image().apply { src = "https://i.postimg.cc/xddMqyfZ/photo-2022-01-28-19-57-53-removebg-preview.png"
            style["width"]="50px"
            style["height"]="50px"
            style["margin-top"] ="0"
            style["margin-bottom"] ="0"
        }

    val buttonHome = Button("Home").apply {
        addThemeVariants(ButtonVariant.LUMO_TERTIARY)
        style["color"] = "#7fb491"
        icon = Icon(VaadinIcon.HOME)
        isIconAfterText = true
        addClickListener {  UI.getCurrent().navigate("") }

    }
    val newsHome = Button("News").apply {
        addThemeVariants(ButtonVariant.LUMO_TERTIARY)
        style["color"] = "#7fb491"
        icon = Icon(VaadinIcon.NEWSPAPER)
        isIconAfterText = true
    }
    val loginItem = Button("Login").apply {
        addThemeVariants(ButtonVariant.LUMO_TERTIARY)
        style["color"] = "#7fb491"
        icon = Icon(VaadinIcon.KEY)
        isIconAfterText = true


    }

    loginItem.addClickListener {
        checkPassword { UI.getCurrent().navigate(Routes.PersonalAccount.route) }
    }
    return HorizontalLayout(img,header,buttonHome, newsHome, loginItem).apply {  style["margin-top"] ="4em"
        style["margin-bottom"] ="2em"}
}

private fun checkPassword(funOnClick:()->Unit) {
    val enter = Button("Enter")
    val login = TextField("Login")
    val pass = TextField("Password")
    val dialog = DialogFromLayout(ecoDialog("DIGIWASTE", p = "Personal account", login, pass, enter))
    dialog.open()
    enter.addClickListener {
        if (login.value in LoginEnum.values().map { it.login } && pass.value in LoginEnum.values()
                .map { it.pass }) {
            dialog.close()
            funOnClick()
        } else {
            Notification.show("Invalid password", 700, Notification.Position.MIDDLE)
        }
    }
}

private fun ecoDialog(t: String, p: String, login: TextField, pass: TextField, buttonOk: Button): VerticalLayout {
    return VerticalLayout(H2(t), Paragraph(p), login, pass, HorizontalLayout().apply {
        addAndExpand(buttonOk)
    })}