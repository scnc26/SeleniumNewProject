package techproed.Day04_DTLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElelmentLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  //-- https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
   // --arama kutusuna "city bike" yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));//localini aldlık
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();
   // --sonuc yazısını yazdırın
List<WebElement> sonucYazilari =driver.findElements(By.className("sg-col-inner"));//sonuc yazısının locate aldık
        String sonucYazisi = sonucYazilari.get(0).getText();
        //120 aynı isimli clastan 0. indexi aldık cünku hepsini o secti string olarak sonuc yazısını aldık
        String[] sonucSayisi=sonucYazisi.split(" ");//sonuc yazısını bosluktan böldük
        System.out.println("Arrays.toString(sonucSayisi) = " + Arrays.toString(sonucSayisi));
        //[1-16, of, 178, results, for, "city, bike"]

   // --sonuc sayısını yazdırın
        System.out.println("sonucSayisi[2] = " + sonucSayisi[2]);//178
   // --ilk ürünün locatini alın
        List<WebElement> sonuclar=driver.findElements(By.className("s-image"));
        WebElement ilkUrun = sonuclar.get(0);
   // --ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println("ilkUrun.görünürmü = " + ilkUrun.isDisplayed());
   // --ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println("ilkUrun.erisilebilirmi = " + ilkUrun.isEnabled());
   // --ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println("ilkUrun.secilebilirmi = " + ilkUrun.isSelected());
        //ilkUrun.secilebilirmi = false "isSelect" radio ve checkbox gibi kutucuklarda secimlerinde kullanılır
   // --ilk urune tıklayın
        ilkUrun.click();

     // --sayfayı kapatın
        driver.close();




    }
}
