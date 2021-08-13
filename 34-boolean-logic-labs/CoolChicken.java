public class CoolChicken{
	private String name;
	private int wing;
	private double speed;

	public CoolChicken(double c, int b, String a){
		name = a;
		wing = b;
		speed = c;
	}

	public double maxSpeed(){
		return speed * wing;
	}

	public boolean isCool(){
		return maxSpeed() > 1000 && name.indexOf("cool") != -1;
	}

	public String toString(){
		return "Name: " + name + '\n' + "Wing Count: " + wing + '\n' + "Speed: " + speed;
	}
}