import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	public static void main(String[] args) {
	
		String text = "I am from India, I live in India and I love India";
		
		String[] data = text.split(",");
		String[] firstHalf = data[0].split(" ");
		String[] SecHalf = data[1].split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
		for(int i =0; i<=firstHalf.length-1; i++) {
			if(hashMap.containsKey(firstHalf[i])) {
				hashMap.put(firstHalf[i], hashMap.get(firstHalf[i])+1);
			}
			else {
				hashMap.put(firstHalf[i], 1);
			}
		}
		
		
		for(int i =0; i<=SecHalf.length-1; i++) {
			if(hashMap2.containsKey(SecHalf[i])) {
				hashMap2.put(SecHalf[i], hashMap2.get(SecHalf[i])+1);
			}
			else {
				hashMap2.put(SecHalf[i], 1);
			}
		}
		
		int count1=0;
		int count2 =0;
		for(Map.Entry<String, Integer> map : hashMap.entrySet()) {
			if(map.getKey().contains("India")) {
				System.out.println("occurence of India word" +map.getValue());
				count1= map.getValue();
			}
		}
		for(Map.Entry<String, Integer> map : hashMap2.entrySet()) {
			if(map.getKey().contains("India")) {
				System.out.println("occurence of India word" +map.getValue());
				count2= map.getValue();
			}
		}
		
		
		System.out.println(count1+count2);
		
		
		
		
	}
	
	
	@Test
	public void maxNum() {
	
		
		String name = "my name is name";
		
		String[] data = name.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for(int i=0; i<=data.length-1; i++) {
			if(hashMap.containsKey(data[i])) {
				hashMap.put(data[i], hashMap.get(data[i])+1);
			}
			else {
				hashMap.put(data[i], 1);
			}
		}
		
		System.out.println(hashMap.entrySet());
		
	}
	
	
	
	@Test
	public void matrix() {
		int R=4;
		int C=4;
		int a[][] = {{1, 2, 3, 4},
                	{5, 6, 7, 8},
                	{9, 10, 11, 12},
                	{13, 14, 15, 16}};
		
		//printmatrix(R,C,a);
		Matrix(R,C,a);
		
	}
	
	
	public void spiralPrint(int R, int C, int a[][]) {
		
		int top=0;
		int left=0;
		int bottom = R-1;
		int right = C-1;
		
		while(top<=bottom && left<=right) {
			
			for(int i=left; i<=right; i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
				
			for(int i=top; i<=bottom; i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			for(int i=right;i>=left; i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			for(int i= bottom; i>=top; i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
			
			
		}
		
	}
	
	
	
	public void printmatrix(int R, int C, int a[][]) {
		int top=0;
		int bottom = R-1;
		int left =0;
		int right = C-1;
		
		while(left<=right && top<=bottom) {
			for(int i=left; i<=right; i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			
			for(int i=top; i<=bottom; i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			
			for(int i=right; i>=left;i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			
			for(int i=bottom; i>=top; i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
	
	
	
	
	
	
	@Test
	public void TestMatrix() {
		int R=4;
		int C=3;
		int a[][] = {{1, 2, 3},
                	{5, 6, 7},
                	{9, 10, 11},
                	{13, 14, 15}};
		
		//diagnolMatrix(R,C,a);
		
		String jh = new String("Name");
		String hg = new String("Name");
		System.out.println(jh.equals(hg));


		
		
	}
	
	public void diagnolMatrix(int R, int C, int a[][]) {
		int top = 0;
		int left = 0;
		int right = C-1;
		int bottom = R-1;
		
		while(top<=bottom && left<=right) {
			
			for(int i = left ; i<=right ; i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			
			for(int i = top ; i<=bottom ; i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			
			for(int i = right ; i>= left ; i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			
			for(int i = bottom; i>=top; i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
			
		}
	}
	
	
	
	@Test
	public void TestMatrix2() {
		int R=4;
		int C=3;
		int a[][] = {{1, 2, 3},
                	{5, 6, 7},
                	{9, 10, 11},
                	{13, 14, 15}};
		
		//diagnolMatrix(R,C,a);
		
		
		System.out.println(a.length);
		System.out.println(a[0].length);


		
		
	}
	
	
	 public int[][] matrixReshape(int[][] mat, int r, int c) {
	        int a[][] =  new int[r][c];
	        
	        
	        int top=0;
	        int left =0;
	        int right = c-1;
	        int bottom = r-1;
	        
	        
	        if((r*c)==(mat.length*mat[0].length)) {
	        	while(top<=bottom && left<=right) {
	        		for(int i=left; i<=r;i++) {
	        			//a[top][i]= 
	        		}
	        	}
	        }
	        else {
	        	return mat;
	        }
	        
	        
	       return a;
	    }
	
	
	
	@Test
	public void counter() {
		String name = "my name is suraj suraj name";
		
		String data[]= name.split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		
		for(int i = 0; i<=data.length-1; i++) {
			if(hashMap.containsKey(data[i])) {
				hashMap.put(data[i], hashMap.get(data[i])+1);
			}
			else {
				hashMap.put(data[i], 1);
			}
		}
		
		System.out.println(hashMap.entrySet());
	}
	
	
	@Test
	public void Matrix(int Row,int Column, int a[][]) {
		int left =0;
		int top =0;
		int right = Column-1;
		int bottom = Row -1;
		
		while(top<=bottom && left <= right) {
			for(int i = left ; i<=right ; i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			
			for(int i = top; i<=bottom; i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			
			for(int i = right ; i>= left; i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			
			for(int i = bottom; i>=top; i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
	
	
	@Test
	public void removeDuplicate() {
		
		String dataw  = "Java is subject Java";
		String data[] = dataw.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
		
		for(int i =0; i<=data.length-1; i++) {
			if(hashMap.containsKey(data[i])) {
				hashMap.put(data[i], hashMap.get(data[i])+1);
			}
			else {
				hashMap.put(data[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey()+" ");
			}
		}
		
	}
	
	
	
	
	
	@Test
	public void test2() {
		System.out.println("Test2");
		int a =20;
		System.out.println(String.valueOf(a));
	}
	
}
