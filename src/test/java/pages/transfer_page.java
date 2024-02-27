package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class transfer_page{
    private WebDriver driver;

    public transfer_page(WebDriver driver) {
        this.driver = driver;
    }
    private By menu = By.id("transfer-menu-item");
    private By reset = By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[2]");
    private By amount = By.id("amount");
    private By submit = By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]");
    private By fromaccount = By.id("fromAccount");
    private By toaccount = By.id("toAccount");
    
    
    public void Fromaccount(String name) {
        WebElement from = driver.findElement(fromaccount);
        Select select = new Select(from);
        select.selectByVisibleText(name);
    }
    public void Toaccount(String name) {
        WebElement to = driver.findElement(toaccount);
        Select select = new Select(to);
        select.selectByVisibleText(name);
    }
    public void clicksubmit() {
        driver.findElement(submit).click();
    }
    public void clickreset() {
        driver.findElement(reset).click();
    }
    public void clicktransfer() {
        driver.findElement(menu).click();
    }
    public void enteramount(String Amount) {
        driver.findElement(amount).sendKeys(Amount);
    }

}