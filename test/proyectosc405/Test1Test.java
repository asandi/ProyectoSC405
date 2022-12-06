
package proyectosc405;

import static org.junit.Assert.fail;
import org.junit.Test;
import static proyectosc405.Test1.driver;

public class Test1Test {
    
    public Test1Test() {
    }
    
    @Test
    public void testTest1() {
        Test1 t1 = new Test1();
        t1.Test1();
        
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        
        driver.getClass().getName().length();
        
        if (driver.getClass().getName().length() == 39){
        
        boolean result= true;
        }else{
        boolean result= false;
        fail ("fallo");
        }
    }
    
}
