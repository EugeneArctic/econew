package com.example.application.views.eco.service

import javax.swing.border.TitledBorder
import javax.xml.transform.Templates

enum class TopicEnum(
    val Text: String,
    val ImageUrl: String, val title: String,
    sub: String
) {
    FirstTopic(
        "Recyclable materials",
        "https://images.unsplash.com/photo-1595278069441-2cf29f8005a4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2071&q=80",
        "Recyclable materials",
        "Recyclable materials",
    ),

    SecondTopic(
        "Nutrition",
        "https://images.unsplash.com/photo-1535914254981-b5012eebbd15?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "Nutrition",
        "First Topic sub",
    ),

    ThirdTopic("Instructions",
        "https://images.unsplash.com/photo-1611284446314-60a58ac0deb9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "Instruction",
        "Instruction"),

    FourthTopic ( "Games",
        "https://images.unsplash.com/photo-1627856013091-fed6e4e30025?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "Games",
        "Games"),

    FiveTopic("Biowaste",
        "https://images.unsplash.com/photo-1627856013091-fed6e4e30025?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80",
        "First Topic",
        "First Topic sub",),


}

