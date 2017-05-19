public abstract class Figura{ 
	protected double x; 
	protected double y; 
	
	public Figura (double x, double y) 
	{ 
		this.x = x; 
		this.y = y; 
	}

	public void verXY() {
		System.out.println("X: " + x + " Y: " + y);
	}

	public abstract double area (); 
} 