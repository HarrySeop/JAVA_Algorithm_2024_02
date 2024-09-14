import java.util.Scanner;

public class Main_202114154 {
  public static void main(String[] args) {
    System.out.println("lab0_4:박지섭");

    // 오름차순으로 정렬된 배열 array 초기화
    int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

    // 대체할 원소를 입력받음
    Scanner scanner = new Scanner(System.in);
    int item = scanner.nextInt();

    // 오름차순으로 정렬된 배열 array에서 마지막 원소를 item으로 대체
    insertInOrder(array, item);

    // 오름차순으로 정렬된 배열 내용 출력
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    scanner.close();
  }

  private static void insertInOrder(int[] array, int item) {
    int last = array.length - 1;

    while (last > 0 && array[last - 1] > item) {
      array[last] = array[last - 1];
      last--;
    }
    array[last] = item;
  }
}