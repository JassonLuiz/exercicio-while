import java.util.Scanner;

public class Exer_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu nome:");
		String name = sc.nextLine();
		
		int cond = 0;
		
        while(cond < 10) {
        	System.out.println(name);
        	cond++;
        }
		
		
		sc.close();
	}

}
