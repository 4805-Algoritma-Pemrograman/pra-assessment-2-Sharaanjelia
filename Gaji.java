 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
     int gajiPokok = hitungGaji();
        int uangLembur = hitungUangLembur(jamLembur);
        
        // Menghitung total gaji
        int totalGaji = gajiPokok + uangLembur;

        // Menampilkan hasil
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Uang Lembur: " + uangLembur);
        System.out.println("Total Gaji: " + totalGaji);
     
        System.out.println("Jumlah metode: " + Gaji.class.getDeclaredMethods().length);
        System.out.println("Jumlah field: " + Gaji.class.getDeclaredFields().length);
        
        input.close();
    }

    // Fungsi untuk menghitung gaji pokok
    public static int hitungGaji() {
        if (masaKerja < 5) {
            return 5000000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            return 7500000;
        } else {
            return 10000000;
        }
    }

    // Fungsi untuk menghitung uang lembur
    public static int hitungUangLembur(int jamLembur) {
        int uangLemburPerJam;
        if (masaKerja < 5) {
            uangLemburPerJam = 40000;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            uangLemburPerJam = 50000;
        } else {
            uangLemburPerJam = 75000;
        }
        return jamLembur * uangLemburPerJam;
    }
}
        /* Pekerjaan anda berakhir sini */
        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
