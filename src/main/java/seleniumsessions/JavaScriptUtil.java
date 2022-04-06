package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void flash(WebElement element,WebDriver driver){
		
		//Flashing
		
		String bgcolor = element.getCssValue("backgroundColor"); //green 
		for (int i = 0; i < 500; i++)
		{ 
			changeColor("#000000", element, driver);// 1 
			changeColor(bgcolor, element, driver);// 2 
		}
	}
		
		public static void changeColor(String color, WebElement element, WebDriver driver)
		{ 
			JavascriptExecutor js = ((JavascriptExecutor) driver); 
		
		js.executeScript( "arguments[0].style.backgroundColor = '" + color + "'", element); 
		try 
		{ 
			Thread.sleep(20);
		}
		
		catch (InterruptedException e)
		{ 
		
		}
	}
		
		public static void drawBroder(WebElement element, WebDriver driver){
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		//get title
		public static String getTitle(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			String title=js.executeScript("return document title").toString();
			return title;
		}
		
		//click
		public static void clickElement(WebElement element, WebDriver driver){
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].click();", element);
		}
		
		//alert info
		public static void generateAlert(WebDriver driver, String message)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("alert('" +message +" ')"); 
		}
		
		public static String getPagelnnerText(WebDriver driver){
			JavascriptExecutor js = (JavascriptExecutor) driver);
			String pageText = js.executeScript("return document.documentElement.innerText;").toString();
			return pageText:

			
		}
		
		//refresh browser
		public static void refreshBrowserByn(WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("history.go(0)"); 
		}
		
		//Scroll
		public static void scrolllntoView(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);  
		}
		
		public static void scrollPageDown(WebDriver driver){
			
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
		}


}



