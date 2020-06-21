import Jama.Matrix;

public class MemoryThread extends Thread {
    //Class constants
    private Matrix firingVector;
    private Monitor monitor;
    //Class variables

    //Constructor
    public MemoryThread(Monitor monitor){ //}, Matrix firingVector ) {
        //TODO
        this.monitor = monitor;
        //this.firingVector = firingVector;
    }
    //Setters
    public void setFiringVector(Matrix firingVector) {
		this.firingVector = firingVector;
	}

	//Getters
	public Matrix getFiringVector() {
		return firingVector;
	}
    @Override
    public void run() {
        //TODO
    }
}