package seleniumsessions;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * this method will initialize the driver on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this will return the driver
	 */
	public WebDriver launchBrowser(String browser) {
		if (browser.equals("Chrome")) {
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
		return driver;
		

		

	}

	public void lauchUrl(String url) {
		if (url == null)
			return;
		if (url.isEmpty())
			return;
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
