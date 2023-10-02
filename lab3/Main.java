import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int N = 1117;
        System.out.printf("C3=%d; C17=%d;\n", N % 3, N % 17);
        System.out.println("Тип = 'StringBuffer'\nДія з рядком = 'Відсортувати слова заданого тексту за кількістю входжень визначеного символу в них.'\n");

        StringBuffer text = new StringBuffer();
        //Add text
        text.append("The sun shines brightly.\n" +
                "Silly cats chase strings.\n" +
                "She sings beautifully.");
        char targetChar = 's';
        if (text == null || text.isEmpty() || !Character.isLetterOrDigit(targetChar)) {
            System.err.println("Некоректний вхідний текст або символ.");
            return;
        }
        System.out.println("Start text: " + text);

        //Replace all characters with spaces split words by spaces and add them to the array
        String[] textSplit = text.toString().replaceAll("[\\p{P}|\\s]+", " ").split(" ");

        //We determine the length of the longest word because it is necessary
        int lmax = 0;
        for (var a : textSplit) {
            int l = a.length();
            if (lmax < l) {
                lmax = l;
            }
        }

        //We create an empty array containing empty elements to which we will add sorted words in the future
        ArrayList<ArrayList<String>> sorted_w = new ArrayList<>();
        for (int i = 0; i <= lmax; i++) {
            sorted_w.add(new ArrayList<>());
        }

        //Determine for each word the number of occurrences of the specified character
        // and add the word to the array with sorted words in the element with the index
        // corresponding to the number of occurrences of the character in the word
        for (var a : textSplit) {
            int n = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == targetChar) {
                    n++;
                }
            }
            sorted_w.get(n).add(a);
        }

        //Here you could create a new StringBuffer, but for what, let's use the property
        text.delete(0, text.length());

        //Adding words from a sorted array to a StringBuffer
        for (var a : sorted_w) {
            for (var el : a) {
                text.append(el).append(" ");
            }
        }
        System.out.println("Sorted text: " + text); //print the result!!!

    }
}