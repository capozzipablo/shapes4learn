package edu.maimonides.multimedia.shapes4learn.analisis;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	
	T visitSentenciacreatecircle(@NotNull GramaticaParser.SentenciacreatecircleContext ctx);
        	
	T visitSentenciasetcolorcircle(@NotNull GramaticaParser.SentenciasetcolorcircleContext ctx);
        	
	T visitSentenciasetposition(@NotNull GramaticaParser.SentenciasetpositionContext ctx);
        	
	T visitSentenciasetbase(@NotNull GramaticaParser.SentenciasetbaseContext ctx);
        	
	T visitSentenciasetheight(@NotNull GramaticaParser.SentenciasetheightContext ctx);
        	
	T visitSentenciasetradius(@NotNull GramaticaParser.SentenciasetradiusContext ctx);
        	
	T visitStart(@NotNull GramaticaParser.StartContext ctx);
        	
	T visitSentenciacreateshape(@NotNull GramaticaParser.SentenciacreateshapeContext ctx);
        	
	T visitSentenciasetcolorshape(@NotNull GramaticaParser.SentenciasetcolorshapeContext ctx);
        	
	T visitSentenciasetcolorrectangle(@NotNull GramaticaParser.SentenciasetcolorrectangleContext ctx);
        	
	T visitSentenciacreaterectangle(@NotNull GramaticaParser.SentenciacreaterectangleContext ctx);
        	
	T visitProg(@NotNull GramaticaParser.ProgContext ctx);
}