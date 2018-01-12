package skeleton.features.steps.serenity;

import org.openqa.selenium.WebElement;
import skeleton.page.SearchPage;
import net.thucydides.core.annotations.Step;
import skeleton.page.SearchResultPage;

public class SearchSteps {

    SearchPage searchPage;
    SearchResultPage searchResultPage;

    @Step
    public void open() {

        searchPage.open();
    }

    @Step
    public void connect(String searchWord ) {

        searchPage.search(searchWord);
    }

    @Step
    public void getSearchResultOnPosition(int position){
        WebElement result = searchResultPage.getSearchResultOnPosition(position);
        result.click();
    }
}
