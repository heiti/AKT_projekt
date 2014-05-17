// Generated from /Users/Heiti/Documents/Dropbox/Kool/ATK/Projekt/Gb.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GbParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, Muutujanimi=22, Arv=23, Whitespace=24, 
		Kommentaar=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'True'", "'False'", "'vigastus'", "')'", "'objekt'", "','", 
		"'laud('", "'pos'", "'('", "'='", "'tyyp'", "';'", "'var'", "'lisa'", 
		"'{'", "'tekst'", "'}'", "'tugevus'", "'\"'", "'korjatav'", "'joonista'", 
		"Muutujanimi", "Arv", "Whitespace", "Kommentaar"
	};
	public static final int
		RULE_programm = 0, RULE_lausetejada = 1, RULE_lause = 2, RULE_lauadeklaratsioon = 3, 
		RULE_objekt = 4, RULE_tyyp = 5, RULE_lisamine = 6, RULE_joonista = 7;
	public static final String[] ruleNames = {
		"programm", "lausetejada", "lause", "lauadeklaratsioon", "objekt", "tyyp", 
		"lisamine", "joonista"
	};

	@Override
	public String getGrammarFileName() { return "Gb.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GbParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public LausetejadaContext lausetejada() {
			return getRuleContext(LausetejadaContext.class,0);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); lausetejada();
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

	public static class LausetejadaContext extends ParserRuleContext {
		public LauseContext lause(int i) {
			return getRuleContext(LauseContext.class,i);
		}
		public List<LauseContext> lause() {
			return getRuleContexts(LauseContext.class);
		}
		public LausetejadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausetejada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterLausetejada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitLausetejada(this);
		}
	}

	public final LausetejadaContext lausetejada() throws RecognitionException {
		LausetejadaContext _localctx = new LausetejadaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lausetejada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); lause();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==12) {
				{
				{
				setState(19); match(12);
				setState(20); lause();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LauseContext extends ParserRuleContext {
		public LisamineContext lisamine() {
			return getRuleContext(LisamineContext.class,0);
		}
		public TyypContext tyyp() {
			return getRuleContext(TyypContext.class,0);
		}
		public LauadeklaratsioonContext lauadeklaratsioon() {
			return getRuleContext(LauadeklaratsioonContext.class,0);
		}
		public ObjektContext objekt() {
			return getRuleContext(ObjektContext.class,0);
		}
		public JoonistaContext joonista() {
			return getRuleContext(JoonistaContext.class,0);
		}
		public LauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitLause(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lause);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); lauadeklaratsioon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); objekt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); lisamine();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); tyyp();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 5);
				{
				setState(30); joonista();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LauadeklaratsioonContext extends ParserRuleContext {
		public TerminalNode Arv(int i) {
			return getToken(GbParser.Arv, i);
		}
		public TerminalNode Muutujanimi() { return getToken(GbParser.Muutujanimi, 0); }
		public List<TerminalNode> Arv() { return getTokens(GbParser.Arv); }
		public LauadeklaratsioonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lauadeklaratsioon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterLauadeklaratsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitLauadeklaratsioon(this);
		}
	}

	public final LauadeklaratsioonContext lauadeklaratsioon() throws RecognitionException {
		LauadeklaratsioonContext _localctx = new LauadeklaratsioonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lauadeklaratsioon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(13);
			setState(34); match(Muutujanimi);
			setState(35); match(10);
			setState(36); match(7);
			setState(37); match(Arv);
			setState(38); match(6);
			setState(39); match(Arv);
			setState(40); match(4);
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

	public static class ObjektContext extends ParserRuleContext {
		public TerminalNode Arv(int i) {
			return getToken(GbParser.Arv, i);
		}
		public TerminalNode Muutujanimi(int i) {
			return getToken(GbParser.Muutujanimi, i);
		}
		public List<TerminalNode> Muutujanimi() { return getTokens(GbParser.Muutujanimi); }
		public List<TerminalNode> Arv() { return getTokens(GbParser.Arv); }
		public ObjektContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objekt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterObjekt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitObjekt(this);
		}
	}

	public final ObjektContext objekt() throws RecognitionException {
		ObjektContext _localctx = new ObjektContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objekt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(5);
			setState(43); match(Muutujanimi);
			setState(44); match(15);
			setState(45); match(8);
			setState(46); match(9);
			setState(47); match(Arv);
			setState(48); match(6);
			setState(49); match(Arv);
			setState(50); match(4);
			setState(51); match(12);
			setState(52); match(11);
			setState(53); match(9);
			setState(54); match(Muutujanimi);
			setState(55); match(4);
			setState(56); match(12);
			setState(57); match(17);
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

	public static class TyypContext extends ParserRuleContext {
		public TerminalNode Arv(int i) {
			return getToken(GbParser.Arv, i);
		}
		public TerminalNode Muutujanimi() { return getToken(GbParser.Muutujanimi, 0); }
		public List<TerminalNode> Arv() { return getTokens(GbParser.Arv); }
		public TyypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyyp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterTyyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitTyyp(this);
		}
	}

	public final TyypContext tyyp() throws RecognitionException {
		TyypContext _localctx = new TyypContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tyyp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(11);
			setState(60); match(Muutujanimi);
			setState(61); match(15);
			setState(62); match(16);
			setState(63); match(10);
			setState(64); match(19);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(65);
					matchWildcard();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(71); match(19);
			setState(72); match(12);
			setState(77);
			_la = _input.LA(1);
			if (_la==20) {
				{
				setState(73); match(20);
				setState(74); match(10);
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==2) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(76); match(12);
				}
			}

			setState(83);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(79); match(3);
				setState(80); match(10);
				setState(81); match(Arv);
				setState(82); match(12);
				}
			}

			setState(89);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(85); match(18);
				setState(86); match(10);
				setState(87); match(Arv);
				setState(88); match(12);
				}
			}

			setState(91); match(17);
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

	public static class LisamineContext extends ParserRuleContext {
		public TerminalNode Muutujanimi(int i) {
			return getToken(GbParser.Muutujanimi, i);
		}
		public List<TerminalNode> Muutujanimi() { return getTokens(GbParser.Muutujanimi); }
		public LisamineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisamine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterLisamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitLisamine(this);
		}
	}

	public final LisamineContext lisamine() throws RecognitionException {
		LisamineContext _localctx = new LisamineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lisamine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(14);
			setState(94); match(9);
			setState(95); match(Muutujanimi);
			setState(96); match(6);
			setState(97); match(Muutujanimi);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(98); match(6);
				setState(99); match(Muutujanimi);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(4);
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

	public static class JoonistaContext extends ParserRuleContext {
		public TerminalNode Muutujanimi() { return getToken(GbParser.Muutujanimi, 0); }
		public JoonistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joonista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).enterJoonista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GbListener ) ((GbListener)listener).exitJoonista(this);
		}
	}

	public final JoonistaContext joonista() throws RecognitionException {
		JoonistaContext _localctx = new JoonistaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joonista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(21);
			setState(108); match(9);
			setState(109); match(Muutujanimi);
			setState(110); match(4);
			setState(111); match(12);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\5\4\"\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7E\n\7\f\7\16\7H"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\7\3"+
		"\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bg\n\b\f\b"+
		"\16\bj\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3F\2\n\2\4\6\b\n\f\16"+
		"\20\2\3\3\2\3\4u\2\22\3\2\2\2\4\24\3\2\2\2\6!\3\2\2\2\b#\3\2\2\2\n,\3"+
		"\2\2\2\f=\3\2\2\2\16_\3\2\2\2\20m\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24"+
		"\31\5\6\4\2\25\26\7\16\2\2\26\30\5\6\4\2\27\25\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34\"\5\b\5\2\35\""+
		"\5\n\6\2\36\"\5\16\b\2\37\"\5\f\7\2 \"\5\20\t\2!\34\3\2\2\2!\35\3\2\2"+
		"\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\7\3\2\2\2#$\7\17\2\2$%\7\30\2\2"+
		"%&\7\f\2\2&\'\7\t\2\2\'(\7\31\2\2()\7\b\2\2)*\7\31\2\2*+\7\6\2\2+\t\3"+
		"\2\2\2,-\7\7\2\2-.\7\30\2\2./\7\21\2\2/\60\7\n\2\2\60\61\7\13\2\2\61\62"+
		"\7\31\2\2\62\63\7\b\2\2\63\64\7\31\2\2\64\65\7\6\2\2\65\66\7\16\2\2\66"+
		"\67\7\r\2\2\678\7\13\2\289\7\30\2\29:\7\6\2\2:;\7\16\2\2;<\7\23\2\2<\13"+
		"\3\2\2\2=>\7\r\2\2>?\7\30\2\2?@\7\21\2\2@A\7\22\2\2AB\7\f\2\2BF\7\25\2"+
		"\2CE\13\2\2\2DC\3\2\2\2EH\3\2\2\2FG\3\2\2\2FD\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IJ\7\25\2\2JO\7\16\2\2KL\7\26\2\2LM\7\f\2\2MN\t\2\2\2NP\7\16\2\2O"+
		"K\3\2\2\2OP\3\2\2\2PU\3\2\2\2QR\7\5\2\2RS\7\f\2\2ST\7\31\2\2TV\7\16\2"+
		"\2UQ\3\2\2\2UV\3\2\2\2V[\3\2\2\2WX\7\24\2\2XY\7\f\2\2YZ\7\31\2\2Z\\\7"+
		"\16\2\2[W\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\23\2\2^\r\3\2\2\2_`\7\20\2"+
		"\2`a\7\13\2\2ab\7\30\2\2bc\7\b\2\2ch\7\30\2\2de\7\b\2\2eg\7\30\2\2fd\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\6\2\2l\17"+
		"\3\2\2\2mn\7\27\2\2no\7\13\2\2op\7\30\2\2pq\7\6\2\2qr\7\16\2\2r\21\3\2"+
		"\2\2\t\31!FOU[h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}