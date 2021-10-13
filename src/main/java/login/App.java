package login;

import java.io.FileInputStream;
import java.util.Properties;

public class App {
	public boolean userLogin(String user,String pass) throws Exception{
		Properties prop =new Properties();
		prop.load(new FileInputStream("src/main/resources/credentials.property"));
		String un=prop.getProperty("username");
		String ps=prop.getProperty("password");
		
		if(un.equals(user)&&ps.equals(pass)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
