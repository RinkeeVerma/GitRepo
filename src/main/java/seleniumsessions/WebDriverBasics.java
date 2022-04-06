package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//chromedriver.exe
				//geckodriver.exe
				//servers --> Binary File
				
				//IllegalStateException -- if server is not started...
				//windows:
				//System.setProperty("webdriver.chrome.driver", "c:\\users\\dev\\chromedriver.exe");
				
				//System.setProperty("webdriver.chrome.driver", "E:\\Study Material\\Testing\\Project\\RequiredSoftwares\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();//1.launch the browser
				
				System.setProperty("webdriver.gecko.driver", "E:\\Study Material\\Testing\\Project\\RequiredSoftwares\\geckodriver.exe");
				WebDriver driver1 = new FirefoxDriver();
				
				driver.get("https://google.com");//2. launch url
				
				String title = driver.getTitle();//3. get the title of the page
				System.out.println(title);
				
				//Verification point/checkpoint/act vs exp result:
				if(title.equals("Google")) {
					System.out.println("correct title");
				}
				else {
					System.out.println("incorrect title");
				}
				
				System.out.println(driver.getCurrentUrl());
				
				//System.out.println(driver.getPageSource());
				
				//close the browser:
				driver.quit();
				//driver.close();

	}

}
