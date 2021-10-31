package com.company;

public class Main {

    public static void main(String[] args) {
	String a = "abab";
	String b = "abba";
	boolean isvisited[] = new boolean[b.length()];
		boolean isanagram = false;
	if (a.length()==b.length()){
	    for (int i = 0;i< a.length();i++){
	    	 isanagram = false;
	        char c = a.charAt(i);
	        for (int j = 0;j<b.length();j++){
	            if (b.charAt(j)==c && !isvisited[j]){
	            	isvisited[j] = true;
	            	isanagram=true;
	                break;
                }
            }
	        if (!isanagram){
	        	break;
			}
        }
    }
	if (isanagram){
		System.out.println("Anagram");
	}
	else {
		System.out.println("not Anagram");
	}

    }
}
