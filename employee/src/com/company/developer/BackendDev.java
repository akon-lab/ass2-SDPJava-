package com.company.developer;

import com.company.deals.EmployeeDeal;
import com.company.developer.skill.Database;
import com.company.developer.skill.ProgLang;

public class BackendDev implements EmployeeDeal {
    private final Database db;
    private final ProgLang langForBackend;

    public BackendDev() {
        db = Database.PostgreSql;
        langForBackend = ProgLang.JavaEE;
    }

    @Override
    public void start(boolean frontendReady) {
        if(frontendReady){
            System.out.println("backend developer get fronted part, start work");
            work();
        }
    }

    @Override
    public void work() {
        connectToDb();
        websiteUsability();
        addBackend();

    }

    @Override
    public boolean sendWork() {
        System.out.println("backend is ready");
        return true;
    }

    public void connectToDb() {
        System.out.println("Connect website to database with " + getDb());
    }

    public void websiteUsability() {
        System.out.println("Make website usable in users part");
    }

    public void addBackend() {
        System.out.println("Wrote backend part on " + getLangForBackend());
    }

    //getter

    public Database getDb() {
        return db;
    }

    public ProgLang getLangForBackend() {
        return langForBackend;
    }
}
