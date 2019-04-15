package utils;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	static ChromeDriver driver;

	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kowsalya.ramesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public ChromeDriver getDriver() {
		if (null == driver)
			initialize();
		return driver;
	}

}
