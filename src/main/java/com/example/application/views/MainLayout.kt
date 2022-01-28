package com.example.application.views

import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.menubar.MenuBar
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.server.PWA
import com.vaadin.flow.theme.Theme


@PWA(name = "My App", shortName = "My App", enableInstallPrompt = false)
@Theme(themeFolder = "myapp")
@PageTitle("Main")
class MainLayout : AppLayout() {




    init {

    }

}