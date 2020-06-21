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
	private Matrix markingVector;
	private ArrayList<Semaphore> arraySemaphores;
	private Semaphore processQueue;
	private Semaphore queueP1;
	private Semaphore queueP2;
	private double[] delaysAlpha;
	private double[] timeoutsBetha;
	private Politic politic;
	private MyThreads myThreads;
	private Memory memory;
	private Log log;

	//Constructor
	public void Monitor() {
		double[][] i = {{0,1,0,0,0,-1,0},
						{-1,-1,1,0,0,0,0},
						{0,0,-1,1,0,0,0},
						{0,0,1,-1,0,0,0},
						{1,0,0,0,-1,0,0},
						{0,0,0,0,1,1,-3},
						{0,0,0,0,-1,-1,3},
						{1,1,-1,0,0,0,0},
						{-1,-1,0,0,1,1,0}};
		
		incidence = new Matrix(i); //9 plazas x 7 transiciones
		
		double [] mV = {0,0,0,1,0,0,3,2,1};
		
		markingVector = new Matrix(mV,1);
	}

	//Public Methods
	public void tryFiring(Matrix firingVector) {
		//TODO
	}
}