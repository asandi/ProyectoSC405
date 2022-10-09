
package proyectosc405;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty ("webdriver.edge.driver", 
                "E:\\Universidad\\Cursos\\2022\\III C 2022\\Calidad del Software\\Proyecto\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://play.google.com/store/games?hl=es_419&gl=US");
        System.out.println("El titulo de la pagina es: "+ driver.getTitle());
    }
    
}
