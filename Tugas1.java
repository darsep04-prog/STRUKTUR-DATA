import java.util.LinkedList;
public class Tugas1 {
public static void main(String[] args) {
    
    //1. Buatlah sebuah deklarasi variabel dengan tipe data float yang bernama ‘StrukturBaris’

    float StrukturBaris = 15.5f;
    System.out.println("1. Struktur Baris : " + StrukturBaris);

    System.out.println("\n");

    //2. Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘SusunanKataBaru’ yang berisi kata ‘Pemrograman Struktur Data Java’

    String SusunanKataBaru = "Pemrograman Struktur Data Java";
    System.out.println("2. Susunan Kata Baru : " + SusunanKataBaru);

    System.out.println("\n");


    //3. Buatlah pendeklarasian array satu dimensi dengan nama ‘DelapanAngka, tipe data integer, yang berisi angka (10, 12, 18, 23, 33, 58, 67, 82)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.

    int [] DelapanAngka = {10, 12, 18, 23, 33, 58, 67, 82};
    System.out.print("3. Delapan Angka : ");
    for (int i = 0; i < DelapanAngka.length; i++){
        System.out.print(DelapanAngka[i] + ", ");
    }

    System.out.println("\n");


    //4. Buatlah pendeklarasian array dua dimensi dengan nama ‘DuaAngka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut (2, 4, 6, 8, 10, 12, 14, 16, 18) Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.

    String [][] DuaAngka = {
        {"2", "4", "6"},
        {"8", "10", "12"},
        {"14", "16", "18"},
    };
    System.out.println("4. Dua Angka :");
    for (int i = 0; i < DuaAngka.length; i++){
        for(int j = 0; j < DuaAngka.length; j++){
            System.out.print(DuaAngka [i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("\n");


    //5. Buatlah deklarasi linked list dengan nama 'UrutanListAngka' yang memiliki list (15, 28, 33, 47, 59),  Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.

    LinkedList<Integer>UrutanListAngka = new LinkedList<>();
    UrutanListAngka.add(15);
    UrutanListAngka.add(28);
    UrutanListAngka.add(33);
    UrutanListAngka.add(47);
    UrutanListAngka.add(59);
    System.out.println("5. List Angka : " + UrutanListAngka);

    System.out.println("=====SELESAI=====");
}
}
