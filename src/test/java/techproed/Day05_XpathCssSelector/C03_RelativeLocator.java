package techproed.Day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocator {
    public static void main(String[] args) {
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
/*
Benzer özelliklere sahip web elementler icin relative locator kullanabiliriz
SYNTAX;
driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near()) gibi methodlar
ile benzer özelliklere sahip web elementleri locate'ini almadan o web elemente ulaşabiliriz.
 */



        //amazona gidelim
        driver.get("https://amazon.com");


        // city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        //reletive locator kullanarak hibrit bike altindaki elemente tıklayalım
        WebElement hibritBikes = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));//---->//*[.='Hybrid Bikes']
        WebElement electrikBike = driver.findElement(with(By.tagName("a")).below(hibritBikes));
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electrikBike));
        electrikBike.click();

    }




}
