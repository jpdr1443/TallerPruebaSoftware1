Feature: Inicio de Sesión en Saucedemo
  Para poder acceder a la plataforma de Saucedemo
  Como usuario registrado
  Quiero poder ingresar mis credenciales y verificar el acceso

    Scenario: Inicio de sesión exitoso en Saucedemo verficando URL
    Given Navego a la página de inicio de sesión de Saucedemo
    When Ingreso el nombre de usuario standard_user
    And Ingreso la contraseña secret_sauce
    And Hago clic en el botón de Login
    Then Debería ser redirigido a la URL https://www.saucedemo.com/v1/inventory.html