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
import com.vaadin.flow.component.textfield.TextField
import com.vaadin.flow.data.provider.DataProvider
import com.vaadin.flow.data.provider.ListDataProvider
import com.vaadin.flow.router.Route

@Route (value = "acc")

class PersonalAccount:VerticalLayout()
{
    init {
        add(menuLayout())
        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
        add(mainVerticalLayout().apply {
        val header = H1("Welcome to your personal account")
        val p = Paragraph("Here you can meet people, who wants to care about nature too.\n" +
                "Also we add people which are near you\n"+"See you on the future meeting in our community")

        val grid = Grid(Person::class.java).apply {   addThemeVariants(GridVariant.LUMO_NO_BORDER) }
        grid.dataProvider = ListDataProvider(mutablePersonList)

        add(header,p,grid)


         })

    }

}

