import java.util.Arrays;

public class FromLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
	}
	
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
	        
	        char ransom[] = ransomNote.toCharArray();
	        char mag[] = magazine.toCharArray();
	       // Arrays.sort(ransom);
	        //Arrays.sort(mag);
	        String first = new String(ransom);
	        String second = new String(mag);
	        System.out.println(first);
	        System.out.println(second);
	      if(second.contains(first)) {
				 return true;
			 }
			 else {
				 return false;
			 }
		    }
}
