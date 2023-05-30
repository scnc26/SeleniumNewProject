package techproed.Day03_dt_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com ");

// Amazon sayfasında kac tane link olduğunu konsolda yazdırın
       List<WebElement> linklerlistesi= driver.findElements(By.tagName("a"));
       // a  tagı linklere gider cok sayıda oldugu icin list e assing edilir
        System.out.println("a tag linklerlistesi. = " + linklerlistesi.size());
        //kodumuzu calistirinca Linklerin Sayisi:319 sonucunu gorduk.;

// Linkleri konsolda yazdırın
        for (WebElement each:linklerlistesi){
            System.out.println(each.getText());
            //getText()--> hash kodu ile verilen elementleri stringe dönüstürür
            //getText() -->kullanılmazsa hash code verir
        }
// sayfayı kapatın
driver.close();





    }
}
