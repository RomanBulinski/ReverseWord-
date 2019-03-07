
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestRevers {


    @Test
    public void TestPalidromeTrue(){
        ReverseWord reverseWord = new ReverseWord();
        String input = "the sky is blue";
        String output = reverseWord.checkString(input);
        assertEquals( "blue is sky the", output);
    }

    @Test
    public void TestPalidromeTrueOneWord(){
        ReverseWord reverseWord = new ReverseWord();
        String input = "blue";
        String output = reverseWord.checkString(input);
        assertEquals( "blue", output);
    }



}
