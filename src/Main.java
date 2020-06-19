import java.io.IOException;

public class Main {
    //Class Constants

    //Class Variables
    public static Monitor monitor;
    public static ThreadFactory TFactory;
    public static Log myLog;
    public static String logName = "ReportLog.txt";		//The name of the log file. FJC

    //Public Methods
    public static void main(String args[])
    {
        TFactory = new ThreadFactory(); //Instantiating a Thread Factory
        monitor = new Monitor(); //Instantiating the singleton Monitor

        try
        {
            myLog = new Log(logName);
        }
        catch(IOException e) { e.printStackTrace(); }
    }
}
