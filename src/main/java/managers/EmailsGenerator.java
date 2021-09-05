package managers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EmailsGenerator {
	
	private static final String FILE_PATH = "Email.txt";
	private static final String MAIL_PATTERN = "TestAutomation100@Gmail.com:";
	
	public static String getNextEmail() {
		int index = 0;
		String mail = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			String line = br.readLine();
			
			//TestAutomation100@Gmail.com:500
			
			String[] mailArr = line.split(":");
			mail = mailArr[0];
			index = Integer.parseInt(mailArr[1]);
			
			int atIndex = mail.indexOf("@");
			mail = mail.substring(0, atIndex) + ++index + mail.substring(atIndex); // TestAutomation101@Gmail.com
		} catch (IOException e) {
			// logger
		}
		
		try (PrintWriter writer = new PrintWriter(FILE_PATH, "UTF-8")) {
		    writer.println(MAIL_PATTERN + index);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// logger
		}
		
		return mail;
	}
	
}
