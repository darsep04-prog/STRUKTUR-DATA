import java.util.Stack;

public class TugasStack {
    public static void main(String[] args) {
        Stack<Integer> tumpukan = new Stack<>();
        int [] dataMasuk = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.println("=== PROSES PUSH (MEMASUKAN DATA) ===");
        for ( int data : dataMasuk) {
            tumpukan.push(data);
            System.out.println("PUSH: " + data + "ISI STACK SAAT INI: " + tumpukan);
        }
        System.out.println("\nISI STACK SEBELUM PROSES POP: ");
        System.out.println(tumpukan);

        System.out.println("\n=== PROSES POP (MENGELUARKAN DATA) ===");

        for (int i = 0; i < 3; i++) {
            int dataKeluar = tumpukan.pop();
            System.out.println("POP DATA: " + tumpukan);
        }
        System.out.println("\nISI STACK SESUDAH PROSES POP: ");
        System.out.println(tumpukan);
    }
}