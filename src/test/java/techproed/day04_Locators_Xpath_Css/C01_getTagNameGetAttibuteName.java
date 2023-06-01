package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttibuteName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


// 2- arama kutusunun tagName'inin  oldugunu test edin
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Test Passed");
        } else System.out.println("test Failed");
// 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String acturalattributeName = aramaKutusu.getAttribute("name");
        String expectedAttributeName = "field-keywords";
        if (acturalattributeName.equals(expectedAttributeName)) {
            System.out.println("test PASSED");
        } else System.out.println("test Failed");
// 4- sayfayı kapatınız
        driver.close();

/*
<input type="text" id="twotabsearchtextbox" value=""
name="field-keywords" autocomplete="off" placeholder="Ara Amazon.com.tr"
class="nav-input nav-progressive-attribute" dir="auto"
tabindex="0" aria-label="Ara Amazon.com.tr" spellcheck="false">
 */


    }
}
