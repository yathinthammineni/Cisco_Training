package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void f() {
	  String url="http://www.google.com";
	  System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
	  System.out.println(driver.getTitle());
  }


}
