package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//get total number of links on the page
		//print the text of each link but ignore the blank text
		//links --> <a href= "" signup/>
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		int totalLinks = linkList.size();
		System.out.println("total links on the page "+ totalLinks);
		
		for(int i=0; i<totalLinks; i++){
			String linkText = linkList.get(i).getText();
			
			if(! linkText.isEmpty()){
				System.out.print(i+"--->"+linkText + " --->");
				System.out.println("attribute" +linkList.get(i).getAttribute("href"));
			}
		}
			
			//image
		System.out.println("Image ");
			
			List<WebElement> imageList=driver.findElements((By.tagName("img"));
			System.out.println("total images on the page "+ imageList.size());
			
			for(int i=0; i<imageList.size(); i++){
				String imageUrl = imageList.get(i).getAttribute("src");
				System.out.println(imageUrl);
				
			}

	}

}

