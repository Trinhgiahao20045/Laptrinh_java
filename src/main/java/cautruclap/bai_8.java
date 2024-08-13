/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("==Viết chương trình tính tổng các số nguyên từ 1 N==");
        //buoc 1
        System.out.print("nhap so n: ");
        n = sc.nextInt();
        //buoc 2
        s=0;
        for (int i= 1; i<=n;i++)
        {s=s+i;}
        System.out.println("tong day so: "+s);
    }
    
}
