package pl.gornik;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileRead fileReader = new FileRead();
        StringBuilder stringBuilder;
        stringBuilder = fileReader.readFile("src/pl/gornik/file.txt");
        System.out.println(stringBuilder);
        System.out.println("======================");
        Util util = new Util();
        int numberOfWords = util.countWords(stringBuilder);
        System.out.println("liczba wyrazow w tekscie "+numberOfWords);
        System.out.println("======================");
        System.out.println(util.countWordsStartPrefix(stringBuilder,"."));
    }
}
