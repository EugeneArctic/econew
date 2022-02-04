package com.example.application.views.eco

import com.example.application.views.MainLayout
import com.example.application.views.eco.service.PolaroidCard
import com.example.application.views.eco.service.Routes
import com.example.application.views.eco.service.TopicEnum
import com.example.application.views.eco.service.mainStyle
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.FlexLayout
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route


@PageTitle("Eco")
@Route(value = "", layout = MainLayout::class)
class MainViewVer2 : VerticalLayout() {

    init {
        this.mainStyle()
        val cardHorizontalLayout = HorizontalLayout().apply {
            style["margin-top"] = "10em"
            style["margin-left"] = "10em"
        }

        cardHorizontalLayout.addAndExpand(
            PolaroidCard(
                TopicEnum.FirstTopic.ImageUrl, TopicEnum.FirstTopic.title + ". "
                        + TopicEnum.FirstTopic.Text, "rotate(-5deg)"
            )
                .apply {
                    addClickListener {
                        UI.getCurrent().navigate(Routes.FirstTopic.route)
                    }
                },
            PolaroidCard(
                TopicEnum.SecondTopic.ImageUrl, TopicEnum.SecondTopic.title + ". "
                        + TopicEnum.SecondTopic.Text, "rotate(1deg)"
            ) .apply {
                addClickListener {
                    UI.getCurrent().navigate(Routes.SecondTopic.route)
                }
            },
            PolaroidCard(
                TopicEnum.FourthTopic.ImageUrl, TopicEnum.FourthTopic.title + ". "
                        + TopicEnum.FourthTopic.Text, "rotate(5deg)"
            ) .apply {
                addClickListener {
                    UI.getCurrent().navigate(Routes.FourthItem.route)
                }
            }
        )
        this.setHorizontalComponentAlignment(FlexComponent.Alignment.CENTER, cardHorizontalLayout)
        addAndExpand(cardHorizontalLayout)


    }

}