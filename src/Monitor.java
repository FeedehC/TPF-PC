import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Monitor {
	//Private Class Variables
	private boolean taskResource, processor1, processor2;
	private Memory memory1, memory2;
	private Matrix incidence;
	private ArrayList<Semaphore> arraySemaphores;
	private Politic politic;
	private Semaphore processQueue, queueP1, queueP2;
	private Executor Pool1, Pool2;

	//Constructor
	public void Monitor() {
		//TODO
	}

	//Public Methods
	public void tryFiring(Matrix firingVector) {
		//TODO
	}
}