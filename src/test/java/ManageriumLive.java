import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManageriumLive {
    WebDriver driver;

    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://mgm.ibos.io/");
    }

    @Test
    public  void logInLive()
    {
        WebElement txtUser = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/input[1]"));
        txtUser.sendKeys("01679172828");
        WebElement txtPass = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/input[1]"));
        txtPass.sendKeys("mgm@arp");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/button[1]")).click();
//        driver.findElement(By.xpath("//div[contains(text(),'HR')]")).click();
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/ul[1]/li[1]/div[1]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
    }
}
