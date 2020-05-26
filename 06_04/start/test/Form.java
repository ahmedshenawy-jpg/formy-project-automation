import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPAge formpage = new FormPAge();

        formpage.submitForm(driver);

        ConfirmationPage cf = new ConfirmationPage();
        cf.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", cf.getAlertBannerText(driver));

        driver.quit();
    }




}
