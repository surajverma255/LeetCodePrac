import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.devtools.v85.dom.model.Node;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {
		int b=0;
		int a=b+2;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder demo = new StringBuilder();
	//	demo.append("aaa").insert(1, "bb").insert(4, "ccc\");
		System.out.println(demo);
		
		
	}
	
	public int methodA(int a, int b) {

		int c = methodB();
		return a+b+c;
	}
	public int methodB() {
		return 5;
	}
	
	@Test
	public void testMethodA() {
		int result = methodA(2, 3);
		Assert.assertEquals(result, 10);
	}
	
	//LeetCode Problems
	
	
	@Test
	public int maxSumProgram(int[] nums) {
		int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            
            if(sum < nums[i]) {
                sum = nums[i];
            }
            
            max = Math.max(max, sum);
        }
        
        return max;
	}
	
	@Test
	public void runner() {
		int[] arr = {3,2,6,4,6,7,8,24,56,76,78,3,2,8};
		//System.out.println(arr.length);
		//System.out.println(maxSumProgram(arr));
		twoSum(arr, 154);
		
	}
		
	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	/**
	 * @param nums
	 * @param target
	 * @rturn
	 */
	@Test
	   public int[] twoSum(int[] nums, int target) {
	        int remainder = 0;
	        int arr[] = new int[3];
	        
	        //[3,2,6]  = 6 
	        
	        for(int i =0;i<=nums.length-1; i++){
	        	
	            for(int j=i+1; j<=nums.length-1; j++){
	            	System.out.println("Nums value "+nums[j]);
	            	System.out.println("Remainder Value "+remainder);
	                if(nums[i]+nums[j]==target) {
	                	
	                	arr[0]=i;
	                	arr[1]=j;
	                	
	                	
	                	
	                }
	            }
	        }
	        System.out.println("First place value is "+arr[0]);
	        System.out.println("Secound place value is "+arr[1]);
	        
			return arr;
	    }
	
	
	
	@Test
	public void runner2() {
		int[] arr = {1,2,3,0,0,0};
		int[] arr2 = {2,5,6};
		//System.out.println(arr.length);
		//System.out.println(maxSumProgram(arr));
		merge(arr, 3, arr2, 3);
		
	}
	
	@Test
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
	//	[1,2,3,0,0,0] m = 3			 [2,5,6], n = 3
//		[1,2,3,5,0,0] m = 4		n=2
	// [1,2,2,3,5,6]
		
		int[] arr = new int[m+n];
		int length = nums1.length-1;
		
		for(int i = length , j=0; i>=m;i--) {
			
			nums1[i]=nums2[j];
			j++;
		}
		Arrays.sort(nums1);
		for(Integer no : nums1) {
			System.out.println(no);
		}     
}
	
	
	
	
	
	@Test
	public void intersectRunner() {
		int[] arr = {1};
		int[] arr2 = {1};
		//System.out.println(arr.length);
		//System.out.println(maxSumProgram(arr));
		//intersect(arr, arr2);
		intersection(arr,arr2);
		
	}
	
	//tried intersect program by brute force method by myself 
	//but getting Array Index bond exception for [1] and [1]
	@Test
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[(nums1.length)+(nums2.length)];
        
        int counter = 0;
            //nums1[1,1]    nums2[1]
            //[4,9,5]   [9,4,9,8,4]     4,9
        for(int i=0; i<=nums1.length-1; i++){
            for(int j=0; j<=nums2.length-1; j++){
                if(nums1[i]==nums2[j]){
                    arr[counter]=nums1[i];
                    
                    counter++;
                    break;
                }
            }
        }
        
        int[] result = new int[counter];
        for(int i =0; i<=arr.length-1; i++) {
        	if(arr[i]>0) {
        		result[i]=arr[i];
        	}
        }
        
        return result; 
    }
	
	
	
	@Test
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0; i<=nums1.length-1; i++) {
			if(hashMap.containsKey(nums1[i])) {
				hashMap.put(nums1[i], hashMap.get(nums1[i])+1);
			}
			else
			{
				hashMap.put(nums1[i], 1);
			}
		}

		HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
		for(int i = 0; i<=nums2.length-1; i++) {
			if(hashMap2.containsKey(nums2[i])) {
				hashMap2.put(nums2[i], hashMap2.get(nums2[i])+1);
			}
			else
			{
				hashMap2.put(nums2[i], 1);
			}
		}

		for(Integer key : hashMap.keySet()) {
			if(hashMap2.containsKey(key)) {
				int x = Math.min(hashMap.get(key), hashMap2.get(key));
				while(x-->0) {
					arrayList.add(key);
				}
			}
		}
		int[] arr=new int[arrayList.size()];
		for(int i=0; i<arrayList.size(); i++) {
			arr[i]= arrayList.get(i); 
			System.out.print(arr[i]+" ");
		}
		
		
		return arr;
	}
	
	
	
	
	@Test
	public void intersectRunner2() {
		int[] arr = {1,1,2,3,4,5};
		int[] arr2 = {1};
		//System.out.println(arr.length);
		//System.out.println(maxSumProgram(arr));
		//intersect(arr, arr2);
		System.out.println(maxSubArray(arr));
		
	}
	
	@Test
	 public boolean containsDuplicate(int[] nums) {
       boolean flag = false;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for(int i =0; i<=nums.length-1; i++) {
        	if(hashMap.containsKey(nums[i])) {
        		hashMap.put(nums[i], hashMap.get(nums[i])+1);
        	}
        	else {
        		hashMap.put(nums[i], 1);
        	}
        }
      for(int i =0; i<=hashMap.size();i++) {
    	  if(hashMap.get(nums[i])>1) {
    		  flag = true;
    		  break;
    	  }
    	  else {
    		  flag = false;
    	  }
      }
		
        return flag;
    }
	
	@Test
    public int maxSubArray(int[] nums) {
	       int max = Integer.MIN_VALUE;
	        int sum = 0;
	        
	        for(int i = 0; i < nums.length; i++) {
	            sum = sum + nums[i];
	            
	            if(sum < nums[i]) {
	                sum = nums[i];
	            }
	            
	            max = Math.max(max, sum);
	        }
	        
	        return max;
	    }
	
	@Test
	 public int firstUniqChar(String s) {
        char[] charArray = s.toCharArray();
        int result=-1;
        HashMap<Character , Integer> hashMap = new HashMap<Character , Integer>();
        
        for(int i =0; i<=charArray.length-1; i++){
            if(hashMap.containsKey(charArray[i])){
                hashMap.put(charArray[i],hashMap.get(charArray[i])+1);
            }    
            else{
                hashMap.put(charArray[i], 1);
            }
        }
        System.out.println(hashMap.entrySet());
        
        for(int i =0; i<=charArray.length-1;i++) {
        	if(hashMap.get(charArray[i])==1) {
        		result = i;
        		break;
        	}
        }
        System.out.println("result value"+ result);
        return result;
    }
	
	
	@Test
	public void runner6() {
		//int[] arr = {1,1,2,3,4,5};
		String ransomNote = "aabl";
		String magzine = "baa";
		//int[] arr2 = {1};
		//System.out.println(arr.length);
		//System.out.println(maxSumProgram(arr));
		//intersect(arr, arr2);
		System.out.println(canConstruct(ransomNote, magzine));
		
	}
	
	
	
	/*
	 * Input: ransomNote = "a", magazine = "b" Output: false Example 2:
	 * 
	 * Input: ransomNote = "aa", magazine = "ab" Output: false Example 3:
	 * 
	 * Input: ransomNote = "aa", magazine = "aab" Output: true
	 */
	
	 public boolean canConstruct(String ransomNote, String magazine) {
	     
		 char[] ransom = ransomNote.toCharArray();
		 char[] mag = magazine.toCharArray();
		 
		 HashMap<Character, Integer> ransomHashMap = new HashMap<Character, Integer>();
		 
		 for(int i=0; i<= ransom.length-1; i++) {
			 	if(ransomHashMap.containsKey(ransom[i])) {
			 		ransomHashMap.put(ransom[i], ransomHashMap.get(ransom[i])+1);
			 	}
			 	else {
			 		ransomHashMap.put(ransom[i], 1);
			 	}
		 	}
		 
		 HashMap<Character, Integer> magHashMap = new HashMap<Character, Integer>();
		 
		 for(int i=0; i<= mag.length-1; i++) {
			 	if(magHashMap.containsKey(ransom[i])) {
			 		magHashMap.put(mag[i], magHashMap.get(ransom[i])+1);
			 	}
			 	else {
			 		magHashMap.put(ransom[i], 1);
			 	}
		 	}
		 
		 ArrayList<Integer> ransomValues = new ArrayList<Integer>();
		 ArrayList<Integer> magzineValues = new ArrayList<Integer>();
		 
		 for(Map.Entry<Character, Integer> map : ransomHashMap.entrySet()) {
			 ransomValues.add(map.getValue());
		 }
		 for(Map.Entry<Character, Integer> map : magHashMap.entrySet()) {
			 magzineValues.add(map.getValue());
		 }
		 
		 System.out.println(ransomValues);
		 System.out.println(magzineValues);
		 
		 
		 return true;
		 
		 }
	
	
	 
	 @Test
	 public void sortAndReplace() {
		 int[] arr = {-1,-1,1,6,1,9,3,2,-1,4,-1};
		 			//-1 -1 -1 -1 1 1 2 3 4 6 9
		 				
		 //           -1  1 2 3 4 -1 6 -1 -1 9 
		 Set<Integer> integers = new HashSet<Integer>();
		  Arrays.sort(arr);
		  for(Integer n : arr) {
				 integers.add(n);
			 }
		  System.out.print(integers);
		  
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 for(Integer n : arr) {
			 arrayList.add(n);
		 }
		 
		for(int i=0; i<=arr.length-1; i++) {
		  		if(arr[i]==i) {
		  			
		  		}
		  	}
	 }
	 
	 
	 @Test
	 public void testing() {
		 String name = "my name is is hy";
		 
		 String namedata[] = name.split(" ");
		 HashMap<String,Integer> hashmap = new HashMap<String, Integer>();
		 for(int i = 0 ; i<=namedata.length-1; i++) {
			 if(hashmap.containsKey(namedata[i])) {
				 hashmap.put(namedata[i], hashmap.get(namedata[i])+1);
			 }
			 else {
				 hashmap.put(namedata[i],1);
			 }
		 }
		 
		 LinkedList<Integer> linkedList = new LinkedList<Integer>();
		 
		 for(Map.Entry<String, Integer> entry : hashmap.entrySet()) {
				/*
				 * System.out.print(entry.getKey()); System.out.print(entry.getValue());
				 */
			 linkedList.add(entry.getValue());
		 } 
		 
		 System.out.print(linkedList);
		 
		 for(int i = 0 ; i<=linkedList.size(); i++) {
			 if(linkedList.get(i)>1) {
				linkedList.pop();
			 }
		 }
		 System.out.print(linkedList);
		 
	 }
	 
	 
	 
	 
	 @Test
	 public void reverseLinkedList() {
		 LinkedList<Integer> integers = new LinkedList<Integer>();
		 integers.add(1);
		 integers.add(2);
		 integers.add(3);
		 integers.add(4);
		 integers.add(3);
		 integers.add(2);
		 integers.push(10);
		 
		
		 
		 for(Integer intt : integers) {
			 System.out.print(integers.getFirst());
		 }
		 
		 
	 }
	 
	 @Test
	 public void reverseLinkedList2() {

		String arr[] = {"Suraj","Adak","Verma"};
		
		Arrays.sort(arr);
		
		for(String a : arr) {
			System.out.println(a);
		}
		 
		 
	 }
	 
	 
	 
	 
	
	
}

