package edu.maimonides.multimedia.shapes4learn;

import edu.maimonides.multimedia.shapes4learn.analisis.AnalizadorLexico;
import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;

import edu.maimonides.multimedia.shapes4learn.model.Color;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import edu.maimonides.multimedia.shapes4learn.model.exceptions.InexistentShapeException;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Circle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Rectangle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Shape;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
   
    public static void main(String[] args) throws CodeException, FileNotFoundException, IOException {
                
        ShapeAmbient ambiente = new ShapeAmbient() {

            @Override
            public void add(Shape shape) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Shape get(String id) throws InexistentShapeException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void remove(String id) throws InexistentShapeException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean contains(String id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Iterable<Shape> shapes() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        /*
         Ingrese solamente una sentencia. La misma ser� analizada por las diferentes
         etapas de un compilador
        
        */
        
        String codigo = new String("setcolor #aa33cc in shape gtgt ;");          
        

          AnalizadorLexico lexico = new AnalizadorLexico();
          lexico.interpret(codigo, ambiente);
        
    
    }
}