package Exercise;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào 3 cạnh của tam giác
            System.out.print("Nhập cạnh a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập cạnh b: ");
            int b = scanner.nextInt();
            System.out.print("Nhập cạnh c: ");
            int c = scanner.nextInt();

            // Kiểm tra điều kiện tam giác
            checkTriangleValidity(a, b, c);

            // Hiển thị thông báo nếu là tam giác hợp lệ
            System.out.println("Ba cạnh đã nhập tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            // Xử lý ngoại lệ IllegalTriangleException
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            // Xử lý ngoại lệ khác (ví dụ: nhập không phải là số nguyên)
            System.out.println("Lỗi: Nhập không hợp lệ.");
        } finally {
            // Đóng Scanner
            scanner.close();
        }
    }

    // Hàm kiểm tra tam giác
    private static void checkTriangleValidity(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Ba cạnh không thể tạo thành một tam giác.");
        }
    }
}
