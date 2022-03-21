package tumauso;

import java.util.Scanner;

public class lopphanso {
    int a,b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    boolean kiemtra(){
        if(getB()==0) return true;
        return false;
    }
    void rutgonphanso(){
        System.out.println("Rút gọn phân số");
    }
    void nghichdaophanso(){
        System.out.println("Nghịch đảo phân số");
    }
    void cong(){
        System.out.println("Cộng");
    }
    void tru(){
        System.out.println("Trừ");
    }
    void nhan(){
        System.out.println("Nhân");
    }
    void chia(){
        System.out.println("Chia");
    }
}
