/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double toan, van, anh;
        double dtb;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem cua thi sinh");
        //b1
        System.out.print("nhap diem toan: ");
        toan = sc.nextDouble();
        System.out.print("nhap diem anh: ");
        anh = sc.nextDouble();
        System.out.print("nhap diem van: ");
        van = sc.nextDouble();
        //b2
        dtb=(toan+van+anh)/3;
        //b3 xeploai
        if (dtb<=4) {
            kq="Yeu";
        } else if(dtb<=6.5) {
            kq="Trung bình";
        }else if (dtb<=8){
            kq="khá";
        }else{
            kq="Giỏi";
        }
        //b3 
        System.out.println("-DTB: "+dtb + "-Xep loai: "+kq);
    }
    
}
