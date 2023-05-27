package techproed.Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//yeni  chorme browser ı acar

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı mantıkta çalışır
        Thread.sleep(3000);// 3 saniye bekletti; Tread.sleep()--<java kodlarını bekletir

        //Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa başlığı : " + driver.getTitle());
        //Amazon.com. Spend less. Smile more.
        Thread.sleep(3000);

        //Techproeducation sayfasına geri dönelim
        driver.navigate().back(); //önceki sayfaya döner
        Thread.sleep(3000);

        //Sayfa başlığını yazdıralım
        System.out.println("Techproeducation Sayfa Başlığı : " + driver.getTitle());
        //Techpro Education | Online It Courses & Bootcamps
        Thread.sleep(3000);


        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward(); //ileri sayfasına gider
        System.out.println("Amazon Sayfası Url'i : " + driver.getCurrentUrl());
        //https://www.amazon.com/
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();
        /* ***homework
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
          */


    }
}
