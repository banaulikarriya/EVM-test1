package evm;

public abstract class Button {

	int state=0;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public abstract void button_press();
	
}
