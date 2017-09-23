package page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Represents the Bing page. Could be splitted up into two pages but this is simpler for as a small example project.
 * **/
// The host part will be overwritten by the serenity.properties entry
@DefaultUrl("http://www.bing.com")
@At("http://www.bing.com")
public class BingSearchPage extends BasePage {

    /**
     * The search field in which the search text can be entered.
     **/
    @FindBy(id = "sb_form_q")
    private WebElementFacade searchField;

    /**
     * The button which triggers the search process.
     **/
    @FindBy(id = "sb_form_go")
    private WebElementFacade searchButton;

    /**
     * The result list parent.
     **/
    @FindBy(id = "b_results")
    private WebElementFacade resultListContentElement;

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

    /**
     * Opens a search result by clicking on the result link.
     *
     * @param searchResultNumber The number of the search result, which should be opened. 0 is the first search result.
     **/
    public void openSearchResult(int searchResultNumber) {
        List<WebElement> resultLinks = resultListContentElement.findElements(By.xpath(".//li//h2//a"));

        resultLinks.get(searchResultNumber).click();
    }
}
