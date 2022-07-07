import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Bước 1: Tạo hàm timSoLonNhat với 3 tham số đầu vào và kết quả trả về.
	 * Bước 2: Sử dụng biến tạm lấy giá trị là số a, so sánh biến tạm với số 2 số còn lại để tìm số lớn nhất
	 * Bước 3: Vào hàm main, thông báo và cho nhập 3 số
	 * Bước 4: Gọi hàm timSoLonNhat và in ra kết quả 
	 * */
	
	public static int timSoLonNhat(int a, int b, int c) {
		int soLonNhat = a;
		if(b > soLonNhat) {
			soLonNhat = b;
		}
		if(c > soLonNhat ) {
			soLonNhat = c;
		}
		return soLonNhat;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        //Thông báo cho người dùng nhập vào 3 số
		System.out.println("Chương trình tìm số lớn nhất trong 3 số");
		System.out.println("Mời nhập số thứ nhất ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập số thứ hai ");
		int y = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập số thứ ba ");
		int z = Integer.parseInt(scan.nextLine());
		
		int max = timSoLonNhat(x, y, z);
		
		System.out.println("Max trong 3 số là: " + max);
	}
}
