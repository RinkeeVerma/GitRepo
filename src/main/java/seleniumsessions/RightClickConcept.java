package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClick).perform();
		
		Thread.sleep(1000);
		
		List<WebElement> rightList = 
				driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		
		Thread.sleep(1000);
		
		for(WebElement e : rightList) {
			
			if(e.getText().equals("Copy")) {
				System.out.println(e.getText());
				e.click();
				break;
			}
		}
		
		

	}

}
