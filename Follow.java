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
//sign in
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
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input" )).clear();
driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input" )).sendKeys("josephzhirkov@gmail.com");
driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).clear();
driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("@Goats4Sale");
driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
Thread.sleep(5000);
//locate the follow button



//click follow button 
	}}
	


