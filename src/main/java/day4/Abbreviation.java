package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Abbreviation {

/*    public String[] split(String input) {
        // TODO Auto-generated method stub
        return input.split("\\s");
    }

    public List<String> filter(String input) {
        // TODO Auto-generated method stub
        String[] result = split(input);
        List<String> afterfilter = new ArrayList<>();
        for (String string : result) {
            if (!"of".equals(string.toLowerCase()) && !"by".equals(string.toLowerCase())) {
                afterfilter.add(string);
            } 
        }        
                
        return afterfilter;
    }

    public String of(String input) {
        // TODO Auto-generated method stub
        List<String> afterFilter = filter(input);
        String result = "";
        for (String string : afterFilter) {
            result += string.charAt(0);
        }
        return result.toUpperCase();
    }*/

    public String ofStrem(String input) {
        // TODO Auto-generated method stub
        
        return Stream.of(input.split(" "))
                .filter(e -> !"of".equalsIgnoreCase(e))
                .filter(e -> !"by".equalsIgnoreCase(e))
                .map(e -> String.valueOf(e.charAt(0)).toUpperCase())
                .collect(Collectors.joining(""));
    }

}
