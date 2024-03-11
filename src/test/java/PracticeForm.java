import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.Select;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {

    
     public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the page
        driver.get("https://demoqa.com/automation-practice-form");

        // Fill the form
        driver.findElement(By.id("firstName")).sendKeys("Yogesh");
        driver.findElement(By.id("lastName")).sendKeys("Shinde");
        driver.findElement(By.id("userEmail")).sendKeys("Yogesh@example.com");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");



        WebElement uploadFile=driver.findElement(By.id("uploadPicture"));
        uploadFile.sendKeys("/home/yogeshs/JavaProject/Untitled 1.odt");
        
        // /home/yogeshs/JavaProject/Untitled 1.odt



        driver.findElement(By.id("currentAddress")).sendKeys("123 Main Street");
        driver.findElement(By.id("state")).click();
        driver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();
        driver.findElement(By.id("city")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).click();
        driver.findElement(By.id("submit")).click();



        // driver.findElement(By.id("dateOfBirthInput")).click();
        // //driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__month-select')]")).click();

        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // WebElement monthSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'react-datepicker__month-select')]")));
        // monthSelect.click();
        // Select monthDropdown = new Select(monthSelect);
        // monthDropdown.selectByVisibleText("April");

        //driver.findElement(By.xpath("//option[contains(text(),'April')]")).click();

        // driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__year-select')]")).click();
        // driver.findElement(By.xpath("//option[contains(text(),'1990')]")).click();
        // driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--0')]")).click();
        // driver.findElement(By.id("subjectsInput")).sendKeys("English");
        // driver.findElement(By.xpath("//div[text()='English']")).click();
        // driver.findElement(By.xpath("//label[text()='Reading']")).click();


               // Close the browser
        //driver.quit();
    }
    
}