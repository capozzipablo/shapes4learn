
package edu.maimonides.multimedia.shapes4learn.lexico;

import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan
 */
public class LexicoTest {
    
    public LexicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of interpret method, of class Lexico.
     */
    @Test
    public void TestCorrecto1() throws Exception {
        System.out.println("codigo correcto test1");
        String code1 = "create shape saraza";
        ShapeAmbient ambient1 = null;
        Lexico instance1 = new Lexico();
        instance1.interpret(code1, ambient1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void TestCorrecto2() throws Exception {
        System.out.println("codigo correcto test2");
        String code2 = "in #00AB34 234 +";
        ShapeAmbient ambient2 = null;
        Lexico instance2 = new Lexico();
        instance2.interpret(code2, ambient2);
    }
    
    public void TestCorrecto3() throws Exception {
        System.out.println("codigo correcto test3");
        String code3 = "- * / ( )";
        ShapeAmbient ambient3 = null;
        Lexico instance3 = new Lexico();
        instance3.interpret(code3, ambient3);
    }
    
    public void TestIncorrecto1() throws Exception {
        System.out.println("aabb43 #*ef");
        String codeIncorrect1 = "";
        ShapeAmbient ambientIncorrect1 = null;
        Lexico instanceIncorrect1 = new Lexico();
        instanceIncorrect1.interpret(codeIncorrect1, ambientIncorrect1);
    }

    public void TestIncorrecto2() throws Exception {
        System.out.println("#ed45gbt5 [sdas");
        String codeIncorrect2 = "";
        ShapeAmbient ambientIncorrect2 = null;
        Lexico instanceIncorrect2 = new Lexico();
        instanceIncorrect2.interpret(codeIncorrect2, ambientIncorrect2);
    }

}
