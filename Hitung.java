import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Pekerjaan anda mulai dari sini */
        String input;

        // Mengisi ArrayList dengan angka dari user
        System.out.println("Masukkan angka (ketik 'T' untuk selesai):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("T")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, silakan masukkan angka atau 'T' untuk selesai.");
            }
        }

        // Menghitung dan menampilkan nilai minimal, maksimal, dan rata-rata
        if (!numbers.isEmpty()) {
            System.out.println("Nilai minimal: " + findMin());
            System.out.println("Nilai maksimal: " + findMax());
            System.out.println("Nilai rata-rata: " + calculateAverage());
        } else {
            System.out.println("Tidak ada angka yang dimasukkan.");
        }

        scanner.close();
    }

    // Fungsi untuk menghitung nilai minimal
    public static int findMin() {
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Fungsi untuk menghitung nilai maksimal
    public static int findMax() {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Fungsi untuk menghitung nilai rata-rata
    public static double calculateAverage() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}
