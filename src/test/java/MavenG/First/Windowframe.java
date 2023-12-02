package MavenG.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		//	System.setProperty("Webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			//driver=new FirefoxDriver();
			System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");
			 driver=new EdgeDriver();
			
			//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			 //String parenthandle=driver.getWindowHandle();
			// System.out.println(parenthandle);
			 //driver.findElement(By.id("newWindowBtn")).click();
			// Set<String> handles =driver.getWindowHandles();
			// System.out.println(handle);
			 //for(String handle :handles)
			// {
					//System.out.println(handle);
				 
              //        if(!handle.equals(parenthandle))
                //      {
                    	  
                  //  	  driver.switchTo().window(handle);
                    //	  driver.findElement(By.id("firstName")).sendKeys("QA");
                    	//  Thread.sleep(2000);
                    	  
                      //}
				 
		//	 }
			// driver.switchTo().window(parenthandle);
			 //driver.findElement(By.id("name")).sendKeys("helo");
			// Thread.sleep(4000);
			 
			 ///////////////////////////////////frames///////////////////////////////
			 
			 driver.get("https://blogpendingtasks.blogspot.com//p/?m=0");
			 driver.switchTo().frame("navbar-iframe");
			 driver.findElement(By.id("b-query")).click();
			 

	}

}
