package stdOOP;

public class personn {
	String name;
	int tuoi;
	float high;
	
	public personn(String name, int tuoi, float high) {
		this.name= name;
		this.tuoi=tuoi;
		this.high=high;
		System.out.println(this.name);
	    System.out.println(this.tuoi);
	    System.out.println(this.high);
	}


 public static void main(String[]args) {
	 personn a = new personn("Hung", 21, 1.8f);
	 personn b =new personn("Nhi", 18, 1.55f);

 //	 a.name= "Nhi";
//	 a.tuoi=18;
//	 a.high=1.55f;
//	 System.out.println(a.name);
//	 System.out.println(a.tuoi);
//	 System.out.println(a.high);
	 }
}
	 
 