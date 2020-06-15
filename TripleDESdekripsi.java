package _tgsKSJ;

import java.util.Scanner;
import _tgsKSJ.TripleDES;

public class TripleDESdekripsi {
	public static void main (String[] args) {
		System.out.print("Masukkan cipher: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		System.out.print("Kunci: ");
		String inKey = in.nextLine();
		in.close();
		try{
			TripleDES tes = new TripleDES(inKey);
			System.out.println("Hasil dekripsi: "+tes.decrypt(input));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
