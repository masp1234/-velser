import java.util.Comparator;

public interface Eatable<T> extends Comparable, Iterable, Comparator{

    public int getInt();

    public int convertToString(int input);
}
