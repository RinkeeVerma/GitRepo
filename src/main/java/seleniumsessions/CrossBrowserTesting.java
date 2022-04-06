package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "safari";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Study Material\\Testing\\Project\\RequiredSoftwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Study Material\\Testing\\Project\\RequiredSoftwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		//else if (browser.equals("safari")) {
		//	driver = new SafariDriver();
		//}

		else {
			System.out.println("please pass the right browser....");
		}

		driver.get("https://google.com");// 2. launch url

		String title = driver.getTitle();// 3. get the title of the page
		System.out.println(title);

		// Verification point/checkpoint/act vs exp result:
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		// close the browser:
		driver.quit();

	}

}
