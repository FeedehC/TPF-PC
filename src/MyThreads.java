public class MyThreads {
	//Private Class Fields
	private Matrix firingVector;
	private Matrix matrix;
	private TaskThread taskThread;
	private ArrivalThread arrivalThread;
	private MemoryThread memoryThread;
	private Monitor monitor;
	private MyThreadFactory myThreadFactory;


	//Public Methods
	public Matrix getFiringVector() {
		//Meant to be override
	}
	public void setFiringVector() {
		//Meant to be override
	}

}
