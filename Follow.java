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
driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input" )).sendKeys("EXAMPLE@gmail.com");
driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).clear();
driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("YOURPASSWORD");
driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
Thread.sleep(10000);
//locate the follow button

driver.findElement(By.xpath("//label[contains(@for,'follow1')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow2')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow3')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow4')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow5')]")).click();

for (int i = 0; i < 5; i++) {
	 //click the next button
	driver.findElement(By.xpath("//*[@id='mainContent']/div/div[1]/div/div/span[2]")).click();

	 //wait 2 seconds
	  Thread.sleep(1000);
	 
}

Thread.sleep(2000);

driver.findElement(By.xpath("//label[contains(@for,'follow6')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow7')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow8')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow9')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow10')]")).click();

driver.navigate().to(driver.getCurrentUrl()); 
Thread.sleep(5000);

driver.findElement(By.xpath("//label[contains(@for,'follow1')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow2')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow3')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow4')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow5')]")).click();

for (int i = 0; i < 5; i++) {
	 //click the next button
	driver.findElement(By.xpath("//*[@id='mainContent']/div/div[1]/div/div/span[2]")).click();

	 //wait 2 seconds
	  Thread.sleep(1000);
	 
}

Thread.sleep(2000);

driver.findElement(By.xpath("//label[contains(@for,'follow6')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow7')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow8')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow9')]")).click();
driver.findElement(By.xpath("//label[contains(@for,'follow10')]")).click();

driver.navigate().to(driver.getCurrentUrl()); 
driver.close();



	}}
	
