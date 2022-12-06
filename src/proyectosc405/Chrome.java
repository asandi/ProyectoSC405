package proyectosc405;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    
    static WebDriver driver;
    public boolean Chrome() {
        boolean desplegado;
        System.setProperty("webdriver.chrome.driver",
              "E:\\Universidad\\Cursos\\2022\\III C 2022\\Calidad del Software\\Proyecto\\DriverChrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://play.google.com/store/games?hl=es");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div/div[1]/c-wiz/div/c-wiz/c-wiz[1]/c-wiz/section/div/div[1]/div/div/div[3]/div[2]")).click();
        desplegado = driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div/div[1]/c-wiz/div/c-wiz/c-wiz[1]/c-wiz/section/div/div[3]/div/div/div/div[1]/div[1]/div[1]/div/a/div[2]/div/div[3]/span")).isDisplayed();
        return desplegado;
    }    
}
