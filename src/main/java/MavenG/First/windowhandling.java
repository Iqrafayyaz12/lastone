package MavenG.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	       System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	       driver =new EdgeDriver();
	       driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");	       
	       //what is handle beacuse every window have some handles in which we can differentiate the window if we have multiple windows
             String Parenthandle=  driver.getWindowHandle();	
        //     System.out.println(Parenthandle);
    	       Thread.sleep(3000);

  	        driver.findElement(By.id("newWindowBtn")).click();
            Set<String> childhandle =driver.getWindowHandles();
           System.out.println(childhandle);
            for(String handle:childhandle)
            {
            //	System.out.println(handle);
            	if(!handle.equals(Parenthandle))
            	{
                    driver.switchTo().window(handle);
          	       driver.findElement(By.id("firstName")).sendKeys("child");
           	       Thread.sleep(5000);
           	       driver.close();
}
              
            }
            driver.switchTo().window(Parenthandle);
  	        driver.findElement(By.id("name")).sendKeys("parent");
    	    Thread.sleep(2000);
    	    
	}

}
