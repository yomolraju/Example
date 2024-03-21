package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\yomol\\Documents\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver.", "C:\\Users\\yomol\\Documents\\geckodriver.exe");
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
     driver.get("https://www.upwork.com/ab/account-security/login");
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     driver.close();
     }

}
