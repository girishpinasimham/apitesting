package com.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String Appium_Node_Path="C:\\Program Files\\nodejs\\node.exe";
		String Appium_JS_Path="C:\\Users\\castus\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js";
		AppiumDriverLocalService appiumService;
		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
                usingAnyFreePort().usingDriverExecutable(new File(Appium_Node_Path)).
                withAppiumJS(new File(Appium_JS_Path)));
		
		
		
		
		


		appiumService.start();


String url = appiumService.getUrl().toString();

DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability("browserName","");
dc.setCapability("deviceName","1114debb");
dc.setCapability("platformName","android");
dc.setCapability("platformVersion","10");
//dc.setCapability("appPackage", "com.cclp.cargohubcclp");
//dc.setCapability("appActivity","com.cclp.cargohubcclp.MainActivity");

AndroidDriver driver = new AndroidDriver(new URL(url),dc);

Thread.sleep(10000);
		



		
/*driver.findElementByAccessibilityId("username").sendKeys("admin");
Thread.sleep(5000);
driver.findElementByAccessibilityId("password").sendKeys("admin");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@class='android.widget.Button']")).click();
*/


/*
driver.findElementByXPath("(//*[@class='android.widget.EditText'])[1]").sendKeys("test2@castusinfo.com");


driver.findElementByXPath("(//*[@class='android.widget.EditText'])[2]").sendKeys("castus");

Thread.sleep(3000);


File f= new File("C://Users//castus//Desktop//signin.png");

Path p = f.toPath();


String encode = Base64.getEncoder().encodeToString(Files.readAllBytes(p));

System.out.println(encode);





driver.findElementByImage(encode).click();
et.log(LogStatus.PASS, "login test passed");
		
		
		
		




er.endTest(et);

er.flush();
		*/
		
		
appiumService.stop();

		
		
	}

}
