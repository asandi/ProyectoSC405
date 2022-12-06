
package proyectosc405;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static proyectosc405.Chrome.driver;

/**
 *
 * @author Pc
 */
public class TestLibros {
    public boolean testLibros() {
        boolean desplegadoBiblioteca;
        boolean desplegadoListaDeseos;
        boolean desplegado;
        System.setProperty("webdriver.chrome.driver",
                "E:\\Universidad\\Cursos\\2022\\III C 2022\\Calidad del Software\\Proyecto\\DriverChrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://play.google.com/store/games?hl=es");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/c-wiz[1]/header/nav/c-wiz/div/div/div[1]/div/div/span/button[4]/span[2]")).click();
        desplegadoBiblioteca = driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div/c-wiz/div/div/div/div/div[3]")).isDisplayed();
        desplegadoListaDeseos = driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div/c-wiz/div/div/div/div/div[4]/a")).isDisplayed();
        if(desplegadoBiblioteca == true && desplegadoListaDeseos == true){
            desplegado=true;
        }
        else{
            desplegado=false;
        }
        return desplegado;
    }  
}
