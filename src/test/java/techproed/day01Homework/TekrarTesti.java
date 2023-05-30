package techproed.day01Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chormeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        /* HOMEWORK
//        Yeni bir class olusturun (TekrarTesti)

//        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("http://youtube.com");
        Thread.sleep(3000);
        String actualTitle1 = driver.getTitle();
        String sorcedWord1 = "youtube";
        if (actualTitle1.contains(sorcedWord1)) {
            System.out.println("test1 PASSED");

        } else System.out.println("test1 FAİL " + actualTitle1);

//        Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actuaUrl2 = driver.getCurrentUrl();
        String sourcedWord2 = "youtube";
        if (actuaUrl2.contains(sourcedWord2)) {
            System.out.println("test2 PASSED");
        } else System.out.println("test2 FAİL " + actuaUrl2);


        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com/");
        Thread.sleep(3000);

//        Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

//        Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

//        Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);

//        Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

//      Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle3 = driver.getTitle();
        String sourcedWord3 = "Amazon";
        if (actualTitle3.contains(sourcedWord3)) {
            System.out.println("test3 PASSED");

        } else System.out.println("test3 FAİLED " + actualTitle3);

//        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        String actualUrl4 = driver.getCurrentUrl();
        String expectedUrl4 = "https://www.amazon.com/";
        if (actualUrl4.equals(expectedUrl4)){
            System.out.println("testUrl4 PASSED");

        }else System.out.println("testUrl4 Failed "+actualUrl4);
//        URL'yi yazdırın
        System.out.println("amazon url = " + driver.getCurrentUrl());
//        Sayfayi kapatin
        driver.close();
//


    }
}
