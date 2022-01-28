package com.example.application.views.eco.pages

import com.example.application.views.eco.service.mainVerticalLayout
import com.example.application.views.eco.service.menuLayout
import com.vaadin.flow.component.accordion.Accordion
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route(value = "fourth")
class FourTopic:VerticalLayout() {
init {

    add(menuLayout())
    defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER


    add(mainVerticalLayout().apply {

        add((H2("Digiwaste Tamagotchi")))
        add(Paragraph("This is Demo game"))
        val accordion = Accordion()
        val sadnessVerticalLayout =VerticalLayout()
        sadnessVerticalLayout.apply {
            add(Paragraph("She is sad" +
                    " when you dont recycle."))
            add(Image().apply {
                src =
                    "https://images.unsplash.com/photo-1614583225154-5fcdda07019e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&q=80"
            })
        }

        val happyVerticalLayout =VerticalLayout()
        happyVerticalLayout.apply {
            add(Paragraph("She is happy " +
                    "when you recycle."))
            add(Image().apply {
                src =
                    "https://images.unsplash.com/photo-1632506823413-200b3d091e90?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&q=80"
            })
        }

        accordion.add("Tamagotchi is sad",sadnessVerticalLayout )
        accordion.add("Tamagotchi is happy",happyVerticalLayout )
        add(accordion)




    })
}


}