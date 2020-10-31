import java.util.Scanner;
/**
 *
 * 
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini membandingkan dua
 * buah nilai yg diinput oleh user
 */

public class PerbandinganDuaBuahNilai {
    public static void main(String[] args) {
        System.out.println("=========Program Perbandingan Nilai========");
        membandingkanInput();
    }

    public static void membandingkanInput() {
        int nilaiPertama, nilaiKedua;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama : ");
        nilaiPertama= scanner.nextInt();

        System.out.print("Masukkan nilai kedua : ");
        nilaiKedua = scanner.nextInt();

        if (nilaiPertama > nilaiKedua) {
            System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
        } else if (nilaiPertama < nilaiKedua) {
            System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
        } else {
            System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
        }
        ulang();
    }

    public static void ulang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
        String ulang = scanner.next();
        if (ulang.equals("Ya")) {
            System.out.println("\n");
            membandingkanInput();
        }
    }
}

