package evm;

public class BusyLamp extends Lamp{

	@Override
	public void lamp_glow() {
		// TODO Auto-generated method stub
		if(lamp =="off")
		{
			lamp ="off";
			System.out.println("lamp is on");
		}
		else
		{
			System.out.println("lamp is off");
		}
	}

}
