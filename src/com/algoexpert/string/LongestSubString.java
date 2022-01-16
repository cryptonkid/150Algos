package com.algoexpert.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
		System.out.println(longestSubstringWithoutDuplication("clementisacap"));
		
	}
	public static String longestSubstringWithoutDuplication(String str) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] charArray = str.toCharArray();
		int startIdx = 0;
		int endIdx = 0;
		String subStr = charArray[0]+"";//first character
		int subStringMaxLen = 0;
		int startLen = 1;
		do {
			char ch = charArray[endIdx];
			if(!map.containsKey(ch)){
				map.put(ch,endIdx);
			}else{
				//Todo: Substring this will increase the space complexity
				// String temp = str.substring(startIdx,endIdx+1);
				// if(temp.length() > subStr.length())
					// subStr = temp;
				int templen = (endIdx-startIdx)+1;
				startLen = startLen > templen ? startLen:templen;//Todo : fix when not broken
				startIdx = Math.max(map.get(ch),endIdx+1);
			}
				 endIdx++;
		}while(endIdx < str.length());
    return subStr;
  }
	private static 
	//Expensive way to store data.: Very object 
	class Index{
		private int start;
		private int end;
		
		//Constructor based start and end value storing is not good as it
		//expensive :: user setter and getter
		/*
		 * Index(int start,int end){ this.start = start; this.end = end; }
		 */		
		//Use setter and getter
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		
		public int getEnd() {
			return end;
		}
		public void setEnd(int end) {
			this.end = end;
		}
		
	}
	
	//Else use simple //int[] strt_end_index = {0,1};
	
	public static String longestSubstringWithoutDuplication_working(String str) {
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
			int[] longest = {0,1};
			int startIdx = 0;
			for(int i=0;i<str.length();i++){
				char ch = str.charAt(i);
				if(map.containsKey(ch)){
					startIdx = Math.max(startIdx,map.get(ch)+1);
				}
				if(longest[1] - longest[0] < i+1-startIdx){ //here u will see th logic of storing 0,1 values
					longest = new int[]{startIdx,i+1};
				}
				map.put(ch,i);
			}
	    return str.substring(longest[0],longest[1]);
	  }
	}

