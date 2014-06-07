package edu.maimonides.multimedia.shapes4learn.lexico;

import edu.maimonides.multimedia.shapes4learn.analisis.PabloInterprete;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        PabloInterprete instance1 = new PabloInterprete();
        instance1.interpret(code1, ambient1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void TestCorrecto2() throws Exception {
        System.out.println("codigo correcto test2");
        String code2 = "in #00AB34 234 +";
        ShapeAmbient ambient2 = null;
        PabloInterprete instance2 = new PabloInterprete();
        instance2.interpret(code2, ambient2);
    }
    
    @Test
    public void TestCorrecto3() throws Exception {
        System.out.println("codigo correcto test3");
        String code3 = "- * / ( )";
        ShapeAmbient ambient3 = null;
        PabloInterprete instance3 = new PabloInterprete();
        instance3.interpret(code3, ambient3);
    }
    
    @Test
    public void TestIncorrecto1() throws Exception {
        System.out.println("codigo incorrecto test1");
        String codeIncorrect1 = "aabb43 #*ef";
        ShapeAmbient ambientIncorrect1 = null;
        PabloInterprete instanceIncorrect1 = new PabloInterprete();
        instanceIncorrect1.interpret(codeIncorrect1, ambientIncorrect1);
    }

    @Test
    public void TestIncorrecto2() throws Exception {
        System.out.println("codigo incorrecto test2");
        String codeIncorrect2 = "#ed45gbt5 [sdas";
        ShapeAmbient ambientIncorrect2 = null;
        PabloInterprete instanceIncorrect2 = new PabloInterprete();
        instanceIncorrect2.interpret(codeIncorrect2, ambientIncorrect2);
    }

}
