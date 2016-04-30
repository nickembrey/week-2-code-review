import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("Home", "a to-live place");
    assertEquals(true, testWord instanceof Word);
  }

}
