package Zaapin_Project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zaapin {

	WebDriver driver;
	   
	@BeforeTest 
	public void setupt() throws InterruptedException {
    driver= new ChromeDriver();
    driver.get("https://www.hardwarevala.in/finaladmin/index.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    Thread.sleep(Duration.ofSeconds(3));
    WebElement sk = driver.findElement(By.xpath("/html/body/section[2]/div[2]/form[1]/div[1]/input"));
	sk.sendKeys("admin@dinesh");
	
    Thread.sleep(Duration.ofSeconds(2));
    driver.findElement(By.xpath("/html/body/section[2]/div[2]/form[1]/div[2]/input")).sendKeys("admin@monish");
    
    Thread.sleep(Duration.ofSeconds(2));
    driver.findElement(By.xpath("/html/body/section[2]/div[2]/form[1]/div[3]/button")).click();

	}
	
	@Test(priority=2)
	public void Dashboard() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[1]/a")).click();
	Thread.sleep(2000);
	Select vn = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
	vn.selectByVisibleText("Ravet");
	Thread.sleep(2000);
	
	String vc = driver.getCurrentUrl();
	String cv = "https://www.hardwarevala.in/finaladmin/dashboard.php?outlet=ShewalWadi";
	Assert.assertEquals(cv,vc,"url is fail");
    System.out.println(driver.getCurrentUrl());
    }
	
	@Test(priority=1)
	public void Categories() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[3]/td[3]/a")).click();
	WebElement fish = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
	fish.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/fish-fry.jpg");
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	Thread.sleep(2000);
	
	WebElement ds = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(ds.getText().contains("updated Successfully..."));
	
	driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
	Thread.sleep(1000);
		
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[2]/td[3]/a")).click();
    Thread.sleep(2000);
	  
    WebElement fg = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[1]/input"));
    fg.clear();
    Thread.sleep(2000);
	fg.sendKeys("Mutton Birayni");
	Thread.sleep(2000);
	  
	WebElement gh = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
	gh.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Mutton-Biryani.jpg");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	Thread.sleep(1000);
	
	WebElement up = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(up.getText().contains("Successfully..."));
	
	driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
	Thread.sleep(1000);
		
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[1]/td[3]/a")).click();
	Thread.sleep(2000);
	  
	WebElement fd = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
    fd.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Chicken-Biryani-.jpg");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	Thread.sleep(2000);
	
	WebElement pu= driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(pu.getText().contains("updated Successfully..."));
	
	driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
	Thread.sleep(1000);
	
    Select df = new Select(driver.findElement(By.xpath("//*[@id=\"sampleTable_length\"]/label/select")));
	df.selectByIndex(1);
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[4]/td[3]/a")).click();
    Thread.sleep(2000);
    WebElement ft = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
    ft.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/mop.jpeg");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	Thread.sleep(1000);
	
	WebElement jk= driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(jk.getText().contains("updated Successfully..."));
	
	driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[5]/td[3]/a")).click();
    Thread.sleep(2000);
    WebElement vf = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
    vf.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Carpet.jpg");
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
 	Thread.sleep(1000);
 	
 	WebElement lk = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(lk.getText().contains("updated Successfully..."));
	
 	driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
	Thread.sleep(1000);
	
	Select hj = new Select(driver.findElement(By.xpath("//*[@id=\"sampleTable_length\"]/label/select")));
	hj.selectByIndex(2);
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[24]/td[3]/a")).click();
    WebElement gb = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
    gb.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Hammer.jpg");
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
 	Thread.sleep(1000);
 	
 	WebElement jn= driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(jn.getText().contains("updated Successfully..."));
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/aside/ul/li[2]/a/span")).click();
    WebElement vx=   driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input"));
    vx.sendKeys("HAMMER");
    Thread.sleep(3000);
    vx.clear();
    
    }
     @Test(priority=3)
    public void subcategiors() throws InterruptedException{
	driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
    Select gk = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
	gk.selectByVisibleText("chicken biryani");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[2]/input")).sendKeys("chicken biryani");
	Thread.sleep(1000);
		 
	WebElement vl = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
	vl.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Chicken-Biryani-.jpg");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
		
    WebElement fo = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));
	Assert.assertTrue(fo.getText().contains("Sub-Category added Successfully..."));

	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[4]/td[4]/a[2]")).click();
	Alert c = driver.switchTo().alert();
	Thread.sleep(2000);
	c.accept();
	    
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[3]/td[4]/a[1]")).click();
	Thread.sleep(2000);
    Select bk = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
	bk.selectByIndex(24);
	WebElement vp = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
	vp.clear();
	Thread.sleep(2000);
	vp.sendKeys("Mutton Birayni");
	Thread.sleep(1000);
	
    WebElement zx = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
	zx.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Mutton-Biryani.jpg");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
    Thread.sleep(2000);
	    
    }
    
    @Test(priority=4)
    public void Products() throws InterruptedException {
    driver.findElement(By.xpath("/html/body/aside/ul/li[4]/a/span")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/aside/ul/li[4]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    Select nb = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
    nb.selectByVisibleText("Mutton Birayni");
    Thread.sleep(1000);
    
    Select bn = new Select(driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[3]/div/select")));
    bn.selectByIndex(1);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Birayni");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[5]//div[1]//input[1]")).sendKeys("1234");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[6]//div[1]//input[1]")).sendKeys("Rs.130");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[7]//div[1]//input[1]")).sendKeys("Rs.120");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[8]//div[1]//input[1]")).sendKeys("Ravet"+Keys.ENTER);
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[9]//div[1]//input[1]")).sendKeys("2");
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//textarea[@name='productdesc']")).sendKeys("Mutton Biryani = Dum cooked lamb with basmati rice and spices");
    
    Select mn =new Select(driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[11]/div/select")));
    mn.selectByVisibleText("Sw109 | 4% | Shopping | active");
    
    driver.findElement(By.xpath("//div[13]//div[1]//input[1]")).sendKeys("www.MuttonBiryani.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
    
    WebElement vt= driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/form/div/label/input"));
    vt.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Mutton-Biryani.jpg");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/form/div/div[2]/a[2]")).click();
    
    Thread.sleep(2000);
    WebElement tp = driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
    tp.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Mutton-Biryani.jpg");
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
    
    WebElement my = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[1]"));	
	Assert.assertTrue(my.getText().contains("Success! Product is Updated!"));
	
	driver.navigate().back();
	Thread.sleep(200);
	driver.navigate().back();
	
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/form/div/div[1]/button")).click();
	driver.findElement(By.xpath("/html/body/aside/ul/li[4]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/aside/ul/li[4]/ul/li[2]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[8]/td[8]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/h4[1]/div/a[3]")).click();
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	
	//Edit
	Thread.sleep(2000);
    WebElement ft=driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[9]/a/button"));
    Actions bo = new Actions(driver);
    bo.moveToElement(ft).click(ft).build().perform();
	Thread.sleep(2000);
	WebElement zp =driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
	zp.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Screw.png");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	
	WebElement ny = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[1]"));	
    Assert.assertTrue(ny.getText().contains("Success! Product is Updated!"));
		
    }
    
	@Test(priority=5)
	public void Outlets() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[5]/a")).click();
    Select bi = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
    bi.selectByVisibleText("Ravet");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("1234");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
     
    WebElement ty = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
    Assert.assertTrue(ty.getText().contains("Success!1234 is assgined to Ravet!!!"));
 		
    Thread.sleep(5000);
     
    driver.findElement(By.xpath("//tr[@class='odd']//a[@title='Delete pincode'][normalize-space()='Delete']")).click();
    Alert z = driver.switchTo().alert();
    Thread.sleep(3000);
    z.accept();
    
    WebElement ry = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]"));	
    Assert.assertTrue(ry.getText().contains("Pincode Deleted Successfully..."));
    Thread.sleep(2000);
    
    Select bk = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
    bk.selectByVisibleText("Ravet");
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("412101");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
    Thread.sleep(3000);
    
	}
	
	@Test(priority=6)
	public void OffersCoupons() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[6]/a/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("FC143");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"exampleInputAmount\"]")).sendKeys("50%");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("Food Delivery");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[4]//input[1]")).sendKeys("12-12-2025");
	Thread.sleep(2000);
	WebElement rn =	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[6]/input"));
	rn.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/Food-Coupon.png");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	  
	WebElement rq = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
    Assert.assertTrue(rq.getText().contains("Success!Coupon Code added!!"));
	Thread.sleep(3000); 
	   
	WebElement ma = driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input"));
	ma.sendKeys("food");
	Thread.sleep(2000);
	ma.clear();
	
	}
	
	@Test(priority=7)
	public void Orders() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[7]/a/span")).click();	
	Thread.sleep(2000); 
    driver.findElement(By.xpath("/html/body/aside/ul/li[7]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    Select pn = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
    pn.selectByVisibleText("Order Accepted");
     
    Thread.sleep(2000);
    Select pn1 = new Select(driver.findElement(By.xpath("//tbody/tr[3]/td[6]/select[1]")));
    pn1.selectByVisibleText("Order Accepted");
     
    Thread.sleep(2000);
    Select pn2 = new Select(driver.findElement(By.xpath("//tbody/tr[5]/td[6]/select[1]")));
    pn2.selectByVisibleText("Order Accepted");
     
    Thread.sleep(2000);
    Select pn3 = new Select(driver.findElement(By.xpath("//tbody/tr[2]/td[7]/select[1]")));
    pn3.selectByVisibleText("Asad Khan");
     
    Thread.sleep(2000);
    Select pn4 = new Select(driver.findElement(By.xpath("//tbody/tr[5]/td[7]/select[1]")));
    pn4.selectByVisibleText("Kumar");
     
    Thread.sleep(2000);
    Select pn5 = new Select(driver.findElement(By.xpath("//tbody/tr[6]/td[7]/select[1]")));
    pn5.selectByVisibleText("-- NO DELIVERY BOY --");
     
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/aside/ul/li[7]/a/span")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/aside/ul/li[7]/ul/li[2]/a")).click();
     
     
    Thread.sleep(1000);
    Select np = new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[6]/select[1]")));
    np.selectByVisibleText("Order Pending");
     
    Thread.sleep(1000);
    Select np1 = new Select(driver.findElement(By.xpath("//tbody/tr[@class='even']/td[6]/select[1]")));
    np1.selectByVisibleText("Order Pending");
     
    Thread.sleep(1000);
    Select np2 = new Select(driver.findElement(By.xpath("//tbody/tr[3]/td[6]/select[1]")));
    np2.selectByVisibleText("Order Pending");
     
    Thread.sleep(1000);
    Select np3 = new Select(driver.findElement(By.xpath("//tbody/tr[3]/td[7]/select[1]")));
    np3.selectByVisibleText("Mayur wakde");
     
 	driver.findElement(By.xpath("/html/body/aside/ul/li[7]/a/span")).click();	
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/aside/ul/li[7]/ul/li[1]/a")).click();

    driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input")).sendKeys("2209");
    Thread.sleep(1000);
    Select np8 = new Select(driver.findElement(By.xpath("//tbody/tr[@class='odd']/td[6]/select[1]")));
    np8.selectByVisibleText("Order Accepted");
     
    Thread.sleep(1000);
    Select np9 = new Select(driver.findElement(By.xpath("//tbody/tr[@class='odd']/td[7]/select[1]")));
    np9.selectByVisibleText("Mayur wakde");
     
    Select np7 = new Select(driver.findElement(By.xpath("//tbody/tr[@class='odd']/td[6]/select[1]")));
    np7.selectByVisibleText("Order Pending");
     
    Thread.sleep(1000);
    Select np0 = new Select(driver.findElement(By.xpath("//tbody/tr[@class='odd']/td[7]/select[1]")));
    np0.selectByVisibleText("Ravi");
     
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr/td[8]/a")).click();
    Thread.sleep(2000);
     
    WebElement kq = driver.findElement(By.xpath("/html/body/main/div/div/div/section/div[4]/div/a"));
    Actions pb = new Actions(driver);
    pb.moveToElement(kq).click(kq).build().perform();
     
    Set<String>vc = driver.getWindowHandles();
    ArrayList<String> tq = new ArrayList<String>(vc);
    String parent= tq.get(0);
    String child = tq.get(1);
     
    WebElement Tb= driver.findElement(By.xpath("/html/body/main/div/div/div/section/div[3]/div/table/thead[2]/tr[1]/th[6]"));
	System.out.println("Total Amount"+Tb.getText());
    Thread.sleep(4000);
	// Switching to Child Window
	driver.switchTo().window(child);
	WebElement Sk5= driver.findElement(By.xpath("/html/body/section/div[3]/div/table/thead[2]/tr[5]/th[6]"));
	System.out.println("Net total="+Sk5.getText());
	Thread.sleep(4000);
	driver.close();
	//Switching to Parent window
	driver.switchTo().window(parent);
	WebElement Rk5 = driver.findElement(By.xpath("/html/body/main/div/div/div/section/div[2]/div[1]/address/strong"));
	System.out.println("msg3="+Rk5.getText());
	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().back();
	
    }
	@Test(priority=8)
	public void Users() throws InterruptedException{
		
	driver.findElement(By.xpath("/html/body/aside/ul/li[8]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/aside/ul/li[8]/ul/li[1]/a")).click();
		
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[2]/div/input")).sendKeys("Karan Arjun");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[3]/div/input")).sendKeys("1234567890");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[4]/div/input")).sendKeys("KA12@gmail.com");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[5]/div/input")).sendKeys("420");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[6]/div/input")).sendKeys("galaxy");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[7]/div/input")).sendKeys("Hadpsar");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[8]/div/input")).sendKeys("Pune");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[9]/div/input")).sendKeys("411028");
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[10]/div/input")).sendKeys("12345678");

	Thread.sleep(2000);
	WebElement Ai = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[11]/div/input"));
    Ai.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/download.jpg");
	Thread.sleep(2000);
	WebElement Ai1 = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[12]/div/input"));
	Ai1.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/images.jpg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/div/div/button[1]")).click();
	Thread.sleep(2000);
		 
	//View customer
    driver.findElement(By.xpath("/html/body/aside/ul/li[8]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/aside/ul/li[8]/ul/li[2]/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input")).sendKeys("789");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]/a")).click();
	Thread.sleep(1000);
		 
	//Scroll down
	JavascriptExecutor Sk8= (JavascriptExecutor)driver;
	Sk8.executeScript("window.scrollBy(10,document.body.scrollHeight)");
	Thread.sleep(3000);
	//Scroll up
	JavascriptExecutor Sk9= (JavascriptExecutor)driver;
	Sk9.executeScript("window.scrollTo(150,document.body.scrollTop)");
	Thread.sleep(1000);
		
	driver.navigate().back();
	Thread.sleep(1000);
		
	//View Delivery Boys
	driver.findElement(By.xpath("/html/body/aside/ul/li[8]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/aside/ul/li[8]/ul/li[3]/a")).click();
		
	driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input")).sendKeys("890");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[1]/td[4]/a")).click();
	Thread.sleep(3000);
		
	JavascriptExecutor Sp5= (JavascriptExecutor)driver;
	Sp5.executeScript("window.scrollBy(10,document.body.scrollHeight)");
	Thread.sleep(5000);
	JavascriptExecutor Sp6= (JavascriptExecutor)driver;
    Sp6.executeScript("window.scrollTo(150,document.body.scrollTop)");
    Thread.sleep(3000);
     
    driver.navigate().back();
    Thread.sleep(1000);
    driver.navigate().back();
     
     }
	//@Test(priority=9)
	public void Sections() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[9]/a")).click();
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div/input")).sendKeys("Pizza");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
		
    WebElement rq = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(rq.getText().contains("Success!Section added Successfully..."));
	    
	Thread.sleep(4000);
	WebElement go=	driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input"));
	go.sendKeys("Pizza");
	Thread.sleep(3000);
	go.clear();	
		
	}
	
	@Test(priority=10)
	public void Contents() throws InterruptedException {
    Thread.sleep(1000);
    WebElement click= driver.findElement(By.xpath("/html/body/aside/ul/li[10]/ul/li[1]/a"));
    Actions xu = new Actions(driver);
    xu.moveToElement(click).click(click).build().perform();
    
    driver.findElement(By.xpath("/html/body/aside/ul/li[10]/ul/li[1]/a")).click();
    Thread.sleep(2000);
    Select co = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
	co.selectByVisibleText("Pizza");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Corn Pizza");
	
	driver.findElement(By.xpath("//div[3]//div[1]//input[1]")).sendKeys("RS.299");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[4]//div[1]//input[1]")).sendKeys("4");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[5]//div[1]//input[1]")).sendKeys("<img src =\"pizza.png\" alt=\"slice of pizza on a pate\"");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//textarea[@name='contentdesc']")).sendKeys("Pizza is an italian food that was created in italy");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//div[7]//div[1]//input[1]")).sendKeys("11-11-2024");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//div[8]//div[1]//input[1]")).sendKeys("Pune");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//div[9]//div[1]//input[1]")).sendKeys("www.foodie.com");
	Thread.sleep(1000);

	WebElement zy =driver.findElement(By.xpath("//*[@id=\"fupImage\"]"));
	zy.sendKeys("D:/WorkSpace/Selenium/src/test/java/SeleniumProject/pizza.jpg");
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
	
	 WebElement br = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(br.getText().contains("Success!content added Successfully..."));
	
	driver.findElement(By.xpath("/html/body/aside/ul/li[10]/a/span")).click();
     Thread.sleep(1000);
     
	driver.findElement(By.xpath("/html/body/aside/ul/li[10]/ul/li[2]/a")).click();
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input")).sendKeys("pizza"); 
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr/td[5]/a[1]")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor Sp0= (JavascriptExecutor)driver;
	Sp0.executeScript("window.scrollBy(10,document.body.scrollHeight)");
	Thread.sleep(5000);
	
	JavascriptExecutor Sd0= (JavascriptExecutor)driver;
    Sd0.executeScript("window.scrollTo(150,document.body.scrollTop)");
    Thread.sleep(3000);
     
	driver.navigate().back();
	WebElement ix =  driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input"));
	ix.clear();
	Thread.sleep(1000);
	ix.sendKeys("pizza"); 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[1]/td[5]/a[4]")).click();
	
    WebElement link=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
	link.sendKeys("https://youtu.be/gUlsgxzY9GU?si=oFJ8aiZLKv0fU9Le");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/form/div/div/button")).click();
    
    WebElement br2 = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
   	Assert.assertTrue(br2.getText().contains("Success!Video added Successfully"));
   	
   	Thread.sleep(3000);
   	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a[1]/img")).click();
   	Alert x =driver.switchTo().alert();
   	Thread.sleep(3000);
   	x.accept();
   	
    WebElement br3 = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
   	Assert.assertTrue(br3.getText().contains("Success!Video Deleted Successfully"));
   	Thread.sleep(1000);
   	driver.navigate().back();
   	driver.navigate().back();
   	driver.navigate().back();
    Thread.sleep(1000);
    
   	}
	
	@Test(priority=11)
	public void Expenses() throws InterruptedException {
    driver.findElement(By.xpath("/html/body/aside/ul/li[11]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/aside/ul/li[11]/ul/li[1]/a")).click();
		
	Select xx = new Select(driver.findElement(By.xpath("//*[@id=\"select\"]")));
	xx.selectByVisibleText("Ravet");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[2]/div/input")).sendKeys("450");
	Thread.sleep(1000);
	Select zz = new Select(driver.findElement(By.xpath("//div[3]//div[1]//select[1]")));
	zz.selectByVisibleText("Vegetables");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/form/div[4]/div/input")).sendKeys("11-11-2024");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@placeholder='Enter Note']")).sendKeys("Eating vegetables is an important part of a healthy diet.");
    Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/div/div/button[1]")).click();
	
    WebElement br3 = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(br3.getText().contains("Success! Expense added successfully!"));
	Thread.sleep(2000);
	
	//View Expenses
	driver.findElement(By.xpath("/html/body/aside/ul/li[11]/a/span")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/aside/ul/li[11]/ul/li[2]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"sampleTable_filter\"]/label/input")).sendKeys("Vegetables");
    Thread.sleep(2000);
    //Delete
    driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[1]/td[7]/a")).click();
    Alert zx =driver.switchTo().alert();
    Thread.sleep(2000);
    zx.accept();
    
    WebElement br4 = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]"));	
	Assert.assertTrue(br4.getText().contains("Success! Expense deleted successfully..."));
	
    driver.navigate().back();
    Thread.sleep(1000);
    driver.navigate().back();
    Thread.sleep(1000);
    driver.navigate().back();
    }
	@Test(priority=12)
	public void Settings() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/aside/ul/li[12]/a/span")).click();
	
	WebElement qp = driver.findElement(By.xpath("//div[@class='tile-body']//div[1]//div[1]//input[1]"));
	qp.clear();
	qp.sendKeys("Yash kakade");
	Thread.sleep(1000);
	
	WebElement qp1 = driver.findElement(By.xpath("//div[2]//div[1]//input[1]"));
	qp1.clear();
	qp1.sendKeys("1234567890");
	Thread.sleep(1000);
	
	WebElement qp2 = driver.findElement(By.xpath("//div[3]//div[1]//input[1]"));
	qp2.clear();
	qp2.sendKeys("Yashkakade12@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[2]/button")).click();
		
	WebElement br7 = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]"));	
	Assert.assertTrue(br7.getText().contains("Success!Settings updated Successfully..."));
    Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/aside/ul/li[1]/a/span")).click();
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	}
	


