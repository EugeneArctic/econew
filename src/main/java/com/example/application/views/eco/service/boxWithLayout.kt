package com.example.application.views.eco.service

import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout

fun mainVerticalLayout() = VerticalLayout().apply {
    defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
    maxWidth = "70%"
    style["border-radius"] ="16px"
    style["box-shadow"] ="3px 42px 22px 35px rgba(127, 180, 145, 0.27)"
    style["background-color"]= "transparent"}