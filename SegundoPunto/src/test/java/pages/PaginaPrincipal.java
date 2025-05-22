package pages;

public class PaginaPrincipal extends BasePage {

 private String sectionLink = "//h3[normalize-space()='%s']";

    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.elespectador.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.elespectador.com/");
 
    }
 
    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
    
}
