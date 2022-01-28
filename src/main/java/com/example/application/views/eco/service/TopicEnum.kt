package com.example.application.views.eco.service

import javax.swing.border.TitledBorder
import javax.xml.transform.Templates

enum class TopicEnum(
    val Text: String,
    val ImageUrl: String,
    val title: String,
    val sub: String
) {
    FirstTopic(
        "What Are Recyclable Materials?",
        "https://images.unsplash.com/photo-1595278069441-2cf29f8005a4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2071&q=80",
        "Recyclable materials",
        "Let’s get to it!",
    ),

    SecondTopic(
        "Eat local",
        "https://images.unsplash.com/photo-1535914254981-b5012eebbd15?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "Nutrition",
        "Useful tips",
    ),

    ThirdTopic("Video instruction",
        "https://images.unsplash.com/photo-1611284446314-60a58ac0deb9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "Instruction",
        "See it!"),

    FourthTopic ( "Digiwaste Tamagotchi",
        "https://images.unsplash.com/photo-1627856013091-fed6e4e30025?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "Games",
        "Let’s play!"),



    FiveTopic("Biowaste",
        "https://images.unsplash.com/photo-1627856013091-fed6e4e30025?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "First Topic",
        "First Topic sub",),


}

