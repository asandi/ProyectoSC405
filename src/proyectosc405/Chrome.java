package proyectosc405;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    
    static WebDriver driver;
    public void Chrome() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\Universidad\\Cursos\\2022\\III C 2022\\Calidad del Software\\Proyecto\\DriverChrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://play.google.com/store/games?hl=es_419&gl=US");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div/c-wiz/div/div/div/div/div[4]/a/div[2]")).click();
    }
}
