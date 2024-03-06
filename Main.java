import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> filledHashSet = getFilledHashSet();
        String elementToRemove = "smartphone";
        Set<String> setWithSameType = new HashSet<>(filledHashSet);
        setWithSameType.add(elementToRemove);

        for (String element : setWithSameType) {
            if (element.equals(elementToRemove)) {
                setWithSameType.remove(element);
                break;
            }
        }

        filledHashSet.clear();

        System.out.println(filledHashSet.isEmpty());
    }

    public static Set<String> getFilledHashSet() {
        Set<String> set = new HashSet<>();
        set.add("smartphone");
        set.add("pc");
        set.add("tablet");
        return set;
    }
}
