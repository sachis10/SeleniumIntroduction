import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfElseTest {

    @Test
    public void testPageTitle() {
        System.out.println("Lunching Chrome: ");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://google.com");

        //verifing the page title
        String expPageTitle = "Google";
        boolean flag = false;
        if (driver.getTitle().equalsIgnoreCase(expPageTitle)){
            flag = true;
        System.out.println("Page title matched");
    }

        Assert.assertTrue(flag,"Page title is not mathching "+"with expected");
        //driver.quit();
}
}
