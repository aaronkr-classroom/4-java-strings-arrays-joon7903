import java.util.Scanner;

public class ex601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String[] myArr = new String[3];
		
		System.out.println("3개 문자열을 입력하세여: ");
		
		for(int i = 0; i < 3; i++) {
			myArr[i] = s.nextLine();
		}	
		for(int i = 0; i < 3; i++) {
			System.out.print(myArr[i] + " ");
		}
		}
	}


