package edu.maimonides.multimedia.shapes4learn.analisis;

public class OperacionesSemanticas {
    
    public String calculo(String operando1, String operando2, String operador) {
		if("+".equals(operador)) return String.valueOf(((Double.valueOf(operando1))+(Double.valueOf(operando2))));
        if("-".equals(operador)) return String.valueOf(((Double.valueOf(operando1))-(Double.valueOf(operando2))));
        if("*".equals(operador)) return String.valueOf(((Double.valueOf(operando1))*(Double.valueOf(operando2))));
	if("/".equals(operador)) return String.valueOf(((Double.valueOf(operando1))/(Double.valueOf(operando2))));

        return "0.0";
    }
		
	public String divide(String expresion) {
            
    int i=0;
    int n1=0;
    int n2=0;
    String sub="";
    String sub2="";
    String sub3="";
		
    if(expresion.indexOf('+') >= 0 && expresion.indexOf('(') < 0 && expresion.indexOf(')') < 0) {
    	for(i=0; i<expresion.length()&&expresion.indexOf('+', i)>=0; i++) {
            n1=expresion.indexOf('+', i);
            sub=this.divide(expresion.substring(0, n1));
            sub2 = this.divide(expresion.substring(n1+1));
	}
	expresion = this.calculo(this.divide(sub), this.divide(sub2), "+");
    }
	
    if(expresion.indexOf('*') >= 0 && expresion.indexOf('(') < 0 && expresion.indexOf(')') < 0) {
	for(i=0; i<expresion.length()&&expresion.indexOf('*', i)>=0; i++) {
            n1=expresion.indexOf('*', i);
            sub=this.divide(expresion.substring(0, n1));
            sub2 = this.divide(expresion.substring(n1+1));
	}
	expresion = this.calculo((sub), (sub2), "*");
    }
	
    if(expresion.indexOf('/') >= 0 && expresion.indexOf('(') < 0 && expresion.indexOf(')') < 0) {
        for(i=0; i<expresion.length()&&expresion.indexOf('/', i)>=0; i++) {
            n1=expresion.indexOf('/', i);
            sub=this.divide(expresion.substring(0, n1));
            sub2 = this.divide(expresion.substring(n1+1));
        }
        expresion = this.calculo((sub), (sub2), "/");
    }
	
    if(expresion.indexOf('-') >= 0 && expresion.indexOf('(') < 0 && expresion.indexOf(')') < 0) {
        for(i=0; i<expresion.length()&&expresion.indexOf('-', i)>=0; i++) {
            n1=expresion.indexOf('-', i);
            sub=this.divide(expresion.substring(0, n1));
            sub2=this.divide(expresion.substring(n1+1));
	}
        expresion=this.calculo((sub), (sub2), "-");
    }
	
    if(expresion.indexOf('(') >= 0) {
        for(i=0; i<=expresion.length()&& expresion.indexOf('(', i)>=0; i++) {
            n1=expresion.indexOf('(', i);
            n2=expresion.indexOf(')', i);
        }
    sub=expresion.substring(0,n1);
    sub2=expresion.substring(n1+1,n2);
    sub3=expresion.substring(n2+1);
    expresion=this.divide(sub+(this.divide(sub2))+sub3);
    }
    
    return expresion;
    }
    
}