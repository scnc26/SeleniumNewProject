package techproed.Day03_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Findelements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
//Sayfadaki linklerin sayisini ve Linklerini yazdıralım

/*
findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu kullanırız.
Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
 */
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı = "+linklerListesi.size());

        for (WebElement w:linklerListesi) {
           if(!w.getText().isEmpty()){
            System.out.println(w.getText());}

        }
////        lambda ile yazdıralim
//        linklerListesi.forEach(w->{if (!w.getText().isEmpty()){
//            System.out.println(w.getText());
//        }});
//Shop deals in Electronics elementinin yazısını yazdıralım

        // get text() elementin yazisini yazdırır yoksa hash koduna benzer bir kod veriir
        System.out.println("**********************************");
        System.out.println(driver.findElement(By.linkText("Shop deals in Electronics")).getText());
        String webYazisi=driver.findElement(By.linkText("Shop deals in Electronics")).getText();
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());
        driver.close();
        //homework
        //Amazon sayfasına gidiniz
//iphone aratınız
//çıkan sonuç yazısını konsola yazdırınız
//çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
    }

}
