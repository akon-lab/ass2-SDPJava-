package com.company.developer;

import com.company.deals.EmployeeDeal;
import com.company.developer.skill.Design;

public class UIDesigner implements EmployeeDeal {
    private final Design designEditor;

    public UIDesigner() {
        designEditor = Design.AdobePhotoshop;
    }

    @Override
    public void start(boolean send) {
        System.out.println("UIDesigner start work");
        work();
    }

    @Override
    public void work() {
        makeDesign();
        makeNotes();

    }

    @Override
    public boolean sendWork() {
        System.out.println("design is ready");
        return true;
    }

    public void makeDesign() {
        System.out.println("make design on " + getDesignEditor() + " editor");
    }

    public void makeNotes() {
        System.out.println("add notes for frontend developer");
    }

    //getter
    public Design getDesignEditor() {
        return designEditor;
    }
}
