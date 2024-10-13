package com.automations.steps;

import com.automations.utils.Configreader;
import com.automations.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        DriverManager.createDriver();
        Configreader.initialProperties();

    }

    @After
    public void tearDown(){
        DriverManager.getDriver().quit();
    }

}
