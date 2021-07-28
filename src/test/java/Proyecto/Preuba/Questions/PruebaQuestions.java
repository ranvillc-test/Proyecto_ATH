package Proyecto.Preuba.Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PruebaQuestions extends PageObject{
	
	/*
	 * Definicion de variables
	 * */
	String TXT_LABEL="Verificar tu número";
	@FindBy(xpath="//*[@class=\"ahT6S \"]")
	public WebElementFacade LBL_CONFIRMACION;
	
	String TXT_VERIFICAR="Verificar";
	@FindBy(xpath="//span[normalize-space()='Verificar']")
	public WebElementFacade BTN_VERIFICARPHONE;
	
	
	
	public void validarEtiqueta() {
		
		Assert.assertEquals(TXT_LABEL,LBL_CONFIRMACION.getText());
		System.out.println("Validacion primar ok");
	}
	
	
	public void verificarPhone(){
		
		BTN_VERIFICARPHONE.waitUntilVisible().findElement(By.xpath("//span[normalize-space()='Verificar']"));
		
		Assert.assertEquals(TXT_VERIFICAR,BTN_VERIFICARPHONE.getText());
		

	}
	
	
	
	
	
	
	

}
