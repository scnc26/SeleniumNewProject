package techproed.Day03_dt_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
// aramakutusunu locate ediniz ve Nutella aratınız
        WebElement aramKutusu=driver.findElement(By.id("twotabsearchtextbox"));//arama kutusu locte aldık
        aramKutusu.sendKeys("Nutella");//arama kutusuna nutella yazıp enter a bastık
        aramKutusu.submit();//submit()-->Akeys enter gibi enter a basar
        Thread.sleep(3000);
        // sayfayı kapatınız
        driver.close();
    }
}
