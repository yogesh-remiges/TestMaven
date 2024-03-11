import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadFile {
     @SuppressWarnings("deprecation")
    @Test
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.16/");
        // driver.findElements(By.linkText("chromedriver_linux64.zip"));

        WebElement link = driver.findElement(By.linkText("chromedriver_linux64.zip"));
        
        link.click();
       
       
        try {

            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();

        }

        driver.quit();
    }

}
