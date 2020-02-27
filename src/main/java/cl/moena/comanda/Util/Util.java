package cl.moena.comanda.Util;
import java.io.InputStream;
import java.util.Properties;

public class Util {
		 public static Properties getProperties(String file){
		        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		            Properties prop = new Properties();
		            try{
		                InputStream in = classLoader.getResourceAsStream(file);
		                prop.load(in);
		                in.close();
		            }
		            catch(Exception e){
		                e.printStackTrace();
		            }
		            return prop;
		    }
	}

