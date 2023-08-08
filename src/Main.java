import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;
public class Main {

	public static void main(String[] args){
		int Matematik, Fizik, Turkce, Kimya, Muzik;
		double ort;
		
		Scanner inp = new Scanner(System.in);
		
		
		System.out.println("Matematik notunuz: ");
		Matematik = inp.nextInt();
		
		
		System.out.println("Fizik notunuz: ");
		Fizik = inp.nextInt();
		
		System.out.println("Turkce notunuz: ");
		Turkce = inp.nextInt();
		
		System.out.println("kimya notunuz: ");
		Kimya = inp.nextInt();
		
		System.out.println("Muzik notunuz: ");
		Muzik = inp.nextInt();
		
		ort = (Matematik + Fizik + Turkce + Kimya + Muzik)/5;
		
		if(ort>55) {
			System.out.println("Tebrikler gectiniz!");
		}
		else {
			System.out.println("Maalesef Kaldiniz!");
		}
		
		System.out.println("Ortalamaniz: "+ort);

	}

}


