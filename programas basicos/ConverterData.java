package slls;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class ConverterData {

	public static void main(String[] args) throws IOException {

		String date = "02/12/2004";
		DateFormat data = DateFormat.getInstance();
		try {
			Date da = (Date) data.parse(date);
		} catch (ParseException ex) {
			ex.getStackTrace();
		}
		System.out.println(date);
		
	}
}
