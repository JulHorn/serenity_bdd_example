package page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.wikipedia.de")
@At("https://www.wikipedia.de/*")
public class WikipediaPage extends BasePage {

    @FindBy(id = "txtSearch")
    private WebElementFacade searchField;

    @FindBy(id = "cmdSearch")
    private WebElementFacade searchButton;

    /**
     * Searches for a text.
     *
     * @param searchText The text for which will be searched.
     **/
    public void search(String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
        searchButton.click();
    }
}
