package loophomework;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int number,
		counter=0,
		total=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sayıyı giriniz :");
		
		number=scan.nextInt();
		
		for(int i=1;i<=number;i++) {
			if(i%3==0 & i%4==0) {
				total+=i;
				counter++;
			}
		}
		
		System.out.println("3 ve 4'e bölünen sayıların ortalaması = "+total/counter);

	}

}
