
package proyectosc405;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.edge.EdgeDriver;
public class Edge {
    
    static WebDriver driver;
    public void Edge(){
    System.setProperty ("webdriver.edge.driver", 
                "E:\\Universidad\\Cursos\\2022\\III C 2022\\Calidad del Software\\Proyecto\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://play.google.com/store/games?hl=es_419&gl=US");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div/c-wiz/div/div/div/div/div[4]/a/div[2]")).click();
    }
}
