package ga;
// cú pháp kb lớp
//mức độ truy xuất + class + tên class{ 
 //thuộc tính;
 //phương thức;
//}
public class SinhVien {
	//thuộc tính (giống với biến)
	public String hoTen; //biến tooàn cục global vảiable
	private double diem;
	
	//cóntrctor hàm tạo để truyền thông tin cho đối tương
			//tên giôgns tên lớp
			//contractor mạc đinh không có kiểu trar về
			 public SinhVien() {
			 hoTen = "no name";
			 diem = 0.0;
			 }
			 //cóntructor có đói số đối số do người dùng truyền vào
			 public SinhVien(String hoTen) {
				 this.hoTen= hoTen;
			 }
			 public SinhVien(String hoTen, double diem) { //biến cục bộlocal vảiable chỉ xai fdduowjc trong cóntructor
				 this.hoTen=hoTen;
				 this.diem=diem;
			 }
	
	//phương thức (hàm)
	//không có kiểu trả về
	public void hienThiThongTin() {
		System.out.println(hoTen+ " "+ diem);
		//cóntrctor hàm tạo để truyền thông tin cho đối tương
		//tên giôgns tên lớp
		//contractor mạc đinh không có kiểu trar về
	}
	
	//có kiểu trả về
	public double tinhDTB(double toan, double van) {
		return (toan+van)/2;
	}
	public double tinhDTB(double toan, double van, double anh) {
		return (toan+van+anh)/3;
	}
	
	//toString
@Override
public String toString() {
	return "SinhVien{" + "hoTen: "+ hoTen+ diem+ "}";
}
		//support method: private vì chỉ sử dụng nội taih support cho method kia
		private boolean checkdiem() {
			return diem>=24;
			
		}
		//sevice method pubilc có thể gọi từ ctr chính
		public void checkhoplediem() {
			if (checkdiem()==true)
					System.out.println("diem hop le");
			else System.out.println("diem k hop le");
		}
		//parametter list
		public double tongdiem(double ...arr) {
			double tong=0.0;
			for(double x: arr) {
				tong+=x;
			}
			return tong;
		}
		
		
//get:xem; set:	sửa thôngtin
		public String getHoTen() {
			return hoTen;
			}
		public double getDiem() {
			return diem;
		}
		public void setHoTen(String hoTen) {
			this.hoTen=hoTen;
		}
		public void setDiem(double diem) {
			this.diem=diem;
		}
	

	public static void main(String[]arg) {
		//khởi tạo đối tương trong class sinh vien
		SinhVien sv1= new SinhVien();
		SinhVien sv2 = new SinhVien();
		sv1.hienThiThongTin();
		sv2.hienThiThongTin();
		SinhVien sv3=new SinhVien("Tèo");
		sv3.hienThiThongTin();
		SinhVien sv4=new SinhVien("TÍ", 9);
		sv4.hienThiThongTin();
		sv4.hoTen= "obama";
		sv4.hienThiThongTin();//nếu đểu public htif bên goài có thể sử đc dữ liệu rất nguy hiểm
			System.out.println(sv4.getHoTen());
			System.out.println(sv4.getDiem());
			//thay đỏi ten dv4
			sv4.setHoTen("haha");
			sv4.hienThiThongTin();
			sv4.setDiem(8);
			sv4.hienThiThongTin();
			//
			double dtbsv4= sv4.tinhDTB(6, 5);
			System.out.println(dtbsv4);
			System.out.println(sv4);//in ra khó hiểu
			//sd tótrings thì se bth
			
			//sp method sv method
			sv4.checkdiem();
			//k cần truy xuất vì chỉ hổ trợ cho sv me thôi
			sv4.checkhoplediem();
			
			//overloadinh
			double testd = sv4.tinhDTB(4, 5, 6);
			System.out.println(testd);
			
			double kq= sv4.tongdiem(1,2,3,4,5,6);
			System.out.println(kq);
			
	}

}

