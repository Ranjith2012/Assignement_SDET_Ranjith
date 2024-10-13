package com.automation.Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class DriverManager {
    static WebDriver driver;

    public static void createDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    //ExtentReport
    public static String addScreenShortAs(){
        TakesScreenshot ta = (TakesScreenshot) DriverManager.getDriver();
        File screenShott = ta.getScreenshotAs(OutputType.FILE);
        String screenshotFolderPath = "report/";
        String screenshotName = "screenshot.png";
        try {
            FileUtils.copyFile(screenShott, new File(screenshotFolderPath + screenshotName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return screenshotName;
    }

    //Allure Report ScreenShort
    public static ByteArrayInputStream takeScreenShot(){
        TakesScreenshot take = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenShort = take.getScreenshotAs(OutputType.BYTES);
        return new ByteArrayInputStream(screenShort);
    }
}
