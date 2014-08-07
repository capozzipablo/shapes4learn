package edu.maimonides.multimedia.shapes4learn.analisis;

import edu.maimonides.multimedia.shapes4learn.model.Color;
import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Circle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Rectangle;
import edu.maimonides.multimedia.shapes4learn.model.shapes.Shape;

import java.util.Iterator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class provides an empty implementation of {@link antlrVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */

public class GramaticaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements GramaticaVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    int i=0;
    int conthijos=0;
    int index=0;

    ShapeAmbient Ambiente;
    static ArrayList<Circle>   ListaCirc = new ArrayList();
    static ArrayList<Shape> Lista = new ArrayList();
    static ArrayList<Rectangle> ListaRect =  new ArrayList();

    public T visitSentenciacreaterectangle(@NotNull GramaticaParser.SentenciacreaterectangleContext ctx) {
            
        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");
        String Forma = ctx.getChild(1).toString();
        String Id = ctx.getChild(2).toString();
        crearforma(Forma,Id);
        getall(Forma);

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetbase(@NotNull GramaticaParser.SentenciasetbaseContext ctx) {

        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        String Array = "";
        String ID = "^[a-zA-Z]+$";
        Pattern PatronId = Pattern.compile(ID);
        for (i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
            Matcher matcheadorID = PatronId.matcher(ctx.getChild(i).toString());
            if (matcheadorID.find()) continue;
            Array = Array + ctx.getChild(i).toString() ;
        }
        System.out.println("========================================================");
        System.out.println("\n");
        System.out.println("La operacion es = " + Array);
        OperacionesSemanticas opc = new OperacionesSemanticas();
        String Resultado = opc.divide(Array);
        int resultadoenint= Integer.parseInt(Resultado);
        System.out.println("El resultado de la operación es = " + resultadoenint);
        if(resultadoenint<0 ) {
            System.out.println("El resultado de la operación es menor a 0, no se puede establecer valores negativos.");
            System.exit(0);        
        }
        Setrectangulobase(ctx.getChild(4).toString(),resultadoenint );
        getall(ctx.getChild(4).toString());

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetposition(@NotNull GramaticaParser.SentenciasetpositionContext ctx) {

        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        String Array1="";
        String Array2="";
        String ID="^[a-zA-Z]+$";
        Pattern PatronId=Pattern.compile(ID);
        int PositionArray1=0;
        for (i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
            Matcher matcheadorID = PatronId.matcher(ctx.getChild(i).toString());
            if (matcheadorID.find()) continue;
            if ((ctx.getChild(i).toString().charAt(0) == ',')) {
                PositionArray1=i;
                System.out.println("Position Array1 = " + PositionArray1);
                break;
            }
            Array1=Array1 + ctx.getChild(i).toString() ;
        }

        for (int i=PositionArray1; i<conthijos; i++) {
            System.out.println("child " + i +" = " + ctx.getChild(i));
            if ((ctx.getChild(i).toString().charAt(0) == ',')) continue;
            Matcher matcheadorID = PatronId.matcher(ctx.getChild(i).toString());
            if (matcheadorID.find()) continue;
            Array2=Array2+ctx.getChild(i).toString() ;
        }
        System.out.println("========================================================");
        System.out.println("\n");
        System.out.println("La operacion 1 es = " + Array1);
        System.out.println("La operacion 2 es = " + Array2);
        OperacionesSemanticas opc = new OperacionesSemanticas();
        String Resultado=opc.divide(Array1);
        String Resultado2=opc.divide(Array2);
        int Resultadoenint=(int) Double.parseDouble(Resultado);
        int Resultado2enint=(int) Double.parseDouble(Resultado2);
        System.out.println("Resultado de la operacion en entero = " + Resultadoenint);
        System.out.println("Resultado de la operacion en entero = " + Resultado2enint);
        if(Resultadoenint<0) {
            System.out.println("El resultado de la operación es menor a 0, no se puede establecer valores negativos.");
            System.exit(0);        
        }
        if(Resultado2enint<0) {
            System.out.println("El resultado de la operación es menor a 0, no se puede establecer valores negativos.");
            System.exit(0);        
        }

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciacreateshape(@NotNull GramaticaParser.SentenciacreateshapeContext ctx) {

        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");
        String Forma=ctx.getChild(1).toString();
        String Id=ctx.getChild(2).toString();
        crearforma(Forma,Id);
        getall(Forma);

        return visitChildren(ctx); 
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetcolorcircle(@NotNull GramaticaParser.SentenciasetcolorcircleContext ctx) {

        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");

        return visitChildren(ctx); 
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciacreatecircle(@NotNull GramaticaParser.SentenciacreatecircleContext ctx) {

        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (i=0; i<conthijos ; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");
        String Forma = ctx.getChild(1).toString();
        String Id = ctx.getChild(2).toString();
        crearforma(Forma,Id);
        getall(Forma);

        return visitChildren(ctx); 
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetheight(@NotNull GramaticaParser.SentenciasetheightContext ctx) {

        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        String Array="";
        String ID="^[a-zA-Z]+$";
        Pattern PatronId = Pattern.compile(ID);
        for (int i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
            Matcher matcheadorID = PatronId.matcher(ctx.getChild(i).toString());
            if (matcheadorID.find()) continue;
            Array = Array + ctx.getChild(i).toString() ;
        }
        System.out.println("========================================================");
        System.out.println("\n");
        System.out.println("La operacion es = " + Array);
        OperacionesSemanticas opc = new OperacionesSemanticas();
        String Resultado=opc.divide(Array);
        int Resultadoenint=(int) Double.parseDouble(Resultado);
        System.out.println("El resultado de la operación es = " + Resultadoenint);
        if(Resultadoenint<0) {
            System.out.println("El resultado de la operación es menor a 0, no se puede establecer valores negativos.");
            System.exit(0);        
        };
        Setrectanguloaltura(ctx.getChild(4).toString(), Resultadoenint);
        getall(ctx.getChild(4).toString());

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetradius(@NotNull GramaticaParser.SentenciasetradiusContext ctx) {
        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        String Array = "";
        String ID = "^[a-zA-Z]+$";
        Pattern PatronId = Pattern.compile(ID);
        for (int i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
            Matcher matcheadorID = PatronId.matcher(ctx.getChild(i).toString());
            if (matcheadorID.find()) continue;
            Array = Array + ctx.getChild(i).toString() ;
        }
        System.out.println("========================================================");
        System.out.println("\n");
        System.out.println("La operacion es = " + Array);
        OperacionesSemanticas opc = new OperacionesSemanticas();
        String Resultado=opc.divide(Array);
        int Resultadoenint=(int) Double.parseDouble(Resultado);
        System.out.println("El resultado de la operación es = " + Resultadoenint);
        if(Resultadoenint<0) {
            System.out.println("El resultado de la operación es menor a 0, no se puede establecer valores negativos.");
            System.exit(0);        
        }
        setearrcirculo(ctx.getChild(4).toString(),Resultadoenint);
        getall(ctx.getChild(4).toString());

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitStart(@NotNull GramaticaParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetcolorrectangle(@NotNull GramaticaParser.SentenciasetcolorrectangleContext ctx) {
        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (int i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");
        
        return visitChildren(ctx); 
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitSentenciasetcolorshape(@NotNull GramaticaParser.SentenciasetcolorshapeContext ctx) {
        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos=ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (int i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");
        SetearColor(ctx.getChild(1).toString(), ctx.getChild(4).toString());
        getall(ctx.getChild(4).toString());

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public T visitProg(@NotNull GramaticaParser.ProgContext ctx) {
        System.out.println("===============================");
        System.out.println("Generando el AST");
        System.out.println("===============================");
        conthijos = ctx.getChildCount();
        System.out.println("Cantidad de nodos hijos:  " +(conthijos-1));
        for (int i=0; i<conthijos; i++) {
            System.out.println("Hijo " + i +" = " + ctx.getChild(i));
        }
        System.out.println("========================================================");
        System.out.println("\n");
        return visitChildren(ctx);
    }

    public void add(Shape Forma) {
       Lista.add(Forma);   
    }

    public Shape get(String id) {
        Shape Forma=null;
        Iterator iter = Lista.iterator();
        while(iter.hasNext()) {
             Forma = (Shape) iter.next(); 
             if (Forma.getId().equals(id)){
                 return Forma;       
             } 
        }
       return Forma;
    }
    
    public void getall(String id) {
        Shape Forma = null;
        Iterator iter = Lista.iterator();
        index=1;
        String Tiposhape = null;
        System.out.println("Cantidad de elementos que tiene la lista de shapes = " + Lista.size());
        while(iter.hasNext()) {
            Forma=(Shape) iter.next(); 
            Tiposhape = "shape";
            System.out.println("La posición "+ index + " del contenedor de formas tiene la forma: "+ Forma.getId() + " y la misma se trata de: " + Tiposhape + " y su color es: rojo= " + Forma.getColor().getRed() + " verde= " + Forma.getColor().getGreen() + " y azul = " + Forma.getColor().getBlue());
            index++;
        } 
    }

    public void remove(String id){
        Shape Forma=null;
        Iterator iter = Lista.iterator();
        while(iter.hasNext()) {
            Forma=(Shape) iter.next();
            if (Forma.getId().equals(id)){
                Lista.remove(Forma);
                System.out.println("El "+ Forma.getId() + " se eliminó de la lista");
            }                      
        }
    }

    public boolean contains(String id) {
        if(Lista.contains(id)) {
            System.out.println("El " + id + "existe en el ambiente ShapeAmbient" );
            return true;
        }
        return false;
    }

    public Iterable<Shape> shapes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setearrcirculo(String ID, double Expresion) {
        Circle Circulo=new Circle();
        Circulo.setRadius((int) Expresion);
        index=0;
        Iterator itercirc = ListaCirc.iterator();
        while(itercirc.hasNext()) {
            Circulo = (Circle) itercirc.next();
            String IdCirculo = Circulo.getId();
            if (IdCirculo.equals(ID)){
                System.out.println("El "+ IdCirculo + " está en la lista");
                Circulo.setRadius((int) Expresion);
                ListaCirc.set(index, Circulo);
            } else {
                Circulo.setId(ID);
                Circulo.setRadius((int) Expresion);
                Lista.add(Circulo);
            }
            index++;
        }
    }   
    
    public void crearforma(String Forma, String ID) {
        if ("circle".equals(Forma)) {
            Circle Circulo=new Circle();
            Circulo.setId(ID);
            ListaCirc.add(Circulo);
        }
        if ("shape".equals(Forma)) {
            Shape Figura=new Shape();
            Figura.setId(ID);
            Lista.add(Figura);
        }
        if ("rectangle".equals(Forma)) {
            Rectangle Rectangulo=new Rectangle();
            Rectangulo.setId(ID);
            ListaRect.add(Rectangulo);
        }
        System.out.println("El "+Forma+" se generó correctamente");
    }
        
    public void Setrectangulobase(String Forma, double Expresion) { 
        Rectangle Rectangulo=new Rectangle();
        Rectangulo.setId(Forma);
        if(Lista.contains(Forma)) {
            index=Lista.indexOf(Forma);
            Rectangulo.setBase((int) Expresion);
            Lista.set(index, Rectangulo);
        } else {
            Rectangulo.setBase((int) Expresion);
            Lista.add(Rectangulo);
        }
    }
         
    public void Setrectanguloaltura(String Forma, double Expresion) {
        Rectangle Rectangulo=new Rectangle();
        Rectangulo.setId(Forma);
        if(Lista.contains(Forma)) {
            index=Lista.indexOf(Forma);
            Rectangulo.setHeight((int) Expresion);
            Lista.set(index, Rectangulo);
        } else {
            Rectangulo.setHeight((int) Expresion);
            Lista.add(Rectangulo);              
        }   
    }
    
    public void SetearColor (String colorStr, String ID) {
        Color color=new Color();
        String hex=colorStr.replace("#", "");
        System.out.println("Color String = " + hex);
        hex=hex.toUpperCase();
	String hex_alphabets = "0123456789ABCDEF";
	int[] value=new int[3];
	int k=0;
	int int1,int2;
	for(i=0;i<6;i+=2) {
            int1 = hex_alphabets.indexOf(hex.charAt(i));
            int2 = hex_alphabets.indexOf(hex.charAt(i+1)); 
            value[k]=(int1 * 16) + int2;
            k++;
	}     
        System.out.println("   Rojo  : " + value[0] );
        System.out.println("   Verde : " + value[1] );
        System.out.println("   Azul  : " + value[2] );
        color.setRed(value[0]);   
        color.setGreen(value[1]); 
        color.setBlue(value[2]);
        Shape Forma = new Shape();
        Forma.setColor(color);
        index=0;
        Iterator itershape = Lista.iterator();
        while(itershape.hasNext()) {
            Forma = (Shape) itershape;
            String IdForma = Forma.getId();
            if (IdForma.equals(ID)){
                System.out.println("La forma "+ IdForma + " está en la lista");
                Forma.setColor(color);
                Lista.set(index, Forma);
            } else {
                Forma.setId(ID);
                Forma.setColor(color);
                Lista.add(Forma);
            }
            index++;
        }
    }

}