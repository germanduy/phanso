package com.company;

import java.util.Scanner;

public class lopPhanSo {
    int a,b,c,d;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    //kiểm tra mẫu khác không
    boolean kiemtra1(){
        if(getB()==0){return true;}
        else {return false;}
    }
    boolean kiemtra2(){
        if(getD()==0){return true;}
        else {return false;}
    }
    //Tìm ucln
    int timUcln(){
        int ucln=1;
        if(getA()>getB()){
            for(int i=1 ; i<=getB(); i++){
                if(getA()%i==0 && getB()%i==0){
                    ucln=i;
                }
            }
        }else{
            for(int i=1; i<=getA(); i++){
                if(getA()%i==0 && getB()%i==0){
                    ucln=i;
                }
            }
        }
        return ucln;
    }
    //rút gọn phân số
    void rutgonPhanSo(){
        int tuso,mauso;
        tuso=getA()/timUcln();
        mauso=getB()/timUcln();
        System.out.println("Phân số rút gọn là: "+tuso+"/"+mauso);
    }
    //Nghịc đảo phân số
    void nghichdaoPhanSo(){
        if(getA()==0){
            System.out.println("Không có phân số nghịch đảo");
        }else{
            System.out.println("Phân số nghịch đảo là: "+getB()+"/"+getA());
        }    }
    // Tong
    void tong(){
        int tongtu,tongmau;
        tongtu= getA()*getD()+getB()*getC();
        tongmau =getB()*getD();
        System.out.println("Tổng 2 phân số là: "+tongtu+"/"+tongmau);
    }
    //Hieu
    void hieu(){
        int tongtu,tongmau;
        tongtu= getA()*getD()-getB()*getC();
        tongmau =getB()*getD();
        System.out.println("Hiệu 2 phân số là: "+tongtu+"/"+tongmau);
    }
    //Tich
    void tich(){
        int tongtu,tongmau;
        tongtu= getA()*getC();
        tongmau =getB()*getD();
        System.out.println("Tích 2 phân số là: "+tongtu+"/"+tongmau);
    }
    //Thuong
    void thuong(){
        int tongtu,tongmau;
        tongtu= getA()*getD();
        tongmau =getB()*getC();
        System.out.println("Thương 2 phân số là: "+tongtu+"/"+tongmau);
    }


}
