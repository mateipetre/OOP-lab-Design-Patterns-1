package lab9;

public class LowerCaseTokenizer extends TokenizerDecorator{

	public LowerCaseTokenizer(WordTokenizer wordTokenizer) {
		
		super(wordTokenizer);
	}
	public String getNext() {
		
		return this.wordTokenizer.getNext().toLowerCase();
	}
}
