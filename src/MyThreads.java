import Jama.Matrix;

public class MyThreads {

	//Private Class Fields
	private Matrix firingVector;
	private Matrix matrix;
	private TaskThread taskThread;
	private ArrivalThread arrivalThread;
	private MemoryThread memoryThread;
	private Monitor monitor;
	private MyThreadFactory myThreadFactory;

	public MyThreads() {
		//TODO
	}

	//Public Methods
	public Matrix getFiringVector() {
		//Meant to be override
		return firingVector;
	}

	public void setFiringVector() {
		//Meant to be override
	}
}