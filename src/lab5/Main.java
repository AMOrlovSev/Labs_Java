package lab5;


public class Main {
    public static void main(String[] args) {

        String test_Ex1 = "Написание текстов для главных страниц сайта – дело непростое. Проблема в том, что существует сразу несколько подходов к подготовке таких материалов.\n" +
                "\n" +
                "Каждый подход, как это и водится, имеет свои плюсы и минусы. Где-то можно выиграть в оптимизации, но потерять в живых читателях. Где-то можно приобрести живых читателей, но придется жертвовать SEO-показателями и, возможно, по этой причине отставать от конкурентов.\n" +
                "\n" +
                "Постоянные сомнения, касающиеся оптимальных путей создания текстов для главной, стали вполне привычными спутниками авторов.\n" +
                "\n" +
                "Кто-то постоянно работает под одной и той же схеме, кто-то мечется между SEO и продающими текстами, а кто-то и вовсе не имеет четкого видения. Чтобы хоть как-то определиться с тем, как писать тексты для главных страниц, мы составили эту небольшую заметку. На полноценный научный труд претендовать не собираемся, но кое-какие собственные наблюдения озвучим.";
        System.out.println(longestWord_Ex1(test_Ex1));

        System.out.println(isPalindrome_Ex2("test"));
        System.out.println(isPalindrome_Ex2("ABBA"));

        String test_Ex3 = "Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»";
        System.out.println((replaceByaka_Ex3(test_Ex3)));

        String string_Ex4 = "helloslkhellodjladfjhello";
        String substring_Ex4 = "hello";
        System.out.println((numberOfSubstrings_Ex4_indexOf(string_Ex4, substring_Ex4)));
        System.out.println((numberOfSubstrings_Ex4_splitBySubstring(string_Ex4, substring_Ex4)));

        String test_Ex5 = "This is a test string";
        System.out.println((reverseString_Ex5(test_Ex5)));
    }

    // 1. Написать метод для поиска самого длинного слова в тексте
    public static String longestWord_Ex1(String text) {
        String result = "";
        int counter = 0;
        String[] strings = text.replace("\n", " ").split(" ");
        for (String i : strings) {
            if (i.length() > counter) {
                counter = i.length();
                result = i;
            }
        }
        return result;
    }

    // 2. Написать метод, который проверяет является ли слово палиндромом
    public static Boolean isPalindrome_Ex2(String word) {
        String drow = reverseWord(word);
        if (word.equals(drow)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseWord(String word) {
        char[] array = word.toCharArray();
        String drow = "";
        for (int i = array.length - 1; i >= 0; i--) {
            drow = drow + array[i];
        }
        return drow;
    }

    // 3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
    public static String replaceByaka_Ex3(String text) {
        String result = "";
        result = text.replace("бяка", "[вырезано цензурой]");
        return result;
    }

    // 4. Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую
    public static Integer numberOfSubstrings_Ex4_indexOf(String string, String substring) {
        int lastIndex = 0;
        int counter = 0;
        while (lastIndex != -1) {
            lastIndex = string.indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                counter++;
                lastIndex += substring.length();
            }
        }
        return counter;
    }

    public static Integer numberOfSubstrings_Ex4_splitBySubstring(String string, String substring) {
        int counter = string.split(substring, -1).length-1;
        return counter;
    }

    // 5. Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами
    public static String reverseString_Ex5(String string) {
        String result = "";
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            result += reverseWord(strings[i]) + " ";
        }
        return result.trim();
    }
}
