package utest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Follow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDiver.chome.driver", "C:/Chrome driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
// store application url as a variable
String url = "https://www.utest.com/";
//Launch url
driver.get(url);
Thread.sleep(5000);
//Verify that you are on the right page.
String fail = "Test is failed!";
String currenturl = driver.getCurrentUrl();
System.out.println(currenturl);
String currenttitle = driver.getTitle();
System.out.println(currenttitle);

if (currenturl.equals(url)){
	System.out.println("The URL is " + currenturl);}
	else {System.out.println(fail);}

if (currenttitle.equals(currenttitle)){
	System.out.println("Current title is " + currenttitle);
} else {
	System.out.println(fail);
}
//sign in.
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input" )).clear();
		                                          //Make sure you add and existing email
driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input" )).sendKeys("email");
driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).clear();
		                                         //Make sure you add a password that corresponds with ^^ email.
driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("Password");
driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
Thread.sleep(5000);
//locate the follow button
/*I am having issues with locating the follow button. It seems like it is created as a check box.
please help! */



//click follow button 
	}
}
	


