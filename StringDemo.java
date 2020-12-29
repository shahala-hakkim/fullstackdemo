class StringDemo{

	public static void main(String args[]){
		System.out.println("---concat()--->combines specified string at the end of this string. It returns combined string.");
		System.out.println("---Using String literal-----");	
		String s="Hola";//String literal
		System.out.println(s);
		s=s.concat("   hi ");
		System.out.println(s);

		System.out.println("---Using new keyword-----");
		System.out.println(s);	
		String str=new String("  hello");
		str=str.concat(s);
		System.out.println(str);

		System.out.println("---Using StringBuffer-----");
		StringBuffer sb=new StringBuffer("String 1   ");
		sb.append("String 2");
		System.out.println(sb);

		System.out.println("---Using StringBuilder-----");
		StringBuilder sbu=new StringBuilder("String 1  ");
		sbu.append("String 2");
		System.out.println(sbu);

		String name1="Harry";
		System.out.println(name1);
		System.out.println("---charAt()--->returns the char value at the specified index  ");
		System.out.println("index specified=2");
		char ch=name1.charAt(2);  
		System.out.println(ch);  


		System.out.println("---compareTo()--->Compares the given string with current string alphabetically."+	
				    "if s1 > s2, it returns positive number "+ 
				    "if s1 < s2, it returns negative number  "+
				    "if s1 == s2, it returns 0 ,if empty returns the length ");
		String name2="Hermoine";  
		String name3="Ron";  
		String name4=""; 
		String name5="Harry";
		System.out.println("name1:"+name1);
		System.out.println("name2:"+name2);
		System.out.println("name3:"+name3);
		System.out.println("name4:"+name4);
		System.out.println("name5:"+name5);

		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name3));
		System.out.println(name1.compareTo(name4));
		System.out.println(name1.compareTo(name5));


		System.out.println("---contains()---> searches the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.");
		String line="After all this time? Always";  
		System.out.println("string="+line);
		System.out.println("word searching=After");		
                System.out.println(line.contains("After"));
		System.out.println("word searching=all");  
                System.out.println(line.contains("all"));
		System.out.println("word searching=yes");  
                System.out.println(line.contains("yes"));  


		System.out.println("---endsWith()---> checks if this string ends with given suffix. It returns true if this string ends with given suffix else returns false.");
		System.out.println("string="+line);
		System.out.println("Does it end with s?");
		System.out.println(line.endsWith("s"));  
		System.out.println("Does it end with Always?");
		System.out.println(line.endsWith("Always"));    
		System.out.println("Does it end with all?");
		System.out.println(line.endsWith("all"));    



		System.out.println("---string equals() ---> checks if this string ends with given suffix. It returns true if this string ends with given suffix else returns false.");
		String s1="Harry";  
 		String s2="Harry";  
		String s3="HARRY";  
		String s4="ron"; 
 		System.out.println("string1=Harry");	
 		System.out.println("string2=HArry");
 		System.out.println("string2=HARRY");
 		System.out.println("string4=ron");	
		System.out.println("Is str1=str2?-----------"+s1.equals(s2));
		System.out.println("Is str1=str3?-----------"+s1.equals(s3));
		System.out.println("Is str 1=str4?----------"+s1.equals(s4));


		System.out.println("---String equalsIgnoreCase() method compares the two given strings on the basis of content of the string irrespective of case of the string");
		System.out.println("Is content of str1=str2?-----------"+s1.equalsIgnoreCase(s2));
		System.out.println("Is content of str1=str3?-----------"+s1.equalsIgnoreCase(s3));
		System.out.println("Is content of str1=str4?-----------"+s1.equalsIgnoreCase(s4));

		System.out.println("---The java string format() method returns the formatted string by given locale, format and arguments.");
		String str1 = String.format("%d", 10);         
		String str2 = String.format("%s", "Harry"); 
    		String str3 = String.format("%f", 10.10);     
       		String str4 = String.format("%x", 10);          
        	String str5 = String.format("%c", 'c');          
        	System.out.println(str1);  
    	        System.out.println(str2);  
       	        System.out.println(str3);  
                System.out.println(str4);  
      	        System.out.println(str5);  

		System.out.println("---java string toUpperCase() method returns the string in uppercase letter. ");
  		String s1upper=s1.toUpperCase(); 
		System.out.println(s1);  
                System.out.println("uppercase:"+s1upper);  

		
		
		System.out.println("---java string toLowerCase() method returns the string in lowercase letter. ");
  		String s1lower=s1.toLowerCase(); 
		System.out.println(s1);  
                System.out.println("lowercase:"+s1lower);  

		
		System.out.println("--- valueOf() method converts different types of values into string. By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string. ");
		int a=30;  
                String value=String.valueOf(a);  
                System.out.println(value+"abc");
		
		System.out.println("----trim() method eliminates leading and trailing spaces");
		String ts1="  harry potter   "; 
		System.out.println("string="+ts1);
		System.out.println("after trim()");
                System.out.println(ts1.trim()+"and the prisoner of azkhaban");

		System.out.println("----- replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.");
		System.out.println(line);
                String replaceString=line.replace('a','e');
                System.out.println("after replacing a and e"+replaceString);  

		
		System.out.println("------length() method length of the string.");
		System.out.println("string="+name1);
		System.out.println("string length is: "+name1.length());

		System.out.println("------isEmpty() method checks if this string is empty or not.");
		System.out.println("string1="+name1);
		System.out.println("string2="+name4);
		System.out.println("Is string1 empty?-----"+name1.isEmpty());  
                System.out.println("Is string2 empty?-------"+name4.isEmpty());  

		 System.out.println("------indexOf() method is used to search the position of a particular character or string in a sequence of given char values");
		 System.out.println("string:"s1);
	         System.out.println(s1.indexOf('a'));
		
		
		System.out.println("----- substring() method returns a part of the string.");
		System.out.println("string:"line);
		System.out.println(line.substring(2,4));  
                 System.out.println(line.substring(2));

		



		




	


}


}