import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TestNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		
		//List<Map.Entry<String, Integer>> list= new LinkedList<Map.Entry<String,Integer>>(scores.entrySet());
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 
		for(Map.Entry<String, Integer> en : scores.entrySet()) {
			arrayList.add(en.getValue());
		}
	
		Collections.sort(arrayList);
		
		for(Integer integer : arrayList) {
			System.out.println(integer);
		}
	}
	
	
	@Test
	public void practice() {
		String name = "who is here is who where by by by not me me me me me";
		String nameArray[] = name.split(" ");
		
		HashMap<String, Integer>  hashMap = new HashMap<String, Integer>();
		
		for(int i = 0 ; i <=nameArray.length-1 ; i++) {
			if(hashMap.containsKey(nameArray[i])) {
				hashMap.put(nameArray[i], hashMap.get(nameArray[i])+1);
			}
			else {
				hashMap.put(nameArray[i], 1);
			}
		}
		System.out.println(hashMap.entrySet());
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<String> arrayList2 = new ArrayList<String>();
		for(Map.Entry<String, Integer> en : hashMap.entrySet()) {
			arrayList.add(en.getValue());
			arrayList2.add(en.getKey());
		}
		
		Collections.sort(arrayList);
		
		//print the no of most 
		System.out.println(arrayList.get(arrayList.size()-1));
		
	}
	
	
	
	
	@Test
	public void mySplit() {
	    
		int[] nums = {1,2,3,1};
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
         for(int i =0 ; i<=nums.length-1; i++){
             if(map.containsKey(nums[i])){
                 map.put(nums[i], map.get(nums[i])+1);
             }
             else
             {
                 map.put(nums[i],1);
             }
         }
     
     ArrayList<Integer> list = new ArrayList<Integer>();
     for(Map.Entry<Integer,Integer> m : map.entrySet()){
         list.add(m.getValue());
     }
     
     System.out.println(map.entrySet());
     
     Collections.sort(list);
     
     System.out.println(list.get(list.size()-1));
 } 
	
	
	
	@Test
	public void koitojobdedo() {
		String word = "hi my name is this hi name this ";
		String words[] = word.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for(int i = 0 ; i<=words.length-1; i++){
		if(hashMap.containsKey(words[i])){
				hashMap.put(words[i], hashMap.get(words[i])+1);
			}
		else{
				hashMap.put(words[i], 1);
			}
		}
		
		
		System.out.println(hashMap.entrySet());
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			arrayList.add(entry.getValue());
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
		
	}
	
	
	
	@Test
	public void doforLoop() {
		String data = "hello";
		char[] value = data.toCharArray();
		
		for(int i = 0; i<=value.length-1; i++) {
			for(int j = i+1; j<=value.length-1; j++) {
				if(value[i]==value[j]) {
					System.out.println("on duplicate ele "+value[i]);
				}
				else {
					System.out.println("first non repeting "+value[i]);
				}
			}
		}
	}
	
	
	@Test
	public void LinkedHash() {
		String data = "hello";
		char[] value = data.toCharArray();
			LinkedHashSet set = new LinkedHashSet();
			HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
			for(int i= 0 ; i<= value.length-1; i++) {
				if(hashMap.containsKey(value[i])) {
					hashMap.put(value[i], hashMap.get(value[i])+1);
				}
				else
					hashMap.put(value[i], 1);
					set.add(value[i]);
			}
			System.out.println(hashMap.entrySet());
			System.out.println(set.iterator().next());
			
			
	
	}
	
	@Test
	public void redbus() {
	String data= "xHi Hxi Hi";
	char delta = 'x';
	char[] datavalue= data.toCharArray();
	StringBuilder builder = new StringBuilder();
	for(int i =0 ; i <=datavalue.length-1; i++) {
		if(datavalue[i]==delta) {
			continue;
		}
		else {
			builder=builder.append(datavalue[i]);
		}
	}
	System.out.println(builder);
	
	}
	
	@Test
	public void binarySearch() {
		int[] numbers = {5,10,15,20,25,30,36,40,45,50,60,70,80,90};
		int li=0;
		int hi=numbers.length-1;
		int number=80;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(numbers[mi]==number) {
				System.out.println("This is the index"+mi);
				break;
			}
			else if(numbers[mi]<number) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	}
	
	@Test
	public void square() {
		for(int i = 0; i<=5; i++) {
			for(int j=0 ; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void triangle() {
		for(int i = 0; i<=5; i++) {
			for(int j=0 ; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void decresingtriangle() {
		for(int i = 0; i<=5; i++) {
			for(int j=i ; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
