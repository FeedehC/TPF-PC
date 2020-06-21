import Jama.Matrix;

public class TaskThread extends Thread {
    //Class constants
   
    //Class variables
    private Matrix firingVector;
	private Monitor monitor;

    //Constructor
    public TaskThread(Monitor monitor){//}, Matrix firingVector) {
        this.monitor = monitor;
        double[] fV = {1, 1, 0, 0, 0, 0, 0};
        Matrix mfV = new Matrix(fV,7); //coloco 7 porque quiero 7 filas, es decir un vector parado
        this.setFiringVector(mfV);
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