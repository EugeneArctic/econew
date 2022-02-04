package com.example.application.views

import com.example.application.views.eco.MainView
import com.example.application.views.eco.MainViewVer2
import com.example.application.views.eco.pages.FirstTopic
import com.example.application.views.eco.pages.PersonalAccount
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.H1
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.page.Viewport
import com.vaadin.flow.component.tabs.Tab
import com.vaadin.flow.component.tabs.Tabs
import com.vaadin.flow.component.tabs.TabsVariant
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouterLink
import com.vaadin.flow.server.PWA
import com.vaadin.flow.theme.Theme



@PWA(name = "My App", shortName = "My App", enableInstallPrompt = false)
@Theme(themeFolder = "myapp")
@PageTitle("Main")
@Viewport(value = "1024")
class MainLayout : AppLayout() {


    init {
        val title = H2("DIGIWASTE")
        title.style
            .set("font-size", "var(--lumo-font-size-l)")
            .set("left", "var(--lumo-space-l)")
            .set("color", "#007929")
            .set("margin", "0")["position"] = "absolute"

//        val img =
//            Image().apply { src = "https://i.postimg.cc/xddMqyfZ/photo-2022-01-28-19-57-53-removebg-preview.png"
//                style["width"]="50px"
//                style["height"]="50px"
//                style["margin-top"] ="0"
//                style["margin-bottom"] ="0"
//            }

        val tabs = getTabs()
        tabs.addThemeVariants(TabsVariant.LUMO_MINIMAL)



        addToNavbar(title, tabs)

        }





}

private fun getTabs(): Tabs {
    val tabs = Tabs()
    tabs.style["margin"] = "auto"
    tabs.add(
        createTab("Home", MainViewVer2::class.java),
        createTab("Login",PersonalAccount::class.java)
    )
    return tabs
}

private fun createTab(viewName: String,classJava: Class<*>): Tab? {
    val link = RouterLink()
    link.add(viewName)
    link.setRoute(classJava as Class<out Component>?)
    link.tabIndex = -1
    return Tab(link).apply {
        style["color"]="#007929"
        style.set("font-size", "var(--lumo-font-size-xl)")
        style.set("height", "var(--lumo-size-xxl)")
    }
}
