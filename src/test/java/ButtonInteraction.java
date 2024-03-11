import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonInteraction {

@SuppressWarnings("deprecation")
public static void main(String[] args) {

// Create a WebDriver instance (for Chrome, in this case)
WebDriver driver = new ChromeDriver();

// Open the webpage
driver.get("https://demoqa.com/buttons");

driver.manage().window().maximize();

try {
// Wait until the buttons are loaded

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

// Find all buttons
WebElement[] buttons = driver.findElements(By.xpath("//button")).toArray(new WebElement[0]);

// Iterate through the buttons and perform actions
for (WebElement button : buttons) {
String buttonText = button.getText();
System.out.println("Button text: " + buttonText);

// Click the button
button.click();

// Wait for 1 second to observe the action
Thread.sleep(1000);

// Check if alert is present and accept it
try {
driver.switchTo().alert().accept();
} catch (Exception e) {
System.out.println("No alert found.");
}
}
} catch (Exception e) {
e.printStackTrace();
} finally {
// Close the browser window
driver.quit();
}
}
}


