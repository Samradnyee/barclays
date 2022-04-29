import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Trade Transmission 
 * Date Create: 12/12/2020
 * @author Adarsh Biswal
 *
 */

public class tradeTransmissionMain {

	public static void main(String[] args) throws Exception {
		
		tradeFlow tf=new tradeFlow();
		Date todaysDate=Calendar.getInstance ().getTime ();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		
		Date maturityDate=sd.parse("20/05/2020");
		Trade t1=new Trade("T1",1,"CP-1","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t1);
		
		maturityDate=sd.parse("20/05/2021");
		Trade t2=new Trade("T2",2,"CP-2","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t2);
	
		Trade t4=new Trade("T2",1,"CP-1","B1",sd.parse("20/05/2021"), sd.parse("14/03/2015"), 'N');
		tf.addTrade(t4);
		
		
		maturityDate=sd.parse("20/05/2014");
		Trade t3=new Trade("T3",3,"CP-3","B2",maturityDate, todaysDate, 'Y');
		tf.addTrade(t3);
			
		
		tf.checkExpiredDates();
		tf.printTrade();
		
		

	}

}
