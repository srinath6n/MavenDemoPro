package definitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CvtAttrib {
	
	static JSONParser parser = new JSONParser();
	
	static Object Obj;
	
	static JSONObject JObj;
	
	public static String SData(String sdata) throws FileNotFoundException, IOException, ParseException
	{
		Obj = parser.parse(new FileReader("C:\\Users\\SAMURAI-JACK\\eclipse-workspace\\MavenDemoPro\\src\\test\\java\\definitions\\allPages.JSON"));

		JObj = (JSONObject) Obj;
		
		return (String) JObj.get(sdata);
	
	}
}