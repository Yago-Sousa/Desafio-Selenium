package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.FormularioPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class PreencherFormularioSteps {

	
	
	@Quando("preencher a aba Vehicle Data")
	public void preencherAAbaVehicleData() throws InterruptedException {
		Na(FormularioPage.class).preencherVehicleData();
	}

	@Quando("preencher a aba Insurant Data")
	public void preencherAAbaInsurantData() throws InterruptedException {
		Na(FormularioPage.class).preencherInsurantData();
	}

	@Quando("preencher a aba Product Data")
	public void preencherAAbaProductData() throws InterruptedException {
		Na(FormularioPage.class).preencherProdutctData();
	}

	@Quando("preencher a aba Price Option")
	public void preencherAAbaPriceOption() {
		Na(FormularioPage.class).preencherPriceOption();
	}

	@Quando("preencher a aba Send Quote")
	public void preencherAAbaSendQuote() {
		Na(FormularioPage.class).preencherSendQuote();
	}

	
	@Entao("o sistema verifica a mensagem de sucesso")
	public void oSistemaVerificaAMensagemDeSucesso() throws InterruptedException {
		Thread.sleep(5000);
		assertEquals("Sending e-mail success!", driver.findElement(By.xpath("//h2")).getText());
	}

	
	

}
