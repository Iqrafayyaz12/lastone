package MavenG.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class newclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
	       System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	       driver =new EdgeDriver();
	       driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	       String parenthandle =driver.getWindowHandle();
	     //  System.out.println(parenthandle);
	       Thread.sleep(3000);
	       driver.findElement(By.id("newWindowBtn")).click();
	       Set<String> handles =driver.getWindowHandles();
	       //System.out.println(handles);
	       for (String handle :handles)
	       {
	    	   System.out.println(handle);
	    	   if(!handle.equals(parenthandle))
	    	   {
	    		   driver.switchTo().window(handle);
	    		   driver.findElement(By.id("firstName")).sendKeys("child");
	    	       Thread.sleep(5000);
           	       driver.close();
	    	   }
	    	   

	       }
	      
	        driver.switchTo().window(parenthandle);
  	        driver.findElement(By.id("name")).sendKeys("parent");
	}

}
