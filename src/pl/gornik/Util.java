package pl.gornik;

public class Util {
    public int countWords(StringBuilder text){
        String[] words = String.valueOf(text).split(" ");
        return words.length;
    }
    public int countWordsStartPrefix(StringBuilder text, String prefix) {
        String[] words = text.toString().split("");
        int count = 0;
        for (String word : words) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        return count;
    }
}
