package stdOOP;

public class Person {
	String name;
	int age;
	float high;
	
	//pt khởi tạo
	public Person(String name, int age, float high) {
		this.name= name;//k có thí thì sẽ k biết name là name của class hay của phương thức
		this.age= age;  //this. sẽ của class, cái kia sau dấu bằng là của phương thức
		this.high= high; 
		System.out.println(this.name);
		 System.out.println(this.age);
		 System.out.println(this.high);
	}


	/*method phương thức
	Cú pháp:
   <Phạm vi truy cập> <từ khóa> <Kiểu dữ liệu trả về> <tên phương thức> ([Tham số]) {
        <Chương trình>
    }
	 */
	public void eat(String foodName) { 
		System.out.println(name+" is eating "+foodName);
	}
	/* Ta có phương thức eat(), có tham số truyền vào là biến foodName kiểu String.
	 *  Ta sẽ in ra màn hình tên của đối tượng Person ăn món có tên là foodName. 
	 *  Vì phương thức eat() không trả về giá trị gì, ta để từ khóa là void.*/
	
	public int getAge() {
		return age;
	}
	/*Ở phương thức getAge() là trả về tuổi của đối tượng. 
	Vì vậy ta chọn từ khóa là int vì biến age trong class thuộc kiểu int.
	 Rồi trong phương thức, ta return giá trị age của đối tượng về.*/

	
 public static void main(String[]args) {
	 Person a = new Person("Nhi", 18, 1.55f);
//	 a.name= "Nhi"; 
//	 a.age=18;
//	 a.high=1.55f;
//	 System.out.println(a.name);
//	 System.out.println(a.age);
//	 System.out.println(a.high);
	 a.eat("Rice");
	 /*Trong chương trình main. Sau khi khởi tạo đối tượng và gán giá trị cho các thuộc tính.
	  *  Ta thử chạy phương thức eat(), ta truyền vào giá trị “Rice” vào tham số. 
	  *  Như vậy, giá trị tham số foodName sẽ đại diện giá trị “Rice”.
	  *   Sau đó sẽ in ra màn hình là “Chau is eating Rice”.
*/
	 int age = a.getAge(); //a.getAge() là tính đóng gói
	 System.out.println("Age is: "+age);
	/* Ở phương thức getAge(), vì phương thức sẽ return giá trị thuộc tính age của đối tượng.
	 *  Ta khai báo một biến age để lưu giá trị mà phương thức trả về. Sau đó in nó ra màn hình.
*/
	 
 }
}