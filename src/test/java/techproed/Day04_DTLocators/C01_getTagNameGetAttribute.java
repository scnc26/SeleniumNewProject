package techproed.Day04_DTLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /* önce locate al
        webElement.getTagName( ); Web elementin tag ismini getirir.
 Bir HTML koduna inspect ile baktik. Tag name'nin input oldugunu gorduk. getTagName() bize
 input'u verir.


webElement.getAttribute("Att.ismi" ); Ismi girilen attribute'un degerini getirir.
Ayni HTML koduna baktik ve id olan attribute'u gorduk. Bu id attribute'i getAttribute() parantezi
icine yazarsak bize value'su olan twotabsearchtextbox'i verir.
         */
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusunu locate ediniz
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));//Locate alınır iki tane olsada id icin uniqe dir
        // arama kutusunun tagName'inin "input" oldugunu test edin
        String actualTagName = aramaKutusu.getTagName();//gercek tagname get name ile siteden alindi
        String expectedTagName="input";//beklenen tagname
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİL "+actualTagName);
        // arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
        String actualAtribute=aramaKutusu.getAttribute("name");
        String expectedAttribute="field-keywords";
        if (actualAtribute.equals(expectedAttribute)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAİLED "+actualAtribute);
        // sayfayı kapatın
        driver.close();


    }





}
