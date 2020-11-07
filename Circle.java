package SemuaCircle; //create package here
//java.sum.com ---> pakage com.sum.java (reversed)

public class Circle {
	//field or attribute
	private double jejari, x;
	public static int bilObjekWujud = 0; //static field

	//default constructor
	 public Circle(){
	 	// System.out.println("Default constructor dipanggil.");
	 	jejari = 1;
	 	x = 5;
	 	bilObjekWujud++;
	 }

	//overloading constructor 1 parameter
	public Circle(double jejari){
		// this();//panggil default constructor
		 this.jejari = jejari;
		 x = 5;
		// this(jejari, 59); //panggil constructor 2 parameter
		bilObjekWujud++;
	}

	//overloading constructor 2 parameter
	public Circle (double jejari, double x) {
	 	this.jejari = jejari;
	 	this.x = x;
	 	bilObjekWujud++;
	 }


	//overload method to String
	public String toString() {
		String tentangCircle;
		tentangCircle = "Bil objek ialah " + bilObjekWujud;
		// tentangCircle = "Jejari = " + jejari
		// +"\nx = " + x
		// + "\nLuas adalah " + KiraLuas();
		return tentangCircle;

	}


	//setter atau mutator
	public void setJejari(double jejari) {
		this.jejari = jejari; //kiri ialah field, kanan ialah parameter
		// System.out.println(jejari);
	}

	//getter atau accessor
	public double getJejari(){
		return jejari;
	}

	//method
	public double KiraLuas(){
		return getJejari() * getJejari() * Math.PI;
	}

	public static double UkurLilit(double jejari) {
		return 2 * Math.PI * jejari;
	}

	////////////////////////////////////////////////
	// //default constructor
	//  public Circle(){
	//  	// System.out.println("Default constructor dipanggil.");
	//  	jejari = 1;
	//  	x = 5;
	//  }

	// //overloading constructor 1 parameter
	// public Circle(double jejari){
	// 	this.jejari = jejari;
	// 	// System.out.println("Jejari = " + jejari);
	// }

	// //overloading constructor 2 parameter
	// public Circle (double r, String s) {
	//  	jejari = r;
	//  	// System.out.println("Jejari = " + jejari + " String = " + s);
	//  }



}