@CrearCuentaCorreo
Feature: Realizar Creacion de Cuenta de Correo

  @Scenario:CrearCuenta
  Scenario: Crear Cuenta Con datos Validos
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta Con mis datos personales
    And Un passwd correcto
    Then Validar que la cuenta se pueda Crear
    

 @ScenariOutline:CrearCuenta
  Scenario Outline: Crear Cuenta usuario nuevo
    Given Como un usuario nuevo que no tiene cuenta de Email
    When Quiero crear una cuenta con mi nombre <name> mi apellido <lname> mi usuario <username> y una constraseña <password>
    And con un telefono <phone>
    Then Validar que la cuenta se pueda Crear correctamente
    
  Examples: 
      | name	  | lname		  | username       | password	 		| phone				|
      | Antonio | Cabarcas  | Ancabarcas8041 | Prueba80.		| 3192129795	|
  