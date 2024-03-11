import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop{

    public static void main(String[] args) {
       
        // Initialize WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://demoqa.com/droppable");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Locate draggable element
        WebElement draggable = driver.findElement(By.id("draggable"));

        // Locate droppable element
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Perform drag and drop action
        actions.dragAndDrop(draggable, droppable).perform();

        // Verify if the drop was successful
        String droppedText = droppable.getText();
        if (droppedText.equals("Dropped!")) {
            System.out.println("Drag and drop successful!");
        } else {
            System.out.println("Drag and drop failed!");
        }

        // Close the browser
        //driver.quit();
    }
}
