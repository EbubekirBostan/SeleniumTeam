package Deneme01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme_01 {
    WebDriver driver;
    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @After
    public void after(){
        driver.quit();
    }
    @Test
    public void titleTest(){
        driver.get("https://www.hepsiburada.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        Assert.assertTrue("Nau Nau",title.contains("hepsi"));
    }
    @Test
    public void urlTest(){
        driver.get("https://www.trendyol.com");
        String url=driver.getCurrentUrl();
        System.out.println("url = " + url);
        Assert.assertFalse("Nau Nau",url.isEmpty());
    }
    @Test
    public void titleContains(){
        driver.get("https://www.hepsiburada.com");
        String title1= driver.getTitle();
        System.out.println("url1 = " + title1);
        driver.get("https://www.trendyol.com");
        String title2= driver.getTitle();
        System.out.println("url2 = " + title2);
        Assert.assertTrue("hayır içermiyor..",title1.contains("Sitesi")&&title2.contains("Sitesi"));
    }



}
