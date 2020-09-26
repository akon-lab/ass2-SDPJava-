package com.company.controller;

import com.company.department.BackendDep;
import com.company.department.DesignDep;
import com.company.department.FrontendDep;

public class ProjectController {
    protected BackendDep backendDep = new BackendDep();
    protected FrontendDep frontendDep = new FrontendDep();
    protected DesignDep designDep = new DesignDep();

    public void start() {
        System.out.println("Start new website order from client");
        System.out.println(" ");

        getDesign();
        if (designDep.sendWork()) {
            System.out.println(" ");
            System.out.println("manager send design and notes to frontend department");
            getFrontend();
        }
        if (frontendDep.sendWork()) {
            System.out.println(" ");

            System.out.println("manager send frontend to backend department");
            getBackend();
        }
        if (backendDep.sendWork()) {
            System.out.println(" ");

            System.out.println("Website is ready");
        }
    }

    public void stop() {
        System.out.println("Send website to client, and get money!");
    }

    public void getDesign() {
        designDep.getWork();
    }

    public void getFrontend() {
        frontendDep.getWork();
    }

    public void getBackend() {
        backendDep.getWork();
    }
}
