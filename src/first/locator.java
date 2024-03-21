package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yomol\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.findElement(By.name("username")).sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Invalid password
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("hello123");
		//driver.findElement(By.className("orangehrm-login-button")).click();
		
		/*--InValid user name and password
		 * 
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("hello123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		//driver.findElement(By.cssSelector("p.oxd-text oxd-text--p oxd-alert-content-text")).getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.findElement(By.cssSelector("p.oxd-text.oxd-text--p.oxd-alert-content-text")).getText());*/
		/*--ForgetPassword
		driver.findElement(By.cssSelector("p.oxd-text.oxd-text--p.orangehrm-login-forgot-header")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[normalize-space()='Reset Password']")).click();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		/* Valid Username and password */
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
	}

}
