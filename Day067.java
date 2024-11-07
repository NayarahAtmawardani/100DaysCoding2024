public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai waktu detik");
        int a = in.nextInt();

        System.out.print("Masukkan jenis konversi(Menit, Jam atau hari)");
        String b = in.nextLine();

        switch (b) {
            case "menit":
                menit(a);
                break;
            case "jam":
                jam(a);
                break;
            case "hari":
                hari(a);
                break;

            default:
                System.out.println("error");
                break;
        }

        in.close();
    }

    public static void menit(int a) {
        //method  untuk mengkonversi detik ke menit
        int hasil = a / 60;
        System.out.println("hasilnya adalah " + hasil);
    }

    public static void jam(int a) {
        //method untuk mengkonversi detik ke jam
        int hasil = a / 3600;
        System.out.println("hasilnya adalah " + hasil);
    }

    public static void hari(int a) {
        //method untuk mengkonversi detik ke hari
        int hasil = a / 86400;
        System.out.println("hasilnya adalah " + hasil);
    }
