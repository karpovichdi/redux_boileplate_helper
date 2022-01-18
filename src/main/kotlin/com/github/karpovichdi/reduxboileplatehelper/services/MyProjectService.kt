package com.github.karpovichdi.reduxboileplatehelper.services

import com.intellij.openapi.project.Project
import com.github.karpovichdi.reduxboileplatehelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
