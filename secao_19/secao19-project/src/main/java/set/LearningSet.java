package set;

import java.util.Set;

/**
 * Rápido, porem não garante a ordem dos elementos
 */
public class LearningSet {

  public LearningSet() {
  }

  public void printSet(Set<String> set) {
    System.out.println("set contains: " + set.contains("tablet"));
    for (String p : set) {
      System.out.println(p);
    }
  }
}
