public class MyThreadFactory {
	
	Monitor monitor;

	//Private Class Fields
	
	//Constructor
	/*
	 *	@param	arrivalTh:	Cantidad de arrival threads a crear.
	 *			taskTh: 	Cantidad de task threads a crear.
	 *			memoriesTh: Cantidad de memory threads a crear.
	 */
	public MyThreadFactory(Monitor monitor, int arrivalTh, int taskTh, int memoriesTh) {
		this.monitor = monitor;

		for(int i=0; i<arrivalTh; i++) {
			createArrivalThread();
		}

		for(int i=0; i<taskTh; i++) {
			createTaskThread();
		}

		for(int i=0; i<memoriesTh; i++) {
			createMemoryThread();
		}
	}

	//Public Methods
	public void createArrivalThread() {
		ArrivalThread t = new ArrivalThread(monitor);
		//t.setFiringVector(firingVector);
		t.start();
	}

	public void createTaskThread() {
		TaskThread t = new TaskThread(monitor);
		//t.setFiringVector(firingVector);
		t.start();
	}	

	public void createMemoryThread() {
		MemoryThread t = new MemoryThread(monitor);
		t.start();
	}
}