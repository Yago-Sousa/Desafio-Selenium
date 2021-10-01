package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormularioPage {

	
//	Vehicle Data
	
	@FindBy (id = "nav_automobile")
	private WebElement navAutomobile;
	
	@FindBy (id = "entervehicledata")
	private WebElement abaVehicleData;
	
	@FindBy (id = "make")
	private WebElement make;
	
	@FindBy (id = "engineperformance")
	private WebElement enginePerformace;
	
	@FindBy (id = "dateofmanufacture")
	private WebElement dateOfManufacture;
	
	@FindBy (id = "numberofseats")
	private WebElement numberOfSeats;
	
	@FindBy (id = "fuel")
	private WebElement fuelPrice;
	
	@FindBy (id = "listprice")
	private WebElement listPrice;
	
	@FindBy (id = "licenseplatenumber")
	private WebElement plateNumber;
	
	@FindBy (id = "annualmileage")
	private WebElement anualMileage;
	
	@FindBy (id = "nextenterinsurantdata")
	private WebElement btnNextenterInsurantData;
	
	public void preencherVehicleData() throws InterruptedException {
		navAutomobile.click();
		Select combo1 = new Select(make);
		combo1.selectByVisibleText("Audi");
		enginePerformace.sendKeys("1000");
		dateOfManufacture.sendKeys("10/10/1990");
		numberOfSeats.sendKeys("4");
		Select combo2 = new Select(fuelPrice);
		combo2.selectByVisibleText("Petrol");
		listPrice.sendKeys("15000");
		plateNumber.sendKeys("121212");
		anualMileage.sendKeys("2222");
		btnNextenterInsurantData.click();		
	}
	
	
//	Insurant Data
	
	@FindBy (id = "enterinsurantdata")
	private WebElement abaInsurantData;
	
	@FindBy (id = "firstname")
	private WebElement firstName;
	
	@FindBy (id = "lastname")
	private WebElement lastName;
	
	@FindBy (id = "birthdate")
	private WebElement birthDate;
	
	@FindBy (xpath = "//label[@class='ideal-radiocheck-label'][contains(string(),'Male')]")
	private WebElement male;
	
	@FindBy (id = "streetaddress")
	private WebElement streetAddress;
	
	@FindBy (id = "country")
	private WebElement country;
	
	@FindBy (id = "zipcode")
	private WebElement zipCode;
	
	@FindBy (id = "city")
	private WebElement city;
	
	@FindBy (id = "occupation")
	private WebElement occupation;
	
	@FindBy (xpath = "//label[@class='ideal-radiocheck-label'][contains(string(),'Skydiving')]")
	private WebElement skydiving;
	
	@FindBy (id = "website")
	private WebElement website;
	
	@FindBy (id = "nextenterproductdata")
	private WebElement btnNextenterProductData;
	
	public void preencherInsurantData() throws InterruptedException {
		
		firstName.sendKeys("Yago");
		lastName.sendKeys("Oliveira");
		birthDate.sendKeys("12/12/1980");
		male.click();
		streetAddress.sendKeys("Rua 01");
		Select combo1 = new Select(country);
		combo1.selectByVisibleText("Brazil");
		zipCode.sendKeys("71996115");
		city.sendKeys("Brasilia");
		Select combo2 = new Select(occupation);
		combo2.selectByVisibleText("Employee");
		skydiving.click();
		website.sendKeys("yago.com");
		btnNextenterProductData.click();
	}
	
	
//	Produtct Data
		
	@FindBy (id = "enterproductdata")
	private WebElement abaProductData;
	
	@FindBy (id = "startdate")
	private WebElement startDate;
	
	@FindBy (id = "insurancesum")
	private WebElement insuranceSum;
	
	@FindBy (id = "meritrating")
	private WebElement meritRating;
	
	@FindBy (id = "damageinsurance")
	private WebElement damageInsurance;
	
	@FindBy (xpath = "//label[@class='ideal-radiocheck-label'][contains(string(),'Euro Protection')]")
	private WebElement euroProtection;
	
	@FindBy (id = "courtesycar")
	private WebElement courtesyCar;
	
	@FindBy (id = "nextselectpriceoption")
	private WebElement btnNextSelectPriceOption;
	
	public void preencherProdutctData() throws InterruptedException {
		startDate.sendKeys("10/10/2022");
		Select combo1 = new Select(insuranceSum);
		combo1.selectByVisibleText("3.000.000,00");
		Select combo2 = new Select(meritRating);
		combo2.selectByVisibleText("Super Bonus");
		Select combo3 = new Select(damageInsurance);
		combo3.selectByVisibleText("No Coverage");
		euroProtection.click();
		Select combo4 = new Select(courtesyCar);
		combo4.selectByVisibleText("No");
		btnNextSelectPriceOption.click();
	}
	
//	Price Option
	
	@FindBy (xpath = "(//label[@class='choosePrice ideal-radiocheck-label']//span[@class='ideal-radio'])[1]")
	private WebElement selectSilver;
	
	@FindBy (id = "nextsendquote")
	private WebElement btnNextSendQuote;
	
	public void preencherPriceOption() {
		selectSilver.click();
		btnNextSendQuote.click();
	}
	
//	Send Quote
	
	@FindBy (id = "email")
	private WebElement email;
	
	@FindBy (id = "phone")
	private WebElement phone;
	
	@FindBy (id = "username")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement password;
	
	@FindBy (id = "confirmpassword")
	private WebElement confirmpassword;
	
	@FindBy (id = "Comments")
	private WebElement comments;
	
	@FindBy (id = "sendemail")
	private WebElement btnSendEmail;
	
	
	public void preencherSendQuote() {
		email.sendKeys("yago@yago.com");
		phone.sendKeys("123123123123");
		username.sendKeys("yago");
		password.sendKeys("Yago123");
		confirmpassword.sendKeys("Yago123");
		comments.sendKeys("yago bonito!");
		btnSendEmail.click();
	}
	
	

	
	
}
