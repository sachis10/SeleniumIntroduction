import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tema {

    public String baseUrl= "http://www.google.com/";
    public WebDriver driver = new ChromeDriver();

    @Test
    public void verifyGoogleImage() {
        driver.get(baseUrl);
        WebElement cookie = driver.findElement(By.id("L2AGLb"));
        cookie.click();
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys("Messi");
        search.submit();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[3]/a"));
        image.click();

        driver.quit();
    }
    @Test
    public void firstResult() {
        driver.get(baseUrl);
        WebElement cookie = driver.findElement(By.id("L2AGLb"));
        cookie.click();
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys("Messi");
        search.submit();

        WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[3]/div/div/div/div/div/div[1]/div/a/h3"));
        firstElement.click();
        driver.quit();
    }
    @Test
    public void firstResultDelete() {
        driver.get(baseUrl);
        WebElement cookie = driver.findElement(By.id("L2AGLb"));
        cookie.click();
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys("Messi");
        search.submit();

        WebElement delete = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[3]/div[1]/div/span"));
        delete.click();
        driver.quit();
    }

}