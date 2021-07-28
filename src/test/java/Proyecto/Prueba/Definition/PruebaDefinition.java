package Proyecto.Prueba.Definition;

import Proyecto.Prueba.Steps.PruebaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PruebaDefinition {

	@Steps
	PruebaSteps PruebaSteps;

	@Given("^Como un usuario que no tiene cuenta de Email$")
	public void como_un_usuario_que_no_tiene_cuenta_de_Email() throws Exception {
		PruebaSteps.IngresarCrearCuenta();
	}

	@When("^Quiero crear una Cuenta Con mis datos personales$")
	public void quiero_crear_una_Cuenta_Con_mis_datos_personales() throws Exception {
		PruebaSteps.DatosPersonales();
	}

	@When("^Un passwd correcto$")
	public void un_passwd_correcto() throws Exception {
		PruebaSteps.Contrasena();
	}

	@Then("^Validar que la cuenta se pueda Crear$")
	public void validar_que_la_cuenta_se_pueda_Crear() throws Exception {
		PruebaSteps.ValidacionCrearCuenta();
	}

	
	//......................................................................................................
	
	
	@Given("^Como un usuario nuevo que no tiene cuenta de Email$")
	public void como_un_usuario_nuevo_que_no_tiene_cuenta_de_Email() throws Exception {
		PruebaSteps.IngresarCrearCuenta();
	}

	@When("^Quiero crear una cuenta con mi nombre (.*) mi apellido (.*) mi usuario (.*) y una constraseña (.*)$")
	public void quiero_crear_una_cuenta_Con_mis_datos_personales(String name, String lname, String username, String password)throws Exception {
		PruebaSteps.DatosPersonales(name,lname,username,password);
		
	}
	
	@When("^con un telefono (.*)$")
	public void quiero_crear_una_cuenta_Con_mi_telefono(String phone)throws Exception {
		PruebaSteps.IngresarPhone(phone);
		
	}
	

	@Then("^Validar que la cuenta se pueda Crear correctamente$")
	public void validar_que_la_cuenta_se_pueda_Crear_correctamente() throws Exception {
		PruebaSteps.ValidacionPhoneCuenta();
	}
	
	
}
