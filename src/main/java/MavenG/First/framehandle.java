package MavenG.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //embed one web page to another eweb page 
		
	       WebDriver driver;
	       System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	       driver =new EdgeDriver();
	       ///////////////////////////////////////////////////////////////////////
	       
	        driver.get("https://blogpendingtasks.blogspot.com//p/?m=0");
            driver.switchTo().frame("navbar-iframe");
            driver.findElement(By.id("b-query")).click();
           /////////////////////////////////////////////////////////////////////
           
           
           driver.get("https://the-internet.herokuapp.com/iframe");
           driver.switchTo().frame("mce_0_ifr");
           driver.findElement(By.id("tinymce")).sendKeys("lahore");
           ///////////////////////////////////////////////////////////////////////
           
           //driver.get("https://demo.automationtesting.in/Frames.html");
          // driver.switchTo().frame("singleframe");
           //driver.findElement(By.id("text")).sendKeys("lahore");
           
           
		
		
		
	}

}
