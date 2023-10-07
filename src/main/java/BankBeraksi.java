public class BankBeraksi {
    public static void main(String[] args) {
        Bank bankku = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankku.getSaldo());
        System.out.println();
        bankku.simpanuang(500000);
        System.out.println("Simpan uang Rp. 500000");
        System.out.println("Saldo saat ini: Rp. " + bankku.getSaldo());
        System.out.println();
        bankku.ambiluang(150000);
        System.out.println("Ambil uang Rp. 150000");
        System.out.println("Saldo saat ini: Rp. " + bankku.getSaldo());
    }
}
