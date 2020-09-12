
public class Vector {
	
	// fields
	private double x;
	private double y;
	private double z;
	
	// constructors
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// methods
	public String toString() {
		return String.format("<%f, %f, %f>", x, y, z);
	}
	
	public double magnitude() {
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2)+Math.pow(this.z, 2));
	}
	
	public Vector add(Vector v) {
		return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
	}
	
	public double dot(Vector v) {
		return (this.x * v.x)+(this.y * v.y)+(this.z * v.z);
	}

	public static void main(String[] args) {
		Vector v = new Vector(1, 2, 3);
		Vector w = new Vector(2, 4, 6);
		System.out.println(v.add(w));
		System.out.println(v.dot(w));
		System.out.println(v.magnitude());
	}
}
