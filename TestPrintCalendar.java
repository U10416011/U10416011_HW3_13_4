//U10416011 謝秉瑾
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestPrintCalendar {
	public static void main(String[] args) {
		PrintCalendar PC = new PrintCalendar(); 
		Calendar calendar = new GregorianCalendar();
	    
	    int month;
	    int year;
	    if (args.length == 1) { //if it only has month 
            year = calendar.get(Calendar.YEAR);
            month = Integer.parseInt(args[0]);
        } else if(args.length == 0){ //if it does not has month and year
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
        }
        else { //if it has month and year
	    	year = new Integer(args[1]);
            month = Integer.parseInt(args[0]);
	    }
	    
	    
	    // Print calendar for the month of the year
	    PC.printMonth(year, month);
	  }
}
