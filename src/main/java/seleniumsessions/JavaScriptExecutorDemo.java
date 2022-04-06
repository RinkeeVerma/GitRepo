package seleniumsessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
		WebElement joinForFree=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
		
		//Flashing
		JavaScriptUtil.flash(joinForFree, driver);
		
		//Drawing Broder & Screenshot
		
		JavaScriptUtil.drawBroder(joinForFree, driver);
		
		// File src=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// File trg=new File("E:\\Study Material\\Testing\\Project\\Screenshot\\twoplugs.png");
		// FileUtils.copyFile(src,trg);
		 
		 //Capture title of page
		 //System.out.println(driver.getTitle());
		 
		 String title=JavaScriptUtil.getTitle(driver);
		 System.out.println(title);
		 
		 //click
		 
		 WebElement btnLogin=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		 JavaScriptUtil.clickElement(btnLogin, driver);
		 
		 //alert
		 JavaScriptUtil.generateAlert(driver, "You clicked on Login button.....");
		 
		 //refresh browser
		 JavaScriptUtil.refreshBrowserByn(driver);
		 
		//scroll down the page till we found elenent
		//MebElenent image=driver .findelement (By .xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		//JavaScriptutil. scrollintoview(image, driver);

		//Scroll down page till end
		JavaScriptUtil.scrollPageDown(driver);
	}

}
