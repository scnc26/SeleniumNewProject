package techproed.Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//yeni  chorme browser ı acar

        driver.manage().window().maximize();

        //** ONEMLİ SAYFANIN ACILMA SÜRESİNE GÖRE ENFAZLA BELİRTTİĞİMİZ SÜRE BEKLER ELEMENTLER OLUSMAYABİLİR
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
            implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
            Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler.30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */
        //techproed sayfasina gidelim
        String techproEdUrl="https://techproeducation.com";
        String amazonUrl="https://amazon.com";
        driver.get(techproEdUrl);

        //amazona gidelim
        driver.get(amazonUrl);


        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini techpro icerdigini test edelim
        String actrualtitle=driver.getTitle();
        String arananKelime="Techpro";
        if (actrualtitle.contains(arananKelime)){
            System.out.println("test PASSED");
        }else System.out.println("test failed " +actrualtitle);

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basligini Amazon icerdigini test edelim;
        if (driver.getTitle().contains("Amazon")){
            System.out.println("test PASSED");
        }else System.out.println("test FAİLED-->"+driver.getTitle());

        //sayfayı kapatınız
        driver.close();
        /* HOMEWORK
        Yeni bir Class olusturalim.C06_ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin

         */
        /* HOMEWORK
        Yeni bir class olusturun (TekrarTesti)
        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Youtube sayfasina geri donun
        Sayfayi yenileyin
        Amazon sayfasina donun
        Sayfayi tamsayfa yapin
        Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        Sayfayi kapatin
         */



    }
}
