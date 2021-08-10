package Ex09082021;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Bai 1A
        int num = inputNum();
        if (isDoiXung(num)) {
            System.out.println("Số này là số đối xứng");
        } else System.out.println("Số này không đối xứng");

        // Bài 1B
        if (isChinhPhuong(num)) {
            System.out.println("Đây là số chính phương");
        } else System.out.println("Đây không phải là số chính phương");

//      Bai 2D
        int num2 = inputNum();
        int tgt = tinhGiaiThua(num2);
        System.out.println("Giai thừa= " + tgt);

//      Bai 2E
        int num3 = inputNum();
        int sgt = sumGiaiThua(num3);
        System.out.println("Tổng Giai thừa= " + sgt);

        // bài 4
        int num1 = inputNum();
        if (num1 > 0 && num1 < 50) {
            sumNguyenTo(num1);
        } else System.out.println("Bạn nhập số ngoài 0<n<50");

        // bài 5
        int x = nghichDaoNum(num);
        System.out.println("Số nghịch đảo là: " + x);

    }

    public static int inputNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        int n = sc.nextInt();
        return n;
    }

    public static boolean isChinhPhuong(int n) {
        boolean chinhPhuong = true;
        double sqrt = Math.sqrt(n);
        if ((sqrt % 10) != 0) {
            chinhPhuong = false;
        } else
            chinhPhuong = true;
        return chinhPhuong;
    }

    public static int nghichDaoNum(int n) {
        int num = 0;
        while (n > 0) {
            int tmp = n % 10;
            num = num * 10 + tmp;
            n /= 10;
        }
        return num;
    }

    public static boolean isNguyenTo(int n) {
        boolean num = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                num = false;
                break;
            }
        }
        return num;
    }

    public static int sumNguyenTo(int n) {
        int sum = 0;
        if (n == 2) {
            sum = sum + 2;
        }
        if (n >= 2) {
            for (int i = 3; i <= n; i += 2) {
                if (isNguyenTo(i) == true) {
                    sum += i;
                }
            }
        }
        System.out.println("Tổng các số nguyên tố là: " + (sum + 2));
        return sum;
    }

    public static boolean isDoiXung(int n) {
        boolean doiXung = true;
        if (n == nghichDaoNum(n)) {
            doiXung = true;
        } else doiXung = false;
        return doiXung;
    }

    public static int tinhGiaiThua(int n) {
        int gt = 1;
        for (int i = 1; i <= n; i++)
            gt *= i;
        return gt;
    }

    public static int sumGiaiThua(int n) {
        int sgt = 0;
        for (int i = 1; i <= n; i++) {

            sgt += tinhGiaiThua(i);
        }
        return sgt;
    }
}

