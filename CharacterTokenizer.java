package lab9;

public class CharacterTokenizer extends TokenizerDecorator{

	public int index = 0;
	public CharacterTokenizer(WordTokenizer wordTokenizer) {
		
		super(wordTokenizer);
	}
	public String getNext() {
		
		String letter = new String();
		String memorator = wordTokenizer.getNext();
		if(memorator.isEmpty()) {
			memorator = wordTokenizer.getNext();
		    index = 0;
			letter = letter + memorator.charAt(index);
		}
		else {
			letter = letter + memorator.charAt(index);
			index++;
		}
	return letter;
	}
}
