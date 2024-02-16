package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo mảng
        Integer[] arr = new Integer[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Mảng hiện tại: " + Arrays.toString(arr));
        int left = 0;
        int right = n - 1;
        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        while (true) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                System.out.println("Số cần tìm ở vị trí " + mid);
                break;
            } else if (arr[mid] <= value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            };
            if (left>right){
                try{
                    throw new Exception("Không tìm thấy giá trị");
                } catch (Exception e){
                    System.out.println("Lỗi "+e.getMessage());
                    break;
                }
            }
        }

    }

}
