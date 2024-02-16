package Exercise;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo mảng
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n == 0) {
            try {
                throw new Exception("Mảng không có phần tử. Vui lòng nhập ít nhất một phần tử.");

            } catch (
                    Exception e
            ) {
                System.out.println("Lỗi: " + e.getMessage());
                return;

            }
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Bước 4: Hiển thị kết quả hoặc thông báo lỗi
        System.out.println("Số lớn nhất trong mảng là: " + max);

        // Đóng Scanner
        scanner.close();
    }

}
