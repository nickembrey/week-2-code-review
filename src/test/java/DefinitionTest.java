import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("a to-live place");
    assertEquals(true, testDefinition instanceof Definition);
  }

}
