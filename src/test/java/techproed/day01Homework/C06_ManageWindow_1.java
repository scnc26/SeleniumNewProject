package techproed.day01Homework;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ManageWindow_1 {
    public static void main(String[] args) {
        System.setProperty("chormaDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//         HOMEWORK
//        Yeni bir Class olusturalim.C06_ManageWindow

//        Amazon soyfasina gidelim. https://www.amazon.com/
       driver.get("http://amazon.com");

//        Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("amazon sayfa boyutları"+driver.manage().window().getSize());
//        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
     driver.manage().window().setSize(new Dimension(600,600));
     driver.manage().window().setPosition(new Point(40,0));

//        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("amazon sayfa konumu"+driver.manage().window().getPosition());
        System.out.println("amazon sayfa büyüklügü = " + driver.manage().window().getSize());
//        8. Sayfayi kapatin
        driver.close();

    }}
