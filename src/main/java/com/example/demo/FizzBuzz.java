package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	   /* String Result = "";
	    	    int[] number = {15};
	    String[] result = {"FizzBuzz"};

	    for (int i = 0; i < number.length; i++) {
            if(input%number[i] == 0) {
                return String.valueOf(result[i]);
            }
        }*/
	     
	    // Register conditions
        List<Condition> conditions = new ArrayList<>();
        conditions.add(new FizzBuzzCondition());
        conditions.add(new FizzCondition());
        conditions.add(new BuzzCondition());
        conditions.add(new OtherCondition());
        /*
        // Process
        for (Condition condition : conditions) {
            if(condition.check(input)) {
                return condition.say(input);
            }
        }*/
        
        return conditions .parallelStream()
                .filter(c -> c.check(input))
                .map(c -> c.say(input))
                .collect(Collectors.toList()).get(0);

        //throw new RuntimeException("Condition not match");
    }
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


