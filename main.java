package tumauso;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    lopphanso duy1 = new lopphanso();
    Scanner sc = new Scanner(System.in);
    duy1.setA(sc.nextInt());
    duy1.setB(sc.nextInt());
    System.out.println("Tử số là" + duy1.getA());
    System.out.println("Mẫu số là'" + duy1.getB());
    if(duy1.kiemtra()){System.out.println("Mẫu số phải khác không ");}
    duy1.rutgonphanso();
    duy1.nghichdaophanso();
    duy1.cong();
    duy1.tru();
    duy1.nhan();
    duy1.chia();
    }
}
