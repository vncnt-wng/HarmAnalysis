import Enums.Interval;
import Enums.NoteName;

import java.util.Set;

public abstract class Structure implements Transposable {

  protected NoteName root;

  @Override
  public void transpose(Interval transposeUp) {
    root = root.addInterval(transposeUp);
  }

  public NoteName getRoot() {
    return root;
  }

  public boolean contains(NoteName name) {
    return getNotes().contains(name);
  }

  public abstract Set<NoteName> getNotes();
}
