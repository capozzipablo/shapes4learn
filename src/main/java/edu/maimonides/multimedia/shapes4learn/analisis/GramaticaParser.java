package edu.maimonides.multimedia.shapes4learn.analisis;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, SHAPE=2, RECTANGLE=3, CIRCLE=4, SETCOLOR=5, COLORDEF=6, SETBASE=7, 
		SETHEIGHT=8, SETRADIUS=9, SETPOSITION=10, ID=11, IN=12, COMA=13, NUEVALINEA=14, 
		FINSENTENCIA=15, EXPRESIONNUMERICA=16, EXPRESSION=17, PARENTHESISAP=18, 
		PATRENTESISCE=19, MUL=20, DIV=21, ADD=22, SUB=23, WHITESPACE=24;
	public static final String[] tokenNames = {
		"<INVALID>", "CREATE", "SHAPE", "RECTANGLE", "CIRCLE", "SETCOLOR", "COLORDEF", 
		"SETBASE", "SETHEIGHT", "SETRADIUS", "SETPOSITION", "ID", "IN", "','", 
		"NUEVALINEA", "';'", "EXPRESIONNUMERICA", "EXPRESSION", "PARENTHESISAP", 
		"PATRENTESISCE", "MUL", "DIV", "ADD", "SUB", "WHITESPACE"
	};
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_sentenciacreateshape = 2, RULE_sentenciacreaterectangle = 3, 
		RULE_sentenciacreatecircle = 4, RULE_sentenciasetcolorshape = 5, RULE_sentenciasetcolorrectangle = 6, 
		RULE_sentenciasetcolorcircle = 7, RULE_sentenciasetbase = 8, RULE_sentenciasetheight = 9, 
		RULE_sentenciasetradius = 10, RULE_sentenciasetposition = 11;
	public static final String[] ruleNames = {
		"prog", "start", "sentenciacreateshape", "sentenciacreaterectangle", "sentenciacreatecircle", 
		"sentenciasetcolorshape", "sentenciasetcolorrectangle", "sentenciasetcolorcircle", 
		"sentenciasetbase", "sentenciasetheight", "sentenciasetradius", "sentenciasetposition"
	};

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); start();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public SentenciacreateshapeContext sentenciacreateshape() {
			return getRuleContext(SentenciacreateshapeContext.class,0);
		}
		public SentenciasetcolorrectangleContext sentenciasetcolorrectangle() {
			return getRuleContext(SentenciasetcolorrectangleContext.class,0);
		}
		public SentenciacreatecircleContext sentenciacreatecircle() {
			return getRuleContext(SentenciacreatecircleContext.class,0);
		}
		public SentenciasetradiusContext sentenciasetradius() {
			return getRuleContext(SentenciasetradiusContext.class,0);
		}
		public SentenciasetbaseContext sentenciasetbase() {
			return getRuleContext(SentenciasetbaseContext.class,0);
		}
		public SentenciasetcolorshapeContext sentenciasetcolorshape() {
			return getRuleContext(SentenciasetcolorshapeContext.class,0);
		}
		public SentenciasetheightContext sentenciasetheight() {
			return getRuleContext(SentenciasetheightContext.class,0);
		}
		public SentenciasetcolorcircleContext sentenciasetcolorcircle() {
			return getRuleContext(SentenciasetcolorcircleContext.class,0);
		}
		public SentenciasetpositionContext sentenciasetposition() {
			return getRuleContext(SentenciasetpositionContext.class,0);
		}
		public SentenciacreaterectangleContext sentenciacreaterectangle() {
			return getRuleContext(SentenciacreaterectangleContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); sentenciacreateshape();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); sentenciacreaterectangle();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); sentenciacreatecircle();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); sentenciasetcolorshape();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30); sentenciasetcolorrectangle();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(31); sentenciasetcolorcircle();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(32); sentenciasetbase();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(33); sentenciasetheight();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(34); sentenciasetradius();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(35); sentenciasetposition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciacreateshapeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SHAPE() { return getToken(GramaticaParser.SHAPE, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public SentenciacreateshapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciacreateshape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciacreateshape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciacreateshape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciacreateshape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciacreateshapeContext sentenciacreateshape() throws RecognitionException {
		SentenciacreateshapeContext _localctx = new SentenciacreateshapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentenciacreateshape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(CREATE);
			setState(39); match(SHAPE);
			setState(40); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciacreaterectangleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode RECTANGLE() { return getToken(GramaticaParser.RECTANGLE, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public SentenciacreaterectangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciacreaterectangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciacreaterectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciacreaterectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciacreaterectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciacreaterectangleContext sentenciacreaterectangle() throws RecognitionException {
		SentenciacreaterectangleContext _localctx = new SentenciacreaterectangleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentenciacreaterectangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(CREATE);
			setState(43); match(RECTANGLE);
			setState(44); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciacreatecircleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaParser.CREATE, 0); }
		public TerminalNode CIRCLE() { return getToken(GramaticaParser.CIRCLE, 0); }
		public SentenciacreatecircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciacreatecircle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciacreatecircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciacreatecircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciacreatecircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciacreatecircleContext sentenciacreatecircle() throws RecognitionException {
		SentenciacreatecircleContext _localctx = new SentenciacreatecircleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentenciacreatecircle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(CREATE);
			setState(47); match(CIRCLE);
			setState(48); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetcolorshapeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SETCOLOR() { return getToken(GramaticaParser.SETCOLOR, 0); }
		public TerminalNode COLORDEF() { return getToken(GramaticaParser.COLORDEF, 0); }
		public TerminalNode SHAPE() { return getToken(GramaticaParser.SHAPE, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public SentenciasetcolorshapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetcolorshape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetcolorshape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetcolorshape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetcolorshape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetcolorshapeContext sentenciasetcolorshape() throws RecognitionException {
		SentenciasetcolorshapeContext _localctx = new SentenciasetcolorshapeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentenciasetcolorshape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(SETCOLOR);
			setState(51); match(COLORDEF);
			setState(52); match(IN);
			setState(53); match(SHAPE);
			setState(54); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetcolorrectangleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode RECTANGLE() { return getToken(GramaticaParser.RECTANGLE, 0); }
		public TerminalNode SETCOLOR() { return getToken(GramaticaParser.SETCOLOR, 0); }
		public TerminalNode COLORDEF() { return getToken(GramaticaParser.COLORDEF, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public SentenciasetcolorrectangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetcolorrectangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetcolorrectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetcolorrectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetcolorrectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetcolorrectangleContext sentenciasetcolorrectangle() throws RecognitionException {
		SentenciasetcolorrectangleContext _localctx = new SentenciasetcolorrectangleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentenciasetcolorrectangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(SETCOLOR);
			setState(57); match(COLORDEF);
			setState(58); match(IN);
			setState(59); match(RECTANGLE);
			setState(60); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetcolorcircleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SETCOLOR() { return getToken(GramaticaParser.SETCOLOR, 0); }
		public TerminalNode COLORDEF() { return getToken(GramaticaParser.COLORDEF, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public TerminalNode CIRCLE() { return getToken(GramaticaParser.CIRCLE, 0); }
		public SentenciasetcolorcircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetcolorcircle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetcolorcircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetcolorcircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetcolorcircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetcolorcircleContext sentenciasetcolorcircle() throws RecognitionException {
		SentenciasetcolorcircleContext _localctx = new SentenciasetcolorcircleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentenciasetcolorcircle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(SETCOLOR);
			setState(63); match(COLORDEF);
			setState(64); match(IN);
			setState(65); match(CIRCLE);
			setState(66); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetbaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode EXPRESIONNUMERICA() { return getToken(GramaticaParser.EXPRESIONNUMERICA, 0); }
		public TerminalNode RECTANGLE() { return getToken(GramaticaParser.RECTANGLE, 0); }
		public TerminalNode SETBASE() { return getToken(GramaticaParser.SETBASE, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public SentenciasetbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetbaseContext sentenciasetbase() throws RecognitionException {
		SentenciasetbaseContext _localctx = new SentenciasetbaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentenciasetbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(SETBASE);
			setState(69); match(EXPRESIONNUMERICA);
			setState(70); match(IN);
			setState(71); match(RECTANGLE);
			setState(72); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetheightContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SETHEIGHT() { return getToken(GramaticaParser.SETHEIGHT, 0); }
		public TerminalNode EXPRESIONNUMERICA() { return getToken(GramaticaParser.EXPRESIONNUMERICA, 0); }
		public TerminalNode RECTANGLE() { return getToken(GramaticaParser.RECTANGLE, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public SentenciasetheightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetheight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetheight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetheight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetheight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetheightContext sentenciasetheight() throws RecognitionException {
		SentenciasetheightContext _localctx = new SentenciasetheightContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentenciasetheight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(SETHEIGHT);
			setState(75); match(EXPRESIONNUMERICA);
			setState(76); match(IN);
			setState(77); match(RECTANGLE);
			setState(78); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetradiusContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SETRADIUS() { return getToken(GramaticaParser.SETRADIUS, 0); }
		public TerminalNode EXPRESIONNUMERICA() { return getToken(GramaticaParser.EXPRESIONNUMERICA, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public TerminalNode CIRCLE() { return getToken(GramaticaParser.CIRCLE, 0); }
		public SentenciasetradiusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetradius; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetradius(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetradius(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetradius(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetradiusContext sentenciasetradius() throws RecognitionException {
		SentenciasetradiusContext _localctx = new SentenciasetradiusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentenciasetradius);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(SETRADIUS);
			setState(81); match(EXPRESIONNUMERICA);
			setState(82); match(IN);
			setState(83); match(CIRCLE);
			setState(84); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasetpositionContext extends ParserRuleContext {
		public TerminalNode SETPOSITION() { return getToken(GramaticaParser.SETPOSITION, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public List<TerminalNode> EXPRESIONNUMERICA() { return getTokens(GramaticaParser.EXPRESIONNUMERICA); }
		public TerminalNode RECTANGLE() { return getToken(GramaticaParser.RECTANGLE, 0); }
		public TerminalNode EXPRESIONNUMERICA(int i) {
			return getToken(GramaticaParser.EXPRESIONNUMERICA, i);
		}
		public TerminalNode COMA() { return getToken(GramaticaParser.COMA, 0); }
		public TerminalNode IN() { return getToken(GramaticaParser.IN, 0); }
		public SentenciasetpositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciasetposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentenciasetposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentenciasetposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentenciasetposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasetpositionContext sentenciasetposition() throws RecognitionException {
		SentenciasetpositionContext _localctx = new SentenciasetpositionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentenciasetposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(SETPOSITION);
			setState(87); match(EXPRESIONNUMERICA);
			setState(88); match(COMA);
			setState(89); match(EXPRESIONNUMERICA);
			setState(90); match(IN);
			setState(91); match(RECTANGLE);
			setState(92); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'\n"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2]\2"+
		"\32\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b,\3\2\2\2\n\60\3\2\2\2\f\64\3\2\2\2"+
		"\16:\3\2\2\2\20@\3\2\2\2\22F\3\2\2\2\24L\3\2\2\2\26R\3\2\2\2\30X\3\2\2"+
		"\2\32\33\5\4\3\2\33\3\3\2\2\2\34\'\5\6\4\2\35\'\5\b\5\2\36\'\5\n\6\2\37"+
		"\'\5\f\7\2 \'\5\16\b\2!\'\5\20\t\2\"\'\5\22\n\2#\'\5\24\13\2$\'\5\26\f"+
		"\2%\'\5\30\r\2&\34\3\2\2\2&\35\3\2\2\2&\36\3\2\2\2&\37\3\2\2\2& \3\2\2"+
		"\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()\7"+
		"\3\2\2)*\7\4\2\2*+\7\r\2\2+\7\3\2\2\2,-\7\3\2\2-.\7\5\2\2./\7\r\2\2/\t"+
		"\3\2\2\2\60\61\7\3\2\2\61\62\7\6\2\2\62\63\7\r\2\2\63\13\3\2\2\2\64\65"+
		"\7\7\2\2\65\66\7\b\2\2\66\67\7\16\2\2\678\7\4\2\289\7\r\2\29\r\3\2\2\2"+
		":;\7\7\2\2;<\7\b\2\2<=\7\16\2\2=>\7\5\2\2>?\7\r\2\2?\17\3\2\2\2@A\7\7"+
		"\2\2AB\7\b\2\2BC\7\16\2\2CD\7\6\2\2DE\7\r\2\2E\21\3\2\2\2FG\7\t\2\2GH"+
		"\7\22\2\2HI\7\16\2\2IJ\7\5\2\2JK\7\r\2\2K\23\3\2\2\2LM\7\n\2\2MN\7\22"+
		"\2\2NO\7\16\2\2OP\7\5\2\2PQ\7\r\2\2Q\25\3\2\2\2RS\7\13\2\2ST\7\22\2\2"+
		"TU\7\16\2\2UV\7\6\2\2VW\7\r\2\2W\27\3\2\2\2XY\7\f\2\2YZ\7\22\2\2Z[\7\17"+
		"\2\2[\\\7\22\2\2\\]\7\16\2\2]^\7\5\2\2^_\7\r\2\2_\31\3\2\2\2\3&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}