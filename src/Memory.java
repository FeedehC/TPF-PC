public class Memory {
	//Private Class Fields
	private int totalSlots;
	private int availableSlots;

	//Constructor
	public Memory(int slots) {
		this.totalSlots = slots;
		this.availableSlots = slots;
	}

	//Public Methods
	public int getAvailableSlots() {
		return availableSlots;
	}
	
	public int getTotalSlots() {
		return totalSlots;
	}

	public void writeInMemory() {
		if(this.availableSlots > 0) {
			availableSlots--;
		}
		else {
			//THROW EXCEPTION CUSTOM
		}
	}
}