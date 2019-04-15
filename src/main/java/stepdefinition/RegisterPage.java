package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utils.Driver;

public class RegisterPage extends Driver{
	WebDriver driver;
	pageobjects.HomePage homePage = new pageobjects.HomePage(getDriver(), 500);
	pageobjects.RegisterPage registerPage = new pageobjects.RegisterPage(getDriver(), 500);

	@And("^Click registeration link$")
	public void registerationlnk() throws Throwable {
		homePage.getlnk_Register().click();
	}

	@And("^Enter Registeration Details$")
	public void registerationpage() throws Throwable {
		registerPage.getrb_genderMale().click();
		registerPage.gettxt_FirstName().sendKeys("Karthi");
		registerPage.gettxt_LastName().sendKeys("Ramesh");

		Random rndNum = new Random();
		int rndNum1 = 0;

		for (int nbr = 1; nbr <= 1; nbr++) {
			rndNum1 = rndNum.nextInt();
			System.out.println("Number: " + rndNum1);
		}

		registerPage.gettxt_Email().sendKeys("ABC" + rndNum1 + "@gmail.com");
		registerPage.gettxt_Password().sendKeys("Abcd@123");
		registerPage.gettxt_ConfirmPassword().sendKeys("Abcd@123");
		registerPage.getbtn_Register().click();
		
		
	}
		
		@Given("^Click on Continue$")
		public void click_on_Continue() throws Throwable {
			registerPage.get_Continue().click();
		}

		@Given("^click on Books and checkout$")
		public void click_on_Books() throws Throwable {
			registerPage.clk_Books().click();
			registerPage.clk_Fiction().click();
			
			registerPage.Add_Cart().click();
			Thread.sleep(3000);
			/*WebDriverWait wait = new WebDriverWait(driver,30); 			
			wait.until(ExpectedConditions.textToBePresentInElement (registerPage.Mycart,"Shopping cart(1)"));*/
			registerPage.clk_Shoppingcart.click();
//			String str = registerPage.Country().getText();
			registerPage.Country.click();
//			WebElement drop=driver.findElement(arg0)
			Select sel= new Select(registerPage.Country());
			sel.selectByVisibleText("India");
			//WebElement bilad = driver.findElement(By.xpath("//div[@id='checkout-billing-load']/div/div/label"));
			/*String str = registerPage.Country().getText();
			WebDriverWait wait = new WebDriverWait(driver,30); 
			wait.until(ExpectedConditions.textToBePresentInElement (,"Billing Address"));*/
			registerPage.Postalcode().sendKeys("631102");
			registerPage.terms().click();
			registerPage.Checkout().click();
			registerPage.CountryId.click();
			Select sel1= new Select(registerPage.CountryId());
			sel1.selectByVisibleText("India");
			registerPage.City().sendKeys("Vellore");
			registerPage.Address1().sendKeys("No.1, Big Street, Sholinghur");
			registerPage.Codebilling().sendKeys("600012");
			registerPage.Phone().sendKeys("9999632585");
			registerPage.Continueagain().click();
			Thread.sleep(3000);
			registerPage.Continue2().click();
			Thread.sleep(3000);
			registerPage.Continue3().click();
			Thread.sleep(3000);
			registerPage.Continue4().click();
			Thread.sleep(3000);
			registerPage.Continue5().click();
			Thread.sleep(3000);
			registerPage.Confirm().click();
			
			String title= registerPage.ordered().getText();			
			assertEquals("Your order has been successfully processed!", title);
			System.out.println("PASS");
			registerPage.Continue6().click();
			
		
		}

		
		  
		
	
	
}
