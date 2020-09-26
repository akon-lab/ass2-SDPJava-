package com.company.department;

import com.company.deals.DepartmentDeal;
import com.company.developer.FrontendDev;

public class FrontendDep implements DepartmentDeal {
    private final DepEnum depName=DepEnum.Frontend;
    private final FrontendDev programmer=new FrontendDev();
    @Override
    public void getWork() {
        System.out.println(depName + " department get work from manager");

        programmer.start(true);
    }

    @Override
    public boolean sendWork() {
        if (programmer.sendWork()){
            System.out.println(depName+" department send work to manager");
            return true;
        }
        return false;
    }
}
