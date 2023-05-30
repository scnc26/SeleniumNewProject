package techproed.day01Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_GetMethods {
    public static void main(String[] args) {
        System.setProperty("chormeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Yeni bir package olusturalim : day01
        //  Yeni bir class olusturalim : C03_GetMethods

        //  Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // Sayfa basligini(title) yazdirin
        System.out.println("amazon title "+driver.getTitle());

        // Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        String containTitle="Amazon";
        if (actualTitle.contains(containTitle)) {
            System.out.println("test Passed");
        }else System.out.println("test Failed "+actualTitle);

        // Sayfa adresini(url) yazdirin
        System.out.println("amazon url "+driver.getCurrentUrl());

        // Sayfa url’inin “amazon” icerdigini test edin.
        if (actualTitle.contains("amazon")){
            System.out.println("Test2 PASSED");
        }else System.out.println("Test2 FAİL " + actualTitle);
        // Sayfa handle degerini yazdirin
        System.out.println(" amazon handle degeri= " + driver.getWindowHandle());

        // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualAmazonHtmlKod=driver.getPageSource();
        String arananKelime="Gateway";
        if (actualAmazonHtmlKod.contains(arananKelime)){
            System.out.println("Test3 PASSED");

        }else System.out.println("Test3 FAİLED");
        // Sayfayi kapatin.*/
        driver.close();
}}
