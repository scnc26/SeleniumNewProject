package techproed.Day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMetod {
    public static void main(String[] args) throws InterruptedException {
        //Sayfanin icinde gordugumuz tum kutucuklar tum kisimlar birer
        // web elementidir.Bunlarin butunu web sayfasini olusturur.

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//yeni  chorme browser ı acar

            //Browser'ın konumunu yazdıralım
        System.out.println("sayfanın konumu Position() = " + driver.manage().window().getPosition());

            //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları:getSize() = " + driver.manage().window().getSize());


            //Browser'ı maximize yapalım *** COOK ÖNEMLİ  WEB ELEMENTLERI GÖREMEYEBİLİR
        driver.manage().window().maximize();
        Thread.sleep(3000);
        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

            //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

            //Browser'ın konumunu yazdıralım
        System.out.println("sayfanın konumu:getPosition() = " + driver.manage().window().getPosition());


        //Browser'ın boyutlarını yazdıralım
        System.out.println("sayfanın  boyutları getSize() = " + driver.manage().window().getSize());

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();

        //İstediğimiz konuma getirir
        driver.manage().window().setPosition(new Point(50,50));

        //İstediğimiz boyuta (size) getirir
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);
        driver.close();
    /* ****HOMEWORK
    1.Yeni bir Class olusturalim.C06_ManageWindow
2.Amazon soyfasina gidelim. https://www.amazon.com/
3.Sayfanin konumunu ve boyutlarini yazdirin
4.Sayfayi simge durumuna getirin
5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
7.Sayfayi fullscreen yapin
8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
9.Sayfayi kapatin
     */


    }
}
