package techproed.Day03_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //-ÖDEV-
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //çıkan sonuç yazısını konsola yazdırınız
        WebElement sonucYazisi = driver.findElement(By.xpath("//h1//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisi.getText());
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi = "+sonucSayisi[2]);
        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        for (int i = 0; i < 5 ; i++) {
            List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
            Thread.sleep(1000);
            urunler.get(i).click();
            Thread.sleep(1000);
            System.out.println((i+1)+". Urun basligi : "+driver.getTitle());
            driver.navigate().back();
            Thread.sleep(1000);
        }
        driver.close();
    }
}
