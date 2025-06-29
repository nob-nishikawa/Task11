package Task11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11Main {

  public static void main(String[] args) {

    String inputDataFile = "inputData.txt";

    FileRead fileRead = new FileRead();

    List<String> getLines;

    try {
      getLines = fileRead.getLine(inputDataFile);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    String regex = "^(\\d+)\\s*(.*?)\\s*by(\\s*.*)$";
    Pattern pattern = Pattern.compile(regex);
    RegexMatching regexMatching = new RegexMatching();
    List<Book> Liblary = new ArrayList<>();

    for (String line : getLines) {
      Matcher matcher = regexMatching.matching(pattern, line);

      if (matcher.matches()) {
        Book liblary = new Book(matcher.group(2).trim(), matcher.group(3).trim(),
            Integer.parseInt(matcher.group(1).trim()));
        Liblary.add(liblary);
      }
    }

    Search search = new Search();
    Scanner scanner = new Scanner(System.in);
    Scanning scanning = new Scanning();
    int kind = scanning.scanNumber(scanner);

    int num = 0;
    String bookTitle = "";
    String authorName = "";

    switch (kind) {
      case 1 -> num = search.searchNumber(scanner);
      case 2 -> bookTitle = search.searchTitle(scanner);
      case 3 -> authorName = search.searchAuthor(scanner);
      default -> System.err.println("1,2,3いずれかの数字を入力してください");

    }

    int i = 0;
    for (Book book : Liblary) {
      if (num == Liblary.get(i).getReferenceNumber() || (bookTitle.equals(
          Liblary.get(i).getBookName())) || authorName.equals(Liblary.get(i).getAuther())) {
        System.out.println(
            "参照番号：" + Liblary.get(i).getReferenceNumber() + " " + "タイトル：" + Liblary.get(i)
                .getBookName() + " " + "著者：" + Liblary.get(i)
                .getAuther());

      }

      i++;
    }
    scanner.close();

  }

}
