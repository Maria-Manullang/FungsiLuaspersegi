package com.Pertemuan5;
import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        int s;
        System.out.print("Masukkan sisi: ");
        s=data.nextInt();
        int luas=luaskubus(s);

        System.out.println("Luas Persegi adalah "+luasPersegi(s));
        System.out.println("Luas Kubus adalah "+luas);
    }

    //membuat fungsi luasPersegi()
    static int luasPersegi(int s){
        return s*s;
    }

    //membuat fungsi luas kubus
    static int luaskubus(int s){
        //memanggil luas persegi
        return 6*luasPersegi(s);
    }
}
