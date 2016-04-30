import java.util.ArrayList;

public class Word {
  private String mWord;
  private ArrayList<Definition> mDefinitions = new ArrayList<Definition>();
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private int mId;

  public Word(String word, String... definitions) {
    mWord = word;
    for(String definition : definitions) {
      mDefinitions.add(new Definition (definition));
    }
    instances.add(this);
    mId = instances.size();
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

  public String getWord() {
    return mWord;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public static Word find(int id) {
    return instances.get(id);
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    instances.clear();
  }

}
