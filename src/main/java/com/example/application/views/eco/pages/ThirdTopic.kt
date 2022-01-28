package com.example.application.views.eco.pages

import com.example.application.views.eco.service.menuLayout
import com.vaadin.flow.component.Html
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route(value = "third")
class ThirdTopic:VerticalLayout() {
init {

    add(menuLayout())
    defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER


    add(Html("<iframe width=500 height= 300 src=\"https://youtu.be/C2oUvSpXOY0\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
}


}