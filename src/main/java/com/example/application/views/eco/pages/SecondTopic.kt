package com.example.application.views.eco.pages

import com.example.application.views.MainLayout
import com.example.application.views.eco.service.mainStyle
import com.example.application.views.eco.service.mainVerticalLayout
import com.example.application.views.eco.service.menuLayout
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route(value = "second" , layout = MainLayout::class)
class SecondTopic:VerticalLayout() {
init {


    this.mainStyle()
    defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER

    add(mainVerticalLayout().apply {
        defaultHorizontalComponentAlignment = FlexComponent.Alignment.START

        add((H2("Eat local")))
        add(Image().apply { src = "https://images.unsplash.com/photo-1605279682024-5a25531582dc?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=600&q=80" })
        add(Paragraph("Winter:"))
        add(Paragraph("• Vegetables: artichokes, white and Brussels sprouts, potatoes, leeks, shallots, carrots, turnips, radishes, beets, celery, pumpkin, cauliflower"))
        add(Paragraph("• Fruits: avocado, pineapple, orange, banana, grapefruit, pear, kiwi, lemon, mango, tangerine, persimmon, apple"))
        add((H2("Tips")))
        add(Paragraph("• Prefer reusable bags over plastic"))
        add(Paragraph("• Prefer products made of one material over combined materials"))
        add(Paragraph("• Use lunch-boxes and metallic or glass cups instead of plastic"))
        add(Paragraph("• Buy locally produced products as they tend to have lower carbon footprint"))



    })

}


}