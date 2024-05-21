package NewPackage2;

import java.util.ArrayList;

public class HeterogeneousList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double sum = 0.00;
		 ArrayList<Object> hetero_list = new ArrayList<Object>();
		 hetero_list.add("Souvik");   
		 hetero_list.add(42); 
		 hetero_list.add(12229999323L);
		 hetero_list.add(8.9);
		 hetero_list.add(9.8888777);
		 hetero_list.add('a');
		 hetero_list.add(0.0009);      
		 hetero_list.add(true); 
	     for (Object i : hetero_list) {
	         System.out.println(i);
	         if (i instanceof Number) {
	             sum += ((Number) i).doubleValue();
	         }
	     } 
	     System.out.println("The sum is: "+sum);
	}

}
