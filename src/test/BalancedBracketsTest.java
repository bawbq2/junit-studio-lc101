package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

//    BalancedBrackets test_balanced_brackets;

    //TODO: add tests here

//    @Test
//    public void emptyTest() {
//
//        assertEquals(true, true);
//    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringFullyWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void partOfStringWithinBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void balancedBracketsBeforeWordInStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void noClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void closingBracketFirstReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    @Test
    public void extraOpeningBracketAtEndReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]["));
    }

    @Test
    public void twoSetsOfBalancedBracketsAroundEntireStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void balancedBracketsWithinUBalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode]["));
    }

    @Test
    public void twoSetsOfBalancedBracketsWithinStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[C][ode]"));
    }

    @Test
    public void twoOpeningBracketsAfterBalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch][Code["));
    }

    @Test
    public void unbalancedBracketsAfterBalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]Code["));
    }

}

