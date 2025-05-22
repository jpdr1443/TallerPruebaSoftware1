package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class FreeRangeTestersSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    
    @Given("I navigate to www.freerangetesters.com")
    public void iNavegateToFreeRangeTesters(){
        landingPage.navigateToFreeRangeTesters();

    }

    @When("I go to a section using the navigation bar")
    public void navigationBarUse(){
        landingPage.clickOnSectionNavigationBar();
        
    }
}
