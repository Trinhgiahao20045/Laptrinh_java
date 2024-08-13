/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cautrucrenhanh;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        String kq ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("==GIAI PHUONG TRINH BAC NHAT: ax+b=0==");
        //buoc 1
        System.out.print("nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("nhap he so b: ");
        b = sc.nextDouble();
        //b 2 
        if (a == 0) 
        {
            if (b == 0) {
                kq = "phong trinh vo so nghiem";
            }
            else{kq="phuong trinh vo so nghiem";}
        }else{kq="phuong trinh vo nghiem x= "+ (-b/a);}
        
        //b3
        System.out.println(kq);
    }

}
