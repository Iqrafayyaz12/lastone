package MavenG.First;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
	     // TODO Auto-generated method stub
		   WebDriver driver;
	       System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	       driver =new EdgeDriver();
	       //driver.get("https://www.python.org");
	       //driver.findElement(By.id("id-search-field")).sendKeys("test");
	       //driver.findElement(By.className("search-button")).click();
	     
	       
	       
	       //////////////////////////////////////////////////////////////////////////////////
	       
	       
	       
	        //driver.get("https://demo.guru99.com/test/link.html");
           //driver.findElement(By.linkText("click here")).click();
           //driver.findElement(By.partialLinkText("click here")).click();
           
           
           
           /////////////////////////////////////CSS selector//////////////////////////////////////////////
	       
	     //  driver.get("https://magento.softwaretestingboard.com/");
	     //  driver.findElement(By.partialLinkText("Create an Account")).click();
	     //  driver.findElement(By.cssSelector("input#firstname")).sendKeys("test");
	     //  driver.findElement(By.cssSelector("input#lastname")).sendKeys("test1");
	      // driver.findElement(By.cssSelector("input[id='email_address']")).sendKeys("test76@yopmail.com");
	     //  driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("Test@1234");
	      // driver.findElement(By.cssSelector("input#password-confirmation")).sendKeys("Test@1234");
	      // driver.findElement(By.cssSelector("button[title='Create an Account']")).click();
	       
	       
           ////////////////////////////////////xpath////////////////////////////////////////////////
	       
		      //driver.get("https://www.demoblaze.com/");

		     
		     //driver.findElement(By.xpath("//*[@id=\"nava\"]")).click();
		     //driver.navigate().back();
		     //driver.findElement(By.xpath(" //a[@class=\"nav-link\" and @href='index.html']")).click();
		     //driver.findElement(By.xpath(" //*[contains(@id,'itemc')]")).click();
		    // driver.findElement(By.xpath(" //*[contains(@id,'cartur')]")).click();
		       //driver.findElement(By.xpath(" //a[text()='Scents N Stories']")).click();
		      
		  
		     
		  driver.get("https://ultimateqa.com/");
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		//  Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body[1]/div[2]/div[1]/div[1]/header/div[3]/span[1]")).click();
		// driver.findElement(By.xpath("//*[@type='text' and @name='s']")).sendKeys("test");
		 //driver.findElement(By.xpath("//*[@class='mobile_menu_bar']")).click();
		  

		  
	       

	       
		       

	       
	       
	}
}
