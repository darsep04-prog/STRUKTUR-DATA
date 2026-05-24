import java.util.Arrays;

public class TugasQuicksort {
    public static void main(String[] args) {
        int[] data = {20, 60, 80, 50, 30, 10, 70, 40};

        System.out.println("Data SEBELUM diurutkan:");
        System.out.println(Arrays.toString(data));

        // Memanggil fungsi quick sort (array, indeks_awal, indeks_akhir)
        quickSort(data, 0, data.length - 1);

        System.out.println("\nData SESUDAH diurutkan:");
        System.out.println(Arrays.toString(data));
    }

    // Fungsi Utama Quick Sort (Rekursif)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Urutkan partisi dan dapatkan indeks posisi pivot yang benar
            int indeksPivot = partition(arr, low, high);

            // Jalankan rekursif untuk sisi kiri dan kanan pivot
            quickSort(arr, low, indeksPivot - 1);
            quickSort(arr, indeksPivot + 1, high);
        }
    }

    // Fungsi untuk membagi partisi array
    public static int partition(int[] arr, int low, int high) {
        // Memilih elemen paling kanan sebagai pivot
        int pivot = arr[high];
        int i = (low - 1); // Indeks untuk elemen yang lebih kecil

        for (int j = low; j < high; j++) {
            // Jika elemen saat ini lebih kecil dari pivot
            if (arr[j] < pivot) {
                i++;
                // Tukar arr[i] dengan arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Tukar pivot (arr[high]) dengan elemen di posisi i + 1
        // Langkah ini menempatkan pivot di posisi akhir yang benar
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Mengembalikan indeks posisi pivot
    }
}