import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "abc", "cde", "cde", "e","cde","f"));


    public static void main(String[] args) {

        System.out.println("Задание №1");
        task1();
        System.out.println("Задание №2");
        task2();
        System.out.println("Задание №3");
        task3();
        System.out.println("Задание №4");
        task4();
        System.out.println("Задание №4(другой вариант)");
        printPovtor();
    }

    public static void task1() {
        for (int num : nums) {
            if(num % 2 != 0){
                System.out.print(num);
            }

        }
    }

    public static void task2() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;
        for (int num : nums ){
            if (num % 2 == 0 && num !=prevNum) {
                System.out.print(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size()- uniqueWords.size());

    }

    public static void printPovtor()
    {

        String string = "Мама мыла раму Мама вам не папа Мама Привет папа привет";
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}