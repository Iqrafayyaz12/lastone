package MavenG.First;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class mavenjava {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

  	   WebDriver driver;
	       System.setProperty("edge driver path","C:\\Users\\HP\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	       driver =new EdgeDriver();
	       driver.get("https://www.saucedemo.com/");
	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       driver.findElement(By.id("login-button")).click();
	       driver.findElement(By.id("react-burger-menu-btn")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.id("inventory_sidebar_link")).click();	 
	       driver.findElement(By.id("react-burger-cross-btn")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
           driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
           driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
           driver.findElement(By.xpath("//button[@id='checkout']")).click();
           driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("QA");
           driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("JObs in lahore");
	       Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("54000");
           driver.findElement(By.xpath("//input[@id='continue']")).click();
           driver.findElement(By.xpath("//button[@id='finish']")).click();
           driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
                driver.close();
                driver.quit();
           
              
	}

}
