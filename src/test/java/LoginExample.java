import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.NestingKind;

public class LoginExample {
    public String baseUrl= "http://www.google.com/";
    public WebDriver driver = new ChromeDriver();
    @Test
    public void login() {

       driver.get(baseUrl);

                WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/users/sign_in");

        WebElement username = driver.findElement(By.id("user_email_login"));
        WebElement password = driver.findElement(By.id("user_password"));
        WebElement login = driver.findElement(By.name("commit"));

        username.sendKeys("sorin_achis");
        password.sendKeys("parola123");
        login.click();

        String expectedResult = String.valueOf(driver.findElement(By.xpath("//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/fieldset/div[5]/div/div/div/span")));
        String   actualResult = String.valueOf(driver.findElement(By.xpath("//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/fieldset/div[5]/div/div/div/span")));

        Assert.assertEquals(expectedResult, actualResult);
        driver.close();

    }
}
