/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.items.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.items.parser.antlr.internal.InternalItemsParser;
import org.xtext.example.items.services.ItemsGrammarAccess;

public class ItemsParser extends AbstractAntlrParser {

	@Inject
	private ItemsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalItemsParser createParser(XtextTokenStream stream) {
		return new InternalItemsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ItemModel";
	}

	public ItemsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ItemsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
