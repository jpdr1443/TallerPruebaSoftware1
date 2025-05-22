package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//h3[@class='Nav-TitleSection Nav-TitleSectionWithoutBorder' and normalize-space()='Últimas Noticias']";
    
    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.elespectador.com/");
    }

    public void clickOnSectionNavigationBar(){
        clickElement(sectionLink);
    }
    
}
