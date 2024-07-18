import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       ChromeDriver driver= new ChromeDriver();
       driver.get("https://www.guvi.in/register");
       driver.findElement(By.className("form-control")).sendKeys("Subathra");
       driver.findElement(By.id("email")).sendKeys("subathra123@gmail.com");
       driver.findElement(By.cssSelector("#password")).sendKeys("subisuba");
       driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("1234567890");
       driver.findElement(By.tagName("span")).click();
       }

}
