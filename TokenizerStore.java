package lab9;
import java.util.*;

public class TokenizerStore {

	public TokenizerStore() {
		
	}

	public static void main(String[] args) {
		
		TokenizerFactory tokenizerFactory = new TokenizerFactory();
		LinkedList<String> listOfWords = new LinkedList<>();
		listOfWords.add("copil");
		listOfWords.add("parinte");
		listOfWords.add("baiat");
		WordTokenizer tokenizer = new WordTokenizer("SALUT copil cuminte");
		TokenizerDecorator tokenizer1 = tokenizerFactory.create("lowercase", listOfWords, tokenizer);
		TokenizerDecorator tokenizer2 = tokenizerFactory.create("stopwords", listOfWords, tokenizer);
		TokenizerDecorator tokenizer3 = tokenizerFactory.create("char", listOfWords, tokenizer);
		System.out.println(tokenizer1.getNext());
		System.out.println(tokenizer2.getNext());
		System.out.println(tokenizer3.getNext());
	}

}
