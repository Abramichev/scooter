import browserSettings.ConfigBrowser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Answer;
import pageObjects.MainPageScooter;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;


//public class ImportentQuestionsTest extends ConfigBrowser {
public class ImportentQuestionsTest extends ConfigBrowser{
   //WebDriver driver;

    int questionNumber;

  @Test
  public void checkAnswerText1() {
      try {
          driver.get("https://qa-scooter.praktikum-services.ru/");
          // Объект класса главной страницы
          MainPageScooter objMainPage = new MainPageScooter(driver);
          objMainPage.cookieButtonClick();
          //Номер вопроса
          questionNumber = 0;
          objMainPage.getQuestion(questionNumber).click();
          //Проверка текста ответа
          assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
  }
@Test
        public void checkAnswerText2() {
    try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 1;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
  }

@Test
        public void checkAnswerText3() {
    try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 2;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        }
@Test
        public void checkAnswerText4() {
    try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 3;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        }

@Test
        public void checkAnswerText5() {
            try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 4;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
  }

@Test
        public void checkAnswerText6() {
    try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 5;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        }
@Test
        public void checkAnswerText7() {
            try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 6;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        }
@Test
        public void checkAnswerText8() {
    try {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Объект класса главной страницы
        MainPageScooter objMainPage = new MainPageScooter(driver);
        objMainPage.cookieButtonClick();
        //Номер вопроса
        questionNumber = 7;
        objMainPage.getQuestion(questionNumber).click();
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        }

    }


