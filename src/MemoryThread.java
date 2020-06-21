import Jama.Matrix;

public class MemoryThread extends Thread {
    //Class constants
    private Matrix firingVector;
    private Monitor monitor;
    //Class variables

    //Constructor
    public MemoryThread(Monitor monitor) { //}, Matrix firingVector ) {
        this.monitor = monitor;
        double[] fV = {0, 0, 0, 0, 0, 0, 0};
        Matrix mfV = new Matrix(fV,7); //coloco 7 porque quiero 7 filas, es decir un vector parado
        this.setFiringVector(mfV);
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