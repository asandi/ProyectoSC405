package proyectosc405;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    static WebDriver driver;

    public void Test1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\barranz\\Downloads\\clases de la universidad\\calidad de software\\Selenium\\chromedriver.exe");
        System.out.println("Test initiated");
        driver = new ChromeDriver();
        driver.get("https://play.google.com/store/games?hl=en&code&pli=1");
        System.out.println("El titulo de la pagina es" + driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[4]/div/div[2]/div[3]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"kO001e\"]/header/nav/div/c-wiz/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"kO001e\"]/header/nav/div/c-wiz/div/div/div[2]/div/ul/li[1]")).click();
        driver.findElement(By.id("identifierId")).sendKeys("zujeilyandrea@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

    }

}
