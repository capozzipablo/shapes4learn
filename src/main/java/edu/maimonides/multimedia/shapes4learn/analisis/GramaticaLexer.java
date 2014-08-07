package edu.maimonides.multimedia.shapes4learn.analisis;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, SHAPE=2, RECTANGLE=3, CIRCLE=4, SETCOLOR=5, COLORDEF=6, SETBASE=7, 
		SETHEIGHT=8, SETRADIUS=9, SETPOSITION=10, ID=11, IN=12, COMA=13, NUEVALINEA=14, 
		FINSENTENCIA=15, EXPRESIONNUMERICA=16, EXPRESSION=17, PARENTHESISAP=18, 
		PATRENTESISCE=19, MUL=20, DIV=21, ADD=22, SUB=23, WHITESPACE=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"CREATE", "SHAPE", "RECTANGLE", "CIRCLE", "SETCOLOR", "COLORDEF", "SETBASE", 
		"SETHEIGHT", "SETRADIUS", "SETPOSITION", "ID", "IN", "','", "NUEVALINEA", 
		"';'", "EXPRESIONNUMERICA", "EXPRESSION", "PARENTHESISAP", "PATRENTESISCE", 
		"MUL", "DIV", "ADD", "SUB", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"CREATE", "SHAPE", "RECTANGLE", "CIRCLE", "SETCOLOR", "COLORDEF", "SETBASE", 
		"SETHEIGHT", "SETRADIUS", "SETPOSITION", "ID", "IN", "COMA", "NUEVALINEA", 
		"FINSENTENCIA", "EXPRESIONNUMERICA", "EXPRESSION", "PARENTHESISAP", "PATRENTESISCE", 
		"MUL", "DIV", "ADD", "SUB", "WHITESPACE"
	};


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00e0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\6\f\u008c\n\f\r\f\16\f\u008d\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\5\17\u0096\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00c1\n\21\3\22\6\22\u00c4\n\22\r\22\16\22\u00c5"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\6\31\u00db\n\31\r\31\16\31\u00dc\3\31\3\31\2"+
		"\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\25\4\2EEee\4\2TT"+
		"tt\4\2GGgg\4\2CCcc\4\2VVvv\4\2UUuu\4\2JJjj\4\2RRrr\4\2PPpp\4\2IIii\4\2"+
		"NNnn\4\2KKkk\4\2QQqq\5\2\628CHch\4\2DDdd\4\2FFff\4\2WWww\4\2C\\c|\5\2"+
		"\13\f\16\17\"\"\u00ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5:\3\2\2\2\7@\3\2\2"+
		"\2\tJ\3\2\2\2\13Q\3\2\2\2\rZ\3\2\2\2\17b\3\2\2\2\21j\3\2\2\2\23t\3\2\2"+
		"\2\25~\3\2\2\2\27\u008b\3\2\2\2\31\u008f\3\2\2\2\33\u0092\3\2\2\2\35\u0095"+
		"\3\2\2\2\37\u0099\3\2\2\2!\u00c0\3\2\2\2#\u00c3\3\2\2\2%\u00c7\3\2\2\2"+
		"\'\u00ca\3\2\2\2)\u00cd\3\2\2\2+\u00d0\3\2\2\2-\u00d3\3\2\2\2/\u00d6\3"+
		"\2\2\2\61\u00da\3\2\2\2\63\64\t\2\2\2\64\65\t\3\2\2\65\66\t\4\2\2\66\67"+
		"\t\5\2\2\678\t\6\2\289\t\4\2\29\4\3\2\2\2:;\t\7\2\2;<\t\b\2\2<=\t\5\2"+
		"\2=>\t\t\2\2>?\t\4\2\2?\6\3\2\2\2@A\t\3\2\2AB\t\4\2\2BC\t\2\2\2CD\t\6"+
		"\2\2DE\t\5\2\2EF\t\n\2\2FG\t\13\2\2GH\t\f\2\2HI\t\4\2\2I\b\3\2\2\2JK\t"+
		"\2\2\2KL\t\r\2\2LM\t\3\2\2MN\t\2\2\2NO\t\f\2\2OP\t\4\2\2P\n\3\2\2\2QR"+
		"\t\7\2\2RS\t\4\2\2ST\t\6\2\2TU\t\2\2\2UV\t\16\2\2VW\t\f\2\2WX\t\16\2\2"+
		"XY\t\3\2\2Y\f\3\2\2\2Z[\7%\2\2[\\\t\17\2\2\\]\t\17\2\2]^\t\17\2\2^_\t"+
		"\17\2\2_`\t\17\2\2`a\t\17\2\2a\16\3\2\2\2bc\t\7\2\2cd\t\4\2\2de\t\6\2"+
		"\2ef\t\20\2\2fg\t\5\2\2gh\t\7\2\2hi\t\4\2\2i\20\3\2\2\2jk\t\7\2\2kl\t"+
		"\4\2\2lm\t\6\2\2mn\t\b\2\2no\t\4\2\2op\t\r\2\2pq\t\13\2\2qr\t\b\2\2rs"+
		"\t\6\2\2s\22\3\2\2\2tu\t\7\2\2uv\t\4\2\2vw\t\6\2\2wx\t\3\2\2xy\t\5\2\2"+
		"yz\t\21\2\2z{\t\r\2\2{|\t\22\2\2|}\t\7\2\2}\24\3\2\2\2~\177\t\7\2\2\177"+
		"\u0080\t\4\2\2\u0080\u0081\t\6\2\2\u0081\u0082\t\t\2\2\u0082\u0083\t\16"+
		"\2\2\u0083\u0084\t\7\2\2\u0084\u0085\t\r\2\2\u0085\u0086\t\6\2\2\u0086"+
		"\u0087\t\r\2\2\u0087\u0088\t\16\2\2\u0088\u0089\t\n\2\2\u0089\26\3\2\2"+
		"\2\u008a\u008c\t\23\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\30\3\2\2\2\u008f\u0090\t\r\2"+
		"\2\u0090\u0091\t\n\2\2\u0091\32\3\2\2\2\u0092\u0093\7.\2\2\u0093\34\3"+
		"\2\2\2\u0094\u0096\7\17\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\f\2\2\u0098\36\3\2\2\2\u0099\u009a\7=\2\2"+
		"\u009a \3\2\2\2\u009b\u009c\5%\23\2\u009c\u009d\5!\21\2\u009d\u009e\5"+
		"\'\24\2\u009e\u00c1\3\2\2\2\u009f\u00a0\5#\22\2\u00a0\u00a1\5)\25\2\u00a1"+
		"\u00a2\5#\22\2\u00a2\u00c1\3\2\2\2\u00a3\u00a4\5#\22\2\u00a4\u00a5\5)"+
		"\25\2\u00a5\u00a6\5!\21\2\u00a6\u00c1\3\2\2\2\u00a7\u00a8\5#\22\2\u00a8"+
		"\u00a9\5+\26\2\u00a9\u00aa\5#\22\2\u00aa\u00c1\3\2\2\2\u00ab\u00ac\5#"+
		"\22\2\u00ac\u00ad\5+\26\2\u00ad\u00ae\5!\21\2\u00ae\u00c1\3\2\2\2\u00af"+
		"\u00b0\5#\22\2\u00b0\u00b1\5-\27\2\u00b1\u00b2\5#\22\2\u00b2\u00c1\3\2"+
		"\2\2\u00b3\u00b4\5#\22\2\u00b4\u00b5\5-\27\2\u00b5\u00b6\5!\21\2\u00b6"+
		"\u00c1\3\2\2\2\u00b7\u00b8\5#\22\2\u00b8\u00b9\5/\30\2\u00b9\u00ba\5#"+
		"\22\2\u00ba\u00c1\3\2\2\2\u00bb\u00bc\5#\22\2\u00bc\u00bd\5/\30\2\u00bd"+
		"\u00be\5!\21\2\u00be\u00c1\3\2\2\2\u00bf\u00c1\5#\22\2\u00c0\u009b\3\2"+
		"\2\2\u00c0\u009f\3\2\2\2\u00c0\u00a3\3\2\2\2\u00c0\u00a7\3\2\2\2\u00c0"+
		"\u00ab\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00b3\3\2\2\2\u00c0\u00b7\3\2"+
		"\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\"\3\2\2\2\u00c2\u00c4"+
		"\4\62;\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\u00c9\5\61\31\2"+
		"\u00c9&\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb\u00cc\5\61\31\2\u00cc(\3\2\2"+
		"\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\5\61\31\2\u00cf*\3\2\2\2\u00d0\u00d1"+
		"\7\61\2\2\u00d1\u00d2\5\61\31\2\u00d2,\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4"+
		"\u00d5\5\61\31\2\u00d5.\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\5\61\31"+
		"\2\u00d8\60\3\2\2\2\u00d9\u00db\t\24\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b\31\2\2\u00df\62\3\2\2\2\b\2\u008d\u0095\u00c0\u00c5\u00dc\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}