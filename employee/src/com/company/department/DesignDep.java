package com.company.department;

import com.company.deals.DepartmentDeal;
import com.company.developer.UIDesigner;

public class DesignDep implements DepartmentDeal {
    private final DepEnum depName = DepEnum.Design;
    private final UIDesigner designer = new UIDesigner();

    @Override
    public void getWork() {
        System.out.println(depName + " department get work from manager");
        designer.start(true);
    }

    @Override
    public boolean sendWork() {
        if (designer.sendWork()) {
            System.out.println(depName + " department send work to manager");
            return true;
        }
        return false;
    }
}
