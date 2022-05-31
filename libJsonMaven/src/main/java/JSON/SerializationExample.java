package JSON;

import javax.xml.XMLConstants;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class SerializationExample {
	
  public static void main(final String[] args) {

    User user = new User(1L, "lokesh", "gupta");

    Gson gson = new GsonBuilder()
      .setPrettyPrinting()
      .create();

    String jsonString = gson.toJson(user);

    //XMLConstants ctes;
    
    System.out.println(jsonString);
  }
}
