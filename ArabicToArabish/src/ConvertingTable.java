import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Firas Najjar
 *
 */
public class ConvertingTable {
	private static ConvertingTable convertingTable = null;
	private static HashMap<Character, String> convertingHashMap = new HashMap<Character,String>();
	
	public static ConvertingTable getInstance(){
		if(convertingTable == null)
			convertingTable = new ConvertingTable();
		
		return convertingTable;
	}
	
	public String getConvertedChar(char character){
		switch (character) {
		case 'Ç':
			return "a";
			
		case 'Ã':
			return "a";
			
		case 'È':
			return "b";
			
		case 'Ê':
			return "t";
			
		case 'Ë':
			return "th";
			
		case 'Ì':
			return "j";

		case 'Í':
			return "7";

		case 'Î':
			return "5";

		case 'Ï':
			return "d";

		case 'Ð':
			return "th";

		case 'Ñ':
			return "r";

		case 'Ò':
			return "z";

		case 'Ó':
			return "s";

		case 'Ô':
			return "sh";

		case 'Õ':
			return "s";

		case 'Ö':
			return "d";

		case 'Ø':
			return "6";

		case 'Ù':
			return "th";

		case 'Ú':
			return "3";

		case 'Û':
			return "gh";

		case 'Ý':
			return "f";

		case 'Þ':
			return "q";

		case 'ß':
			return "k";

		case 'á':
			return "l";

		case 'ã':
			return "m";

		case 'ä':
			return "n";

		case 'å':
			return "h";

		case 'æ':
			return "w";

		case 'í':
			return "y";

		case 'Ä':
			return "2";

		case 'Á':
			return "2";

		case 'Æ':
			return "2";

		case 'É':
			return "ah";

		case 'ì':
			return "a";
			
		case 'Å':
			return "i";


		default:
			return "";
		}
//		if (convertingHashMap.get(character) != null) {
//			return convertingHashMap.get(character);
//		}else{
//			return new String();
//		}
	}
	
	private ConvertingTable() {
		File convertingFile = new File("C:\\Users\\Firas Najjar\\Software\\src\\convertingTable.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(convertingFile));
			
			String line = null;  
			while ((line = br.readLine()) != null)  
			{  
				//TODO I should check nulls I know.. I don't wanna do it right now
				convertingHashMap.put(line.charAt(0), line.split(" ")[1]);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(br != null)
					br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
