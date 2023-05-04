import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormDemo {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("web-driver.chrome.driver", "D:\\Soft\\chromedriver.exe");
        driver =  new ChromeDriver();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void singleInputField() {

        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("test");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true, yourMessage.isDisplayed());
    }
        @Test
        public void checkThatTheInputFieldIsEmpty (){

            driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
            driver.findElement(By.id("showInput")).click();
            WebElement yourMessage = driver.findElement(By.id("message"));
            Assert.assertEquals(false, yourMessage.isDisplayed());
        }

}
