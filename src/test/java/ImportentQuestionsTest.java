import browser_settings.ConfigBrowser;
import org.junit.Test;
import page_objects.Answer;
import page_objects.MainPageScooter;

import static org.junit.Assert.assertEquals;


public class ImportentQuestionsTest extends ConfigBrowser {
    //WebDriver driver;

    int questionNumber;

    @Test
    public void checkAnswerText1() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 0;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

    @Test
    public void checkAnswerText2() {
            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 1;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

    @Test
    public void checkAnswerText3() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 2;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

    @Test
    public void checkAnswerText4() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 3;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));
            }

    @Test
    public void checkAnswerText5() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 4;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

    @Test
    public void checkAnswerText6() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 5;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

    @Test
    public void checkAnswerText7() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 6;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

    @Test
    public void checkAnswerText8() {

            driver.get("https://qa-scooter.praktikum-services.ru/");
            // Объект класса главной страницы
            MainPageScooter objMainPage = new MainPageScooter(driver);
            objMainPage.cookieButtonClick();
            //Номер вопроса
            questionNumber = 7;
            objMainPage.getQuestion(questionNumber).click();
            //Проверка текста ответа
            assertEquals("Проверьте текст " + questionNumber + " ответа", Answer.TEXT_ANSWER[questionNumber], objMainPage.getTextAnswer(questionNumber));

    }

}


