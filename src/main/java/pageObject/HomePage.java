package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    private By searchInput=By.id("lst-ib");
    private By searchButton=By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)");
    private By firstResult=By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a");

    public HomePage(WebDriver webDriver)
    {
        driver=webDriver;
    }

    public void visitTo(String url)
    {
        driver.get(url);
    }

    public void type(String searchItem)
    {
        driver.findElement(searchInput).sendKeys(searchItem);
    }

    public void clickOnButton()
    {
        driver.findElement(searchButton).click();
    }

    public Boolean isContain (String indicator)
    {
        return driver.findElement(firstResult).getText().contains(indicator);
    }

}
