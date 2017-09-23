package steps;

import net.thucydides.core.annotations.Step;
import page.BingSearchPage;
import page.WikipediaPage;

public class SearchSteps {

    private BingSearchPage bingSearchPage;
    private WikipediaPage wikipediaPage;

    @Step("Opens the bing search website")
    public void open_bing() {

        System.out.println("Open");
        bingSearchPage.open();
    }

    @Step("Search for the term {0}")
    public void search_for(String searchTerm) {
        System.out.println("Search for " + searchTerm);
        bingSearchPage.search(searchTerm);
    }

    @Step("Open the {0} search result")
    public void open_search_result(int resultNumber){
        System.out.println("Open Search result " + resultNumber);
        bingSearchPage.openSearchResult(resultNumber);
    }

    @Step("A web page will be visible")
    public void will_see_web_wikipedia() {
        System.out.println("Result visible");
        wikipediaPage.shouldBeDisplayed();
    }
}
