import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Monitor {
	//Private Class Variables
	private boolean taskResource;
	private boolean processor1;
	private boolean processor2;
	private Memory memory1;
	private Memory memory2;
	private Matrix incidence;
	private ArrayList<Semaphore> arraySemaphores;
	private Politic politic;
	private Semaphore processQueue;
	private Semaphore queueP1;
	private Semaphore queueP2;
	private Executor Pool1;
	private Executor Pool2;

	//Constructor
	public void Monitor(){
	}

	//Public Methods
	public void tryFiring(Matrix firingVector) {
	}

}
