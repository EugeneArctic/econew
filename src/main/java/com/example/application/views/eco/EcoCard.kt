package com.example.application.views.eco


import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.littemplate.LitTemplate
import com.vaadin.flow.component.template.Id

@JsModule("./views/helloworld/hello-world-view-card.ts")
@Tag("hello-world-view-card")
class EcoCard(text: String?, url: String?, textTemplate:String) : LitTemplate() {
    @Id
    private val image: Image? = null

    @Id
    private val header: Span? = null

    @Id
    private val subtitle: Span? = null

    @Id
    private val text: Paragraph? = null

    @Id
    private val badge: Span? = null


    init {
        image!!.src = url
        image.setAlt(text)
        header!!.text = "Title"
        subtitle!!.text = "Card subtitle"
        this.text!!.text = textTemplate
        badge!!.text = "Label"
    }

}
