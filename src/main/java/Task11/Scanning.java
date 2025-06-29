package Task11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanning {

  public int scanNumber(Scanner scanner) throws InputMismatchException {

    System.out.println(
        "数字を入力してください" + "1:番号検索" + "2:タイトルで検索" + "3:著者で検索");
    int num = 0;
    num = scanner.nextInt();
//    try (Scanner scanner = new Scanner(System.in)) {
//      num = scanner.nextInt();
//    }
    return num;

  }

}
