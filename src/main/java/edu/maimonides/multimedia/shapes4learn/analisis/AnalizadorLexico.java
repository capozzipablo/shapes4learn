package edu.maimonides.multimedia.shapes4learn.analisis;

import edu.maimonides.multimedia.shapes4learn.interpreter.CodeException;
import edu.maimonides.multimedia.shapes4learn.interpreter.Interpreter;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class AnalizadorLexico implements Interpreter{

    //Constructor
    public AnalizadorLexico() {
    }
    
    //Métodos
    @Override
    public void interpret(String code, ShapeAmbient ambient) throws CodeException {
        //Se crea una lista para almacenar los lexemas
        ArrayList array = new ArrayList();  
                               
        // se inicializa contador de lexemas 
        int valor = 0; 
                
       //Se procesa el código fuente y se guarda en una lista los distintos lexemas
                StringTokenizer tokens = new StringTokenizer(code);
                while(tokens.hasMoreTokens()){
                        array.add(tokens.nextToken());
                        valor = valor+1;
                } 
   
        System.out.println("Cantidad de lexemas encontrados:"+ valor);
                
                //Se inicializa  el estado de los tokens
                 
                int tokencreate = 0;
                int tokensetcolor = 0;
                int tokensetbase = 0;
                int tokensetheight = 0;
                int tokensetradius = 0;
                int tokensetposition = 0;                
                int tokenforma=0;
                int tokenin=0;
                int tokenid=0;
                int tokensuma = 0;
                int tokenresta = 0;
                int tokenproducto = 0;
                int tokendivision = 0;
                int tokenparentesisapertura = 0;
                int tokenparentesiscierre = 0;
                int tokennumero = 0;
                int tokencolor = 0;
                int tokenfinsentencia = 0;
                
                //Se declara lista que se utilizará como input para el análisis Sintáctico
                 ArrayList arrayTokens = new ArrayList();
                
                try{
                            BufferedWriter out = new BufferedWriter (new FileWriter("final.txt"));
                            out.write("Cantidad de lexemas encontrados: "+ valor );
                            out.write(System.getProperty("line.separator"));
                                   
                    for(int i = 0; i < array.size();i++){
                     
                    
                    
                        try{
                        BufferedWriter out2 = new BufferedWriter (new FileWriter("intermedio.txt",true));
                                         
                                //Evalua si el lexema es un Metodo create
                               if( array.get(i).equals("create")) //|| (array.get(i).equals("setcolor")) || (array.get(i).equals("setbase")) || (array.get(i).equals("setheight")) || (array.get(i).equals("setradius")) || (array.get(i).equals("setposition")))
                               {
                                    System.out.println(array.get(i)+"(CREATE)");
                                    tokencreate=1;
                                    out2.write(array.get(i)+" (CREATE)");
                                    out2.write(System.getProperty("line.separator"));
                                    
                                     //Se guarda token en la lista
                                    arrayTokens.add("CREATE");
                                    
                               }
                               
                               //Evalua si el lexema es un Metodo setcolor
                               if(array.get(i).equals("setcolor")){
                                    System.out.println(array.get(i)+"(SETCOLOR)");
                                    tokensetcolor=1;
                                    out2.write(array.get(i)+" (SETCOLOR)");
                                     out2.write(System.getProperty("line.separator"));
                              
                                     arrayTokens.add("SETCOLOR");
                               }
                               
                               //Evalua si el lexema es un Metodo setbase
                               if(array.get(i).equals("setbase")){
                                    System.out.println(array.get(i)+"(SETBASE)");
                                    tokensetbase=1;
                                    out2.write(array.get(i)+" (SETBASE)");
                                     out2.write(System.getProperty("line.separator"));
                                     
                                     arrayTokens.add("SETBASE");
                               }
                               
                               //Evalua si el lexema es un Metodo setheight
                               if(array.get(i).equals("setheight")){
                                    System.out.println(array.get(i)+"(SETHEIGHT)");
                                    tokensetheight=1;
                                    out2.write(array.get(i)+" (SETHEIGHT)");
                                     out2.write(System.getProperty("line.separator"));
                                     
                                     arrayTokens.add("SETHEIGHT");
                              }
                               
                               //Evalua si el lexema es un Metodo setradius
                               if(array.get(i).equals("setradius")){
                                    System.out.println(array.get(i)+"(SETRADIUS)");
                                    tokensetradius=1;
                                    out2.write(array.get(i)+" (SETRADIUS)");
                                     out2.write(System.getProperty("line.separator"));
                                     
                                     arrayTokens.add("SETRADIUS");
                               
                               }
                               
                               //Evalua si el lexema es un Metodo setposition
                               if(array.get(i).equals("setposition")){
                                    System.out.println(array.get(i)+"(SETPOSITION)");
                                    tokensetposition=1;
                                    out2.write(array.get(i)+" (SETPOSITION)");
                                     out2.write(System.getProperty("line.separator"));
                                     
                                    arrayTokens.add("SETPOSITION"); 
                               
                               }
                                                         
                                //Evalua si el lexema es una Forma
                              
                                  if( (array.get(i).equals("shape")) || (array.get(i).equals("rectangle")) || (array.get(i).equals("circle"))){
                                    System.out.println(array.get(i)+"(FORMA)");
                                    tokenforma=1;
                                    out2.write(array.get(i)+" (FORMA)");
                                    out2.write(System.getProperty("line.separator"));
                               
                                    arrayTokens.add("FORMA");
                                  }
                                                       
                                //Evalua  si el lexema es un in
                                  
                                   if( array.get(i).equals("in")){
                                    System.out.println(array.get(i)+"(in)"); 
                                    tokenin=1;
                                    out2.write(array.get(i)+" (IN)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("IN");
                                   }
                    
                                
                                //Evalua  si el lexema es un +
                            {      
                                     if( array.get(i).equals("+")){
                                     System.out.println(array.get(i)+"(OPERADOR_SUMA)"); 
                                    tokensuma=1;
                                    out2.write(array.get(i)+" (OPERADOR_SUMA)");
                                    out2.write(System.getProperty("line.separator"));
                                    
                                    arrayTokens.add("OPERADOR_SUMA");
                                   
                                     }
                                
                                      
                                //Evalua  si el lexema es un -
                               if( array.get(i).equals("-")){
                                    System.out.println(array.get(i)+"(OPERADOR_RESTA)"); 
                                    tokenresta=1;
                                    out2.write(array.get(i)+" (OPERADOR_RESTA)");
                                    out2.write(System.getProperty("line.separator"));
                                    
                                    arrayTokens.add("OPERADOR_RESTA");
                               }
                                           
                                
                                //Evalua  si el lexema es un *
                               if( array.get(i).equals("*")){
                                    System.out.println(array.get(i)+"(OPERADOR_PRODUCTO)"); 
                                    tokenproducto=1;
                                    out2.write(array.get(i)+" (OPERADOR_PRODUCTO)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("OPERADOR_PRODUCTO");
                               }
                                                       
                                //Evalua  si el lexema es un /
                                if( array.get(i).equals("/")){
                                    System.out.println(array.get(i)+"(OPERADOR_DIVISION)"); 
                                    tokendivision=1;
                                    out2.write(array.get(i)+" (OPERADOR_DIVISION)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("OPERADOR_DIVISION");
                                }
                                
                                  
                                //Evalua  si el lexema es un (
                               if( array.get(i).equals("(")){
                                    System.out.println(array.get(i)+"(PARENTESIS_APERTURA)"); 
                                    tokenparentesisapertura=1;
                                    out2.write(array.get(i)+" (PARENTESIS_APERTURA)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("PARENTESIS_APERTURA");
                               }          
                                                 
                                
                                //Evalua  si el lexema es un )
                                if( array.get(i).equals(")")){
                                    System.out.println(array.get(i)+"(PARENTESIS_CIERRE)"); 
                                    tokenparentesiscierre=1;
                                    out2.write(array.get(i)+" (PARENTESIS_CIERRE)");
                                    out2.write(System.getProperty("line.separator"));
                                    
                                    arrayTokens.add("PARENTESIS_CIERRE");
                                
                                }      
                                
                                //Evalua si el lexema es un fin de sentencia
                                if( array.get(i).equals(";")){
                                    System.out.println(array.get(i)+"(FIN_SENTENCIA)"); 
                                    tokenfinsentencia=1;
                                    out2.write(array.get(i)+" (FIN_SENTENCIA)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("FIN_SENTENCIA");
                                }
                                
                                
                                /*Evalua si el lexema es un numero
                                  Se define expresión regular  
                                 */                          
                                
                                  Pattern expresionRegularNumero = Pattern.compile("[0-9]+");
                                  Matcher matchNumero = expresionRegularNumero.matcher((CharSequence) array.get(i));
                            
                                    if (matchNumero.matches()) {
                                    System.out.println(array.get(i)+"(NUMERO)"); 
                                    tokennumero=1;
                                    out2.write(array.get(i)+" (NUMERO)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("NUMERO");
                                    } 
                                
                                /*Evalua si el lexema es un color
                                  Se define expresión regular  
                                 */                          
                                
                                  Pattern expresionRegularColor = Pattern.compile("[#][0-9A-F][0-9A-F][0-9A-F][0-9A-F][0-9A-F][0-9A-F]");
                                  Matcher matchColor = expresionRegularColor.matcher((CharSequence) array.get(i));
                                    if (matchColor.matches()) {
                                    System.out.println(array.get(i)+"(COLOR)"); 
                                    tokencolor=1;
                                    out2.write(array.get(i)+" (COLOR)");
                                    out2.write(System.getProperty("line.separator"));
                                  
                                    arrayTokens.add("COLOR");    
                                    }
                                
                                /*Evalua si el lexema es un identificador
                                  Se define expresión regular  
                                 */                          
                                
                                  Pattern expresionRegularId = Pattern.compile("[a-zA-Z]+");
                                  Matcher matchId = expresionRegularId.matcher((CharSequence) array.get(i));    
                                     
                                          
                                    if ( (matchId.matches()) && !(array.get(i).equals("create")) && !(array.get(i).equals("setcolor")) && !(array.get(i).equals("setbase")) && !(array.get(i).equals("setheight")) && !(array.get(i).equals("setradius")) && !(array.get(i).equals("setposition")) && !(array.get(i).equals("shape")) && !(array.get(i).equals("circle")) && !(array.get(i).equals("rectangle")) && !(array.get(i).equals("in")) && !(array.get(i).equals("+")) && !(array.get(i).equals("-")) && !(array.get(i).equals("*")) && !(array.get(i).equals("/")) && !(array.get(i).equals("(")) && !(array.get(i).equals(")"))  && !(array.get(i).equals(";")))  { 
                                    System.out.println(array.get(i)+"(ID)"); 
                                    tokenid=1;
                                    out2.write(array.get(i)+" (ID)");
                                    out2.write(System.getProperty("line.separator"));
                                
                                    arrayTokens.add("ID");
                                    }
                                    
                                    //El lexema no es válido para el lenguaja shape4learn
                                    else if ( !(matchId.matches()) &&   !(matchColor.matches()) && !(matchNumero.matches()) && !(array.get(i).equals("create")) && !(array.get(i).equals("setcolor")) && !(array.get(i).equals("setbase")) && !(array.get(i).equals("setheight")) && !(array.get(i).equals("setradius")) && !(array.get(i).equals("setposition")) && !(array.get(i).equals("shape")) && !(array.get(i).equals("circle")) && !(array.get(i).equals("rectangle")) && !(array.get(i).equals("in")) && !(array.get(i).equals("+")) && !(array.get(i).equals("-")) && !(array.get(i).equals("*")) && !(array.get(i).equals("/")) && !(array.get(i).equals("(")) && !(array.get(i).equals(")"))  && !(array.get(i).equals(";"))){
                                    System.out.println(array.get(i)+"(TOKEN_INVALIDO)"); 
                                      
                                    
                                    }
                        }                                      
                                           
                                          
                                        
                    out2.close();
                    }
                    catch (IOException e){                    
                    }
                                        
                    }
                 
                System.out.println("Cantidad de tokens encontrados: "+(tokencreate+tokensetcolor+tokensetbase+tokensetheight+tokensetradius+tokensetposition+tokenforma+tokenin+tokenid+tokensuma+tokenresta+tokenproducto+tokendivision+tokenparentesisapertura+tokenparentesiscierre+tokennumero+tokencolor+tokenfinsentencia));  
                out.write("Cantidad de tokens encontrados: "+(tokencreate+tokensetcolor+tokensetbase+tokensetheight+tokensetradius+tokensetposition+tokenforma+tokenin+tokenid+tokensuma+tokenresta+tokenproducto+tokendivision+tokenparentesisapertura+tokenparentesiscierre+tokennumero+tokencolor+tokenfinsentencia));
                out.write(System.getProperty("line.separator"));
                out.write(System.getProperty("line.separator"));
                
                try{
                    FileInputStream fstream = new FileInputStream("intermedio.txt");
                    DataInputStream entrada = new DataInputStream(fstream);
                    BufferedReader out3 = new BufferedReader (new InputStreamReader (entrada));
                    String strLinea;
                    while ((strLinea = out3.readLine()) != null){
                        out.write (strLinea);
                        out.write(System.getProperty("line.separator"));
                    }      
                
                out3.close();
                }
                catch (IOException e){
                        
                }
                                
                out.close();
            }
                catch (IOException e){
                }
                
                File intermedio = new File ("intermedio.txt");
                intermedio.delete();
        
                
                //Preparación Tp2
                String inputtp2 = "";
                for(int i =0; i < array.size();i++){
                    if(array.get(i) != null){
                        inputtp2 = inputtp2 + array.get(i) + " ";
                    }
                }
                
                String pp = (String) array.get(0);
                String sp = (String) array.get(1);
                String cp = (String) array.get(3);
                
                //Se invoca el Parser para el Tp2
            CharStream input = new ANTLRInputStream(inputtp2);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokensTP2 = new CommonTokenStream(lexer);
            GramaticaParser parsertp2 = new GramaticaParser(tokensTP2);                
            
            
            //Se evalua cada expresión para generar el AST
            if (pp.equals("create")){
                if (sp.equals("shape")){
                    
                    parsertp2.setBuildParseTree(true);  
                    ParseTree tree = parsertp2.sentenciacreateshape();
                    
                    GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                    visitor.visitSentenciacreateshape((GramaticaParser.SentenciacreateshapeContext) tree);
                   
       
                }
                if (sp.equals("rectangle")){
                    
                    parsertp2.setBuildParseTree(true);  
                    ParseTree tree = parsertp2.sentenciacreaterectangle();
                    
                    GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                    visitor.visitSentenciacreaterectangle((GramaticaParser.SentenciacreaterectangleContext) tree);
                   
                }
                if (sp.equals("circle")){
                    parsertp2.setBuildParseTree(true); 
                    ParseTree tree = parsertp2.sentenciacreatecircle();
                    
                    GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                    visitor.visitSentenciacreatecircle((GramaticaParser.SentenciacreatecircleContext) tree);
                   
                }
            }
            
            if (pp.equals("setcolor")){
                if (cp.equals("shape")){
                    parsertp2.setBuildParseTree(true); 
                    ParseTree tree = parsertp2.sentenciasetcolorshape();
                    
                    GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                    visitor.visitSentenciasetcolorshape((GramaticaParser.SentenciasetcolorshapeContext) tree);
                   
                }
                if (cp.equals("rectangle")){
                    
                    parsertp2.setBuildParseTree(true);
                    ParseTree tree = parsertp2.sentenciasetcolorrectangle();
                    
                    GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                    visitor.visitSentenciasetcolorrectangle((GramaticaParser.SentenciasetcolorrectangleContext) tree);
          
                }
                if (cp.equals("circle")){
                    parsertp2.setBuildParseTree(true);
                    ParseTree tree = parsertp2.sentenciasetcolorcircle();
                    GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                    visitor.visitSentenciasetcolorcircle((GramaticaParser.SentenciasetcolorcircleContext) tree);
                   
                }
            }
            
            if (pp.equals("setbase")){
                parsertp2.setBuildParseTree(true);    
                ParseTree tree = parsertp2.sentenciasetbase();
                GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                visitor.visitSentenciasetbase((GramaticaParser.SentenciasetbaseContext) tree);
        
            }
            
            if (pp.equals("setheight")){
                parsertp2.setBuildParseTree(true);    
                ParseTree tree = parsertp2.sentenciasetheight();
                GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                visitor.visitSentenciasetheight((GramaticaParser.SentenciasetheightContext) tree);
            
            }
            
            if (pp.equals("setradius")){
                parsertp2.setBuildParseTree(true);       
                ParseTree tree = parsertp2.sentenciasetradius();
                GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                visitor.visitSentenciasetradius((GramaticaParser.SentenciasetradiusContext) tree);
            
            }
            
            if (pp.equals("setposition")){
                parsertp2.setBuildParseTree(true);     
                ParseTree tree = parsertp2.sentenciasetposition();
                GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
                visitor.visitSentenciasetposition((GramaticaParser.SentenciasetpositionContext) tree);
                
            }
                
                
                
               
                
    
    
    
    
        }
            
             
             
             
            
            
    
   







}
   

        
    




