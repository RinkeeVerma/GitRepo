package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/sri-lanka-tour-of-bangladesh-2021-1262340/bangladesh-vs-sri-lanka-1st-odi-1262344/full-scorecard");
		System.out.println(getWicketTakerName("Litton Das"));
		System.out.println(getPlayerScoreCardList("Litton Das"));
	}
	
	public static String getWicketTakerName(String playerName)
	{
		String xpath="//a[text()='"+playerName+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static List<String> getPlayerScoreCardList(String playerName)
	{
		String xpath="//a[text()='"+playerName+"']/parent::td/following-sibling::td";
		List <WebElement> scoreList= driver.findElements(By.xpath(xpath));
		List <String> scoreValList=new ArrayList<String>;
		
		for(int i=1; i<scoreList.size(); i++)
		{
			String text=scoreList.get(i).getText();
			scoreValList.add(text);
		}
		return scoreValList;
		
	}

}
