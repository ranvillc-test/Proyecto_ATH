package Proyecto.Prueba.PageObject;

import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp")
public class PruebaPageObject extends PageObject{
	
	/*
	 * Definicion de variables
	 * */
	String TXT_CONTRASENA="Loquequieraponer2020";
	@FindBy(id="firstName")
	public WebElementFacade TXT_NOMBRES;
	
	@FindBy(name="lastName")
	public WebElementFacade TXT_APELLIDOS;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	public WebElementFacade TXT_USERNAME;
	
	@FindBy(name="Passwd")
	public WebElementFacade TXT_PASSWD;
	
	@FindBy(xpath="//input[@name='ConfirmPasswd']")
	public WebElementFacade TXT_PASSWDCONF;
	
	@FindBy(xpath="//span[normalize-space()='Siguiente']")
	public WebElementFacade BTN_SIGUIENTE;
	
	
	
	public void EscribirNombre() {
		TXT_NOMBRES.sendKeys("Nombre de Prueba");
		}
	
	public void EscribirNombre(String name) {
		TXT_NOMBRES.sendKeys(name);
		}

	public void EscribirApellidos() {
		TXT_APELLIDOS.sendKeys("Apellido Prueba");
	}
	
	public void EscribirApellidos(String lname) {
		TXT_APELLIDOS.sendKeys(lname);
	}


	public void EscribirUsername() {
		TXT_USERNAME.sendKeys("userprueba20202");
		
	}
	
	public void EscribirUsername(String username) {
		TXT_USERNAME.sendKeys(username);
		
	}


	public void EscribirPasswd() {
		TXT_PASSWD.sendKeys(TXT_CONTRASENA);
		
	}


	public void EscribirRepasswd() {
		TXT_PASSWDCONF.sendKeys(TXT_CONTRASENA);
		
	}
	
	public void EscribirPasswd(String password) {
		TXT_PASSWD.sendKeys(password);
		
	}


	public void EscribirRepasswd(String password) {
		TXT_PASSWDCONF.sendKeys(password);
		
	}
	
	
	

	public void InteractuarSiguiente() {
		BTN_SIGUIENTE.click();
		
	}
	
	
	
	
	


	

	
}
