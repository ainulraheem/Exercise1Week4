import SemuaCircle.Circle; //import specific class from package

public class DriverCircle {

	 public static void main(String[] args){
	 	//object or referance
	 	//Circle bulat, bulat1, bulat2, bulat3;
	 	Circle bulat = new Circle(); //default constructor
	 	System.out.println("Print apa? " + bulat); //call method to String

	 	Circle bulat1 = new Circle(76); //Instantiate object - overloading  constructor 1 parameter
	 	System.out.println("Print apa? " + bulat1); //call method to String

	 	Circle bulat2 = new Circle(8, 3); //Instantiate object - overloading  constructor 2 parameter
	 	System.out.println("Print apa? " + bulat2); //call method to String

		Circle bulat3 = new Circle(8, 3); //Instantiate object - overloading  constructor 2 parameter
	 	System.out.println("Print apa? " + bulat3); //call method to String

	 	System.out.println("Ukurlilit = " + UkurLilit(bulat3.getJejari()));

		System.out.println("Ukurlilit = " + Circle.UkurLilit(bulat3.getJejari()));;

		System.out.println("Luas ialah " + KiraLuas(bulat2));

		//Method call
		System.out.println("Paparkan output : " + Papar());

	 	// //string is a referance
	 	// String s = "DITP3113";
	 	// System.out.println(s);

	 	
	 	// System.out.println(bulat1);
	 	// System.out.println(bulat2);

		// System.out.println("Jejari bulat1 = " + bulat1.getJejari());	 	
		// System.out.println("Jejari bulat = " + bulat.getJejari());	 	

		// bulat2.setJejari(35);
		// System.out.println("Jejari bulat2 = " + bulat2.getJejari()); //field class value	 	

		// bulat2.setJejari(7);
		// System.out.println("Jejari bulat2 = " + bulat2.getJejari()); //field class value	 	

		// bulat2.setJejari(50);
		// System.out.println("Jejari bulat2 = " + bulat2.getJejari()); //field class value	 	


		// System.out.format("Luas ialah %2.2f" , bulat.KiraLuas());
	}

	//static method that will return a referance
	public static Circle Papar() {
		int j = 5;
		return new Circle(j); //object
	}

	//call by referance static method that accept object as its parameter
	public static double KiraLuas(Circle b) {
		return b.getJejari() * b.getJejari() * Math.PI;
	}

	public static double UkurLilit(double jejari) {
		return 2 * Math.PI * jejari; //Math.pow(2,3)
	}


}