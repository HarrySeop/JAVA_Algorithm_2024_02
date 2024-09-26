import java.util.Random;
import java.util.Scanner;

public class Main_202114154 {
  public static void main(String[] args) {
    System.out.println("lab4_1:박지섭");
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // 원소 수(n)를 입력받아 크기가 n인 정수 배열 생성
    int n = scanner.nextInt();
    int[] array = new int[n];

    // 경우1 : 배열을 1~n 범위의 랜덤 넘버로 채운 후, 퀵 정렬하여 결과 출력
    for (int i = 0; i < array.length; i++)
      array[i] = random.nextInt(n) + 1;

    quickSort(array, 0, array.length - 1);

    for (int i = 0; i < array.length; i++) {
      if (i < 10 || i >= n - 10) // 이 조건문을 추가하여 앞 뒤의 10개 원소만 출력해보자.
        System.out.print(array[i] + " ");
    }
    System.out.println();

    // 경우2 : 배열을 모두 1로 채운 후, 퀵 정렬하여 결과 출력
    for (int i = 0; i < array.length; i++)
      array[i] = 1;

    quickSort(array, 0, array.length - 1);

    for (int i = 0; i < array.length; i++) {
      if (i < 10 || i >= n - 10)
        System.out.print(array[i] + " ");
    }
    System.out.println();

    // 경우3 : 배열을 1~n으로 이미 정렬되어 있는 값으로 채운 후, 퀵 정렬하여 결과 출력
    for (int i = 0; i < array.length; i++)
      array[i] = i + 1;

    quickSort(array, 0, array.length - 1);

    for (int i = 0; i < array.length; i++) {
      if (i < 10 || i >= n - 10)
        System.out.print(array[i] + " ");
    }

    scanner.close();
  }

  // 배열 array[p...r]을 퀵 정렬
  public static void quickSort(int[] array, int p, int r) {
    if (p < r) {
      int q = partition(array, p, r);
      quickSort(array, p, q - 1);
      quickSort(array, q + 1, r);
    }
  }

  // array[p...r]을 분할하여 기준원소 인덱스를 리턴
  public static int partition(int[] array, int p, int r) {
    int pivot = array[r];
    int i = p - 1;

    for (int j = p; j < r; j++) {
      if (array[j] <= pivot) {
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, r);
    return i + 1;
  }

  // array[i]와 array[j]를 교환
  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}