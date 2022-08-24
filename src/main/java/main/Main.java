/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ProjectController;
import model.Project;

/**
 *
 * @author Nilwan
 */
public class Main {
    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description teste");
        projectController.save(project);

    }
}
