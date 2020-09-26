package com.company.developer;

import com.company.deals.EmployeeDeal;
import com.company.developer.skill.Framework;

public class FrontendDev implements EmployeeDeal {
    private final Framework framework;

    public FrontendDev() {
        framework = Framework.VueJs;
    }

    @Override
    public void start(boolean designReady) {
        if (designReady){
            System.out.println("frontend dev get design from manager, start work");
            work();
        }
    }

    @Override
    public void work() {
        getHTML();
        getCSS();
        getJS();

    }

    @Override
    public boolean sendWork() {
        System.out.println("frontend is ready");
        return true;
    }

    public void getHTML() {
        System.out.println("structered page with html tags");
    }

    public void getCSS() {
        System.out.println("add css, make animation, do website flexible to all devices");
    }

    public void getJS() {
        System.out.println("add js with " + getFramework()+ " framework");
    }
    //getter

    public Framework getFramework() {
        return framework;
    }

}
