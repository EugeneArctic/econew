package com.example.application.views.eco.service

import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle

class PolaroidCard(url:String,paragraph:String,rotate:String):VerticalLayout() {
    init{
        style["box-shadow"] = " 56px 23px 89px -2px rgba(127, 180, 145, 0.27)"
        maxWidth = "30%"
        maxHeight = "50%"
        style.set(
            "background-color", "white"
        )

        style.set(
            "transform", rotate
        )
        addAndExpand(
            Image(url, "q")
                .apply {
                    maxWidth = "99%"
                    maxHeight = "99%"
                },
            Paragraph(paragraph)
        )
    }


}