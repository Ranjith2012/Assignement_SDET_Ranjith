package com.automation.test;

import com.automation.Utils.DriverManager;
import com.automation.Utils.ExcelUtils;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends BaseTest{

    @Test(dataProvider = "MyData")
    public void test1(String username,String password){
        login.openWebsite();
        login.loginuser(username,password);
        Allure.addAttachment("ScreenShort", DriverManager.takeScreenShot());
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @DataProvider(name = "MyData")
    public Object[][] data() {
        ExcelUtils excel = new ExcelUtils("ValidData.xlsx", "Sheet1");
        List<List<String >> tableData = excel.getData();
        Object[][] data = new Object[tableData.size()][tableData.get(0).size()];

        for(int i=0;i< tableData.size();i++){
            List<String> row = tableData.get(i);
            for(int j=0;j<row.size();j++){
                data[i][j]=tableData.get(i).get(j);
            }
        }
        return data;
    }
}
