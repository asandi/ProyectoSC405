
package proyectosc405;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChromeTest {
    
    public ChromeTest() {
    }
   
    @Test
    public void testChrome() {
        boolean desplegado;
        Chrome f = new Chrome();
        f.Chrome();
        if(desplegado= true){
            System.out.println("Elemento encontrado");
        }else{
            fail("The test case is a prototype.");
        }
        
    }
    
}
