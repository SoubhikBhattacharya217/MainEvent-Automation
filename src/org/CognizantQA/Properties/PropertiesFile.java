package org.CognizantQA.Properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop;
	public static void loadData() throws Exception {
		prop = new Properties();
		String configPath = "./src/org/CognizantQA/Properties/config.properties";
		File file = new File (System.getProperty("user.dir")+configPath);
		FileReader read = new FileReader(file);
		prop.load(read);
	}
	
	public static String getDataFromProperty (String key) throws Exception {
		loadData();
		String propData = prop.getProperty(key);
		return propData;
	}
}
