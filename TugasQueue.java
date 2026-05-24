import java.util.LinkedList;
import java.util.Queue;

public class TugasQueue {
    public static void main(String[] args) {
        Queue<Integer> antrean = new LinkedList<>();
        int[] dataMasuk = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.println("=== PROSES ENQUEUE (MASUK ANTREAN ===");
        for(int data : dataMasuk) {
            antrean.add(data);
            System.out.println("ENQUEUE: " + data + "-> ISI QUEUE SAAT INI: " + antrean);

        }
        System.out.println("\nISI QUEUE SEBELUM PROSES DEQUEUE: ");
        System.out.println(antrean);

        System.out.println("\n=== PROSES DEQUEUE (KELUAR ANTREAN) ===");

        for (int i = 0; i < 3; i++) {
            int dataKeluar = antrean.poll();
            System.out.println("DEQUEUE DATA: " + dataKeluar);

        }
        System.out.println("\nISI QUEUE SESUDAH PROSES DEQUEUE: ");
        System.out.println(antrean);
    }
}