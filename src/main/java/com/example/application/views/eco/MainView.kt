package com.example.application.views.eco

import com.example.application.views.MainLayout
import com.example.application.views.eco.service.*
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.gridpro.EditorType
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.wontlost.ckeditor.Constants
import com.wontlost.ckeditor.VaadinCKEditor
import com.wontlost.ckeditor.VaadinCKEditorBuilder


@PageTitle("Eco")
@Route(value = "oldview", layout = MainLayout::class)
//@RouteAlias(value = "")

//@Tag("hello-world-view")
//@JsModule("./views/helloworld/hello-world-view.ts")
class MainView:VerticalLayout()  {

    //LitTemplate(), HasComponents, HasStyle
    init {

        style["background-image"] ="https://images.unsplash.com/photo-1555465910-31f7f20a184d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=3690&q=80"
        //val menuLayout = menuLayout()

        style.set("background-image", "url(https://images.unsplash.com/photo-1555465910-31f7f20a184d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=3690&q=80)")

        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER

//        val mainVerticalLayout = VerticalLayout().apply {
//            defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
//        maxWidth = "70%"
//        style["border-radius"] ="16px"
//        style["box-shadow"] ="3px 42px 22px 35px rgba(127, 180, 145, 0.27)"
//        style["background-color"]= "transparent"




        val firstCard = EcoCard(
            TopicEnum.FirstTopic.title,
            TopicEnum.FirstTopic.sub,
            TopicEnum.FirstTopic.Text,
            TopicEnum.FirstTopic.ImageUrl
        )

        val secondCard = EcoCard(
            TopicEnum.SecondTopic.title,
            TopicEnum.SecondTopic.sub,
            TopicEnum.SecondTopic.Text,
            TopicEnum.SecondTopic.ImageUrl
        )


        val thirdCard = EcoCard(
            TopicEnum.ThirdTopic.title,
            TopicEnum.ThirdTopic.sub,
            TopicEnum.ThirdTopic.Text,
            TopicEnum.ThirdTopic.ImageUrl
        )

        val fourthCard = EcoCard(
            TopicEnum.FourthTopic.title,
            TopicEnum.FourthTopic.sub,
            TopicEnum.FourthTopic.Text,
            TopicEnum.FourthTopic.ImageUrl
        )


        val firstLineCard = HorizontalLayout().apply {
            maxWidth = "50%"
        }
        val firstRowCard = mainVerticalLayout().apply {
            maxWidth = "50%"
            add(firstCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.FirstTopic.route)
            }
        }

        val secondRowCard = mainVerticalLayout().apply {
            style["box-shadow"] =" 56px 23px 89px -2px rgba(127, 180, 145, 0.27)"
            maxWidth = "50%"
            add(secondCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.SecondTopic.route)
            }
        }

        val secondLineCard = HorizontalLayout().apply {
            maxWidth = "50%"
        }

        val thirdRowCard = mainVerticalLayout().apply {
            maxWidth = "50%"
            add(thirdCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.ThirdTopic.route)
            }
        }

        val fourthRowCard = mainVerticalLayout().apply {
            style["box-shadow"] =" 56px 23px 89px -2px rgba(127, 180, 145, 0.27)"
            maxWidth = "50%"
            add(fourthCard)
            addClickListener {
                UI.getCurrent().navigate(Routes.FourthItem.route)
            }
        }
        firstLineCard.addAndExpand(firstRowCard,secondRowCard)
        secondLineCard.addAndExpand(thirdRowCard,fourthRowCard)
            add(firstLineCard,secondLineCard)


        add(firstLineCard,secondLineCard)
        }



//    }


}