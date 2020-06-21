import Jama.Matrix;

public class ArrivalThread extends Thread {
    
    //Private Class Fields
	private Matrix firingVector;
    private Monitor monitor;
    private int currentPlace;

    //Constructor
    /*
     *  @param  monitor: Monitor a asociar para controlar concurrencia.
     */
    public ArrivalThread(Monitor monitor) {//, Matrix firingVector) {
        this.monitor = monitor;
        //this.firingVector = firingVector;
        this.currentPlace = 0; //Inicio en la plaza P0.
        double[] fV = {1, 0, 0, 0, 0, 0, 0};
        Matrix mfV = new Matrix(fV,7); //coloco 7 porque quiero 7 filas, es decir un vector parado
        this.setFiringVector(mfV);
    }
	
    //Public methods
    
    //Setters
    /*
     *  @param  firingVector: Nuevo vector de transiciones sensibilizadas.
     */
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