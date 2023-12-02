package MavenG.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");
	    driver=new EdgeDriver();
        // driver.get("https://www.python.org");
       //driver.findElement(By.id("id-search-field")).sendKeys("test");
       //driver.findElement(By.className("search-field")).click();
       //driver.findElement(By.name("q")).sendKeys("testtest");
       //driver.findElement(By.tagName("input")).sendKeys("heloworld");
       
	    
	    
	    //////////////////////////////////////CSS Selector/////////////////////////////////////
	//    driver.get("https://demo.guru99.com/test/link.html");   
	  //  driver.findElement(By.partialLinkText("click")).click();
	    //driver.get("https://magento.softwaretestingboard.com/");
	 //   driver.findElement(By.cssSelector("#search")).click();
	   // driver.findElement(By.cssSelector("input.input-text")).sendKeys("test");
	 //   driver.findElement(By.cssSelector("input#search")).click();
	   // driver.findElement(By.cssSelector("input[id='search']")).click();
	    
	    
	    
	    ///////////////////////////////////////Xpath//////////////////////////
	    
	     driver.get("https://ultimateqa.com/");
	     ///Absoloute path
	  //   driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	     ////Relative path /////////////////
             //driver.findElement(By.xpath("//input[@class='et_pb_s']")).click(); 
	     driver.findElement(By.xpath("//input[@name='s' and @class='et_pb_s']")).sendKeys("test");
	 
	}

}
