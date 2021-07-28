package Proyecto.Prueba.Steps;

import Proyecto.Preuba.Questions.PruebaQuestions;
import Proyecto.Prueba.PageObject.PruebaPageObject;
import Proyecto.Prueba.PageObject.PruebaPagephone;
import net.thucydides.core.annotations.Step;

public class PruebaSteps {
	PruebaPageObject PruebaPageObject;
	PruebaQuestions PruebaQuestions;
	PruebaPagephone pruebaPhone;

	@Step
	public void IngresarCrearCuenta() {
		PruebaPageObject.open();

	}

	@Step
	public void DatosPersonales() {
		PruebaPageObject.EscribirNombre();
		PruebaPageObject.EscribirApellidos();
		PruebaPageObject.EscribirUsername();
		
	}

	@Step
	public void DatosPersonales(String name, String lname, String username, String password) throws InterruptedException {
		
		PruebaPageObject.EscribirNombre(name);
		PruebaPageObject.EscribirApellidos(lname);
		PruebaPageObject.EscribirUsername(username);
		PruebaPageObject.EscribirPasswd(password);
		PruebaPageObject.EscribirRepasswd(password);
		PruebaPageObject.InteractuarSiguiente();

	}

	@Step
	public void Contrasena() {
		PruebaPageObject.EscribirPasswd();
		PruebaPageObject.EscribirRepasswd();
		PruebaPageObject.InteractuarSiguiente();

	}
	
	@Step
	public void IngresarPhone(String phone) throws InterruptedException {
		
		PruebaQuestions.validarEtiqueta();
		pruebaPhone.EscribirPhone(phone);
		pruebaPhone.BotonPhoneSiguiente();

		

	}

	@Step
	public void ValidacionCrearCuenta() {

		PruebaQuestions.validarEtiqueta();
	}
	
	@Step
	public void ValidacionPhoneCuenta() {

		PruebaQuestions.verificarPhone();
	}

}
