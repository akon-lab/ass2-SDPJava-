package com.company;

import com.company.controller.ProjectController;

public class Switch {
    protected ProjectController prController=new ProjectController();

    public void start() {
        System.out.println("Start working");
       prController.start();
    }

    public void stop() {
        prController.stop();
        System.out.println("The end");
    }
}
