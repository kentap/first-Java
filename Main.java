package tutorial1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a, b,c, ans;
        
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Score of Math=");
			a = input.nextInt();
			System.out.print("Score of English=");
			b = input.nextInt();
			System.out.print("Score of Japanese=");
			c = input.nextInt();
		}
        ans = a + b + c;
        
        System.out.println("Total="+ ans);
        
		if(ans >=210){
			System.out.println("Congratulations! You passed.");
			}
		else {
			System.out.println("Sorry");
			}
		
		
	
        }
	}
