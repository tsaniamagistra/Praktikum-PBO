package bidangdanruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int pilih;
        float panjang, lebar, jariJari, tinggi;
        
        do {
            System.out.println("Menu Utama");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
        
            pilih = keyboard.nextInt();
        
            if(pilih==1) {
                System.out.print("Input Panjang: ");
                panjang = keyboard.nextFloat();
                System.out.print("Input Lebar: ");
                lebar = keyboard.nextFloat();
                System.out.print("Input Tinggi: ");
                tinggi = keyboard.nextFloat();
                
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);
                
                System.out.println("Luas Persegi Panjang= " + persegiPanjang.luas());
                System.out.println("Keliling Persegi Panjang= " +persegiPanjang.keliling() );
                System.out.println("Volume Balok= " + balok.volume());
                System.out.println("Luas Permukaan Balok= " + balok.luasPermukaan());
            }
            else if(pilih==2) {
                System.out.print("Input Tinggi: ");
                tinggi = keyboard.nextFloat();
                System.out.print("Input Jari-jari: ");
                jariJari = keyboard.nextFloat();
                
                Lingkaran lingkaran = new Lingkaran(jariJari);
                Tabung tabung = new Tabung(tinggi, jariJari);
                
                System.out.println("Luas Lingkaran= " + lingkaran.luas());
                System.out.println("Keliling Lingkaran= " + lingkaran.keliling());
                System.out.println("Volume Tabung= " + tabung.volume());
                System.out.println("Luas Permukaan Tabung= " + tabung.luasPermukaan());
            }
        } while (pilih != 0);
    }
}
