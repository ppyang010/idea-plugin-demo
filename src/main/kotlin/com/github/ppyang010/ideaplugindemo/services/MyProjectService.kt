package com.github.ppyang010.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.ppyang010.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
