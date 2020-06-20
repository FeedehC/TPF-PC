import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Log {
	//Private class fields
	private File f;
	private FileHandler FH;
	private Logger logger;

	//Constructor
	public Log(String fileName) throws SecurityException, IOException {
		f = new File(fileName);

		if(!f.exists()) {
			f.createNewFile();
		}

		FH = new FileHandler(fileName,true);
		
		SimpleFormatter formatter = new SimpleFormatter();
		
		FH.setFormatter(formatter);

		//LLAMAR A WRITELOG()
	}

	//Public Methods
	public void writeLog() {
		logger = Logger.getLogger("ReportTest");
		logger.addHandler(FH);
		logger.setLevel(Level.INFO);

		//DECIRLE QUE COSA TIENE QUE LOGUEAR PERO EN INGLISH

		//Message shown before ending program.
		logger.info("------------------------------------------------------------------------------");
		logger.info("END OF LOG: ");
		logger.info("------------------------------------------------------------------------------");

		System.out.println("");
	}
}