package Task11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {

  public int searchNumber(Scanner scanner1) throws InputMismatchException {
    System.out.println("参照番号を入力してください");
    int searchNumber = 0;
    searchNumber = scanner1.nextInt();
//    try (Scanner scanner = new Scanner(System.in)) {
//      searchNumber = scanner.nextInt();
//    }
    return searchNumber;

  }

  public String searchTitle(Scanner scanner2) throws InputMismatchException {
    System.out.println("本のタイトルを入力してください");
    String searchTitle = "";
    searchTitle = scanner2.next();
//    try (Scanner scanner = new Scanner(System.in)) {
//      searchTitle = scanner.next();
//    }
    return searchTitle;
  }

  public String searchAuthor(Scanner scanner3) throws InputMismatchException {

    System.out.println("本の著者を入力してください");
    String searchAuthor = "";
    searchAuthor = scanner3.next();
//    try (Scanner scanner = new Scanner(System.in)) {
//      searchAuthor = scanner.next();
//    }
    return searchAuthor;

  }

}
