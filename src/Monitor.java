import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import Jama.*;

public class Monitor {
	//Private Class Fields
	private boolean taskResource;
	private boolean processor1;
	private boolean processor2;
	private Memory memory1;
	private Memory memory2;
	private Matrix incidence;
	private ArrayList<Semaphore> arraySemaphores;
	private Semaphore processQueue;
	private Semaphore queueP1;
	private Semaphore queueP2;
	private double[] delaysAlpha;
	private double[] timeoutsBetha;
	private Politic politic;
	private Semaphore semaphore;
	private MyThreads myThreads;
	private Memory memory;
	private Log log;

	//Constructor
	public void Monitor(){
	}

	//Public Methods
	public void tryFiring(Matrix firingVector) {
	}

}
