package techproed.Day03_dt_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {

    public static void main(String[] args) throws InterruptedException {
        /*
        Webelemetler: Button, Search, Text box, Headers, Tables

Webelement taglari: <html>, <body>, <label>,<input>, <a> vb.

Biz webelementlere ulasmak icin HTML kodlarini kullanacagiz.

Web sayfasinda istedigimiz bir webelement uzerine gidip sag click yapip (incele)inspect'i tiklayinca HTML
kodlarini goruruz.

Biz arama kutusu uzerine gelip sag click yaptik ve incele'yi tikladik. Arama kutusunun HTML
kodlarini asagida gorebildik. Dilersek bu kodlari yukari, saga veya sola alabiliriz.

Amazon sayfasinda EN baslikli kisimda saga click yaptik ve inspect yaptik. Yine HTML kodlarini
gorduk. Bu kodlar EN'e ait.

Biz webelementlere erisebilmek icin bu HTML kodlarindan faydalanacagiz.

Bir webelement'in HTML kodlarini inceledik. <tbody> tagi ile baslamiz ve </tbody> tagi ile
sona ermis. Icerisnde <input>, <label> gibi taglari gorduk.

Locators(Yer Bulucu-Konum Belirleyici)
Biz bir webelement'in lokate'ini yani konumunu, yerini kodlarla alabilecegiz. Locate almak demek
o webelementin yerini, konumunu belirleyecegiz.

Biz Selenium'da Locators ile web sayfasindaki web ogelerini tanimlayacagiz. Aksi halde otomasyon
yapamayiz. Biz web ogeleri uzerinde eylemeler gerceklestirmek, otomasyon islemi yapmak istiyorsak
mutlaka locators'lari kullaniriz.
         Bir web elemetini tanimlamak icin 8 tane selenium locator vardir.

1.id  ornek: id="twotabsearchtextbox" id bir attribute, " " icindeki value'dir
2.name  ornek: name="field-keywords"   name bir attribute, " " icindeki value'dir
3.class name  ornek: class="nav-input nav-progressive-attribute"
4.tagName    ornek: input type="text" tagName en basta yazilir.Bu HTML kodun tagName'i input
5.linkText
6.partialLinkText
7.xpath  //en cok kullanilan yontem
8.cssSelector  */
        /*
        Locators bulmak icin kullanilan methodlar var.

1) findElement() ornek: driver.findElement(Locator), webelement'in yerini driver'in bulabilmesi
icin bu yontem kullanilir.
2)findElement() methodunun  icine parameter olarak yazacagimiz Locator'in 8 locator'dan hangisi oldugunu
belirtmek icin By.LocatorTuru("LocatorBilgisi"); kullanilabilir.
 ornek: driver.findElement(By.id("twotabsearchtextbox"));
 Biz 8 yontemden name yontemi ile bulmak istersek By.name("field-keywords") deriz. Yani hangi yontemi sectiysek,
 parantez icinde By. yaninda o yontemin adini yazacagiz ve ona gore parantez icine ona ait
 value'yu yerlestiririz.
 3)Locate ettigimiz Web Elementini kullanabilmek icin bir variable'a atama yapariz.
 ornek:  WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox));
 WebElement passwordTextBox =driver.findElement(By.className("form-control"));
         */
// https://www.amazon.com sayfasına gidiniz
// aramakutusunu locate ediniz ve Nutella aratınız
// sayfayı kapatınız
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
// aramakutusunu locate ediniz ve Nutella aratınız
WebElement aramKutusu=driver.findElement(By.id("twotabsearchtextbox"));//arama kutusu locte aldık
aramKutusu.sendKeys("Nutella"+ Keys.ENTER);//arama kutusuna nutella yazıp enter a bastık
// ikinci yol:
/* Eger bir wbElementi locate birdaha kullanılmayacaksa asseyt etmeye bilirsin
        */
 //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+Keys.ENTER);

        //farklı yol 3 :
WebElement aramaTiklama = driver.findElement(By.id("nav-search-submit-button"));
aramaTiklama.click();

        Thread.sleep(3000);
 // sayfayı kapatınız
        driver.close();

    }
}
