package stdOOP;

public class Student {
	public String name;
	public int age;
	public double hight;
	
	public static String universityName ="VKU";
	public static int totalSV=0;
	//2 biến tĩnh là universityNam và total
	
	public Student(String name, int age, double hight) {
		this.name= name;
		this.age= age;
		this.hight=hight;
		totalSV+=1;
		//mỗi khi tao khởi tạo một đối tượng của lớp Student,
		// ta sẽ tăng giá trị total lên một đơn vị.
		
		//tạo phương thức tĩnh(create static method)	
	}
	public static void getInfoUniversity() {
		System.out.println("VKU is a information technology school");
		// phương thức static không thể tác động 
		//đến thuộc tính và phương thức liên quan đối tượng (non-static).
		//không gọi được name vì name k có static
		//syso(name); lỗi
	}
	//khối static (chạy trước cả chương trình main của lớp đó)
	static String course;
	static {
		System.out.println("Java");
		course= "OOP core";	
	}
	
	public static void main(String[] args) {
		Student a = new Student("Chau", 21, 1.7f);
		System.out.println("University (from Class): "+ Student.universityName);
		//static gọi thông qua tên Class chứ kông phải tên object
		System.out.println("university (from instance): "+a.universityName);
		System.out.println("total student (from class): "+Student.totalSV);
		Student b= new Student("Hung", 22, 1.8);
		System.out.println("total student (from instance): "+b.totalSV);
		
		
		
		//gọi phương thức tĩnh ở hàm main
		Student.getInfoUniversity();
		
		//gọi khối tĩnh
		System.out.println("Course:"+ Student.course);
		
		
	}
		
		
		


}
