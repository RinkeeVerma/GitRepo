package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("Chrome");
		//br.initDriver("Chrome");
		br.lauchUrl("https://www.amazon.in");

		String title = br.getPageTitle();
		System.out.println("page title : " + title);

		if (title.contains("Online Shopping")) {
			System.out.println("correct title");
		}

		System.out.println(br.getPageUrl());
		br.closeBrowser();

	}

}
