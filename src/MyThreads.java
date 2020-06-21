import Jama.Matrix;

public abstract class MyThreads extends Thread {

	//Private Class Fields
	private Matrix firingVector;
	private Monitor monitor;
	
	//Public methods	
	//Setters
	public void setFiringVector(Matrix firingVector) {
		this.firingVector = firingVector;
	}

	//Getters
	public Matrix getFiringVector() {
		return firingVector;
	}
}