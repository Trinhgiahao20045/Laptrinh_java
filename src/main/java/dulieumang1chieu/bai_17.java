/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dulieumang1chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//khai bao mang
 double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu cua mang (1 <= n <= 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("nhap so phan tu cua mang");
            }
        } while (n < 1 || n > 20);
        a = new double[n];
    // a. Nhap gia tri
        nhapMang(a, sc);
        // b. Xuat mang ra man hinh
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);
  double tb =tinhTB(a);
  System.out.print("\n gia tri trung binh cua mang la: "+tb);
  //cau c
  double min =timMin(a);
        System.out.print("phan tu co gia tri nho nhat la: "+min);
        
    }
    //nhap mang

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }
    //a.xuat mang

    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
    }
    //b.dem co bao nhieu duong le
    public static double tinhTB(double[] a){
      double sum =0;
      for (double x: a){
          sum=sum+x;
      }
      return sum/a.length;
    }
    //.tim phan nho nhat cua mang
    public static double timMin(double []a){
        double min=a[0];
        for(double x : a)
        {if (x < min)
        {
            min=x;
        }
        }
        return min;
    }
}
