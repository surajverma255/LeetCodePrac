import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.RegEx;

import org.checkerframework.checker.regex.qual.Regex;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.sym.Name;

public class DemoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//[7,1,5,3,6,4]
			//[2,4,1]
		int arr[] = {2,4,1};
		maxProfit(arr);
		System.out.println(maxProfit(arr));
        
	}
	public static int maxProfit(int[] prices) {
        //[7,1,5,3,6,4]
        
		//smallest element (sort)
		//
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<=prices.length-1;i++) {
		int currentValue = prices[i];
		int[] copy = Arrays.copyOfRange(prices, i+1, prices.length);
		
		Arrays.sort(copy);
		if(copy.length==0) {
			
			continue;
		}
		else {
			
			list.add(copy[copy.length-1]-currentValue);
		}
		
		}
		for(Integer integer : list) {
			System.out.print(integer);
		}
		
		Collections.sort(list);

		
		
		
        return 0;
        
        
    
        
    }
	
	
}
	
	
	
	
	
	
	
	
	

