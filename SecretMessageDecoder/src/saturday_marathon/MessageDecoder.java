package saturday_marathon;

public class MessageDecoder {

	public static void main(String[] args) {
		MessageDecoder decoder = new MessageDecoder();
        System.out.println(decoder.decodeCharacter('A'));
	}
	public int decodeCharacter(char ch) {
		return (int) ch;
	}

}