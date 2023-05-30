package techproed.day01Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ManageWindow {  public static void main(String[] args) throws InterruptedException {
    System.setProperty("ChromeDriver","src/resources/drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//* ****HOMEWORK
//    1.Yeni bir Class olusturalim.C06_ManageWindow
//2.Amazon soyfasina gidelim. https://www.amazon.com/
    driver.navigate().to("https://www.amazon.com/");
//3.Sayfanin konumunu ve boyutlarini yazdirin
    System.out.println("position of amazon = " + driver.manage().window().getPosition());
    System.out.println("size of amazon  = " + driver.manage().window().getSize());
    Thread.sleep(3000);
//4.Sayfayi simge durumuna getirin
    driver.manage().window().minimize();



//5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
    Thread.sleep(3000);
    driver.manage().window().maximize();
//6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
    System.out.println("maximize durumda sayfa pozisyonu = " + driver.manage().window().getPosition());
    System.out.println("maximize durumda sayfa boyutu = " + driver.manage().window().getSize());

//7.Sayfayi fullscreen yapin
    driver.manage().window().fullscreen();
    Thread.sleep(3000);

//8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
    System.out.println("fullscreen durumda sayfa pozisyonu = " + driver.manage().window().getPosition());
    System.out.println("fulscreen durumda sayfa boyutu = " + driver.manage().window().getSize());
    Thread.sleep(3000);

//9.Sayfayi kapatin
    driver.close();







}
}
