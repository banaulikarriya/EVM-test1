package evm;

public class TotalButton extends Button {

	@Override
	public void button_press() {
		// TODO Auto-generated method stub
		if(state==0)
		{
			state=1;
			System.out.println("button is press");
		}
		else
		{
			state=0;
			System.out.println("button not press");
		}
		
	}

}
