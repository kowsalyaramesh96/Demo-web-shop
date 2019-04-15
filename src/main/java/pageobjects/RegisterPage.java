package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import junit.framework.Assert;

/**
 * Created by Vijayakumar.
 */
public class RegisterPage {
	public RegisterPage(WebDriver driver, int timeout) {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeout), this);
	}
	WebDriver driver;
	@FindBy(xpath = "//*[@class='page-title']")
	public static WebElement lbl_Register;

	@FindBy(xpath = "//*[@id='gender-male']")
	public static WebElement rb_genderMale;

	@FindBy(xpath = "//*[@id='FirstName']")
	public static WebElement txt_FirstName;

	@FindBy(xpath = "//*[@id='LastName']")
	public static WebElement txt_LastName;

	@FindBy(xpath = "//*[@id='Email']")
	public static WebElement txt_Email;
	// *[@id='Password']

	@FindBy(xpath = "//*[@id='Password']")
	public static WebElement txt_Password;

	@FindBy(xpath = "//*[@id='ConfirmPassword']")
	public static WebElement txt_ConfirmPassword;

	@FindBy(xpath = "//*[@id='register-button']")
	public static WebElement btn_Register;

	@FindBy(xpath = "//*[@class='result']")
	public static WebElement lbl_result;

	private static WebElement rb_genderFemale;

	public static WebElement getbtn_Register() {
		return btn_Register;
	}

	public static void setbtn_Register(WebElement btn_Register) {
		RegisterPage.btn_Register = btn_Register;
	}

	public static WebElement gettxt_ConfirmPassword() {
		return txt_ConfirmPassword;
	}

	public static void settxt_ConfirmPassword(WebElement txt_ConfirmPassword) {
		RegisterPage.txt_ConfirmPassword = txt_ConfirmPassword;
	}

	public static WebElement gettxt_Password() {
		return txt_Password;
	}

	public static void settxt_Password(WebElement txt_Password) {
		RegisterPage.txt_Password = txt_Password;
	}

	public static WebElement gettxt_Email() {
		return txt_Email;
	}

	public static void settxt_Email(WebElement txt_Email) {
		RegisterPage.txt_Email = txt_Email;
	}

	public static WebElement gettxt_LastName() {
		return txt_LastName;
	}

	public static WebElement getlbl_Register() {
		return lbl_Register;
	}

	public static void setlbl_Register(WebElement lbl_Register) {
		lbl_Register = lbl_Register;
	}

	public static void settxt_LastName(WebElement txt_LastName) {
		RegisterPage.txt_LastName = txt_LastName;
	}

	public static WebElement gettxt_FirstName() {
		return txt_FirstName;
	}

	public static void settxt_FirstName(WebElement txt_FirstName) {
		RegisterPage.txt_FirstName = txt_FirstName;
	}

	public static WebElement getrb_genderMale() {
		return rb_genderMale;
	}

	public static void setrb_genderMale(WebElement rb_genderMale) {
		RegisterPage.rb_genderMale = rb_genderMale;
	}

	@FindBy(xpath = "//input[@value='Continue']")
	public static WebElement get_Continue;
	public static WebElement get_Continue() {
		return get_Continue;
	}
	@FindBy(xpath = "//*[@href='/books']")
	public static WebElement clk_Books;
	public static WebElement clk_Books() {
		return clk_Books;
	}
	
	@FindBy(xpath = "//*[@href='/fiction']")
	public static WebElement clk_Fiction;
	public static WebElement clk_Fiction() {
		return clk_Fiction;
	}

	@FindBy(xpath = "//*[@id='add-to-cart-button-45']")
	public static WebElement Add_Cart;
	public static WebElement Add_Cart() {
		return Add_Cart;

	}
	@FindBy(xpath = "//*[@id='topcartlink']/a")
	public static WebElement Mycart; 
	public static WebElement Mycart() {
		return Mycart;
	}
	@FindBy(xpath = "//div[@id='bar-notification']/p/a")
	public static WebElement clk_Shoppingcart; 
	public static WebElement clk_Shoppingcart() {
		return clk_Shoppingcart;
	}
	@FindBy(xpath = "//select[@id='CountryId']")
	public static WebElement Country; 
	public static WebElement Country() {
		return Country;
	}
	@FindBy(xpath = "//input[@id='ZipPostalCode']")
	public static WebElement Postalcode; 
	public static WebElement Postalcode() {
		return Postalcode;// 
}
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	public static WebElement terms; 
	public static WebElement terms() {
		return terms;
}
	@FindBy(xpath = "//button[@id='checkout']")
	public static WebElement Checkout; 
	public static WebElement Checkout() {
		return Checkout;
}
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	public static WebElement CountryId; 
	public static WebElement CountryId() {
		return CountryId;
}
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	public static WebElement City; 
	public static WebElement City() {
		return City;
}
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	public static WebElement Address1; 
	public static WebElement Address1() {
		return Address1;
}
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	public static WebElement Codebilling; 
	public static WebElement Codebilling() {
		return Codebilling;
}
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	public static WebElement Phone; 
	public static WebElement Phone() {
		return Phone;
}
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	public static WebElement Continueagain; 
	public static WebElement Continueagain() {
		return Continueagain;
}
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	public static WebElement Continue2; 
	public static WebElement Continue2() {
		return Continue2;
}
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/input")
	public static WebElement Continue3; 
	public static WebElement Continue3() {
		return Continue3;
}
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/input")
	public static WebElement Continue4; 
	public static WebElement Continue4() {
		return Continue4;
}
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/input")
	public static WebElement Continue5; 
	public static WebElement Continue5() {
		return Continue5;
}
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
	public static WebElement Confirm; 
	public static WebElement Confirm() {
		return Confirm;
}
	
	@FindBy(xpath= "//div[@class='title']")
	public static WebElement ordered; 
	public static WebElement ordered() {
		return ordered;
}
	
	//Your order has been successfully processed!
	@FindBy(xpath = "//div[@class='section order-completed']/div/input")
	public static WebElement Continue6; 
	public static WebElement Continue6() {
		return Continue6;
}
	
}

