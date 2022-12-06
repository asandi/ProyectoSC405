
package proyectosc405;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MostrarMas {
    static WebDriver driver;
    
    public boolean MostrarMas() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\erick\\Desktop\\Calidad del Software\\10\\Selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",
              "E:\\Universidad\\Cursos\\2022\\III C 2022\\Calidad del Software\\Proyecto\\DriverChrome\\chromedriver.exe");
        System.out.println("Test initiated");
        driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://play.google.com/store/games?hl=es");
        System.out.println("El titulo de la pagina es " + driver.getTitle());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        long intialLength = (long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
            if (intialLength == currentLength) {
                break;
            }
            intialLength = currentLength;

        }
        WebElement elementOpen = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div/div[1]/c-wiz/div/c-wiz/div/div"));
        elementOpen.click();
        return false;

    }
}
