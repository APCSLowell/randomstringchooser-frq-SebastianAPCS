import java.util.*;
public class RandomStringChooser {
  ArrayList<String> strings;

  public RandomStringChooser(String[] words) {
    strings = new ArrayList<>();

    for (String word : words) {
      strings.add(word);
    }
  }

  public String getNext() {
    String word;
    if (strings.size() != 0) {
      int randomNum = (int) (Math.random() * strings.size());
      
      word = strings.get(randomNum);
      strings.remove(randomNum);
    } else {
      word = "NONE";
    }

    return word;
  }
}