
package proyectosc405;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MostrarMasTest {
    
    public MostrarMasTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void testChrome() {
        boolean desplegado;
        MostrarMas f = new MostrarMas();
        
        f.MostrarMas();
        if(desplegado = true){
            System.out.println("Elemento encontrado");
        }else{
            fail("The test case is a prototype.");
        }
    }
    
}
