import java.util.ArrayList;

public class Tinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String name = "My naefegergrg etrhrhme is Nishit Nishit";
		String[] namesBroken = name.split(" ");
		
		for(int i=0; i<=namesBroken.length-1; i++) {
			if(namesBroken[i].equals("Nishit")) {
				 count = count+1;
				 System.out.println("Inside Loop");
			}
		}
		System.out.println(count);
		

	}

}
