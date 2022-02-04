package com.example.application.views.eco.service

import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout

fun mainVerticalLayout() = VerticalLayout().apply {
    defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
    maxWidth = "70%"
    style["border-radius"] ="16px"
    style["box-shadow"] ="-2px 19px 89px -2px rgba(127, 180, 145, 0.27)"
    style["background-color"]= "white"}


fun VerticalLayout.mainStyle(){
    this.style.set(
        "background-image",
        "url(https://i.ibb.co/x1qWnjT/photo-1555679427-1f6dfcce943b.jpg)"
    )
    this.style.set(
        "opacity",
        "0.99"
    )
    this.defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
    this.setHeightFull()
    this.setWidthFull()

}