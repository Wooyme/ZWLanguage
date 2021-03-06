// Generated from /home/wooyme/Projects/simplelanguage/language/src/main/java/com/github/wooyme/nmsl/parser/SimpleLanguage.g4 by ANTLR 4.7.2
package com.github.wooyme.nmsl.parser;

// DO NOT MODIFY - generated from SimpleLanguage.g4 using "mx create-sl-parser"

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, WS=42, COMMENT=43, LINE_COMMENT=44, LOGICAL_LITERAL=45, 
		IDENTIFIER=46, STRING_LITERAL=47, NUMERIC_LITERAL=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"WS", "COMMENT", "LINE_COMMENT", "LETTER", "NON_ZERO_DIGIT", "DIGIT", 
			"HEX_DIGIT", "OCT_DIGIT", "BINARY_DIGIT", "TAB", "STRING_CHAR", "LOGICAL_LITERAL", 
			"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'import'", "';'", "'load'", "'fn'", "'fn+'", "'('", "','", 
			"')'", "'{'", "'->'", "'}'", "'await'", "'break'", "'continue'", "'debugger'", 
			"'while'", "'if'", "'else'", "'return'", "'||'", "'&&'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", 
			"'!'", "'null'", "'['", "']'", "':'", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "COMMENT", "LINE_COMMENT", 
			"LOGICAL_LITERAL", "IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u017c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\6+\u0100\n+\r+\16+\u0101\3+\3+\3"+
		",\3,\3,\3,\7,\u010a\n,\f,\16,\u010d\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-"+
		"\u0118\n-\f-\16-\u011b\13-\3-\3-\3.\5.\u0120\n.\3/\3/\3\60\3\60\3\61\5"+
		"\61\u0127\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u013c\n\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0147\n\66\3\67\5\67\u014a\n\67\3"+
		"\67\3\67\3\67\7\67\u014f\n\67\f\67\16\67\u0152\13\67\38\38\78\u0156\n"+
		"8\f8\168\u0159\138\38\38\39\39\39\79\u0160\n9\f9\169\u0163\139\39\39\3"+
		"9\79\u0168\n9\f9\169\u016b\139\39\39\79\u016f\n9\f9\169\u0172\139\39\3"+
		"9\79\u0176\n9\f9\169\u0179\139\59\u017b\n9\3\u010b\2:\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c\2e\2g\2i\2k/m\60o\61q\62\3\2\n\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\3\2\63;\3\2\62;\5\2\62;CHch\3\2"+
		"\629\6\2\f\f\17\17$$^^\2\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7|\3\2\2\2\t"+
		"~\3\2\2\2\13\u0083\3\2\2\2\r\u0086\3\2\2\2\17\u008a\3\2\2\2\21\u008c\3"+
		"\2\2\2\23\u008e\3\2\2\2\25\u0090\3\2\2\2\27\u0092\3\2\2\2\31\u0095\3\2"+
		"\2\2\33\u0097\3\2\2\2\35\u009d\3\2\2\2\37\u00a3\3\2\2\2!\u00ac\3\2\2\2"+
		"#\u00b5\3\2\2\2%\u00bb\3\2\2\2\'\u00be\3\2\2\2)\u00c3\3\2\2\2+\u00ca\3"+
		"\2\2\2-\u00cd\3\2\2\2/\u00d0\3\2\2\2\61\u00d2\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00d7\3\2\2\2\67\u00da\3\2\2\29\u00dd\3\2\2\2;\u00e0\3\2\2\2=\u00e2"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00e6\3\2\2\2C\u00e8\3\2\2\2E\u00ea\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00ee\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2\2\2O\u00f7\3\2"+
		"\2\2Q\u00f9\3\2\2\2S\u00fb\3\2\2\2U\u00ff\3\2\2\2W\u0105\3\2\2\2Y\u0113"+
		"\3\2\2\2[\u011f\3\2\2\2]\u0121\3\2\2\2_\u0123\3\2\2\2a\u0126\3\2\2\2c"+
		"\u0128\3\2\2\2e\u012a\3\2\2\2g\u012c\3\2\2\2i\u013b\3\2\2\2k\u0146\3\2"+
		"\2\2m\u0149\3\2\2\2o\u0153\3\2\2\2q\u017a\3\2\2\2st\7?\2\2t\4\3\2\2\2"+
		"uv\7k\2\2vw\7o\2\2wx\7r\2\2xy\7q\2\2yz\7t\2\2z{\7v\2\2{\6\3\2\2\2|}\7"+
		"=\2\2}\b\3\2\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7f\2\2\u0082\n\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7p\2\2\u0085"+
		"\f\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7p\2\2\u0088\u0089\7-\2\2\u0089"+
		"\16\3\2\2\2\u008a\u008b\7*\2\2\u008b\20\3\2\2\2\u008c\u008d\7.\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7+\2\2\u008f\24\3\2\2\2\u0090\u0091\7}\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0093\7/\2\2\u0093\u0094\7@\2\2\u0094\30\3\2\2\2\u0095"+
		"\u0096\7\177\2\2\u0096\32\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7y\2"+
		"\2\u0099\u009a\7c\2\2\u009a\u009b\7k\2\2\u009b\u009c\7v\2\2\u009c\34\3"+
		"\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7m\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2"+
		"\u00a8\u00a9\7p\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7g\2\2\u00ab \3\2\2"+
		"\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7d\2\2\u00af\u00b0"+
		"\7w\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba$\3\2\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7h\2\2\u00bd&\3\2\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2(\3\2\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7w\2\2"+
		"\u00c7\u00c8\7t\2\2\u00c8\u00c9\7p\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7~\2"+
		"\2\u00cb\u00cc\7~\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7"+
		"(\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7"+
		">\2\2\u00d3\u00d4\7?\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\64"+
		"\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9\7?\2\2\u00d9\66\3\2\2\2\u00da"+
		"\u00db\7?\2\2\u00db\u00dc\7?\2\2\u00dc8\3\2\2\2\u00dd\u00de\7#\2\2\u00de"+
		"\u00df\7?\2\2\u00df:\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1<\3\2\2\2\u00e2\u00e3"+
		"\7/\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7"+
		"\61\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7`\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7"+
		"\'\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7#\2\2\u00edH\3\2\2\2\u00ee\u00ef\7"+
		"p\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7n\2\2\u00f2J"+
		"\3\2\2\2\u00f3\u00f4\7]\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7_\2\2\u00f6N\3"+
		"\2\2\2\u00f7\u00f8\7<\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7\60\2\2\u00faR\3"+
		"\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd\7\60\2\2\u00fdT\3\2\2\2\u00fe"+
		"\u0100\t\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b+\2\2\u0104"+
		"V\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7,\2\2\u0107\u010b\3\2\2\2"+
		"\u0108\u010a\13\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7,\2\2\u010f\u0110\7\61\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b,"+
		"\2\2\u0112X\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115\7\61\2\2\u0115\u0119"+
		"\3\2\2\2\u0116\u0118\n\3\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011d\b-\2\2\u011dZ\3\2\2\2\u011e\u0120\t\4\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\\\3\2\2\2\u0121\u0122\t\5\2\2\u0122^\3\2\2\2\u0123\u0124"+
		"\t\6\2\2\u0124`\3\2\2\2\u0125\u0127\t\7\2\2\u0126\u0125\3\2\2\2\u0127"+
		"b\3\2\2\2\u0128\u0129\t\b\2\2\u0129d\3\2\2\2\u012a\u012b\4\62\63\2\u012b"+
		"f\3\2\2\2\u012c\u012d\7\13\2\2\u012dh\3\2\2\2\u012e\u012f\7^\2\2\u012f"+
		"\u013c\7^\2\2\u0130\u0131\7^\2\2\u0131\u013c\7$\2\2\u0132\u0133\7^\2\2"+
		"\u0133\u013c\7p\2\2\u0134\u0135\7^\2\2\u0135\u013c\7v\2\2\u0136\u0137"+
		"\7^\2\2\u0137\u013c\7t\2\2\u0138\u0139\7^\2\2\u0139\u013c\7z\2\2\u013a"+
		"\u013c\n\t\2\2\u013b\u012e\3\2\2\2\u013b\u0130\3\2\2\2\u013b\u0132\3\2"+
		"\2\2\u013b\u0134\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0138\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013cj\3\2\2\2\u013d\u013e\7v\2\2\u013e\u013f\7t\2\2\u013f"+
		"\u0140\7w\2\2\u0140\u0147\7g\2\2\u0141\u0142\7h\2\2\u0142\u0143\7c\2\2"+
		"\u0143\u0144\7n\2\2\u0144\u0145\7u\2\2\u0145\u0147\7g\2\2\u0146\u013d"+
		"\3\2\2\2\u0146\u0141\3\2\2\2\u0147l\3\2\2\2\u0148\u014a\7B\2\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0150\5[.\2\u014c"+
		"\u014f\5[.\2\u014d\u014f\5_\60\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2"+
		"\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151n"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0157\7$\2\2\u0154\u0156\5i\65\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7$\2\2\u015b"+
		"p\3\2\2\2\u015c\u017b\7\62\2\2\u015d\u0161\5]/\2\u015e\u0160\5_\60\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u017b\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\62\2\2\u0165"+
		"\u0169\7\60\2\2\u0166\u0168\5_\60\2\u0167\u0166\3\2\2\2\u0168\u016b\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u017b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u0170\5]/\2\u016d\u016f\5_\60\2\u016e\u016d\3\2\2"+
		"\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0177\7\60\2\2\u0174\u0176\5_\60\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u015c\3\2\2\2\u017a"+
		"\u015d\3\2\2\2\u017a\u0164\3\2\2\2\u017a\u016c\3\2\2\2\u017br\3\2\2\2"+
		"\23\2\u0101\u010b\u0119\u011f\u0126\u013b\u0146\u0149\u014e\u0150\u0157"+
		"\u0161\u0169\u0170\u0177\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}