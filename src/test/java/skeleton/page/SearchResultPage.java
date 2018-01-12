package skeleton.page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;


public class SearchResultPage extends PageObject {

    @FindBy(className = "srg")
    private WebElement searchResults;


    public WebElement getSearchResultOnPosition(int position){
        return this.searchResults.findElement(By.xpath("div[1]/div/div/h3/a"));
    }
}
