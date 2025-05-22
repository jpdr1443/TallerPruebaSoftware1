package pages;

public class PaginaInventory extends BasePage {

    private String elementText = "//div[@class='product_label']";

    public PaginaInventory() {
        super(driver);
    }

    public String getElementText() {
        return getText(elementText);
    }

    public String getURLPage() {
        return getURL();
    }	

}