package com.example.application.views.eco.service


import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.charts.model.Subtitle
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.littemplate.LitTemplate
import com.vaadin.flow.component.template.Id

@JsModule("./views/helloworld/hello-world-view-card.ts")
@Tag("hello-world-view-card")
class EcoCard(title:String?,
              sub: String?,
              text: String?,
              url: String?) : LitTemplate() {
    @Id
    private val image: Image? = null

    @Id
    private val header: Span? = null

    @Id
    private val subtitle: Span? = null

    @Id
    private val text: Paragraph? = null

//    @Id
//   private val badge: Button? = null


    init {
        image!!.src = url
        image.setAlt(text)
        header!!.text = title
        subtitle!!.text = sub
        this.text!!.text = text

    }

}
