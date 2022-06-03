import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class AlphabetSoupTest {

    @Test
    public void showTestResult1(){
        InputStringImpl testReverse = new InputStringImpl();
        Assertions.assertEquals("ehllo",testReverse.inputReverse("hello"));
    }

    @Test
    public void showTestResult2(){
        InputStringImpl testReverse = new InputStringImpl();
        Assertions.assertEquals("bcdeeorty",testReverse.inputReverse("coderbyte"));
    }

    @Test
    public void showTestResult3(){
        InputStringImpl testReverse = new InputStringImpl();
        Assertions.assertEquals("ahhloop",testReverse.inputReverse("hooplah"));
    }

}