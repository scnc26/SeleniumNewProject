package techproed.Day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.xml.sax.Locator;
import org.xml.sax.ext.Locator2;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// https://www.amazon.com sayfasına gidiniz
        driver.get(" https://www.amazon.com");
// arama kutusuna "city bike"  yazıp aratın

        /*
        <input type="text" id="twotabsearchtextbox"
        value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute"
        dir="auto"
        tabindex="0" aria-label="Search Amazon" spellcheck="false">
                driver.findElement(By.id("twotabsearchtextbox"));
 WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
 //WebElement aramaKutusu = driver.findElement(By.xpath("//*[@name='field-keywords']"))
 WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"))
 /WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
         */


        WebElement aramaKutusu = driver.findElement(By.xpath("(//input[@*])[4]"));
aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

// Hybrid Bikes bölümüne tıklayın
driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();//---->//*[.='Hybrid Bikes']
// sonuc sayısını yazdırın
        WebElement hibritBikeResult = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        System.out.println("hibritBikesonuc yazisi = " + hibritBikeResult.getText());
        //hibritBikesonuc yazisi = 14 results for "city bike"
        String[] sonucYazisi = hibritBikeResult.getText().split(" ");

        System.out.println("sonucYazisi = " + sonucYazisi[0]);//sonucYazisi = 14

// ilk ürününe tıklayın
        driver.findElement(By.xpath("(//h2)[1]")).click();

// Sayfayı kapatınız
        driver.close();

    }
}
