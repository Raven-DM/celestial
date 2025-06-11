public class Main {
    public static void  main(String[] args) {
        int skor = 75;

        if (skor >= 85) {
            System.out.println("Nilai: A");
        } else if (skor >= 70) {
            System.out.println("Nilai: B");
        } else {
            System.out.println("Nilai: C");
        }

        int hari = 2;

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak ditemukan");
        }
    }
}