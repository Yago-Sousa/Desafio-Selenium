package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;

public class Utils {

	public static WebDriver driver;

	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}

	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}
	
	public static void capturarTela(io.cucumber.core.api.Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	
}
