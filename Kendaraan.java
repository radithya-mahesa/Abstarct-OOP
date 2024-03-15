package OOP.Abstract;

public abstract class Kendaraan {
    private String merek, nomorPlat;
    private int tahunPembuatan;

    public Kendaraan(String merek, String nomorPlat, int tahunPembuatan) {
        this.merek = merek;
        this.nomorPlat = nomorPlat;
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getMerek() {
        return merek;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public abstract void infoKhusus();

}

class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String merek, String nomorPlat, int tahunPembuatan, int jumlahKursi) {
        super(merek, nomorPlat, tahunPembuatan);
        this.jumlahKursi = jumlahKursi;
    }


    @Override
    public void infoKhusus() {
        System.out.println("Merk Mobil : " + getMerek() + " | No.Plat : " + getNomorPlat() + " | Thn.Buat : " + getTahunPembuatan() + " | jml.Kursi : " + jumlahKursi);
    }
}

class sepedaMotor extends Kendaraan {
    private String kapasitasMesin;

    public sepedaMotor(String merek, String nomorPlat, int tahunPembuatan, String kapasitasMesin) {
        super(merek, nomorPlat, tahunPembuatan);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void infoKhusus() {
        System.out.println("Merk Motor : " + getMerek() + " | No.Plat : " + getNomorPlat() + " | Thn.Buat : " + getTahunPembuatan() + " | Kapasitas Mesin : " + kapasitasMesin);
    }
}

class Sepeda extends Kendaraan {
    private String jenisrangka;

    public Sepeda(String merek, String nomorPlat, int tahunPembuatan, String jenisrangka) {
        super(merek, nomorPlat, tahunPembuatan);
        this.jenisrangka = jenisrangka;
    }

    @Override
    public void infoKhusus() {
        System.out.println("Merk Sepeda : " + getMerek() + " | No.Plat : " + getNomorPlat() + " | Thn.Buat : " + getTahunPembuatan() + " | Jenis Rangka : " + jenisrangka);
    }
}

class KendaraanApp {
    public static void main(String[] args) {
        Mobil mbl = new Mobil("ESEMKA", "B 14 DAB", 2015, 2);
        sepedaMotor mtr = new sepedaMotor("SUPRA", "R 4 DIT ", 2009, "999cc");
        Sepeda spd = new Sepeda("ALEOCA", "G 4 RUT", 2017, "esaf");

        mbl.infoKhusus();
        mtr.infoKhusus();
        spd.infoKhusus();
    }
}
