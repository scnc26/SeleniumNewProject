package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework {public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

  //  homework
    //Techproeducation sayfasına gidelim
driver.get("https://techproeducation.com");


    //Çıkan reklamı locate edip kapatalım
    driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
    //Arama bölümünde qa aratalım
driver.findElement
        (By.xpath("//*[@id='elementor-search-form-9f26725']"))
        .sendKeys("qa"+ Keys.ENTER);

    //Sayfa başlığının qa içerdiğini doğrulayalım
    if (driver.getTitle().contains("qa")) {
        System.out.println("test title qa: PASSED");
    }else System.out.println("test title qa: FAİLED");

    //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
    WebElement carrerOpp = driver.findElement
            (By.xpath("//*[@href='https://techproeducation.com/software-career-opportunities-qa/']"));
    System.out.println("carrerOpp.görünürmü = " + carrerOpp.isDisplayed());
    System.out.println("carrerOpp.isEnabled() = " + carrerOpp.isEnabled());

    //Carrer Opportunities In QA linkine tıklayalım
    carrerOpp.click();
    //Başlığın Opportunities içerdiğini test edelim
    if(driver.getTitle().contains("Opportunities")){
        System.out.println("test title PASSED");
    }else System.out.println("test title FAİLED");
    //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
driver.navigate().back();
driver.navigate().back();
    String acturalUrl = driver.getCurrentUrl();
    String expectedUrl="https://techproeducation.com/";
if(acturalUrl.equals(expectedUrl)){
    System.out.println("test main title: PASSED");


}else System.out.println("test main title: FAİLED");
driver.close();








}}
