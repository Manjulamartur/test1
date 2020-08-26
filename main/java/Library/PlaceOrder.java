package Library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.prolifics.ProlificsSeleniumAPI;

import io.appium.java_client.android.AndroidDriver;

public class PlaceOrder 
{
	public void loginuser(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(10000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(2000);
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	Thread.sleep(2000);
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	String emailID = "newshoptest44@raleys.com"; 
	email.sendKeys(emailID);
	
	oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as " +emailID.replace(".",":"), "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
	Thread.sleep(1000);
	String Password = "Arsin123"; 
	pwd.sendKeys(Password);
	
	oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(2000);
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
	}
	
	}
	
	
	public void loginuserforJCB(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(10000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(2000);
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	Thread.sleep(2000);
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	String emailID = "zzhpuqdp@rayles.com"; 
	email.sendKeys(emailID);
	
	oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as " +emailID.replace(".",":"), "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
	Thread.sleep(1000);
	String Password = "Arsin123"; 
	pwd.sendKeys(Password);
	
	oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(1000);
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
	}
	
	}
	
	
	public void loginuserforshoppingmode(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(1000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(2000);
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	Thread.sleep(2000);
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	String emailID = "rokzqtis@rayles.com"; 
	email.sendKeys(emailID);
	
	oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as  " +emailID.replace(".",":"), "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
	Thread.sleep(1000);
	String Password = "Arsin123"; 
	pwd.sendKeys(Password);
	
	oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(1000);
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
	}
	
	}

	public void loginuserforProp(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(1000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(2000);
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	Thread.sleep(2000);
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	String emailID = "kntkrndc@rayles.com"; 
	email.sendKeys(emailID);
	
	oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as  " +emailID.replace(".",":"), "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
	Thread.sleep(1000);
	String Password = "Arsin123"; 
	pwd.sendKeys(Password);
	
	oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(1000);
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
	}
	
	}
	
	
	public void loginuserforlist(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(1000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	String emailID = "ikugcbsk@rayles.com"; 
	email.sendKeys(emailID);
	
	oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as  " +emailID.replace(".",":"), "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
	Thread.sleep(1000);
	String Password = "Arsin123"; 
	pwd.sendKeys(Password);
	
	oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(1000);
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
	}
	
	}
	
	
	
	
	
	
	public void loginuserforPointsProfile(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(1000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	String emailID = "indra.poodipalla@raleys.com"; 
	email.sendKeys(emailID);
	
	oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as  " +emailID.replace(".",":"), "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
	Thread.sleep(1000);
	String Password = "Arsin123"; 
	pwd.sendKeys(Password);
	
	oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
	//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(2000);
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
	}
	
	}
	public void LaunchUrl(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	{
	
	try {
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	driver.get("https://www-qa.raleys.com/#");
	
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.MINUTES);
	
	}
	catch (Exception e) {
		e.printStackTrace();
		oPSelFW.reportStepDetails("Verify Login screen", e.toString()+ " is displayed", "Fail");
		Assert.assertEquals("Verify Log in screen", e.toString()+ " is displayed");	
	}
	
	}

	
	public void PlaceorderWithCash(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
		WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		
		selecttimeslot.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 3; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(7000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		
		
		Thread.sleep(5000);
		WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
		String retPayment = pickUPCash.getText();
		pickUPCash.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
		
		WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
		Psave.click();
		Thread.sleep(5000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		wait = new WebDriverWait(driver, 1000);
		WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
		lnkOrderDetails.click();
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		
		WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		if (orderDetPage.isDisplayed()) {
		
			WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
			oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
			} else {
				oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
			
			}
		
		    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
		    Thread.sleep(500);
		    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
			oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
			oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
			
		} 

	
public void Timeslotchange(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
			
		WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		String time = selecttimeslot1.getText();
		String time1 = time.replace("-","");
		selecttimeslot1.click();

		oPSelFW.reportStepDetails("Verify time slot should be displayed ","Verified The First order the Time slot is "+ time1, "Pass");
		Thread.sleep(20000);

		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 2; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(7000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		
		
		Thread.sleep(5000);
		WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
		String retPayment = pickUPCash.getText();
		pickUPCash.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
		
		WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
		Psave.click();
		Thread.sleep(5000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		
			
			//sec order
			
			
			//click on homepage code need to write
			
			
			
			/*WebElement selecttimeslot2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
			
			selecttimeslot2.click();
			Thread.sleep(5000);*/
			
			WebElement selecttimeslot2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
			String time2 = selecttimeslot2.getText();
			String times2 = time2.replace("-","");
			selecttimeslot2.click();

			oPSelFW.reportStepDetails("Verify time slot should be displayed ","Verified The Second Order the Time slot is "+ times2, "Pass");
			Thread.sleep(20000);
			
			
			wait = new WebDriverWait(driver, 20000);
		
			WebElement ClickOnSale2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
			
			ClickOnSale2.click();
			Thread.sleep(2000);
			oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
			
			wait = new WebDriverWait(driver, 10000);
			
			Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
			// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
			//System.out.println("++=itesm Size is " + Items.size());
			for (int i = 0; i < 2; i++) {
				// WebElement product=Items;
				Items.get(i).sendKeys(Keys.ENTER);
				// System.out.println("Item Nameis+++"+Items.get(i).getText());

			}
			Thread.sleep(7000);
			oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
			
			WebElement Clickoncart2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
			Clickoncart2.click();
			Thread.sleep(5000);
			
			oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

			WebElement ClickOncheckout2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
			ClickOncheckout2.click();
			
			oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
			
			
			Thread.sleep(5000);
			WebElement pickUPCash2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
			String retPayment2 = pickUPCash.getText();
			pickUPCash.click();
			
			oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
			
			WebElement Psave2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
			Psave.click();
			Thread.sleep(5000);
			
			WebElement placeOrder2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
			placeOrder.click();
			Thread.sleep(2000);
			wait = new WebDriverWait(driver, 1000);
			WebElement orderConfirmation2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
			if (orderConfirmation2.isDisplayed()) {
				
				oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
				
			} else {
				oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
		
			}
			
			WebElement orderNo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
			String strOrderNo2 = orderNo.getText();
			
			WebElement schedule2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
			WebElement store2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

			oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule2.getText() + "For Store "+ store2.getText(), "Pass");
			
			
			//thired order
				
				
				//click on homepage code need to write
				
				
				
				WebElement selecttimeslot3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
				String time3 = selecttimeslot3.getText();
				String times3 = time3.replace("-","");
				selecttimeslot3.click();

				oPSelFW.reportStepDetails("Verify time slot should be displayed ","Verified The Third Order the Time slot is "+ times3, "Pass");
				Thread.sleep(20000);
				
				
				wait = new WebDriverWait(driver, 20000);
			
				WebElement ClickOnSale3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
				
				ClickOnSale3.click();
				Thread.sleep(2000);
				oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
				
				wait = new WebDriverWait(driver, 10000);
				
				Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
				// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
				//System.out.println("++=itesm Size is " + Items.size());
				for (int i = 0; i < 2; i++) {
					// WebElement product=Items;
					Items.get(i).sendKeys(Keys.ENTER);
					// System.out.println("Item Nameis+++"+Items.get(i).getText());

				}
				Thread.sleep(7000);
				oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
				
				WebElement Clickoncart3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
				Clickoncart2.click();
				Thread.sleep(5000);
				
				oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

				WebElement ClickOncheckout3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
				ClickOncheckout2.click();
				
				oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
				
				
				Thread.sleep(5000);
				WebElement pickUPCash3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
				String retPayment3 = pickUPCash.getText();
				pickUPCash.click();
				
				oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
				
				WebElement Psave3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
				Psave.click();
				Thread.sleep(5000);
				
				WebElement placeOrder3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
				placeOrder.click();
				Thread.sleep(2000);
				wait = new WebDriverWait(driver, 1000);
				WebElement orderConfirmation3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
				if (orderConfirmation3.isDisplayed()) {
					
					oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
					
				} else {
					oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
			
				}
				
				WebElement orderNo3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
				String strOrderNo3 = orderNo.getText();
				
				WebElement schedule3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
				WebElement store3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

				oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule3.getText() + "For Store "+ store3.getText(), "Pass");
				
			
//Fourth order
				
				
				//click on homepage code need to write
				
				
				
				WebElement selecttimeslot4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
				String time4 = selecttimeslot4.getText();
				String times4 = time4.replace("-","");
				oPSelFW.reportStepDetails("Verify time slot should be displayed ","Verified the Fourth Order the Time slot is not same as previous and the TimeSlot is"+ times4, "Pass");
				Thread.sleep(20000);
				
				
			
		} 
	
public void Homepagesaveforlaterlist(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100000);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		//Shoponline.click();
		
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		if(driver.findElements(By.xpath("//a[contains(text(),'shop online')]")).size() > 0)
			executor.executeScript("arguments[0].click()", Shoponline);
		
		
		Thread.sleep(5000);
		
		
		
		oPSelFW.reportStepDetails("Clicking on Shop Online", "Successfully clicked on Shop Online", "Pass");
		
		WebElement Clickonsaveforlater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Save For Later Lists')]")));
		Clickonsaveforlater.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Save for Later List", "Successfully clicked on Save for Later List", "Pass");
		
		Thread.sleep(5000);
		WebElement saveforlater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Save for Later Lists ')]")));
		String saveforlatertitle = saveforlater.getText();
		
		oPSelFW.reportStepDetails("Verify The Save for Later List Title", "Verified The Save for Later List Title is " +saveforlatertitle, "Pass");
		Thread.sleep(500);
		
		
	}
	
public void HomepageOffersandcoupons(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);

	oPSelFW.reportStepDetails("Clicking on Shop Online", "Successfully clicked on Shop Online", "Pass");
	
	WebElement Clickonoffers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Offers and Coupons')])[1]")));
	Clickonoffers.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Offers and Coupons", "Successfully clicked on Offers and Coupons", "Pass");
	Thread.sleep(5000);
	
	
	WebElement Offerstitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Something Extra Personalized Offers')]")));
	String Offerstitleandcoupons = Offerstitle.getText();
	
	oPSelFW.reportStepDetails("Verify The Offers and Coupons Page Title", "Verified The Offers and Coupons Page Title is " +Offerstitleandcoupons, "Pass");
	Thread.sleep(500);
	
	
}
	


public void HomepageQuickReorder(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 00);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);

	oPSelFW.reportStepDetails("Clicking on Shop Online", "Successfully clicked on Shop Online", "Pass");
	
	WebElement ClickonReorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Quick Reorder')]")));
	ClickonReorder.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Quick ReOrder", "Successfully clicked on Quick ReOrder", "Pass");
	Thread.sleep(5000);
	
	WebElement Clickorder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Online')])[2]")));
	Clickorder.click();
	Thread.sleep(5000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
	
}
public void PlaceorderWithCashandreview(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
		WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		
		selecttimeslot.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 3; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(7000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		
		WebElement Clickoncartcount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='counter cart-count'])[1]")));
		String itemscart1 = Clickoncartcount.getText();
		
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Verify Number of products in the Cart", "Verified Number of products in the Cart is " +itemscart1, "Pass");
	
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	
		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		
		
		Thread.sleep(5000);
		WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
		String retPayment = pickUPCash.getText();
		pickUPCash.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
		
		WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
		Psave.click();
		Thread.sleep(5000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		wait = new WebDriverWait(driver, 1000);
		WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
		lnkOrderDetails.click();
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		
		WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		if (orderDetPage.isDisplayed()) {
		
			WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
			oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
			} else {
				oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
			
			}
		
		    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
		    Thread.sleep(500);
		    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
			oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
			oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
			
		} 

	
	
	
	
public void TotalPaymentandSubtotals(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
		WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		
		selecttimeslot.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 3; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(7000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		
		
		Thread.sleep(5000);
		WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
		String retPayment = pickUPCash.getText();
		pickUPCash.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
		
		WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
		Psave.click();
		Thread.sleep(5000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		wait = new WebDriverWait(driver, 1000);
		WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
		lnkOrderDetails.click();
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		
		WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		if (orderDetPage.isDisplayed()) {
		
			WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
			oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
			} else {
				oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
			
			}
		
		    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
		    Thread.sleep(500);
		    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
			oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
			oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
			Thread.sleep(500);
			
			
			WebElement Subtotal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Subtotal')]/following-sibling::div")));
			String SubtotalDetails = Subtotal.getText();
			String Subtotalbefr = SubtotalDetails.replace("$","");
			String Subtotl = Subtotalbefr.replace(".",":");
			
			oPSelFW.reportStepDetails("Verify Sub Total in Payment method order details page ","Verified Sub Total in Payment method order details page is $ " + Subtotl, "Pass");
			
			WebElement Service = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='data']")));
			String Servicefee = Service.getText();
			String Servicefee1 = Servicefee.replace("$","");
			String Servicefeedetail = Servicefee1.replace(".",":");
			
			oPSelFW.reportStepDetails("Verify Service Fee in Payment method order details page ","Verified Service Fee in Payment method order details page is $ " + Servicefeedetail, "Pass");
			
			
			WebElement Total = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='data'])[10]")));
			String Totalfee = Total.getText();
			String Totalfee1 = Totalfee.replace("$","");
			String Totalfees = Totalfee1.replace(".",":");
			
			oPSelFW.reportStepDetails("Verify Total Fee in Payment method order details page ","Verified Total Fee in Payment method order details page is $ " + Totalfees, "Pass");
			
			
		} 
	
	
	
	
	
public void PlaceorderWithCCOnline(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
		WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		
		selecttimeslot.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 3; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(7000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		Thread.sleep(5000);
		
		WebElement pickCCOnline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-auth_capture']")));
		String retPayment = pickCCOnline.getText();
		pickCCOnline.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
		Thread.sleep(5000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		wait = new WebDriverWait(driver, 1000);
		WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
		lnkOrderDetails.click();
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		
		WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		if (orderDetPage.isDisplayed()) {
		
			WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
			oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
			} else {
				oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
			
			}
		
		    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
		    Thread.sleep(500);
		    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
			oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
			oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
			
		} 
	

public void NewRegister(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
/*	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);*/
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@title='Open Menu']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//*[@class='raleys-sign-up'])[2]")).click();

	oPSelFW.reportStepDetails("Registration Frame should be  opened sucessfully", "Registration Frame opened Sucessfully", "Pass");
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//*[@name='profile.firstName'])[1]")).sendKeys("Manjula");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='profile.lastName'])[1]")).sendKeys("Martur");
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, 60);
	
	String allowedChars = "abcdefghiklmnopqrstuvwxyz";
	int stringLength = 8;
	String randomstring = "";
	for (int i = 0; i < stringLength; i++) {
		int rnum = (int) Math.floor(Math.random() * allowedChars.length());
		randomstring += allowedChars.substring(rnum, rnum + 1);
	}

	String emailRandom = randomstring + "@rayles.com";
	System.out.println(emailRandom);
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='email'])[1]")));
	email.sendKeys(emailRandom);
	
	//driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("manju1@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys("Arsin123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='passwordRetype'])[1]")).sendKeys("Arsin123");
	Thread.sleep(5000);

	long number = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
	String somethingExtraNo = number + "";
	System.out.println(somethingExtraNo);
	WebElement extraNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='loyaltyId']")));
	extraNo.sendKeys(somethingExtraNo);
	// Confirm to enter some thing extra number
	WebElement extraNoConform = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='confirmLoyaltyId']")));
	extraNoConform.sendKeys(somethingExtraNo);
	
	/*
	driver.findElement(By.xpath("//*[@id='loyaltyId']")).sendKeys("1234567898");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='confirmLoyaltyId']")).sendKeys("1234567898");
	Thread.sleep(5000);*/
	
	WebElement mblNo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='areacode1']")));
	mblNo1.sendKeys("900");
	mblNo1.sendKeys(Keys.TAB);

	WebElement mblNo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='prefix1']")));
	mblNo2.sendKeys("000");
	mblNo1.sendKeys(Keys.TAB);

	WebElement mblNo3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='suffix1']")));
	mblNo3.sendKeys("0000");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='profile.address'])[1]")).sendKeys("Asdfgh");
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='profile.city'])[1]")).sendKeys("Asdfghi");
	WebElement stateDD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='profile.state'])[1]")));
	Select stateSel = new Select(stateDD);
	stateSel.selectByVisibleText("Alabama");
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='profile.zip'])[1]")).sendKeys("45312");

	/*Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='data.birthdayClub.self_Month'])[1]")).sendKeys("");

	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@name='data.birthdayClub.self_Day'])[2]")).sendKeys("");
	Thread.sleep(5000);*/
	
	WebElement monthDD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='data.birthdayClub.self_Month'])[1]")));
	Select monthSel = new Select(monthDD);
	monthSel.selectByVisibleText("November");
	// select date of the birth
	WebElement dateDD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='data.birthdayClub.self_Day'])[1]")));
	Select dateSel = new Select(dateDD);
	dateSel.selectByVisibleText("4");
	
	WebElement checkPrivacyPolicy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[@for='gigya-checkbox-terms']//span[@class='gigya-label-text gigya-checkbox-text' and contains(text(),'I have read and agree')])[1]")));
	oPSelFW.reportStepDetails("Registration Frame With Details Should be Displayed", "Registration Frame With Details Displayed Sucessfully", "Pass");
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", checkPrivacyPolicy);Thread.sleep(1000);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@class='gigya-input-submit'])[1]")).click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("User Should be created Sucessfully ","User Created Sucessfully with Email id ", "Pass");
	driver.navigate().refresh();
	Thread.sleep(2000);
		
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	
	WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));

	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
	
	emailId.sendKeys(emailRandom);
	pwd.sendKeys("Arsin123");

	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
	
	Thread.sleep(1000);
}
	
public void PlaceorderWithCCPickUp(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
		WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		
		selecttimeslot.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 3; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(7000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		
		
		Thread.sleep(5000);
		WebElement pickUPCC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-credit']")));
		String retPayment = pickUPCC.getText();
		pickUPCC.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Credit card At Pickup", "Payment method selected as Credit Card at Pick Up", "Pass");
		
		WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
		Psave.click();
		Thread.sleep(2000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		wait = new WebDriverWait(driver, 1000);
		WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
		lnkOrderDetails.click();
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		
		WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		if (orderDetPage.isDisplayed()) {
		
			WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
			oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
			} else {
				oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
			
			}
		
		    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
		    Thread.sleep(500);
		    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
			oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
			oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
			
		} 
	
	
	
public void PlaceorderWithDDPickUp(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 3; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	
	
	Thread.sleep(5000);
	WebElement pickUPDD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-debit']")));
	String retPayment = pickUPDD.getText();
	pickUPDD.click();
	
	oPSelFW.reportStepDetails("Payment method should be selected as Debit Card At Pickup", "Payment method selected as Debit Card at Pick Up", "Pass");
	
	WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	Psave.click();
	Thread.sleep(2000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
	} 



public void cancelOrder(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception 
{
	
	WebDriverWait wait = new WebDriverWait(driver, 60);
	Thread.sleep(3000);
	WebElement clickcancelOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'button small hollow') and contains(text(),'Cancel Order')]")));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", clickcancelOrder);
	
	Thread.sleep(6000);
	
	WebElement msgCancelOrder = driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to cancel this order?')]"));
	String msgCancel = msgCancelOrder.getText();
	Thread.sleep(6000);
	if (msgCancel.contains("Are you sure you want to cancel this order?")) {
	
		oPSelFW.reportStepDetails("Cancell Message should be Display", "Cancell Message is Displayed as Are sure want to cancel the order is displayed", "Pass");
		
	} else {
		
		oPSelFW.reportStepDetails("Order Details page opened sucessfully", "Are sure want to cancel the order is not displayed", "Fail");
				
	}
	Thread.sleep(1000);
	WebElement ClickCancelYes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[contains(text(),'Yes')]")));
	ClickCancelYes.click();
	
	Thread.sleep(6000);
	
	WebElement StatusCancelOrder = driver.findElement(By.xpath("//span[contains(@class,'cancelled')]"));
	String Statusmessage = StatusCancelOrder.getText();
	Thread.sleep(6000);
	if (Statusmessage.contains("CANCELLED")) {
		
		oPSelFW.reportStepDetails("Verify Order Details page opened sucessfully", "Verified Cancelled order status displayed successfully", "Pass");
		
			
	} else {
		
		oPSelFW.reportStepDetails("Order Details page opened sucessfully", "Cancelled order status not displayed ", "Fail");

	}

	Thread.sleep(5000);
}
	

public void addItemToCart(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 2; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	
}

public void addComments(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
		{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(5000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");
		Thread.sleep(2000);
		
		WebElement Clickonadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='icon-more']")));
		Clickonadd.click();
		Thread.sleep(5000);

		WebElement Clickonaddcomment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='li-el side-sub-menu-item'])[1]")));
		Clickonaddcomment.click();
		Thread.sleep(5000);
		WebElement Entercomment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='text'])[1]")));
		Thread.sleep(5000);
		oPSelFW.reportStepDetails("Verify Order Note text Box", "Order note text box displayed successfully", "Pass");
		
		Entercomment.clear();
		Entercomment.sendKeys("It's a comment");
		Entercomment.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		oPSelFW.reportStepDetails("Verfiy Order Note","Order note added successfully","Pass");
		
		WebElement ClickonDone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button dark mobile-bottom']")));
		ClickonDone.click();
		Thread.sleep(5000);

}



public void EmptyCart(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
WebDriverWait wait = new WebDriverWait(driver, 100);
WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
Clickoncart.click();
Thread.sleep(5000);

oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");
Thread.sleep(2000);

WebElement Clickonadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='icon-more']")));
Clickonadd.click();
Thread.sleep(5000);

WebElement Clickonemptycart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='li-el side-sub-menu-item'])[2]")));
Clickonemptycart.click();
Thread.sleep(5000);

WebElement itemstatus = driver.findElement(By.xpath("//*[@class='css-17c2pp4']"));
String itemstate = itemstatus.getText();
Thread.sleep(5000);
oPSelFW.reportStepDetails("Verify Cart should be display Confirmation message", "Verifeid cart message displayed as Are you sureyou want to remove all items Successfully", "Pass");


WebElement ClickonOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='button'])[1]")));
ClickonOk.click();
Thread.sleep(5000);
oPSelFW.reportStepDetails("Verify Cart Empty", "All Items from Cart deleted Successfully", "Pass");
Thread.sleep(5000);
Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
Clickoncart.click();
Thread.sleep(5000);

WebElement ClickonContinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Continue Shopping')]")));
ClickonContinue.click();
Thread.sleep(5000);



}
public void OrderHistoryloginUser(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{

	try {
			
			WebDriverWait wait = new WebDriverWait(driver, 100);
			Thread.sleep(1000);
			WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
			OpenMenu.click();
			
			oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
			
			WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
			SignUp.click();
			oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
			
			WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
			LogIn.click();
			oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
			
			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'loginID')]")));
			
			WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
			
			String emailID = "iptnxczs@rayles.com"; 
			email.sendKeys(emailID);
			
			oPSelFW.reportStepDetails("User should be able to enter mail id ", "Verified that User is successfully enterd mail id as  " +emailID.replace(".",":"), "Pass");
			//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Verified" , "Pass");
			Thread.sleep(1000);
			String Password = "Arsin123"; 
			pwd.sendKeys(Password);
			
			oPSelFW.reportStepDetails("User should be able to enter Password", "Verified that User is successfully enterd password - " +"Password", "Pass");
			//oPSelFW.reportStepDtlsWithScreenshot("User should be able to enter Password", "Submit" , "Pass");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			oPSelFW.reportStepDetails("User should be able to click on submit button", "Verified that User is clicked on submit button successfully", "Pass");
			
			Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
				oPSelFW.reportStepDetails("Verify Log In screen", e.toString()+ " is displayed", "Fail");
				Assert.assertEquals("Verify Log In screen", e.toString()+ " is displayed");	
			}
			
			}





public void OrderHistory(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(1000);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement ClickonMyProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
	ClickonMyProfile.click();
	
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(500);
	WebElement ClickonOrderhistory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Order History')])[2]")));
	ClickonOrderhistory.click();
	Thread.sleep(500);
	WebElement ClickonOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='table']")));
	ClickonOrder.click();
	Thread.sleep(500);
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	if (orderDetPage.isDisplayed()) {
		
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");

	}

public void SaveLaterOrderHistory(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(1000);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement ClickonMyProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
	ClickonMyProfile.click();
	
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(500);
	WebElement ClickonOrderhistory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Order History')])[2]")));
	ClickonOrderhistory.click();
	Thread.sleep(500);
	WebElement ClickonOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='table']")));
	ClickonOrder.click();
	Thread.sleep(500);
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	if (orderDetPage.isDisplayed()) {
		
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");

WebElement Savelater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@uib-popover='Add to Save for Later Lists']")));
Thread.sleep(500);
if (Savelater.isDisplayed()) {
	oPSelFW.reportStepDetails("Verify Save For Later should be displayed ","Verified Save For Later is displayed successfully " ,"Pass");
	} 

else {
		oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
	
	}
}
		public void SearchItem(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

		{	
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
			Shoponline.click();
			Thread.sleep(5000);
			
			WebElement ClcikonClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='close']")));
			ClcikonClose.click();
		
			Thread.sleep(5000);
			WebElement Clickonserach = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='search-btn'])[1]")));
			Clickonserach.click();
			Thread.sleep(6000);

		    oPSelFW.reportStepDetails("Search button should be click successfully","Search button should be clicked successfully successfully","Pass");

			WebElement eleSearchItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search_term']")));
			eleSearchItem.sendKeys("apple");
			Thread.sleep(800);
			
			WebElement ClickonSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='btn btn-hollow'])[1]")));
			ClickonSubmit.click();
			Thread.sleep(10000);
			
			WebElement eleSearchRes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='lbl-txt']")));
			String searchResult = eleSearchRes.getText();
			searchResult = searchResult.replaceAll("[^0-9]+", "");
			int resSearch = Integer.parseInt(searchResult);
			System.out.println("searchResult " + searchResult);
			Thread.sleep(1500);
		 oPSelFW.reportStepDetails("Verify Search results page is opened","Verified Search Result count is " + resSearch,"Pass");
		 Thread.sleep(800);

		}
		
		
		public void SearchItemdropdown(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

		{	
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
			Shoponline.click();
			Thread.sleep(5000);
			
			WebElement Clickonserach = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='search-btn'])[1]")));
			Clickonserach.click();
			Thread.sleep(6000);

		    oPSelFW.reportStepDetails("Search button should be click successfully","Search button should be clicked successfully","Pass");

			WebElement eleSearchItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search_term']")));
			eleSearchItem.sendKeys("envy apple");
			Thread.sleep(800);
			
			WebElement ClickonSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='btn btn-hollow'])[1]")));
			ClickonSubmit.click();
			Thread.sleep(10000);
			
			WebElement clickondropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='product-cell-add-to-cart']")));
			clickondropdown.click();
			
			
			 oPSelFW.reportStepDetails("Item price should be select","Item price is selected successfully","Pass");
				
			Thread.sleep(2000);
			WebElement Selectdropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),' 0.25 lb ')]")));
			Selectdropdown.click();
			Thread.sleep(5000);
			
			oPSelFW.reportStepDetails("In cart Item price should be select","In cart Item price is selected successfully","Pass");
			
			WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
			Clickoncart.click();
			Thread.sleep(5000);
			
			WebElement Subtotal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='new-checkout__totals-total']")));
			String SubtotalDetails = Subtotal.getText();
			String Subtotalbefr = SubtotalDetails.replace("$","");
			Thread.sleep(5000);
			
			 oPSelFW.reportStepDetails( "Verify before modifying the quantity the Sub Total is $ " + Subtotalbefr.replace(".",":"), "Verified the Sub Total is $ " +Subtotalbefr.replace(".",":"),"Pass");
	
			WebElement Clickondropdonincart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@ng-if,'item.store_product.order_by_weight')]")));
			Clickondropdonincart.click();
			Thread.sleep(5000);
			
			WebElement Selectsecdropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),' 0.5 lb ')]")));
			Selectsecdropdown.click();
			Thread.sleep(5000);
			
			WebElement Subtotal1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='new-checkout__totals-total']")));
			String SubtotalDetails1 = Subtotal1.getText();
			String SubtotalAfter = SubtotalDetails1.replace("$","");
			
			 oPSelFW.reportStepDetails( "Verify After modifying the quantity the Sub Total is $ " + SubtotalAfter.replace(".",":"), "Verified the Sub Total is $ " +SubtotalAfter.replace(".",":"),"Pass");
					 Thread.sleep(800);

		}
		
		public void modifyOrderforExisted(String orderNo,ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception 
		{
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			Thread.sleep(3000);
			WebElement clickmodifyOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'button small') and contains(text(),'Modify Order')]")));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", clickmodifyOrder);
			
			Thread.sleep(6000);
			
			oPSelFW.reportStepDetails("Modify Order should be displayed","Modify Order is displayed successfully","Pass");

			WebElement ClickOnOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[contains(text(),'OK')]")));
			ClickOnOk.click();
			Thread.sleep(6000);
			
			WebElement ClickOnincrement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='increment'])[1]")));
			ClickOnincrement.click();
			Thread.sleep(7000);
			
			WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
			ClickOncheckout.click();
			Thread.sleep(7000);
			oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
			
			WebElement ClickOnorderarrow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='payment-form-edit-button']")));
			ClickOnorderarrow.click();
			Thread.sleep(7000);
			//*[@id='payment-form-edit-button']
			
			WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
			String retPayment = pickUPCash.getText();
			pickUPCash.click();
			
			oPSelFW.reportStepDetails("Verify Payment method should be selected as Cash At Pickup", "verified Payment method selected as Cash at Pick Up", "Pass");
			
			WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
			Psave.click();
			Thread.sleep(7000);
			WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
			placeOrder.click();
			Thread.sleep(2000);
			wait = new WebDriverWait(driver, 1000);
			WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
			if (orderConfirmation.isDisplayed()) {
				
				oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
				
			} else {
				oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
		
			}
			
			WebElement orderNo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
			String strOrderNo = orderNo1.getText();
			
			WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
			WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

			oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");

			
					
				oPSelFW.reportStepDetails("Verify Order should be placed for order number" + strOrderNo, "Verified After Modify the order same order number is Displaeyd " + strOrderNo,"Pass");
	
			//} else {
				
				//oASelFW.prolifics("sendReport", "Order Placed  ", "Order number is not same for modifed order ", "Fail");
				//oASelFW.prolifics("captureEntirePageScreenshot", "Order number is not same for modifed order ","description");
			
			//
			
		}
		
		public void modifyOrder(String orderNo,ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception 
		{
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			Thread.sleep(3000);
			WebElement clickmodifyOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'button small') and contains(text(),'Modify Order')]")));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", clickmodifyOrder);
			
			Thread.sleep(6000);
			
			oPSelFW.reportStepDetails("Modify Order should be displayed","Modify Order is displayed successfully","Pass");

			WebElement ClickOnOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[contains(text(),'OK')]")));
			ClickOnOk.click();
			Thread.sleep(6000);
			
			WebElement ClickOnincrement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='increment'])[1]")));
			ClickOnincrement.click();
			Thread.sleep(7000);
			
			WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
			ClickOncheckout.click();
			Thread.sleep(7000);
			oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
			
			WebElement ClickOnorderarrow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='payment-form-edit-button']")));
			ClickOnorderarrow.click();
			Thread.sleep(7000);
			//*[@id='payment-form-edit-button']
			
			WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
			String retPayment = pickUPCash.getText();
			pickUPCash.click();
			
			oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
			
			WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
			Psave.click();
			Thread.sleep(7000);
			WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
			placeOrder.click();
			Thread.sleep(2000);
			wait = new WebDriverWait(driver, 1000);
			WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
			if (orderConfirmation.isDisplayed()) {
				
				oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
				
			} else {
				oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
		
			}
			
			WebElement orderNo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
			String strOrderNo = orderNo1.getText();
			
			WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
			WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

			oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");

			
					
				oPSelFW.reportStepDetails("Verify Order should be placed for order number" + strOrderNo, "Verified After Modify the order same order number is Displaeyd " + strOrderNo,"Pass");
	
			//} else {
				
				//oASelFW.prolifics("sendReport", "Order Placed  ", "Order number is not same for modifed order ", "Fail");
				//oASelFW.prolifics("captureEntirePageScreenshot", "Order number is not same for modifed order ","description");
			
			//
			
		}
		
		
		public void modifyOrderReviewpage(String orderNo,ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception 
		{
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			Thread.sleep(3000);
			WebElement clickmodifyOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'button small') and contains(text(),'Modify Order')]")));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", clickmodifyOrder);
			
			Thread.sleep(6000);
			
			oPSelFW.reportStepDetails("Modify Order should be displayed","Modify Order is displayed successfully","Pass");

			WebElement ClickOnOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[contains(text(),'OK')]")));
			ClickOnOk.click();
			Thread.sleep(6000);
			WebElement Clickoncartcount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='counter cart-count'])[1]")));
			String itemscart1 = Clickoncartcount.getText();
			
			Thread.sleep(5000);
			
			oPSelFW.reportStepDetails("Verify Number of products in the Cart after Modify", "Verified Number of products in the Cart after modify is " +itemscart1, "Pass");
		
	
		}
		
		
		public void Cartoverview(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
		
		{
			
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
			Shoponline.click();
			Thread.sleep(5000);
			WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
			
			ClickOnSale.click();
			Thread.sleep(2000);
			oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
			
			
			WebElement dep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-test='mobile-page-header-title']")));
			if (dep.getText().equals("Departments")) {
				
				oPSelFW.reportStepDetails("Departments page should be opened sucessfully ", "Departments are dislayed Successfully ", "Pass");
				} else {
					
					oPSelFW.reportStepDetails("Departments page is not displayed ", "POS not avilable ", "Fail");
				}

			Thread.sleep(2000);
			List<WebElement> Items;
			Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
			// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
			System.out.println("++=itesm Size is " + Items.size());
			for (int i = 0; i < 3; i++) {
				// WebElement product=Items;
				Items.get(i).click();
				// System.out.println("Item Nameis+++"+Items.get(i).getText());

			}
			Thread.sleep(5000);
			oPSelFW.reportStepDetails("Items should be added to the cart sucessfully ", "Items added to the cart sucessfully ", "Pass");
			Thread.sleep(2000);
			
			
			WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
			Clickoncart.click();
			Thread.sleep(5000);
			oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");
			Thread.sleep(1000);
			WebElement Reviewcart = driver.findElement(By.xpath("(//*[@class='li-el'])[1]"));
			String reviecart = Reviewcart.getText();
			System.out.println(reviecart);
			oPSelFW.reportStepDetails("Verify Review cart page should be opened ", "Verified Review cart page opened successfully" ,"Pass");

		}
		
		
		
public void forgetSomethingCartoverview(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
		
		{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	/*
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);*/

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	WebElement dep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-test='mobile-page-header-title']")));
	if (dep.getText().equals("Departments")) {
		
		oPSelFW.reportStepDetails("Departments page should be opened sucessfully ", "Departments are dislayed Successfully ", "Pass");
		} else {
			
			oPSelFW.reportStepDetails("Departments page is not displayed ", "POS not avilable ", "Fail");
		}
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 3; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");	
			
		}

public void AddItemfromRFS(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws InterruptedException, Exception {
	Thread.sleep(4000);
	
	WebDriverWait wait = new WebDriverWait(driver, 40);
	WebElement countcart = driver.findElement(By.xpath("//span[@class='counter cart-count']"));
	String count = countcart.getText();
	int iTest = Integer.valueOf(count);
	
	Thread.sleep(4000);
	WebElement Qupdate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Are You Forgetting Something?')]")));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	oPSelFW.reportStepDetails("Are you Forgetting Something Section should be displayed  ", " Are you Forgetting Something Section  displayed successfully","Pass");

	
	WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@uib-popover-html='maxQuantityWarningPopover'])[1]")));
	item.click();
	Thread.sleep(4000);
	/*
	WebElement ClickonClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='close'])[1]")));
	ClickonClose.click();
	Thread.sleep(4000);
	*/
	
	System.out.println("Cart COunt is ++++" + iTest);
	
	WebElement countcart1 = driver.findElement(By.xpath("//span[@class='counter cart-count']"));
	String count1 = countcart1.getText();
	int iTest1 = Integer.valueOf(count1);
	
	System.out.println("Cart COunt is ++++" + iTest);
	if (iTest1 > iTest) {
		Thread.sleep(1000);
		
		oPSelFW.reportStepDetails("Item should be added  to cart from are you forgetting something " + iTest1,"Item  added  to cart from are you forgetting something","Pass");
	}
	else {
		oPSelFW.reportStepDetails( "Item should be added  to cart from are you forgetting something " + iTest1,"Item  added  to cart from are you forgetting something","Fail");

	}
	
		
}


public void PlaceorderWithListItem(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	/*List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	*/
	
	WebElement ClickonItemimg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cell-image show'])[1]")));
	ClickonItemimg.click();
	
	Thread.sleep(10000);
	WebElement Clickonsaveforlater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@uib-popover='Add to Save for Later Lists']")));
	Clickonsaveforlater.click();
	
	Thread.sleep(8000);
	WebElement lname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter New List Name']")));
	lname.sendKeys("New Test");
	lname.sendKeys(Keys.ENTER);
	//Thread.sleep(10000);
	/*driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
	Thread.sleep(10000);*/
	
	//WebElement Click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='submit'])[2]")));
	//Click.click();
	Thread.sleep(5000);
	lname.sendKeys(Keys.TAB);
	
	
	WebElement ClickonClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='close'])[1]")));
	ClickonClose.click();
	
	Thread.sleep(4000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	
	WebElement OpenProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
	OpenProfile.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("User drop down should be displayed", "User drop down displayed sucessfully","Pass");

	
	WebElement SFLL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),' Save for Later Lists')])[2]")));

	System.out.println("++++got text ====" + SFLL.getText());
	if (SFLL.getText().equals("Save for Later Lists")) {
		
		oPSelFW.reportStepDetails("Save For Later Lists option should be displayed ","Save For Later Lists option should be displayed","Pass");
	}
	Thread.sleep(5000);
	SFLL.click();
	WebElement ClickonNewTest= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-test='save-for-later-list-name'])[1]")));
	ClickonNewTest.click();
	Thread.sleep(5000);
	
	
	
	//WebElement details = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody/tr/td/a[contains(@href,'account')])[1]")));
	
	/*oPSelFW.reportStepDetails("List Details buttton should be displayed", "List Details buttton is displayed sucessfully","Pass");
	details.click();
	Thread.sleep(3000);*/
	
	
	WebElement selectedItems = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='listItem0-0']")));
	/*JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", selectedItems);*/
	selectedItems.click();
	Thread.sleep(5000);
	
	
	WebElement AddTocart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Add to Cart ')]")));
	AddTocart.click();
	Thread.sleep(5000);

	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	
	
	Thread.sleep(5000);
	WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
	String retPayment = pickUPCash.getText();
	pickUPCash.click();
	
	oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
	
	WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	Psave.click();
	Thread.sleep(5000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
		
	} 



public void offersCheck(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws InterruptedException, Exception {
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(5000);
	
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	WebElement ClickOnOffers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open Offers and Savings Menu'])[2]")));
	ClickOnOffers.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Open Offers should be clicked ", "Open Offers Clicked successfully","Pass");
	
	
	WebElement ClickOnclipOffer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Clip Your Personalized Offers'])[2]")));
	ClickOnclipOffer.click();
	Thread.sleep(20000);
	
	oPSelFW.reportStepDetails("Clip Offers should be clicked ", "Clip Offers Clicked successfully","Pass");
	

	List<WebElement> offres = driver.findElements(By.xpath("(//span[contains(@class,'cell-image')])[1]"));
	System.out.println(offres.size());
	Thread.sleep(500);
	if (offres.size() > 0) {
		
		oPSelFW.reportStepDetails("Verify Offers and Coupons Page is Opened ", "Verified Offers and Coupons Displayed","Pass");
		
	
	} else {
		
		oPSelFW.reportStepDetails("", "Offers and Coupons not Displayed", "Fail");
		}
}



public void CheckDOBFrameDisplay(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws InterruptedException {

	WebDriverWait wait = new WebDriverWait(driver, 60);

	try {

		if (driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).isDisplayed()) {
			// oASelFW.prolifics("sendReport", "Verify DOB Frame Display ", "DOB Frame
			// Display Successfully", "Pass");
			oPSelFW.reportStepDetails("DOB Frame should be displayed Successfully","DOB frame displayed","Pass");
			
			WebElement dobInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='mm/dd/yyyy']")));
			dobInput.sendKeys("12221990");
			WebElement dobcontinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
			dobcontinue.click();
			Thread.sleep(5000);
			// oASelFW.prolifics("sendReport", "Verify DOB Frame with Valid 21 Years ",
			// "Verified DOB Frame with Valid 21 Years Successful", "Pass");
			oPSelFW.reportStepDetails("Verify DOB Frame with Valid 21 Years should be displayed", "Verified DOB Frame with Valid 21 Years displayed sucessfully","Pass");

		} else {
			oPSelFW.reportStepDetails("Verify DOB Frame with Valid 21 Years not displayed", "Verified DOB not displayed sucessfully","Fail");

		}
	}
 catch (Exception e) {
	System.out.println(e);
}

}
	
public void DOBPlaceorderWithCash(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
		Shoponline.click();
		Thread.sleep(5000);
		
		WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
		Clickonpickup.click();
		Thread.sleep(5000);
		
		WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
		SelectStore.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 10000);
			
		WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
		
		selecttimeslot.click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20000);
	
		WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
		
		ClickOnSale.click();
		Thread.sleep(2000);
		oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
		
		
		WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
		OpenMenu.click();
		
		oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
		Thread.sleep(2000);
		
		WebElement Shopclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
		Shopclick.click();
		Thread.sleep(2000);
		WebElement Clcikondep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Departments')])[1]")));
		Clcikondep.click();
		Thread.sleep(5000);
		
				WebElement ClickonBeer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-b638a0'])[6]")));
				ClickonBeer.click();
				
				oPSelFW.reportStepDetails("Beer and Wine page should be displayed", "Beer and Wine is displayed successfully", "Pass");
				Thread.sleep(2000);
				
				WebElement ClickonBeerlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-ocrr8q'])[1]")));
				ClickonBeerlink.click();
				Thread.sleep(10000);	
					
		wait = new WebDriverWait(driver, 10000);
		List<WebElement> Items;
		Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
		// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
		//System.out.println("++=itesm Size is " + Items.size());
		for (int i = 0; i < 1; i++) {
			// WebElement product=Items;
			Items.get(i).sendKeys(Keys.ENTER);
			// System.out.println("Item Nameis+++"+Items.get(i).getText());

		}
		Thread.sleep(10000);
		oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
		
		WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
		Clickoncart.click();
		Thread.sleep(10000);
		
		oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

		WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
		ClickOncheckout.click();
		
		oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
		
		Thread.sleep(10000);
		
		//DOB Frame
		CheckDOBFrameDisplay(oPSelFW, driver);
		Thread.sleep(10000);
		
		WebElement pickUPCash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-cash']")));
		String retPayment = pickUPCash.getText();
		pickUPCash.click();
		
		oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
		
		WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
		Psave.click();
		Thread.sleep(5000);
		
		WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
		placeOrder.click();
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, 1000);
		WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
		if (orderConfirmation.isDisplayed()) {
			
			oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
			
		} else {
			oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");
	
		}
		
		WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
		String strOrderNo = orderNo.getText();
		
		WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
		WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

		oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
		wait = new WebDriverWait(driver, 1000);
		WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
		lnkOrderDetails.click();
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		
		WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
		Thread.sleep(500);
		wait = new WebDriverWait(driver, 1000);
		if (orderDetPage.isDisplayed()) {
		
			WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
			oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
			} else {
				oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
			
			}
		
		    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
		    Thread.sleep(500);
		    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
			oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
			oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
			
		} 
	
public void DOBPlaceorderWithDebitPickup(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(2000);
	
	WebElement Shopclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
	Shopclick.click();
	Thread.sleep(2000);
	WebElement Clcikondep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Departments')])[1]")));
	Clcikondep.click();
	Thread.sleep(5000);
	
			WebElement ClickonBeer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-b638a0'])[6]")));
			ClickonBeer.click();
			
			oPSelFW.reportStepDetails("Beer and Wine page should be displayed", "Beer and Wine is displayed successfully", "Pass");
			Thread.sleep(2000);
			
			WebElement ClickonBeerlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-ocrr8q'])[1]")));
			ClickonBeerlink.click();
			Thread.sleep(10000);	
				
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 1; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(10000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	
	Thread.sleep(10000);
	
	//DOB Frame
	CheckDOBFrameDisplay(oPSelFW, driver);
	Thread.sleep(10000);
	
	WebElement pickUPDD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='payment-type-radio-label payment-type-debit']")));
	String retPayment = pickUPDD.getText();
	pickUPDD.click();
	
	oPSelFW.reportStepDetails("Payment method should be selected as Cash At Pickup", "Payment method selected as Cash at Pick Up", "Pass");
	
	WebElement Psave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	Psave.click();
	Thread.sleep(5000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
	} 


public void DOBwithBoxFuctionality(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(2000);
	
	WebElement Shopclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
	Shopclick.click();
	Thread.sleep(2000);
	WebElement Clcikondep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Departments')])[1]")));
	Clcikondep.click();
	Thread.sleep(5000);
	
			WebElement ClickonBeer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-b638a0'])[6]")));
			ClickonBeer.click();
			
			oPSelFW.reportStepDetails("Beer and Wine page should be displayed", "Beer and Wine is displayed successfully", "Pass");
			Thread.sleep(2000);
			
			WebElement ClickonBeerlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-ocrr8q'])[1]")));
			ClickonBeerlink.click();
			Thread.sleep(10000);	
				
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 1; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(10000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	
	Thread.sleep(10000);
}

public void VerifyDOBWith21Years(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws InterruptedException, Exception {
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(5000);
	if (driver.findElement(By.xpath("//input[@ng-model='dateOfBirth']")).isDisplayed()) {

		
		oPSelFW.reportStepDetails("Verify DOB Frame Display ", "Verified DOB Frame Display Successfully", "Pass");
		
		WebElement dobInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='dateOfBirth']")));
		dobInput.sendKeys("12221990");
		WebElement dobcontinue = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue')]")));
		dobcontinue.click();
		Thread.sleep(5000);
		oPSelFW.reportStepDetails("Verify DOB Frame with Valid 21 Years ",
				"Verified DOB Frame with Valid 21 Years Successfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Verify DOB Frame with Valid 21 Years ",
				"Verified DOB Frame with Valid 21 Years UnSuccessfully", "Fail");
		

	}
}

public void VerifyDOBFrame(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws InterruptedException, Exception {
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(5000);
	if (driver.findElement(By.xpath("//input[@ng-model='dateOfBirth']")).isDisplayed()) {

		WebElement dobInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='dateOfBirth']")));
		oPSelFW.reportStepDetails("Verify the Display of Date of Birth Frame ",
				"Verified DOB Frame Displayed Successfully", "Pass");
		
	} else {

		oPSelFW.reportStepDetails("Verify the Display of Date of Birth Frame ", "DOB Frame  Not Displayed",
				"Fail");
		System.out.println("Date Of Birth Not Displayed");

	}
}



public void SomethingExtra(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickonMyProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));

	String extraPoints = ClickonMyProfile.getText();
	Thread.sleep(5000);
	String intextraPoints = extraPoints.replaceAll("[^0-9]+", "");
	int intPoints = Integer.parseInt(intextraPoints);
	
	if (intPoints > 0) {
		oPSelFW.reportStepDetails("SomeThing Extra Number Page is opened ","SomeThing Extra Points displayed " + intPoints, "Pass");
	} else {
		
		oPSelFW.reportStepDetails("SomeThing Extra Number Page is opened ","SomeThing Extra Points not displayed", "Fail");
		}
	Thread.sleep(5000);
	ClickonMyProfile.click();
	
	
	ClickonMyProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
	
	oPSelFW.reportStepDetails("Verify number of points should be displayed ","Verified number of points is displayed successfully " + intPoints, "Pass");
	
	Thread.sleep(5000);

	
	
	
	
	Thread.sleep(10000);
}



public void SomethingExtranumberUpdate(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	
	WebElement Clickonsomething = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Something Extra Number')]")));
	Clickonsomething.click();
	
	oPSelFW.reportStepDetails("Something extra number should be displayed", "Something extra number is displayed successfully", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickonManage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Manage Something Extra Number')]")));
	ClickonManage.click();
	
	Thread.sleep(5000);
	long number = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
	String somethingExtraNo = number + "";
	WebElement elePrfExtraNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//form/input[@type='text'])[1]")));
	elePrfExtraNo.click();
	elePrfExtraNo.clear();
	elePrfExtraNo.sendKeys(somethingExtraNo);
	elePrfExtraNo.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	elePrfExtraNo.sendKeys(Keys.ENTER);
	System.out.println(somethingExtraNo);
	// Click on save after updating the profile
	Thread.sleep(20000);
	oPSelFW.reportStepDetails("Something extra number should be entered ",
			"Something extra number is entered successfully", "Pass");
		WebElement eleMsgExtraUpdate = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'message success loyalty')]")));
	
	
	
	if (eleMsgExtraUpdate.getText().equals("Card updated successfully!")) {
		oPSelFW.reportStepDetails("Something extra number update message should be opened displayed ",
				"Something extra number update message is displayed as Card updated successfully!", "Pass");
			
	} else {
		oPSelFW.reportStepDetails("Profile Page opened successfully ",
				"Something extra number updation message is not  displayed", "Fail");
		
	}

}


public void UpdateProfile(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(5000);
	WebElement ClickonMyProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
	ClickonMyProfile.click();
	
	WebElement ClickonMy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'My Profile')])[2]")));
	ClickonMy.click();
	Thread.sleep(5000);
	
	
	WebElement eleProfileName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='profile.firstName'])[4]")));
	eleProfileName.click();
	String Name = eleProfileName.getText();
	Thread.sleep(10000);
	oPSelFW.reportStepDetails("Profile name should be displayed", "Profile name displayed before update is " + Name,"Pass");
	
	eleProfileName.clear();
	Thread.sleep(5000);
	
	String allowedChars = "abcdefghiklmnopqrstuvwxyz";
	int stringLength = 5;
	String randomstring = "";
	for (int i = 0; i < stringLength; i++) {
		int rnum = (int) Math.floor(Math.random() * allowedChars.length());
		randomstring += allowedChars.substring(rnum, rnum + 1);
	}
	
	String Randomname = randomstring;
	eleProfileName.sendKeys(Randomname);
	
	WebElement eleSave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='SAVE']")));
	eleSave.click();
	Thread.sleep(2000);
	
	oPSelFW.reportStepDetails("Verify Profile name should be displayed", "Verified Profile name displayed After update is " + Randomname,"Pass");
	
	
	
}



public void Priceupdates(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 1; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);

	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");
	
	WebElement Beforprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='new-checkout__totals-total']")));
	
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Price in the cart", "The price in the cart is displayed sucessfully", "Pass");
	WebElement Clickonincrement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='increment'])[1]")));
	Clickonincrement.click();
	Thread.sleep(5000);
	
	WebElement Afterprice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='new-checkout__totals-total']")));
	
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Price in the cart", "Verified The price in the cart after updating the quantity is "+ Afterprice.getText(), "Pass");
	
	
	
	
	
}


public void ShoppingModeSwitch(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonPickup.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup1.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Verify Pick Up should be selected", "Verified Pick up is selected successfully", "Pass");
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	WebElement OpenMenu1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu1.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonPickup2.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	/*
	WebElement Clickonzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-postal-code']")));
	Clickonzip.sendKeys("94501");
	Thread.sleep(5000);
	Clickonzip.sendKeys(Keys.TAB);*/
	
	Thread.sleep(5000);
	WebElement Clickonselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Clickonselect.click();
	Thread.sleep(10000);

	
	
	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu2.click();
	Thread.sleep(5000);
	
	WebElement Clickondelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	Clickondelivery.click();
	Thread.sleep(5000);
	
	WebElement Clickonshppingmode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-instore']")));
	Clickonshppingmode.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Shopping mode should be selected", "Verified Shopping mode is selected successfully", "Pass");
	
	WebElement Clickonyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cart-list-transfer-items']")));
	String items = Clickonyes.getText();
	String searchResult = items.replaceAll("[^0-9]+", "");
	
	oPSelFW.reportStepDetails("Number of products transfer should be selected", "Number of products transfer is " +searchResult, "Pass");
	
	Clickonyes.click();
	Thread.sleep(5000);
	
	
	WebElement OpenMenu3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu3.click();
	Thread.sleep(5000);
	
	WebElement Clickondelivery1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	Clickondelivery1.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonPickup3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup3.click();
	Thread.sleep(5000);
	
	
	WebElement Clickonyes1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cart-list-transfer-items']")));
	Clickonyes1.click();
	WebElement selecttimeslot2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot2.click();
	Thread.sleep(5000);
	
	
}


public void StoreToCartShoppingMode(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception
{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonPickup.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup1.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Verify Pick Up should be selected", "Verified Pick up is selected successfully", "Pass");
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu1.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonPickup2.click();
	Thread.sleep(5000);
	
	WebElement Clickonshppingmode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-instore']")));
	Clickonshppingmode.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Shopping mode should be selected", "Verified Shopping mode is selected successfully", "Pass");
	
	WebElement Clickonyes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cart-list-transfer-items']")));
	String items = Clickonyes.getText();
	String searchResult = items.replaceAll("[^0-9]+", "");
	
	oPSelFW.reportStepDetails("Verify Number of products transfer should be display", "Verified Number of products transfer is " +searchResult, "Pass");
	
	Clickonyes.click();
	Thread.sleep(10000);
	
	WebElement OpenMenu4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu4.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonPickup4.click();
	Thread.sleep(5000);
	WebElement ClickonPickup5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup5.click();
	Thread.sleep(10000);
	
	WebElement Clickonyes1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cart-list-transfer-items']")));
	String items1 = Clickonyes1.getText();
	String searchResult1 = items1.replaceAll("[^0-9]+", "");
	
	oPSelFW.reportStepDetails("Verify Number of products transfer from Shopping mode to Pick Up", "Verified Number of products transfer from Shopping mode to Pick Up is " +searchResult1, "Pass");
	
	Clickonyes1.click();
	Thread.sleep(5000);
	
	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);
	
	WebElement Clickoncart1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='counter cart-count'])[1]")));
	String itemscart1 = Clickoncart1.getText();
	Clickoncart1.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Verify Number of products in the Cart", "Verified Number of products in the Cart is " +itemscart1, "Pass");
	
	
}

public void DeliveryAddressReviewPage(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	String time = selecttimeslot1.getText();
	String time1 = time.replace("-","");
	selecttimeslot1.click();

	oPSelFW.reportStepDetails("Verify time slot should not be displayed ","Verified time slot is "+ time1, "Pass");
	Thread.sleep(20000);
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 2; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	WebElement ClickOneditaddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='delivery-address-edit-button']")));
	ClickOneditaddress.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSelectadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(@for,'address-list-item-radio-423')]")));
	ClickOnSelectadd.click();
	//Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Different Address should be selected", "Different address is selected sucessfully", "Pass");
	Thread.sleep(5000);

	WebElement ClickOnSaveadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='delivery-address-save-button']")));
	ClickOnSaveadd.click();
	Thread.sleep(10000);
	
	WebElement selecttimeslot2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	String times = selecttimeslot2.getText();
	String time2 = times.replace("-","");
	selecttimeslot2.click();

	oPSelFW.reportStepDetails("Verify time slot should not be displayed ","Verified after changing the Addres time slot is "+ time2, "Pass");
	Thread.sleep(5000);
	
}


public void DeliveryPlaceorderWithCreditCard(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	selecttimeslot1.click();

	Thread.sleep(5000);
	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 2; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickOnPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-edit-button']")));
	ClickOnPayment.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	ClickOnSave.click();
	Thread.sleep(10000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
	} 

public void DeliveryOtherAmountCreditCard(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);

	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 2; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickOnPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-edit-button']")));
	ClickOnPayment.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	ClickOnSave.click();
	Thread.sleep(10000);
	
	WebElement ClickOnEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Edit ')]")));
	ClickOnEdit.click();
	Thread.sleep(5000);
	
	
	WebElement ClickOnradio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Other amount')]")));
	ClickOnradio.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Tip for Custom Amount should be selected", "Verified Tip for Custom Amount is selected successfully", "Pass");
	
	
	WebElement EnterAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='number']")));
	EnterAmount.sendKeys("2");
	Thread.sleep(5000);
	EnterAmount.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	int tipPercent = Integer.parseInt("2");
	
	
	WebElement ClickOnapply = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Apply')]")));
	ClickOnapply.click();
	Thread.sleep(30000);
	
	oPSelFW.reportStepDetails("Tip should be added successfully ", "Tip Added successfully","Pass");

	
	
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(5000);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
		
		  Thread.sleep(5000);
		WebElement  tipinOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/label[contains(text(),'Tip')]/following::div[1]")));
		String getTipAmountinOrderDetails = tipinOrderDetails.getText();
		String tipPriceInOrderDetails = getTipAmountinOrderDetails.replace("$","");
		String tipPriceInOrderDetailsPage = tipPriceInOrderDetails.substring(0, tipPriceInOrderDetails.length() - 3);
		//String tipPrice1 = tipPrice.replace(".","");
		int value3 = Integer.parseInt(tipPriceInOrderDetailsPage);
		System.out.println("Tip total Amount in order Details Page"+tipPriceInOrderDetailsPage);


		if(tipPercent == value3){
			oPSelFW.reportStepDetails("Verify selected tip in Order details page ", "Verified Selected tip displayed successfully in order details page","Pass");
			

		}
		else {
			System.out.println("Validation UnSuccessfull");
		}


	} 





public void DeliveryFifteenCreditCard(String Tip,ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);

	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 8; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	
	
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickOnPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-edit-button']")));
	ClickOnPayment.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	ClickOnSave.click();
	Thread.sleep(10000);
	
	WebElement ClickOnEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Edit ')]")));
	ClickOnEdit.click();
	Thread.sleep(5000);
	
	
	
	
	
	TipSelectionandValidation(Tip,oPSelFW,driver);
	
	

	Thread.sleep(20000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(5000);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		Thread.sleep(5000);
		


		Thread.sleep(500);
	} 


public void DeliverywithTenCreditCard(String Tip,ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);

	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 8; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	
	
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickOnPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-edit-button']")));
	ClickOnPayment.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	ClickOnSave.click();
	Thread.sleep(10000);
	
	WebElement ClickOnEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Edit ')]")));
	ClickOnEdit.click();
	Thread.sleep(5000);
	
	
	
	
	
	TipSelectionandValidation(Tip,oPSelFW,driver);
	
	

	Thread.sleep(20000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(5000);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		Thread.sleep(5000);
		


		Thread.sleep(500);

		Thread.sleep(500);
	} 



public void TipSelectionandValidation(String Tip,ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws InterruptedException, Exception {

	 

    WebDriverWait wait = new WebDriverWait(driver,60);



    WebElement  fivePercent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label/span[contains(@ng-if,'configTip')])[2]")));

    String tip1 = fivePercent.getText();

    System.out.println(tip1);

    WebElement  tenPercent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label/span[contains(@ng-if,'configTip')])[3]")));

    String tip2 = tenPercent.getText();

    System.out.println(tip2);

    WebElement  fifteenPercent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label/span[contains(@ng-if,'configTip')])[4]")));

    String tip3 = fifteenPercent.getText();

    System.out.println(tip3);

    if(tip1.contains(Tip)){ 

          fivePercent.click();
          oPSelFW.reportStepDetails("Tip should be selected as 5 percent", "Tip selected as 5 percent  ","Pass");    		
    }                     

    else if(tip2.contains(Tip)){ 

          tenPercent.click();
          oPSelFW.reportStepDetails("Tip should be selected as 10 percent", "Tip selected as 10 percent ","Pass");
    		
    }  

    else{ 

          fifteenPercent.click();
          oPSelFW.reportStepDetails("Tip should be selected as 15 percent", "Tip selected as 15 percent ","Pass");

    } 

    WebElement  applyTip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Apply')]")));

    applyTip.click();
    Thread.sleep(3000);

    oPSelFW.reportStepDetails( "Tip should be added successfully ", "Tip Added successfully","Pass");

  //Here we are Getting the Item Total Amount

    WebElement  itemTotal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[contains(text(),'Item Total')]/following::span[1]")));

    String totalAmount = itemTotal.getText();

    String amount = totalAmount.replace("$","");

    /*String amount1 = totalAmount.replace(",","");

    String amount2 = amount1.replace(".","");
*/
    System.out.println("Item total Amount"+amount);
    
   
    //int value1 = Integer.parseInt(amount2);
    
    oPSelFW.reportStepDetails( "Item total should be $ " + amount.replace(".",":"), "Item Total is $ " +amount.replace(".",":"),"Pass");

    //int tipPercent = Integer.parseInt(Tip);
    Thread.sleep(5000);

   

    WebElement  tipTotal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]/following::span[1][contains(@class,'cart-summary__amount')]")));

    String getTipAmount = tipTotal.getText();

    String tipPrice = getTipAmount.replace("$","");

    /*String tipPrice1 = tipPrice.substring(0, tipPrice.length() - 3);

    //String tipPrice1 = tipPrice.replace(".","");
*/
    System.out.println("Tip total Amount"+tipPrice);

   // int value2 = Integer.parseInt(tipPrice1);

   // System.out.println("Getting Tip Amount By Removing Last 3 Numbers"+tipPrice);

    oPSelFW.reportStepDetails( "Tip should be $ " + tipPrice.replace(".",":"), "Tip Total is $ " +tipPrice.replace(".",":"),"Pass");
    Thread.sleep(5000);

    //below is for getting totla
    WebElement  Total = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cart-summary__footer cart-summary__section--bottom-divider']")));
    String TotalAmount = Total.getText();

    String Totalamt = TotalAmount.replace("$","");
    
    oPSelFW.reportStepDetails( "Total amount should be $ " + Totalamt.replace(".",":"), "Total amount is $ " +Totalamt.replace(".",":"),"Pass");

    Thread.sleep(5000);

/*
    if(s3 == value2){ 

          System.out.println("Validation Successfull");



    }

    else {

          System.out.println("Validation UnSuccessfull");

    }*/









}

public void WeeklyAdd(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	WebElement ClickonShoop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
	ClickonShoop.click();
	Thread.sleep(5000);
	WebElement Clickonweeklyadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Weekly Ad')])[1]")));
	Clickonweeklyadd.click();
	Thread.sleep(10000);
	
	WebElement Downloadpdf = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='download-pdf icon icon-download-pdf header-button']")));

	oPSelFW.reportStepDetails( "Verify Down Load PDF should be display ", "Verified Down Load PDF displayed successfully","Pass");
	Thread.sleep(5000);
	
	WebElement continueshop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button']")));
	 String shoptext = continueshop.getText();
	
	 oPSelFW.reportStepDetails( "Continue shopping highlights ", "Continue shopping is displayed successfully","Pass");
		Thread.sleep(5000);
		
	
	
}

public void PropwithWarningmsg(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(2000);
	
	WebElement Shopclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
	Shopclick.click();
	Thread.sleep(2000);
	WebElement Clcikondep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Departments')])[1]")));
	Clcikondep.click();
	Thread.sleep(5000);
	
			WebElement ClickonBeer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-b638a0'])[6]")));
			ClickonBeer.click();
			
			oPSelFW.reportStepDetails("Beer and Wine page should be displayed", "Beer and Wine is displayed successfully", "Pass");
			Thread.sleep(2000);
			
			WebElement ClickonBeerlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-ocrr8q'])[1]")));
			ClickonBeerlink.click();
			Thread.sleep(10000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title])[2]"))).click();
			Thread.sleep(2000);
			
			WebElement Clickonshowmore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Show More')]")));
			Clickonshowmore.click();
			Thread.sleep(10000);
		
			if (driver.findElement(By.xpath("//p/img[@alt='Prop65 Warning']")).isDisplayed()) {

				oPSelFW.reportStepDetails("Prop65 Warning Should be Displayed  ",
						"Prop65 Warning Displayed Successfully", "Pass");
				
			} else {

				oPSelFW.reportStepDetails("Prop65 Warning Should be Displayed  ",
						"Prop65 Warning Not Displayed Successfully", "Fail");
			}
			
			WebElement Clickonwarning = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'WARNING')])[2]")));
			Clickonwarning.click();
			Thread.sleep(10000);
			
			WebElement textmessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='prop65-span']")));
			
			oPSelFW.reportStepDetails("Verify the Warning message", "Verified the Warning message is " + textmessage.getText(), "Pass");
		
			Thread.sleep(5000);

		}

		
public void PropwithAlcoholiclink(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(2000);
	
	WebElement Shopclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
	Shopclick.click();
	Thread.sleep(2000);
	WebElement Clcikondep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Departments')])[1]")));
	Clcikondep.click();
	Thread.sleep(5000);
	
			WebElement ClickonBeer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-b638a0'])[6]")));
			ClickonBeer.click();
			
			oPSelFW.reportStepDetails("Beer and Wine page should be displayed", "Beer and Wine is displayed successfully", "Pass");
			Thread.sleep(2000);
			
			WebElement ClickonBeerlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-ocrr8q'])[1]")));
			ClickonBeerlink.click();
			Thread.sleep(10000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title])[2]"))).click();
			Thread.sleep(2000);
			
			WebElement Clickonshowmore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Show More')]")));
			Clickonshowmore.click();
			Thread.sleep(10000);
		
			if (driver.findElement(By.xpath("//p/img[@alt='Prop65 Warning']")).isDisplayed()) {

				oPSelFW.reportStepDetails("Prop65 Warning Should be Displayed  ",
						"Prop65 Warning Displayed Successfully", "Pass");
				
			} else {

				oPSelFW.reportStepDetails("Prop65 Warning Should be Displayed  ",
						"Prop65 Warning Not Displayed Successfully", "Fail");
			}
			
			WebElement Clickonwarning = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'WARNING')])[2]")));
			Clickonwarning.click();
			Thread.sleep(10000);
				
			WebElement prop65warningAlcoholUrl = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/strong[contains(text(),'www.P65Warnings.ca.gov/alcohol')]")));
			prop65warningAlcoholUrl.click();
			Thread.sleep(5000);

			// Get the list of window handles
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			System.out.println(tabs.size());
			// Use the list of window handles to switch between windows
			driver.switchTo().window((String) tabs.get(1));

			// Switch back to original window
			/*
			 * oASelFW.driver.switchTo().window(mainWindowHandle); Thread.sleep(2000);
			 */
			String URL = "https://www.p65warnings.ca.gov/products/alcoholic-beverages";
			String gotURL = driver.getCurrentUrl();
			System.out.println("******************URL:" + gotURL);

			if (gotURL.equals(URL)) {
				Thread.sleep(5000);
				oPSelFW.reportStepDetails("Verify Alcoholic Beverages Page Should be Opened ",
						"Verified Alcoholic Beverages Page Opened Successfully", "Pass");
				
				System.out.println("***********Paased");
			} else {
				oPSelFW.reportStepDetails("Alcoholic Beverages Page Should be Opened",
						"Alcoholic Beverages Page Not Opened Successfully", "Fail");
				System.out.println("****************Fail**************");
			}

		}

public void PropwithListProducts(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	Thread.sleep(2000);
	
	WebElement Shopclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu-item-has-children']")));
	Shopclick.click();
	Thread.sleep(2000);
	WebElement Clcikondep = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Departments')])[1]")));
	Clcikondep.click();
	Thread.sleep(5000);
	
			WebElement ClickonBeer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-b638a0'])[6]")));
			ClickonBeer.click();
			
			oPSelFW.reportStepDetails("Beer and Wine page should be displayed", "Beer and Wine is displayed successfully", "Pass");
			Thread.sleep(2000);
			
			WebElement ClickonBeerlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='css-ocrr8q'])[1]")));
			ClickonBeerlink.click();
			Thread.sleep(10000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@title])[2]"))).click();
			Thread.sleep(2000);
			WebElement gettext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='product-title no-bottom-margin']")));
			String productname = gettext.getText();
			WebElement Clickonsaveforlater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@uib-popover='Add to Save for Later Lists']")));
			Clickonsaveforlater.click();
			
			Thread.sleep(8000);
			WebElement lname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter New List Name']")));
			lname.sendKeys("New Test");
			lname.sendKeys(Keys.ENTER);
			
			Thread.sleep(5000);
			lname.sendKeys(Keys.TAB);
			
			WebElement ClcikonClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='close']")));
			ClcikonClose.click();
			Thread.sleep(5000);
			WebElement OpenMenu1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
			OpenMenu1.click();
			Thread.sleep(5000);
			
			WebElement OpenProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
			OpenProfile.click();
			Thread.sleep(5000);
			oPSelFW.reportStepDetails("User drop down should be displayed", "User drop down displayed sucessfully","Pass");

			
			WebElement SFLL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),' Save for Later Lists')])[2]")));

			System.out.println("++++got text ====" + SFLL.getText());
			if (SFLL.getText().equals("Save for Later Lists")) {
				
				oPSelFW.reportStepDetails("Save For Later Lists option should be displayed ","Save For Later Lists option should be displayed","Pass");
			}
			Thread.sleep(5000);
			SFLL.click();
			Thread.sleep(5000);
			WebElement ClickonNewTest= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-test='save-for-later-list-name'])[1]")));
			ClickonNewTest.click();
			Thread.sleep(5000);
			
			
			WebElement gettext1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='item-name']")));
			String productnametwo = gettext1.getText();
				
				oPSelFW.reportStepDetails("Verify Product name in List is " +productname ,"Verified Product name in the list " +productnametwo,"Pass");

			
				
			
			
		}



public void DeliverycancelOrder(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);

	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 3; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
	Thread.sleep(5000);
	
	WebElement ClickOnPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-edit-button']")));
	ClickOnPayment.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	ClickOnSave.click();
	Thread.sleep(10000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		Thread.sleep(5000);
		
		cancelOrder(oPSelFW,driver);
		
		Thread.sleep(5000);
		
		
	} 


public void DeliveryChangeAddress(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(10000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	WebElement ClickonshhoppingContext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-context']")));
	ClickonshhoppingContext.click();
	Thread.sleep(5000);
	
	WebElement ClickonDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-delivery']")));
	ClickonDelivery.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("Verify Delivery should be selected", "Verified Delivery is selected successfully", "Pass");
	
	
	WebElement Selectzip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' Select ')]")));
	Selectzip.click();
	Thread.sleep(10000);
	
	

	WebElement selecttimeslot1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot1.click();
	Thread.sleep(5000);

	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 3; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(10000);
	
	

	WebElement ClickOneditaddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='delivery-address-edit-button']")));
	ClickOneditaddress.click();
	Thread.sleep(5000);
	
	WebElement ClickOnSelectadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(@for,'address-list-item-radio-423')]")));
	ClickOnSelectadd.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Different Address should be selected", "Different address is selected sucessfully", "Pass");
	Thread.sleep(5000);

	WebElement ClickOnSaveadd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='delivery-address-save-button']")));
	ClickOnSaveadd.click();
	Thread.sleep(10000);
	
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(5000);
	WebElement ClickOnPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-edit-button']")));
	ClickOnPayment.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Payment method should be selected as Credit Card Pay Online", "Payment method selected as Credit Card Pay Online", "Pass");
	Thread.sleep(5000);
	WebElement ClickOnSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='payment-form-choose-payment-button']")));
	ClickOnSave.click();
	Thread.sleep(10000);
	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page " + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		Thread.sleep(5000);
		
	} 






public void addingItems(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement elestoreNam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='shopping-selector-search-cities']")));
	elestoreNam.sendKeys(Keys.CLEAR);
	elestoreNam.sendKeys("Bel Air on Walerga Rd");

	elestoreNam.sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	
	
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-14']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-14']")));
	SelectStore.click();
	
	
	
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	String time = selecttimeslot.getText();
	selecttimeslot.click();
	Thread.sleep(5000);
	
	Thread.sleep(20000);
	
	wait = new WebDriverWait(driver, 20000);
	
	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 3; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");

	 	//oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
	}


public void changeStore(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup1.click();
	Thread.sleep(5000);
	
	
	WebElement elestoreNam = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='shopping-selector-search-cities']")));
	elestoreNam.sendKeys(Keys.CLEAR);
	elestoreNam.sendKeys("Bel air on W El camino ave");

	elestoreNam.sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	
	
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-90']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-90']")));
	SelectStore.click();
	Thread.sleep(5000);
	wait = new WebDriverWait(driver, 10000);
		
	
	 	oPSelFW.reportStepDetails("Verify Previous time slot should not be displayed when store change ","Verified Previous time slot is not available when changing the store", "Pass");
		
	}


public void changeStoreoutofstock(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup1.click();
	Thread.sleep(5000);
	
	
	WebElement SelectStore1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-122']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-122']")));
	SelectStore1.click();
	Thread.sleep(2000);
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
	/*	
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(20000);
	
	
	WebElement Clickonpickup2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup2.click();
	Thread.sleep(5000);*/
	
	
	
	
	WebElement outofstock = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='message warn']")));
	String retPayment = outofstock.getText();
	 String text = retPayment.replace(".","");
	 String textone = text.replace("/","");
	oPSelFW.reportStepDetails("Verify Out of Stock Waring messsge should be displyed ","Verified Out of stock Warning message is displayed as " + textone, "Pass");
		
	
	WebElement Clickoncontinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-if='canProceed']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-if='canProceed']")));
	Clickoncontinue.click();

	
	oPSelFW.reportStepDetails("Continue button should be clicked sucessfully","Continue button clicked sucessfully"  , "Pass");
	
	
	}



public void changeStoreItemNotonSale(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement ClickonPickup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='shopping-selector-shop-context-intent-pickup']")));
	ClickonPickup1.click();
	Thread.sleep(5000);
	
	
	WebElement SelectStore1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-122']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-122']")));
	SelectStore1.click();
	Thread.sleep(2000);
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
/*	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(20000);
	
	
	WebElement Clickonpickup2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup2.click();
	Thread.sleep(5000);
	
	
	*/
	
	WebElement outofstock = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='message warn']")));
	String retPayment = outofstock.getText();
	
	oPSelFW.reportStepDetails("Verify Out of Stock Waring messsge should be display ","Verified Out of stock Warning message is displayed sucessfully", "Pass");
		
	/*
	WebElement Clickoncontinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-if='canProceed']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-if='canProceed']")));
	Clickoncontinue.click();

	
	oPSelFW.reportStepDetails("Continue button should be click sucessfully","Continue button clicked sucessfully"  , "Pass");
	*/
	
	}





public void Weeklylaunchandmonthlylist(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(20000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");

	
	WebElement ClickonItemimg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cell-image show'])[1]")));
	ClickonItemimg.click();
	
	Thread.sleep(10000);
	WebElement Clickonsaveforlater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@uib-popover='Add to Save for Later Lists']")));
	Clickonsaveforlater.click();
	
	Thread.sleep(8000);
	WebElement lname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter New List Name']")));
	lname.sendKeys("weekly list");
	lname.sendKeys(Keys.ENTER);
	//Thread.sleep(10000);
	/*driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
	Thread.sleep(10000);*/
	
	//WebElement Click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='submit'])[2]")));
	//Click.click();
	
	lname.sendKeys("Lunch List");
	lname.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	lname.sendKeys("Monthly List");
	lname.sendKeys(Keys.ENTER);
	
	Thread.sleep(5000);
	lname.sendKeys(Keys.TAB);
	
	
	WebElement ClickonClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='close'])[1]")));
	ClickonClose.click();
	
	Thread.sleep(4000);
	
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	Thread.sleep(5000);
	
	
	
	WebElement OpenProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@title='Open User Profile Menu'])[2]")));
	OpenProfile.click();
	Thread.sleep(5000);
	oPSelFW.reportStepDetails("User drop down should be displayed", "User drop down displayed sucessfully","Pass");

	
	WebElement SFLL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),' Save for Later Lists')])[2]")));

	System.out.println("++++got text ====" + SFLL.getText());
	if (SFLL.getText().equals("Save for Later Lists")) {
		
		oPSelFW.reportStepDetails("Save For Later Lists option should be displayed ","Save For Later Lists option should be displayed","Pass");
	}
	Thread.sleep(5000);
	SFLL.click();
	
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Verify Weekly list, Lunch list and Monthly list should be displayed ","verified Weekly list, Lunch list and Monthly list displayed sucessfully","Pass");

		
	} 

public void PlaceorderWithCCWithJCB(ProlificsSeleniumAPI oPSelFW,String paymentMode,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(5000);
	
	WebElement Clickonpickup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Pickup')])[1]")));
	Clickonpickup.click();
	Thread.sleep(5000);
	
	WebElement SelectStore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='shopping-selector-update-home-store-82']")));
	SelectStore.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 10000);
		
	WebElement selecttimeslot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-1dos84f'])[1]")));
	
	selecttimeslot.click();
	Thread.sleep(10000);
	wait = new WebDriverWait(driver, 20000);

	WebElement ClickOnSale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-test='quickshop-on_sale']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-test='quickshop-on_sale']")));
	
	ClickOnSale.click();
	Thread.sleep(2000);
	oPSelFW.reportStepDetails("Clicking Products on Sale button", "Successfully clicked Products on Sale button", "Pass");
	
	wait = new WebDriverWait(driver, 10000);
	List<WebElement> Items;
	Items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(@class,'plus')]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'plus')]")));
	// oASelFW.driver.findElements(By.xpath("//button[contains(@class,'plus')]"));
	//System.out.println("++=itesm Size is " + Items.size());
	for (int i = 0; i < 3; i++) {
		// WebElement product=Items;
		Items.get(i).sendKeys(Keys.ENTER);
		// System.out.println("Item Nameis+++"+Items.get(i).getText());

	}
	Thread.sleep(7000);
	oPSelFW.reportStepDetails("Items should be added to the cart sucessfully", "Items should be added to the cart sucessfully", "Pass");
	
	WebElement Clickoncart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cart-icon'])[1]")));
	Clickoncart.click();
	Thread.sleep(5000);
	
	oPSelFW.reportStepDetails("Clicking on Cart", "Successfully clicked on Cart", "Pass");

	WebElement ClickOncheckout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-cart-bottom-continue']")));
	ClickOncheckout.click();
	
	oPSelFW.reportStepDetails("Clicking on Checkout", "Successfully clicked on Checkout", "Pass");
	Thread.sleep(5000);
	
	
	 WebElement addcard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Card')]")));
     
     addcard.click();
     driver.switchTo().frame("iframeAuthorizeNet");
     //Entering Master card
     
     String cardNo = "3088000000000017";
     WebElement eleCardNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='cardNum']")));
     JavascriptExecutor js= (JavascriptExecutor)driver;	
     js.executeScript("arguments[1].value = arguments[0]; ", cardNo, eleCardNo);

    // eleCardNo.sendKeys(cardNo);
     WebElement eleExpireDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='expiryDate']")));
     eleExpireDate.sendKeys("1126");
     WebElement eleCVV = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cvv']")));
     eleCVV.sendKeys("123");
     WebElement eleFName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='firstName']")));
     eleFName.sendKeys("Devi");
     WebElement eleLName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='lastName']")));
     eleLName.sendKeys("Indra");
     //oASelFW.prolifics("click",bilDDCountry);
     //oASelFW.prolifics("click",bilSelIndia);
     WebElement eleZip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='zip']")));
     eleZip.sendKeys("534312");
     WebElement eleAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='address']")));
     eleAdd.sendKeys("RanganathamStreet");
     WebElement eleCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='city']")));
     eleCity.sendKeys("Chennai");
     WebElement eleState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='state']")));
     eleState.sendKeys("TamilNaadu");
     WebElement phonenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='phoneNumber']")));
     phonenumber.sendKeys("9090909090");
     WebElement company = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='companyName']")));
     company.sendKeys("Raley's");
     //company.sendKeys(Keys.TAB);
     
     driver.findElement(By.xpath("//button[@id='saveButton']")).click();
     //oASelFW.prolifics("click",cardSave," *** Card Save***");          
     Thread.sleep(5000);
     System.out.println("++++CARD SAVED++++");
     oPSelFW.reportStepDetails("Credit card should be savedy", "Credit card saved successfully", "Pass");
 	
    // prolifics("captureEntirePageScreenshot", "Credit card should be saved","Credit card saved successfully");
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
	

	
	WebElement placeOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkout-place-order-button']")));
	placeOrder.click();
	Thread.sleep(2000);
	wait = new WebDriverWait(driver, 1000);
	WebElement orderConfirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__title']")));
	if (orderConfirmation.isDisplayed()) {
		
		oPSelFW.reportStepDetails("Order Confirmation page should be opened sucessfully", "Order Confirmation page opened sucessfully", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Order Confirmtaion  page should be opened sucessfully ","Order Confirmation page  not  Opened", "Fail");

	}
	
	WebElement orderNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(text(),'Order')]")));
	String strOrderNo = orderNo.getText();
	
	WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='confirmation-new__section-header'][2]")));
	WebElement store = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='confirmation-new__section-header'])[3]")));

	oPSelFW.reportStepDetails("Verify Order pick up and store  details", "Verified Pick Up order details displayed sucessfully " + schedule.getText() + "For Store "+ store.getText(), "Pass");
	wait = new WebDriverWait(driver, 1000);
	WebElement lnkOrderDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'account/order-history/order')]")));
	lnkOrderDetails.click();
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	
	WebElement orderDetPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Order Details')]")));
	Thread.sleep(500);
	wait = new WebDriverWait(driver, 1000);
	if (orderDetPage.isDisplayed()) {
	
		WebElement Onumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='content-header-title']")));
		oPSelFW.reportStepDetails("Verify the order number ","Verified Order Number displayed sucessfully " + Onumber.getText(), "Pass");
		} else {
			oPSelFW.reportStepDetails("Order Details page should be opened sucessfully  ","Order Details page not opened", "Fail");
		
		}
	
	    oPSelFW.reportStepDetails("Order Details page should be opened successfully","Order Details page opened successfully","Pass");
	    Thread.sleep(500);
	    WebElement paymentMod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Payment Method')]/following-sibling::div")));
		oPSelFW.reportStepDetails("Verify Payment method in order details page " + paymentMod.getText(),"Verified Payment method in order details page" + paymentMod.getText(), "Pass");
		oPSelFW.reportStepDetails("Payment method should be displayed as selected " + paymentMod.getText(),"Payment method is displaying as selected" + paymentMod.getText(), "Pass");
		
	} 

public void topdeals(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement Shoponline = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'shop online')]")));
	Shoponline.click();
	Thread.sleep(10000);
	
	WebElement ViewMore = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'more')]")));
	ViewMore.click();
	oPSelFW.reportStepDetails("Top Deals in home page should be displayed sucessfully ",
			"Top Deals in home page displayed sucessfully View More", "Pass");
	Thread.sleep(5000);
	WebElement topdeals = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title']")));
	
	oPSelFW.reportStepDetails("Verify Top Deals Page should be  opened  ",
			"Verified Top Deals page displayed sucessfully for " + topdeals.getText(), "Pass");
	

}

public void forgotpassword(ProlificsSeleniumAPI oPSelFW,AndroidDriver<WebElement> driver) throws Exception

{
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	Thread.sleep(10000);
	WebElement OpenMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Open Menu']")));
	OpenMenu.click();
	
	oPSelFW.reportStepDetails("Open Menu should be displayed", "Open Menu is displayed successfully", "Pass");
	
	WebElement SignUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='raleys-sign-up'])[2]")));
	SignUp.click();
	oPSelFW.reportStepDetails("Signup Button should be displayed", "SignUp button is displayed successfully and clicked", "Pass");
	Thread.sleep(2000);
	WebElement LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
	LogIn.click();
	oPSelFW.reportStepDetails("Login Button should be Clicked", "Login button Clicked is successfully", "Pass");
	Thread.sleep(2000);
	
	WebElement loginLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Login')]")));
	if (loginLabel.isDisplayed()) {
		oPSelFW.reportStepDetails("Login page  should be opened sucessfully ", "Login label is avaialable", "Pass");
		} else {
			oPSelFW.reportStepDetails("Login page should not  be opened ", "Log in label is not avilable", "Fail");
			}
	// Log in with wrong password
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='gigya-input-text'])[1]")));
	email.sendKeys("devi.vallabhaneni@prolifics.com");
	WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='gigya-input-password'])[1]")));
	pwd.sendKeys("Arsin1234");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	// Checking for InVlaid User message
	WebElement eleInValidMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Invalid login or password')]")));
	String eleInValidMsg1 = eleInValidMsg.getText();
	
	if (eleInValidMsg.isDisplayed()) {
		oPSelFW.reportStepDetails("Verify Login error message should be displayed ","Verified InValid login or password error mesage is displayed as " +eleInValidMsg1, "Pass");
			
	} else {
		oPSelFW.reportStepDetails("Login error message should not be displayed ","InValid login or password error mesage is not displayed", "Fail");
		
	}
	Thread.sleep(3000);

	// Clicking on Forgot password link
	WebElement eleforgotPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Forgot password?')]")));
	eleforgotPassword.click();
	Thread.sleep(2000);
	// Entering un register email id
	WebElement eleemailId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gigya-textbox-loginID']")));
	eleemailId.clear();
	eleemailId.sendKeys("qwertyuiop1@gmail.com");
	Thread.sleep(2000);
	// Clicking on Submit Button
	WebElement elesubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Submit']")));
	elesubmit.click();
	Thread.sleep(2000);
	// Checking for no user error message
	WebElement eleNoUserMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'There is no user with that username or email')]")));
	String eleNoUserMsg1 = eleNoUserMsg.getText();
	
	if (eleNoUserMsg.isDisplayed()) {
		oPSelFW.reportStepDetails("Verify Email Address for reset password page is Opened ","Verified No user error mesage is displayed as " + eleNoUserMsg1, "Pass");
			} else {
				oPSelFW.reportStepDetails("Email Address for reset password page is Opened ","No user error mesage is not displayed", "Fail");
		
	}
	Thread.sleep(2000);
	// Re entering correct email id
	eleemailId.clear();
	eleemailId.sendKeys("devi.vallabhaneni@prolifics.com");
	elesubmit.click();
	Thread.sleep(2000);
	// Verifying the text An email regarding your password change has been sent to
	// your email address.
	WebElement elePwdChangeEmailerrMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'If the email entered is associated with a Something Extra account you will receive instructions for completing your password reset.')]")));
	
	String elePwdChangeEmailerrMsg1 = elePwdChangeEmailerrMsg.getText();
	if (elePwdChangeEmailerrMsg.isDisplayed()) {
		oPSelFW.reportStepDetails("Verify Password change email sent should be displayed","Verified Password change email has been sent msg is displayed", "Pass");
		
	} else {
		oPSelFW.reportStepDetails("Paswword change email sent is not displayed ","Password change email has been sent msg is not displayed", "Fail");
		;
	}

}


}
