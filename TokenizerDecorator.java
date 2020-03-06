package lab9;

public abstract class TokenizerDecorator implements Tokenizer{

	public WordTokenizer wordTokenizer;
	public TokenizerDecorator(WordTokenizer wordTokenizer) {
		
		this.wordTokenizer = wordTokenizer;
	}
	public String getNext() {
		
		return this.wordTokenizer.getNext();
	}
}
