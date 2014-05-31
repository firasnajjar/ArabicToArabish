import java.io.File;


/**
 * 
 */

/**
 * @author Firas Najjar
 *
 * This classes is a converter from Arabic to Arabish
 * 
 * Although I am against using Arabish but I think it is needed in some cases.
 * The use case this was written for is for the names of songs where the media 
 * device doesn't support Arabic. This may happen in the car media player or 
 * any simple mp3 player. 
 * 
 */
public class Converter {
	public static void main(String[] args){
		String temp = "áãÇ ßäÊ ÕÛíÑÉ ãÑÉ Åãí ÍßÊáí ÇÑæÍ ÚäÏ ÇáÌÇÑÉ ÇÍßíáåÇ Çäæ Åãí ÈÏåÇ ÊÑæÍ ÚäÏåÇ ÊÈÇÑßáåÇ İí ÇÔí¡ ÓÃáÊåÇ áíÔ¡ ÍßÊáí: ÚÔÇä ÃÎáÕ ãä åÇáãÔæÇÑ¡ ÑÍÊ ÚäÏ ÇáÌÇÑÉ ŞáÊáåÇ Åãí ÈÏåÇ ÊíÌí ÚäÏß ÚÔ";
		
		System.out.println(Converter.convertText(temp));
	}

	public static String convertText(String arabicText){
		if (arabicText == null) {
			return null;
		}
		
		StringBuilder arabishStringBuilder = new StringBuilder();
		for (int i = 0; i < arabicText.length(); i++) {
			arabishStringBuilder.append(Converter.convertLetter(arabicText.charAt(i)));
		}
		
		return arabishStringBuilder.toString();
	}
	
	public static String convertFile(File arabicTextFile){
		return null;
	}
	
	
	private static String convertLetter(Character character){
		if(Character.isWhitespace(character)){
			return " ";
		}
		if(isArabicLetter(character))
			return ConvertingTable.getInstance().getConvertedChar(character);
		else
			return character.toString();
	}
	
	private static boolean isArabicLetter(char character){
		return character >= 0xfeff0621 || character <= 0xfeff064a;
	}
}
