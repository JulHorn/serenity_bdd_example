package test;

import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Ignore;
import org.junit.Test;
import steps.SearchSteps;

/**
 * Tests for Bing.
 * **/
@Narrative(text={"In order to choose the best flight for my travels",
        "As a traveller",
        "I want to be able to search for flights between specific destinations"})
public class BingTest extends BaseTest{

    /**
     * The search steps needed for the tests.
     * **/
    @Steps
    private SearchSteps searchSteps;

    /**
     * The positive test.
     * **/
    @Test
    @Title("Searches for wikipedia via Bing and opens it")
    public void searchWorks() {
        searchSteps.open_bing();
        searchSteps.search_for("wikipedia.de");
        searchSteps.open_search_result(0);
        searchSteps.will_see_web_wikipedia();
    }

    /**
     * Test fails directly in the test.
     * **/
    @Test
    @Title("Searches and does throws a RuntimeException")
    public void failsInTest() {
        searchSteps.open_bing();
        searchSteps.search_for("google");
        searchSteps.open_search_result(0);
        throw new RuntimeException("Failed in test");
    }

    /**
     * Fails in a step of the step library.
     * **/
    @Test
    @Title("Searches for wikipedia via Bing and opens it and fails in a step")
    public void failsInStep() {
        searchSteps.open_bing();
        searchSteps.search_for("something");
        searchSteps.open_search_result(0);
        searchSteps.will_see_web_wikipedia();
    }

    /**
     * A pending test.
     * **/
    @Test
    @Pending
    @Title("Pending")
    public void pendingTest() {

    }

    /**
     * An ignored test.
     * **/
    @Test
    @Ignore
    @Title("Ignored")
    public void ignoreTest() {

    }
}
