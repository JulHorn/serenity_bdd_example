package steps;

import net.thucydides.core.annotations.Step;
import page.BingSearchPage;
import page.WikipediaPage;

/**
 * The example search steps.
 * **/
public class SearchSteps {

    /**
     * Includes the Bing page.
     * **/
    private BingSearchPage bingSearchPage;
    /**
     * Includes the Wikipedia page.
     * **/
    private WikipediaPage wikipediaPage;

    /**
     * Opens the Bing web page.
     * **/
    @Step("Opens the bing search website")
    public void open_bing() {

        System.out.println("Open");
        bingSearchPage.open();
    }

    /**
     * Searches via Bing.
     *
     * @param searchTerm The term for which should be searched.
     * **/
    @Step("Search for the term {0}")
    public void search_for(String searchTerm) {
        System.out.println("Search for " + searchTerm);
        bingSearchPage.search(searchTerm);
    }

    /**
     * Opens a Bing search result.
     *
     * @param resultNumber The index of the search result to be opened.
     * **/
    @Step("Open the {0} search result")
    public void open_search_result(int resultNumber){
        System.out.println("Open Search result " + resultNumber);
        bingSearchPage.openSearchResult(resultNumber);
    }

    /**
     * Checks that the Wikipedia website is visible.
     * **/
    @Step("The Wikipedia should be visible")
    public void will_see_web_wikipedia() {
        System.out.println("Result visible");
        wikipediaPage.shouldBeDisplayed();
    }
}