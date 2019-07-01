package Verify;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.CognizantQA.Properties.PropertiesFile;

public class insertintoLOGfile {
	public static void InsertToLog(String mssg) throws Exception {
		PropertiesFile objProperties = new PropertiesFile(); 
		String logfilepath=objProperties.getDataFromProperty("Logtxtfile");
		Date objdate=new Date();
		SimpleDateFormat objFormat=new SimpleDateFormat("E, dd_MM_yyyy'_' hh_mm_ss z");
		String objNewFormat=objFormat.format(objdate);
		try
		{
			File fw=new File(logfilepath);
			if(!(fw.exists()))
			{
				fw.createNewFile();
			}
			FileWriter fr=new FileWriter(fw);
			try(BufferedWriter br=new BufferedWriter(fr))
			{
				br.newLine();
				br.write(objNewFormat);
				br.newLine();
				br.write(mssg);
				br.newLine();
				br.write("---------------------------------");
				br.close();
			}
		       
        }catch(Exception ex)
        {
              System.out.println("Exception occured while writing into log file" + "\n" + ex.toString());              
        }           

		}
	}
        
           
