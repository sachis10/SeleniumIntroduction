import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tema_C19 {

        private WebDriver driver;

        @BeforeClass
        public void setup() {
            System.setProperty("web-driver.chrome.driver", "D:\\Soft\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        @AfterClass
        public void teardown() {
            driver.quit();
        }

        @Test
        public void singleInputCharacters() {

            driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
            driver.findElement(By.id("user-message")).sendKeys("123$%^ABCDF_.dfa||??.");
            driver.findElement(By.id("showInput")).click();
            WebElement yourMessage = driver.findElement(By.xpath("//*[@id=\"message\"]"));
            Assert.assertEquals(true, yourMessage.isDisplayed());
            System.out.println("System allows all characters");
        }
    @Test
    public void twoInputNumbersCorrectSum() {
        String str = "1234";
        int foo = Integer.parseInt(str);
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("sum1")).sendKeys("3");
        driver.findElement(By.id("sum2")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        WebElement result = driver.findElement(By.xpath("/html/body/div[1]/div/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/p"));
        Assert.assertEquals(result,"5" );

    }


}