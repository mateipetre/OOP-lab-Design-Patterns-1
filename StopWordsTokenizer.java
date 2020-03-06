package lab9;
import java.util.*;

public class StopWordsTokenizer extends TokenizerDecorator{

	LinkedList<String> eliminatedWords;
	public StopWordsTokenizer(WordTokenizer wordTokenizer, LinkedList<String> eliminatedWords) {
		super(wordTokenizer);
		this.eliminatedWords = eliminatedWords;
	}
	public String getNext() {
		
		String token = this.wordTokenizer.getNext();
		if(!eliminatedWords.contains(token)) 
			return token;
		else
			token = this.wordTokenizer.getNext();	
		return null;
	}
}
