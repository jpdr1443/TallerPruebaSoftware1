package pages;

public class PaginaPrincipal extends BasePage {

    private String elementUsername = "//input[@id='user-name']";
    private String elementPassword = "//input[@id='password']";
    private String elementClickBoton = "//input[@id='login-button']";
    private String elementoMessage = "//h3[@data-test='error']";
 
    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.saucedemo.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.saucedemo.com/v1/");
 
    }
 
    public void writeOnUsername(String keysToSend){
        write(elementUsername, keysToSend);
    }
    
    public void writeOnPassword(String keysToSend){
        write(elementPassword, keysToSend);
    }

    public void clickOnLoginButton() {
        clickElement(elementClickBoton);
    }

    public String getMessage(){
        return getText(elementoMessage);
        
    }
    
}
