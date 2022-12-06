
package proyectosc405;


import org.junit.Test;
import static org.junit.Assert.*;


public class TestLibrosTest {
    
    public TestLibrosTest() {
    }
       
    @Test
    public void testLibros() {
        boolean desplegado;
        TestLibros t = new TestLibros();
        t.testLibros();
        if(desplegado= true){
            System.out.println("Elemento encontrado");
        }else{
            fail("The test case is a prototype.");
        }
    }
    
}
