package Main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<>();
		
		// Dao nguoc chuoi
		System.out.println("Nhap vao chuoi: ");
		String s = scan.nextLine();
		for(int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i) + "" );// + Với một khoảng emty để biến ký tự thành chuỗi 
		}
		System.out.println("Chuoi dao nguoc: ");
		for(int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		
		//Chuyen tu he thap thap phan sang nhi phan
		Stack<Integer> stacksoDu = new Stack<Integer>();
		System.out.println("\nNhap mot so nguyen duong tu ban phim ");
		int x = scan.nextInt();
		
		while (x > 0) {
			int soDu = x % 2;
			stacksoDu.push(soDu);
			x = x / 2;
		}
		System.out.println("So nhi phan la");
		int n = stacksoDu.size();//Khi cho stacksoDu.size vao thi moi lan lap kich co bi thay doi nen dan den viec sai thuat toan
		for (int i = 0; i < n ; i++) {
			System.out.print(stacksoDu.pop());
			
			
		}
	}
}
