package com.example.demo;

public class Reception {

	//private static final String ONE_SPACE = " ";
	
	public String get(String name) {
		// TODO Auto-generated method stub
		//return "สวัสดี " + name;
		//return String.join(" ","สวัสดี",name);
		return "สวัสดี".concat(" ").concat(name);
		//StringBuilder builder = new StringBuilder();
		//builder.append("สวัสดี")
		//.append(ONE_SPACE)
		//.append(name);
		//return builder.toString();
		//return String.format("สวัสดี %s", name);
		
	}

}
