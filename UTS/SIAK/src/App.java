import java.util.Scanner;
import java.util.ArrayList;

import edu.uph.SIAK.model.KartuHasilStudi;
import edu.uph.SIAK.model.dosen;
import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.matakuliah;
import edu.uph.SIAK.model.nilaistudi;
import edu.uph.SIAK.model.vClass;
import edu.uph.SIAK.model.jadwalkuliah;

/* @author: Nicky || 03082180028 || 18TI2 */

public class App {
    public static void main(String[] args) throws Exception {
        // mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false);
        // mahasiswa mhs2 = new mahasiswa("SriRahayu", "01210121",true);
        // mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true);

        
        // jadwalkuliah jadwalkuliah = new jadwalkuliah();
        // dosen dsn1 = new dosen ("Mr.Kiki","03082180028",false);
        // matakuliah matkul = new matakuliah("Leadership & Enterpreneurship");
        // vClass vClass = new vClass("18TI2");
        // jadwalkuliah.tambahMahasiswa(mhs1);
        // jadwalkuliah.tambahMahasiswa(mhs2);
        // jadwalkuliah.tambahMahasiswa(mhs3);
        // jadwalkuliah.setDosen(dsn1);
        // jadwalkuliah.setMatakuliah(matkul);
        // jadwalkuliah.setVClass(vClass);

        // jadwalkuliah.tampilkanJadwalKuliah();

        mahasiswa mhs1 = new mahasiswa("Nicky", "03082180028", false);
        matakuliah matkul = new matakuliah("MK001", "Pemogramman Berorientasi Objek", 4);
        ArrayList<nilaistudi> ListNilaiStudi = new ArrayList<nilaistudi>();
        ListNilaiStudi.add(new nilaistudi(matkul, 'A', 'B'));
        KartuHasilStudi kartuHasilStudi = new KartuHasilStudi(6, mhs1, ListNilaiStudi);

        // mahasiswa mhs2 = new mahasiswa("Kiki", "01210-131", false);
        // matakuliah matkul2 = new matakuliah("MK002", "Object Oriented Programming", 4);
        // ArrayList<nilaistudi> ListNilaiStudi2 = new ArrayList<nilaistudi>();
        // ListNilaiStudi.add(new nilaistudi(matkul, 'C'));
        // KartuHasilStudi kartuHasilStudi2 = new KartuHasilStudi(3, mhs2, ListNilaiStudi2);
 

        Scanner scan = new Scanner (System.in);
        boolean restart = true;

        while (restart){
            System.out.println("Menu: \n");
            System.out.println("1.Tampilkan KHS \n2.Keluar \n");
            while (!scan.hasNextInt()){
                System.out.println("Masukkan Angka!");
                scan.next();}
            int Menu = scan.nextInt();
            switch(Menu) {

                case 1:
                System.out.println("Tampilan KHS");
                kartuHasilStudi.tampilkanKHS();
                break;

                case 2:
                restart = false;

            }

    }
    }
}
