package mathema;

public class Vector {
	
	// FIELDS
	
	private double x;
	private double y;
	private double z;
	
	// CONSTRUCTORS
	
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// METHODS
	
	// allows vectors to be printed as a string in angle bracket notation
	public String toString() {
		return String.format("<%f, %f, %f>", x, y, z);
	}
	
	// returns the magnitude of a vector
	public double magnitude() {
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2)+Math.pow(this.z, 2));
	}
	
	// returns the unit vector of a vector 
	public Vector unitVector() {
		return this.scalarMultiple(1 / this.magnitude());
	}
	
	// returns the sum of two vectors
	public Vector add(Vector v) {
		return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
	}
	
	// returns parallel vector multiplied by s
	public Vector scalarMultiple(double s) {
		return new Vector(s * this.x, s * this.y, s * this.z);
	}
	
	// returns the dot product of two vectors
	public double dot(Vector v) {
		return (this.x * v.x)+(this.y * v.y)+(this.z * v.z);
	}

	public static void main(String[] args) {
		Vector v = new Vector(1, 2, 3);
		Vector w = new Vector(2, 4, 6);
		System.out.println(v.add(w));
		System.out.println(v.dot(w));
		System.out.println(v.magnitude());
		System.out.println(v.unitVector());
	}
}
