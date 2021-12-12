import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String message = getMessage();
        getDictionary(message);
    }

    private static String getMessage() {
        System.out.print("Введите сообщения туземцев: ");
        return new Scanner(System.in).nextLine();
    }

    private static void getDictionary(String message) {
        List<String> toSort;
        Set<String> uniqueValues1 = new HashSet<>();
        toSort = Arrays.stream(message.split("\\p{Punct}|\\s+"))  //разделяет строку на подстроки
                .filter(uniqueValues1::add) //  метод обработки каждого элемента, добавления
                .sorted() //  метод сортировки каждого элемента в естественном порядке
                .distinct() // используем его для получение списка строк без дубликатов из стрима
                .collect(Collectors.toList());
                toSort.forEach(System.out::println);
    }
}