package Source;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

public class Question9 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.stream()
                .filter(e->e>1)
                .collect(Collectors.toUnmodifiableList()).add(4);

    }
}