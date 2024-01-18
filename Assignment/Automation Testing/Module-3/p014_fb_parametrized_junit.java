package Tops.Assigment_selenium;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import basic.driverconnection;

@RunWith(Parameterized.class)
public class p014_fb_parametrized_junit {
    WebDriver driver ;
	String email,password;
	
  
public p014_fb_parametrized_junit( String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

@Before
public  void browser() {
    String url  = "https://www.facebook.com";
    driver = driverconnection.getDriver(url);
    }
@Test
public void login()throws InterruptedException {
	
   WebElement emailele = driver.findElement(By.id("email"));
   emailele.clear();
   emailele.sendKeys(email);
   WebElement passele = driver.findElement(By.id("pass"));
   passele.clear();
   passele.sendKeys(password);
   Thread.sleep(2000);
}
@Parameters
public static List<Object[]> getdata () {
	Object obj[][] = new Object[3][2];
	obj [0][0] = "sandhiaakib5@gmail.com";
	obj [0][1] = "S@ndhi9596";
	 
    obj [1][0] = "9265457854";
    obj [1][1] = "9265457854";
    
    obj [2][0] = "sandhhiaakib";
    obj [2][1] = "aakib9596";
    
    		
   return Arrays.asList(obj); 		
			
}
}
