import java.io.IOException;
import java.util.concurrent.ThreadFactory;

public class MainLauncher {

	//Class constans

	//Class variables
	public static Monitor monitor;
	public static MyThreadFactory TFactory;
	public static Log myLog;
	public static String logName = "ReportLog.txt";		//The name of the log file. FJC

	//Public methods
	public static void main(String args[])
	{
		monitor = new Monitor(); //Instantiating the singleton monitor.
		TFactory = new MyThreadFactory(monitor, 1, 1, 1); //(1,8,2); 			//Instantiating a Thread Factory.
		 						

		try {
			myLog = new Log(logName);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}