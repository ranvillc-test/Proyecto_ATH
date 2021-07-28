package Proyecto.Prueba.PageObject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PruebaPagephone extends PageObject{
	
	
	@FindBy(xpath="//input[@id='phoneNumberId']")
	public WebElementFacade TXT_PHONE;
	
	
	@FindBy(xpath="//span[normalize-space()='Siguiente']")
	public WebElementFacade BTNPHONE_SIGUIENTE;
	
	
	
	public void EscribirPhone(String phone) throws InterruptedException {
		
		TXT_PHONE.sendKeys(phone);
	}
	
	
	public void BotonPhoneSiguiente() throws InterruptedException {
		//Thread.sleep(1000);
		BTNPHONE_SIGUIENTE.click();
		
	}

}
