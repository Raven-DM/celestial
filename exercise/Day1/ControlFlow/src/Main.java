public class Main {
    public static void main(String[] args) {
        System.out.println("Bilangan Genap 1-20:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        int angka = 5;
        int faktorial = 1;

        for (int j = 1; j <= angka; j++) {
            faktorial *= j;
        }
        System.out.print("Faktorial dari " + angka + " adalah: " + faktorial);
    }


//    public static void  main(String[] args) {
//        int skor = 75;
//
//        if (skor >= 85) {
//            System.out.println("Nilai: A");
//        } else if (skor >= 70) {
//            System.out.println("Nilai: B");
//        } else {
//            System.out.println("Nilai: C");
//        }
//
//        int hari = 2;
//
//        switch (hari) {
//            case 1:
//                System.out.println("Senin");
//                break;
//            case 2:
//                System.out.println("Selasa");
//                break;
//            case 3:
//                System.out.println("Rabu");
//                break;
//            default:
//                System.out.println("Hari tidak ditemukan");
//        }
//    }
//    public static void  main(String[] args) {
//        int angka = 3;
//
//        while (angka <= 6) {
//            System.out.println("Angka tidak valid: " + angka);
//            angka++;
//        }
//
//        System.out.println("Angka valid ditemukan: " + angka);
//
//
//
//        do {
//            System.out.println("Angka ga valid: " + angka);
//            angka++;
//        } while (angka <= 6);
//
//        System.out.println("Angka yg valid ditemukan: " + angka);
//    }
//
//

}