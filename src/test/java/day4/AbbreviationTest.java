package day4;

import static org.junit.Assert.*;
/*
import java.util.ArrayList;
import java.util.List;
*/
import org.junit.Test;

public class AbbreviationTest {

    /*@Test
    public void check_size_after_split_data() {
        Abbreviation p = new Abbreviation();
        String[] result = p.split("United States of America");
        assertEquals(4,result.length);
        assertArrayEquals(new String[] {"United", "States", "of", "America"},
                result);
    }
    
    @Test
    public void filter_out_of_stop_word_from_data() {
        List<String> expected = new ArrayList<>();
        expected.add("United");
        expected.add("States");
        expected.add("America");
        
        Abbreviation p = new Abbreviation();
        
        List<String> result = p.filter("United States of America");
        assertEquals(3,result.size());
        assertEquals(expected,result);
    }*/
    
    @Test
    public void should_return_USA_1() {
        Abbreviation p = new Abbreviation();
        //String result = p.of("United States of America");
        String result = p.ofStrem("United States of America");
        assertEquals("USA", result);
    }
    
    @Test
    public void should_return_USA_2() {
        Abbreviation p = new Abbreviation();
        //String result = p.of("united states of america");
        String result = p.ofStrem("united states of america");
        assertEquals("USA", result);
    }
    
   /* @Test
    public void check_size_after_split_data_2() {
        Abbreviation p = new Abbreviation();
        String[] result = p.split("Light Amplification by Stimulation of Emitted Radiation");
        assertEquals(7,result.length);
        assertArrayEquals(new String[] {"Light", "Amplification", "by", "Stimulation"
                                        , "of", "Emitted", "Radiation"},
                result);
    }
    
    @Test
    public void filter_out_of_stop_word_from_data_2() {
        List<String> expected = new ArrayList<>();
        expected.add("Light");
        expected.add("Amplification");
        expected.add("Stimulation");
        expected.add("Emitted");
        expected.add("Radiation");
        
        Abbreviation p = new Abbreviation();
        
        List<String> result = p.filter("Light Amplification by Stimulation of Emitted Radiation");
        assertEquals(5,result.size());
        assertEquals(expected,result);
    }*/
    
    @Test
    public void should_return_LASER_1() {
        Abbreviation p = new Abbreviation();
       // String result = p.of("Light Amplification by Stimulation of Emitted Radiation");
        String result = p.ofStrem("Light Amplification by Stimulation of Emitted Radiation");
        assertEquals("LASER", result);
    }
    
   /* @Test
    public void check_size_after_split_data_3() {
        Abbreviation p = new Abbreviation();
        String[] result = p.split("Jordan Of the World");
        assertEquals(4,result.length);
        assertArrayEquals(new String[] {"Jordan", "Of", "the", "World"},
                result);
    }
    
    @Test
    public void filter_out_of_stop_word_from_data_3() {
        List<String> expected = new ArrayList<>();
        expected.add("Jordan");
        expected.add("the");
        expected.add("World");
        
        Abbreviation p = new Abbreviation();
        
        List<String> result = p.filter("Jordan Of the World");
        assertEquals(3,result.size());
        assertEquals(expected,result);
    }*/
    
    @Test
    public void should_return_JTW_1() {
        Abbreviation p = new Abbreviation();
        //String result = p.of("Jordan Of the World");
        String result = p.ofStrem("Jordan Of the World");
        assertEquals("JTW", result);
    }
    
}
