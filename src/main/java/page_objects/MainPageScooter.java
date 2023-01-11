package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageScooter {
    private final WebDriver driver;

    private final By upperOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private final By lowerOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    //клик по кнопке Заказать в верху страницы
    public void upperOrderClick() {
        this.driver.findElement(this.upperOrderButton).click();
    }


    public void scrollToLowerOrder() {
        WebElement element = this.driver.findElement(this.lowerOrderButton);
        ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView();", new Object[]{element});
    }

    public void lowerOrderClick() {
        this.driver.findElement(this.lowerOrderButton).click();
    }

    public void cookieButtonClick() {
        this.driver.findElement(this.cookieButton).click();
    }

    private By questions = By.className("accordion__item");
    private By answers = By.className("accordion__panel");

    private By buttonOrderTopPage = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private By buttonOrderMiddlePage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");

    public WebElement getQuestion(int index) {
        return driver.findElements(questions).get(index);
    }

    //Получить текст ответа
    public String getTextAnswer(int index) {
        //вернуть текст ответа
        return driver.findElements(answers).get(index).getText();
    }

}
