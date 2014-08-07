package edu.maimonides.multimedia.shapes4learn.analisis;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface GramaticaListener extends ParseTreeListener {
	
	void enterSentenciacreatecircle(@NotNull GramaticaParser.SentenciacreatecircleContext ctx);
	
	void exitSentenciacreatecircle(@NotNull GramaticaParser.SentenciacreatecircleContext ctx);
        	
	void enterSentenciasetcolorcircle(@NotNull GramaticaParser.SentenciasetcolorcircleContext ctx);
	
	void exitSentenciasetcolorcircle(@NotNull GramaticaParser.SentenciasetcolorcircleContext ctx);
	
	void enterSentenciasetposition(@NotNull GramaticaParser.SentenciasetpositionContext ctx);
	
	void exitSentenciasetposition(@NotNull GramaticaParser.SentenciasetpositionContext ctx);
        	
	void enterSentenciasetbase(@NotNull GramaticaParser.SentenciasetbaseContext ctx);
	
	void exitSentenciasetbase(@NotNull GramaticaParser.SentenciasetbaseContext ctx);
	
	void enterSentenciasetheight(@NotNull GramaticaParser.SentenciasetheightContext ctx);
	
	void exitSentenciasetheight(@NotNull GramaticaParser.SentenciasetheightContext ctx);
	
	void enterSentenciasetradius(@NotNull GramaticaParser.SentenciasetradiusContext ctx);
	
	void exitSentenciasetradius(@NotNull GramaticaParser.SentenciasetradiusContext ctx);
	
	void enterStart(@NotNull GramaticaParser.StartContext ctx);
	
	void exitStart(@NotNull GramaticaParser.StartContext ctx);
	
	void enterSentenciacreateshape(@NotNull GramaticaParser.SentenciacreateshapeContext ctx);
	
	void exitSentenciacreateshape(@NotNull GramaticaParser.SentenciacreateshapeContext ctx);
	
	void enterSentenciasetcolorshape(@NotNull GramaticaParser.SentenciasetcolorshapeContext ctx);
	
	void exitSentenciasetcolorshape(@NotNull GramaticaParser.SentenciasetcolorshapeContext ctx);
        	
	void enterSentenciasetcolorrectangle(@NotNull GramaticaParser.SentenciasetcolorrectangleContext ctx);
	
	void exitSentenciasetcolorrectangle(@NotNull GramaticaParser.SentenciasetcolorrectangleContext ctx);
        	
	void enterSentenciacreaterectangle(@NotNull GramaticaParser.SentenciacreaterectangleContext ctx);
	
	void exitSentenciacreaterectangle(@NotNull GramaticaParser.SentenciacreaterectangleContext ctx);
        	
	void enterProg(@NotNull GramaticaParser.ProgContext ctx);
	
	void exitProg(@NotNull GramaticaParser.ProgContext ctx);
}