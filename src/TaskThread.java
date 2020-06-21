import Jama.Matrix;

public class TaskThread extends Thread {

    //Class constants
   
    //Class variables
    private Matrix firingVector;
	private Monitor monitor;

    //Constructor
    public TaskThread(Monitor monitor){//}, Matrix firingVector) {
        this.monitor = monitor;
        //this.firingVector = firingVector;
    }

    //Public methods
    public void setFiringVector(Matrix firingVector) {
		this.firingVector = firingVector;
	}

	//Getters
	public Matrix getFiringVector() {
		return firingVector;
	}
    
    @Override
    public void run() {
        //TODO monitor.tryFiring(firingVector);
    }
}