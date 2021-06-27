package slls;

public class TesteCompareTo {

	public static void main(String[] args) {
		
		String str1 = "00";
		String str2 = "01";

		String str3 = "12";
		String str4 = "13";
		
		//se str1 é menor que str2 retorna -1, se for maior retorna 1
		int comp = str1.compareTo(str2);
		int comp2 = str3.compareTo(str4);
		
		System.out.println(comp);
		System.out.println(comp2);
		
		if(comp < 0 && comp2 < 0) {
		  System.out.println("Não é mês");
		} else if(comp > 0) {
		  System.out.println("É mês");
		} 
		
	}
}
