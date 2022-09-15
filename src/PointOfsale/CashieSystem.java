package PointOfsale;


import java.util.Scanner;

public class CashieSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] rekNrot = new String[50];
		String [] rekNrot2 = new String[10];
		
		String TuoteniNimi="",TuotteenHinita = "";
		int lkm=0;
		for(int i=0;i<10;i++){
			System.out.print("Enter the product name (-Stop):");
			TuoteniNimi=input.next();
			
			System.out.print("Enter the price of the product (0-Stop):");
			TuotteenHinita=input.next();
			
			if(TuoteniNimi.equals("-") || TuotteenHinita.equals("0")){
				break;
			}else{
				rekNrot[i]=TuoteniNimi;
				rekNrot2[i]=TuotteenHinita;
				lkm++;
			}
		}
		System.out.println("Product in receipe: \n	");
		System.out.println("Name"+"\t"+"Price");
		System.out.println("----------------");
		for(int i=0;i<lkm;i++){
			System.out.println(rekNrot[i]+", ("+rekNrot2[i]+")");
			
			
			
			
		}
		input.close();
		
		int Yhteensa = lkm++;
		
		
		
		System.out.println("\n______________");
		System.out.println("Total amount: "+TuotteenHinita);
		System.out.println("Total products: "+Yhteensa);
		
		
		
	}
}
