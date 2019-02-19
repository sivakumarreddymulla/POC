package SeleniumProject;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SeleniumProject
 
{
 
public static void main(String[] args)
 
{
    
System.setProperty("webdriver.chrome.driver", "D:\\Users\\sivavutla\\Documents\\chromedriver_win32\\chromedriver.exe");
 
WebDriver driver = new ChromeDriver();
 
driver.navigate().to("www.facebook.com");
 
String appTitle = driver.getTitle();
 
System.out.println("Application title is : "+appTitle);
 
driver.quit();
 
}
 
}

