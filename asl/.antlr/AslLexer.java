// Generated from /home/arian/Uni/CL/Practica-CL/asl/Asl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ASSIGN=4, AND=5, OR=6, EQUAL=7, NE=8, NOT=9, LT=10, 
		GT=11, GTE=12, LTE=13, PLUS=14, SUB=15, LP=16, RP=17, LC=18, RC=19, BOOL=20, 
		FLOAT=21, CHAR=22, MUL=23, DIV=24, VAR=25, ARRAY=26, INT=27, IF=28, THEN=29, 
		ELSE=30, WHILE=31, ENDWHILE=32, DO=33, RETURN=34, ENDIF=35, FUNC=36, ENDFUNC=37, 
		READ=38, WRITE=39, INTVAL=40, FLOATVAL=41, BOOLVAL=42, CHARVAL=43, ID=44, 
		COMMA=45, STRING=46, COMMENT=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ASSIGN", "AND", "OR", "EQUAL", "NE", "NOT", "LT", 
		"GT", "GTE", "LTE", "PLUS", "SUB", "LP", "RP", "LC", "RC", "BOOL", "FLOAT", 
		"CHAR", "MUL", "DIV", "VAR", "ARRAY", "INT", "IF", "THEN", "ELSE", "WHILE", 
		"ENDWHILE", "DO", "RETURN", "ENDIF", "FUNC", "ENDFUNC", "READ", "WRITE", 
		"INTVAL", "FLOATVAL", "BOOLVAL", "CHARVAL", "ID", "COMMA", "STRING", "ESC_SEQ", 
		"COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'of'", "';'", "'='", "'and'", "'or'", "'=='", "'!='", "'not'", 
		"'<'", "'>'", "'>='", "'<='", "'+'", "'-'", "'('", "')'", "'['", "']'", 
		"'bool'", "'float'", "'char'", "'*'", "'/'", "'var'", "'array'", "'int'", 
		"'if'", "'then'", "'else'", "'while'", "'endwhile'", "'do'", "'return'", 
		"'endif'", "'func'", "'endfunc'", "'read'", "'write'", null, null, null, 
		null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ASSIGN", "AND", "OR", "EQUAL", "NE", "NOT", "LT", 
		"GT", "GTE", "LTE", "PLUS", "SUB", "LP", "RP", "LC", "RC", "BOOL", "FLOAT", 
		"CHAR", "MUL", "DIV", "VAR", "ARRAY", "INT", "IF", "THEN", "ELSE", "WHILE", 
		"ENDWHILE", "DO", "RETURN", "ENDIF", "FUNC", "ENDFUNC", "READ", "WRITE", 
		"INTVAL", "FLOATVAL", "BOOLVAL", "CHARVAL", "ID", "COMMA", "STRING", "COMMENT", 
		"WS"
	};
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


	public AslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u014a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\6)\u00fd\n)\r)\16)\u00fe"+
		"\3*\6*\u0102\n*\r*\16*\u0103\3*\3*\6*\u0108\n*\r*\16*\u0109\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u0115\n+\3,\3,\3,\5,\u011a\n,\3,\3,\3-\3-\7-\u0120"+
		"\n-\f-\16-\u0123\13-\3.\3.\3/\3/\3/\7/\u012a\n/\f/\16/\u012d\13/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0138\n\61\f\61\16\61\u013b"+
		"\13\61\3\61\5\61\u013e\n\61\3\61\3\61\3\61\3\61\3\62\6\62\u0145\n\62\r"+
		"\62\16\62\u0146\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\2a\61c\62\3\2\t\4\2))^^\5\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\n\2$$))^^"+
		"ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0153\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5"+
		"g\3\2\2\2\7j\3\2\2\2\tl\3\2\2\2\13n\3\2\2\2\rr\3\2\2\2\17u\3\2\2\2\21"+
		"x\3\2\2\2\23{\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2"+
		"\33\u0086\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u008f"+
		"\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u009a\3\2\2\2"+
		"-\u00a0\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2\2\65\u00ad"+
		"\3\2\2\2\67\u00b3\3\2\2\29\u00b7\3\2\2\2;\u00ba\3\2\2\2=\u00bf\3\2\2\2"+
		"?\u00c4\3\2\2\2A\u00ca\3\2\2\2C\u00d3\3\2\2\2E\u00d6\3\2\2\2G\u00dd\3"+
		"\2\2\2I\u00e3\3\2\2\2K\u00e8\3\2\2\2M\u00f0\3\2\2\2O\u00f5\3\2\2\2Q\u00fc"+
		"\3\2\2\2S\u0101\3\2\2\2U\u0114\3\2\2\2W\u0116\3\2\2\2Y\u011d\3\2\2\2["+
		"\u0124\3\2\2\2]\u0126\3\2\2\2_\u0130\3\2\2\2a\u0133\3\2\2\2c\u0144\3\2"+
		"\2\2ef\7<\2\2f\4\3\2\2\2gh\7q\2\2hi\7h\2\2i\6\3\2\2\2jk\7=\2\2k\b\3\2"+
		"\2\2lm\7?\2\2m\n\3\2\2\2no\7c\2\2op\7p\2\2pq\7f\2\2q\f\3\2\2\2rs\7q\2"+
		"\2st\7t\2\2t\16\3\2\2\2uv\7?\2\2vw\7?\2\2w\20\3\2\2\2xy\7#\2\2yz\7?\2"+
		"\2z\22\3\2\2\2{|\7p\2\2|}\7q\2\2}~\7v\2\2~\24\3\2\2\2\177\u0080\7>\2\2"+
		"\u0080\26\3\2\2\2\u0081\u0082\7@\2\2\u0082\30\3\2\2\2\u0083\u0084\7@\2"+
		"\2\u0084\u0085\7?\2\2\u0085\32\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088"+
		"\7?\2\2\u0088\34\3\2\2\2\u0089\u008a\7-\2\2\u008a\36\3\2\2\2\u008b\u008c"+
		"\7/\2\2\u008c \3\2\2\2\u008d\u008e\7*\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7+\2\2\u0090$\3\2\2\2\u0091\u0092\7]\2\2\u0092&\3\2\2\2\u0093\u0094\7"+
		"_\2\2\u0094(\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7n\2\2\u0099*\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f"+
		",\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\60\3\2\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7"+
		"t\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7{\2\2\u00b2\66"+
		"\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"8\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7h\2\2\u00b9:\3\2\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be"+
		"<\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7j\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9@\3\2\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7y\2\2"+
		"\u00ce\u00cf\7j\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7q\2\2\u00d5D\3"+
		"\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7p\2\2\u00dcF\3\2\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7k\2\2"+
		"\u00e1\u00e2\7h\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7w\2"+
		"\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7e\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7"+
		"g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed"+
		"\7w\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7e\2\2\u00efL\3\2\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7f\2\2\u00f4"+
		"N\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00faP\3\2\2\2\u00fb\u00fd\4\62;\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ffR\3\2\2\2\u0100\u0102\4\62;\2\u0101\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\7\60\2\2\u0106\u0108\4\62;\2\u0107\u0106\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aT\3\2\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e\u0115\7g\2\2\u010f"+
		"\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2"+
		"\u0113\u0115\7g\2\2\u0114\u010b\3\2\2\2\u0114\u010f\3\2\2\2\u0115V\3\2"+
		"\2\2\u0116\u0119\7)\2\2\u0117\u011a\5_\60\2\u0118\u011a\n\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7)"+
		"\2\2\u011cX\3\2\2\2\u011d\u0121\t\3\2\2\u011e\u0120\t\4\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"Z\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7.\2\2\u0125\\\3\2\2\2\u0126"+
		"\u012b\7$\2\2\u0127\u012a\5_\60\2\u0128\u012a\n\5\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7$"+
		"\2\2\u012f^\3\2\2\2\u0130\u0131\7^\2\2\u0131\u0132\t\6\2\2\u0132`\3\2"+
		"\2\2\u0133\u0134\7\61\2\2\u0134\u0135\7\61\2\2\u0135\u0139\3\2\2\2\u0136"+
		"\u0138\n\7\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013e\7\17\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u0140\7\f\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\61\2\2\u0142"+
		"b\3\2\2\2\u0143\u0145\t\b\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2"+
		"\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\b\62\2\2\u0149d\3\2\2\2\16\2\u00fe\u0103\u0109\u0114\u0119\u0121\u0129"+
		"\u012b\u0139\u013d\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}