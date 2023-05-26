package techproed.Day01_ilkTest_DriverMetod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        //Chorme u drive ettigimiz icin ChromeDriver() adında  WebDriver da obje olusturduk

        driver.get("https://amazon.com");
        //get() metodu ile url gittik

        System.out.println("amazon Actural title = " + driver.getTitle());
                //Amazon.com. Spend less. Smile more.
        //getTitle() metodu enson gittiğ sayfa basligini verir

        System.out.println("Amazon Actural url= " + driver.getCurrentUrl());
        //https://www.amazon.com/

        System.out.println("Amazon window Handle degeri = " + driver.getWindowHandle());
        String amazonHandleDegeri=driver.getWindowHandle();
        //7921D2DD92EDE80317B892C0E463D55

        driver.get("https://techproeducation.com");
        // get() url ye git

        System.out.println("son gittigi Actural title = " + driver.getTitle());
        // Techpro Education | Online It Courses & Bootcamps
        //getTitle() metodu enson gittiğ sayfa basligini verir

        System.out.println(" son gittigi tecproed Actural url = " + driver.getCurrentUrl());
        //getCurrentUrl() metodu enson gittigi sayfanın url string olarak verir
        //https://techproeducation.com/

       // System.out.println("en son sayfaının kaynak kodları = " + driver.getPageSource());
        //getPageSource() en son sayfaının kaynak kodlarını string olarak verir
        //cok yer kaplaıgı icin kapatıldı

        System.out.println("techpro window Handle degeri = " + driver.getWindowHandle());
        //93714F3677420A3CAEC499F60E4972DE
        //getWindowHandle():gidilen  sayfa ve tabların handle degerini verir
        // /handle degeri windows arası gecisi icin kullanılır hashcode benzetilebilir
    }






}
