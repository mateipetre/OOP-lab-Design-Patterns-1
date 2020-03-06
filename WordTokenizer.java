package lab9;

public class WordTokenizer implements Tokenizer {

	public String string;
	public WordTokenizer(String string) {
		
		this.string = string;
	}
	public String getNext() {
		
		if(this.string.contains(" ")) 
			this.string = this.string.substring(0, this.string.indexOf(" "));
		return this.string;
	}
}
