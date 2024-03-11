import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserWindowsDemo {

    public static void main(String[] args) {
       
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the demoqa website
        driver.get("https://demoqa.com/browser-windows");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Click on the "New Window" button to open a new browser window
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        // Get handles of all currently open windows
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        // Perform actions on the new window (e.g., print the title)
        System.out.println("New Window Title: " + driver.getTitle());

        // Close the new window
        driver.close();

        // Switch back to the main window
        driver.switchTo().window((String) windowHandles.toArray()[0]);

        // Perform actions on the main window (e.g., print the title)
        System.out.println("Main Window Title: " + driver.getTitle());

        

        // Close the main window
        driver.quit();
    }
}


