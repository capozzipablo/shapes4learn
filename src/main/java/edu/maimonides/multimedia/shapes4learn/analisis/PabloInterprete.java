package edu.maimonides.multimedia.shapes4learn.analisis;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.interpreter.Interpreter;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import java.io.*;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public  class PabloInterprete implements Interpreter {
    //Constructores
    public PabloInterprete() {
    }
      
    //Atributos
    private  AnalizadorLexico analizadorLexico;
    private  AnalizadorSintactico analizadorSintactico;
    private  AnalizadorSemantico analizadorSemantico;
    
       
    //Método de la interfaz Interpreter
    
    @Override
    public void interpret(String code, ShapeAmbient ambient) throws CodeException{
            List tokens = this.analizadorLexico.realizaAnalisisLexico(code);
            
    }   
}