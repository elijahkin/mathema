public class Vector {
	
	// FIELDS
	private double x;
	private double y;
	private double z;
	public static boolean useRadians = true;
	
	// CONSTRUCTORS
	// constructor for 2 dimensions
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
		this.z = 0.0;
	}
	
	// constructor for 3 dimensions
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
	
	// returns the difference of two vectors
	public Vector subtract(Vector v) {
		return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
	}
	
	// returns parallel vector multiplied by s
	public Vector scalarMultiple(double s) {
		return new Vector(s * this.x, s * this.y, s * this.z);
	}
	
	// returns the dot product of two vectors
	public double dot(Vector v) {
		return (this.x * v.x)+(this.y * v.y)+(this.z * v.z);
	}
	
	// returns whether two vectors are equal
	public boolean equals(Vector v) {
		return (this.x == v.x) && (this.y == v.y) && (this.z == v.z);
	}
	
	// returns whether two vectors are parallel
	public boolean parallel(Vector v) {
		return (this.unitVector().equals(v.unitVector())) || (this.unitVector().equals(v.scalarMultiple(-1).unitVector()));
	}
	
	// returns whether two vectors are orthogonal
	public boolean orthogonal(Vector v) {
		return this.dot(v) == 0;
	}
	
	// returns the angle between two vectors
	public static double angleBetween(Vector v, Vector w) {
		if (useRadians) {
			return Math.acos((v.dot(w))/(v.magnitude() * w.magnitude()));
		}
		else {
			return Math.acos((v.dot(w))/(v.magnitude() * w.magnitude())) * (180/Math.PI);
		}
	}
}
