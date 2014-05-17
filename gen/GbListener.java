// Generated from /Users/Heiti/Documents/Dropbox/Kool/ATK/Projekt/Gb.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GbParser}.
 */
public interface GbListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GbParser#tyyp}.
	 * @param ctx the parse tree
	 */
	void enterTyyp(@NotNull GbParser.TyypContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#tyyp}.
	 * @param ctx the parse tree
	 */
	void exitTyyp(@NotNull GbParser.TyypContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#joonista}.
	 * @param ctx the parse tree
	 */
	void enterJoonista(@NotNull GbParser.JoonistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#joonista}.
	 * @param ctx the parse tree
	 */
	void exitJoonista(@NotNull GbParser.JoonistaContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#lause}.
	 * @param ctx the parse tree
	 */
	void enterLause(@NotNull GbParser.LauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#lause}.
	 * @param ctx the parse tree
	 */
	void exitLause(@NotNull GbParser.LauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#lausetejada}.
	 * @param ctx the parse tree
	 */
	void enterLausetejada(@NotNull GbParser.LausetejadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#lausetejada}.
	 * @param ctx the parse tree
	 */
	void exitLausetejada(@NotNull GbParser.LausetejadaContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(@NotNull GbParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(@NotNull GbParser.ProgrammContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#lisamine}.
	 * @param ctx the parse tree
	 */
	void enterLisamine(@NotNull GbParser.LisamineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#lisamine}.
	 * @param ctx the parse tree
	 */
	void exitLisamine(@NotNull GbParser.LisamineContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#objekt}.
	 * @param ctx the parse tree
	 */
	void enterObjekt(@NotNull GbParser.ObjektContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#objekt}.
	 * @param ctx the parse tree
	 */
	void exitObjekt(@NotNull GbParser.ObjektContext ctx);

	/**
	 * Enter a parse tree produced by {@link GbParser#lauadeklaratsioon}.
	 * @param ctx the parse tree
	 */
	void enterLauadeklaratsioon(@NotNull GbParser.LauadeklaratsioonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GbParser#lauadeklaratsioon}.
	 * @param ctx the parse tree
	 */
	void exitLauadeklaratsioon(@NotNull GbParser.LauadeklaratsioonContext ctx);
}