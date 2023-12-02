package MavenG.First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Initlize the Geko driver 
		WebDriver driver;
	//	System.setProperty("Webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		//driver=new FirefoxDriver();
		System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//driver.close();
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("fbtest_brybyqq_three@tfbnw.net");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("jeenypa55word2");

		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
	}
	

}
