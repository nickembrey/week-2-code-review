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

  @Test
  public void word_instantiatesWithOneDefinition_true() {
    Word testWord = new Word("Home", "a to-live place");
    assertEquals(true, testWord.getDefinitions().get(0) instanceof Definition);
  }

  @Test
  public void word_instantiatesWithMultipleDefinitions_true() {
    Word testWord = new Word("Home", "a to-live place", "where the heart is");
    assertEquals(true, testWord.getDefinitions().get(0) instanceof Definition && testWord.getDefinitions().get(1) instanceof Definition);
  }

  @Test
  public void word_goesToClassArrayListOnInstantiation_true() {
    Word testWord = new Word("Home", "a to-live place");
    assertEquals(true, Word.all().get(0) instanceof Word);
  }

}
