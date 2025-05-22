package steps;
 
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaInventory;
import pages.PaginaPrincipal;
 
public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaInventory inventoryPage = new PaginaInventory();
 
    @Given("Navego a la página de inicio de sesión de Saucedemo")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
    
    @When("Ingreso el nombre de usuario {word}")
    public void iWriteUsername(String username) {
        landingPage.writeOnUsername(username);
    }
 
    @And("Ingreso la contraseña {word}")
    public void iWritePassword(String password) {
        landingPage.writeOnPassword(password);
    }

    @And("Hago clic en el botón de Login")
    public void iClickOnLoginButton() {
        landingPage.clickOnLoginButton();
    }
    
    @Then("Debería ser redirigido a la página de productos")
    public void validateMessage(){
        Assert.assertEquals(inventoryPage.getElementText(), "Products");
        // Assert.assertEquals(inventoryPage.getURLPage(), "https://www.saucedemo.com/v1/inventory.html");
                
    }

    @Then("Debería ser redirigido a la URL {word}")
    public void validateURL(String urlPage){
        Assert.assertEquals(inventoryPage.getURLPage(), urlPage);
                
    }
}