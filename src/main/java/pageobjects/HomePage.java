package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Vijayakumar.
 */
public class HomePage {

	public HomePage(ChromeDriver driver, int timeout) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeout), this);
	}

	@FindBy(xpath = "//a[@class='ico-register']")
	public static WebElement lnk_Register;

	@FindBy(xpath = "//a[@class='ico-login']]")
	public static WebElement lnk_Login;

	@FindBy(xpath = "//a[@class='ico-cart']")
	public static WebElement lnk_ShoppingCart;

	@FindBy(xpath = "//*[@class='header-links']//a[@class='ico-wishlist']")
	public static WebElement lnk_Wishlist;

	public static WebElement getlnk_Register() {
		return lnk_Register;
	}

	public static void setlnk_Register(WebElement lnk_Register) {
		lnk_Register = lnk_Register;
	}

	public static WebElement getlnk_Login() {
		return lnk_Login;
	}

	public static void setlnk_Login(WebElement lnk_Login) {
		lnk_Login = lnk_Login;
	}

	public static WebElement getlnk_ShoppingCart() {
		return lnk_ShoppingCart;
	}

	public static void setlnk_ShoppingCart(WebElement lnk_ShoppingCart) {
		lnk_ShoppingCart = lnk_ShoppingCart;
	}

	public static WebElement getlnk_wishlist() {
		return lnk_Wishlist;
	}

	public static void setlnk_wishlist(WebElement lnk_wishlist) {
		lnk_Wishlist = lnk_wishlist;
	}

}