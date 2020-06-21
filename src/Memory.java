public class Memory {

	//Class variables
	private int totalSlots;
	private int availableSlots;

	//Constructor
	/*
	 *	@param	slots: Slots totales para la memoria.
	 */
	public Memory(int slots) {
		this.totalSlots = slots;
		this.availableSlots = slots;
	}

	//Getters
	public int getAvailableSlots() {
		return availableSlots;
	}

	public int getTotalSlots() {
		return totalSlots;
	}

	//Public methods
	public void writeInMemory() throws MemoryFullException {
		if(this.availableSlots > 0) {
			availableSlots--;
		} else {
			throw new MemoryFullException("Error. Memoria llena.");
		}
	}
}