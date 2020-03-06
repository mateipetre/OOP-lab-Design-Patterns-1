package lab9;
import java.util.*;

public class TokenizerFactory {

	public TokenizerFactory() {
		
	}
	public TokenizerDecorator create(String type, LinkedList<String> list, WordTokenizer wordTokenizer) {
		
	    TokenizerDecorator tokenizer = null;
		if(type.equals("char"))
			tokenizer = new CharacterTokenizer(wordTokenizer);
		else if(type.equals("lowercase"))
			tokenizer = new LowerCaseTokenizer(wordTokenizer);
		else if(type.equals("stopwords"))
			tokenizer = new StopWordsTokenizer(wordTokenizer, list);
		return tokenizer;
	}

}
