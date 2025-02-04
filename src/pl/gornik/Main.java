package pl.gornik;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileRead fileReader = new FileRead();
        StringBuilder stringBuilder;
        stringBuilder = fileReader.readFile("src/pl/gornik/file.txt");
        System.out.println(stringBuilder);
        System.out.println("======================");
        Util util = new Util();
        int numberOfWords = util.countWords(stringBuilder);
        System.out.println("liczba wyrazow w tekscie "+numberOfWords);
        System.out.println("======================");
        System.out.println("Podaj prefix");
        System.out.println(util.countWordsStartPrefix(stringBuilder,scanner.nextLine()));
        System.out.println("======================");
        System.out.println("Podaj dlugosc");
        System.out.println(util.countSizeOfWords(stringBuilder,scanner.nextInt()));
    }
}
