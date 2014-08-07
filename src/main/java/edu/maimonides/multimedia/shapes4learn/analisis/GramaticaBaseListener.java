package edu.maimonides.multimedia.shapes4learn.analisis;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GramaticaBaseListener implements GramaticaListener {
	
	@Override public void enterSentenciacreatecircle(@NotNull GramaticaParser.SentenciacreatecircleContext ctx) { }
	
	@Override public void exitSentenciacreatecircle(@NotNull GramaticaParser.SentenciacreatecircleContext ctx) { }

	@Override public void enterSentenciasetcolorcircle(@NotNull GramaticaParser.SentenciasetcolorcircleContext ctx) { }
	
	@Override public void exitSentenciasetcolorcircle(@NotNull GramaticaParser.SentenciasetcolorcircleContext ctx) { }
	
	@Override public void enterSentenciasetposition(@NotNull GramaticaParser.SentenciasetpositionContext ctx) { }
	
	@Override public void exitSentenciasetposition(@NotNull GramaticaParser.SentenciasetpositionContext ctx) { }
	
	@Override public void enterSentenciasetbase(@NotNull GramaticaParser.SentenciasetbaseContext ctx) { }
	
	@Override public void exitSentenciasetbase(@NotNull GramaticaParser.SentenciasetbaseContext ctx) { }
	
	@Override public void enterSentenciasetheight(@NotNull GramaticaParser.SentenciasetheightContext ctx) { }
	
	@Override public void exitSentenciasetheight(@NotNull GramaticaParser.SentenciasetheightContext ctx) { }
	
	@Override public void enterSentenciasetradius(@NotNull GramaticaParser.SentenciasetradiusContext ctx) { }
	
	@Override public void exitSentenciasetradius(@NotNull GramaticaParser.SentenciasetradiusContext ctx) { }
	
	@Override public void enterStart(@NotNull GramaticaParser.StartContext ctx) { }
	
	@Override public void exitStart(@NotNull GramaticaParser.StartContext ctx) { }
	
	@Override public void enterSentenciacreateshape(@NotNull GramaticaParser.SentenciacreateshapeContext ctx) { }
	
	@Override public void exitSentenciacreateshape(@NotNull GramaticaParser.SentenciacreateshapeContext ctx) { }
	
	@Override public void enterSentenciasetcolorshape(@NotNull GramaticaParser.SentenciasetcolorshapeContext ctx) { }
	
	@Override public void exitSentenciasetcolorshape(@NotNull GramaticaParser.SentenciasetcolorshapeContext ctx) { }
	
	@Override public void enterSentenciasetcolorrectangle(@NotNull GramaticaParser.SentenciasetcolorrectangleContext ctx) { }
	
	@Override public void exitSentenciasetcolorrectangle(@NotNull GramaticaParser.SentenciasetcolorrectangleContext ctx) { }
	
	@Override public void enterSentenciacreaterectangle(@NotNull GramaticaParser.SentenciacreaterectangleContext ctx) { }
	
	@Override public void exitSentenciacreaterectangle(@NotNull GramaticaParser.SentenciacreaterectangleContext ctx) { }
	
	@Override public void enterProg(@NotNull GramaticaParser.ProgContext ctx) { }
	
	@Override public void exitProg(@NotNull GramaticaParser.ProgContext ctx) { }

	
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}