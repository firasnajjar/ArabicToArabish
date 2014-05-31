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
		case '�':
			return "a";
			
		case '�':
			return "a";
			
		case '�':
			return "b";
			
		case '�':
			return "t";
			
		case '�':
			return "th";
			
		case '�':
			return "j";

		case '�':
			return "7";

		case '�':
			return "5";

		case '�':
			return "d";

		case '�':
			return "th";

		case '�':
			return "r";

		case '�':
			return "z";

		case '�':
			return "s";

		case '�':
			return "sh";

		case '�':
			return "s";

		case '�':
			return "d";

		case '�':
			return "6";

		case '�':
			return "th";

		case '�':
			return "3";

		case '�':
			return "gh";

		case '�':
			return "f";

		case '�':
			return "q";

		case '�':
			return "k";

		case '�':
			return "l";

		case '�':
			return "m";

		case '�':
			return "n";

		case '�':
			return "h";

		case '�':
			return "w";

		case '�':
			return "y";

		case '�':
			return "2";

		case '�':
			return "2";

		case '�':
			return "2";

		case '�':
			return "ah";

		case '�':
			return "a";
			
		case '�':
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
