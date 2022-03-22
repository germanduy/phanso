package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        lopPhanSo PhanSo = new lopPhanSo();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhập phân số 1");
        System.out.println("Tử số");
        PhanSo.setA(sc.nextInt());
        System.out.println("Mẫu số");
        PhanSo.setB(sc.nextInt());
        if(PhanSo.kiemtra1()){
            System.out.println("Mẫu số phải khác không");
            PhanSo.setB(sc.nextInt());
        }
        PhanSo.rutgonPhanSo();
        PhanSo.nghichdaoPhanSo();
        System.out.println("Nhập phân số 2");
        System.out.println("Tử số");
        PhanSo.setC(sc.nextInt());
        System.out.println("Mẫu số");
        PhanSo.setD(sc.nextInt());
        if(PhanSo.kiemtra2()){
            PhanSo.setD(sc.nextInt());
        }
        PhanSo.tong();
        PhanSo.hieu();
        PhanSo.tich();
        PhanSo.thuong();



    }
}
