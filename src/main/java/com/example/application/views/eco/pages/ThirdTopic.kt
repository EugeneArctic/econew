package com.example.application.views.eco.pages

import com.example.application.views.eco.service.mainVerticalLayout
import com.example.application.views.eco.service.menuLayout
import com.vaadin.flow.component.Html
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route


@Route(value = "third")
class ThirdTopic:VerticalLayout() {
    init {

        add(menuLayout())
        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
        add(mainVerticalLayout().apply {
            defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER

            add((H2("Cleaning before recycle")))
            add(Html("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/C2oUvSpXOY0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
            add((H2("Waste management in Finland")))
            add(Html("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/6i1EoqMTRaY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))




    })
}
}