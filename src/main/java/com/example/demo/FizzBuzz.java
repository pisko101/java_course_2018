package com.example.demo;

public class FizzBuzz {

    public static void main(String[] args) {
//        int[] datas = {1,2,3,4,5};
//        //Do
//        int length = datas.length;
//        for (int i = 0; i < length; i++) {
//            System.out.println(datas[i]);
//        }
//        
//        //Do
//        for (int data : datas) {
//            System.out.println(data);
//        }
    }
    
//    private String result;
//	public String say(int input) {
//		// TODO Auto-generated method stub
//	    
//		if(เท่ากับ15(input)) {
//		    result = "FizzBuzz";
//		}else if(หาร3ลงตัว(input)) {
//			result = "Fizz";
//		}else if (หาร5ลงตัว(input)){
//		    result = "Buzz";
//		}else {
//		    result = String.valueOf(input);
//		}	
//		
//		return result;
//	}
	
	public String say(int input) {
        // TODO Auto-generated method stub

	    int[] number = {15,3,5};
	    String[] result = {"FizzBuzz","Fizz","Buzz"};
        
	    for (int i = 0; i < number.length; i++) {
            if(input%number[i] == 0) {
                return String.valueOf(result[i]);
            }
        }
	  
        return String.valueOf(input);
    }

//    private boolean เท่ากับ15(int input) {
//        return input == 15;
//    }
//
//    private boolean หาร5ลงตัว(int input) {
//        return input % 5 == 0;
//    }
//
//    private boolean หาร3ลงตัว(int input) {
//        return input % 3 == 0;
//    }

}
