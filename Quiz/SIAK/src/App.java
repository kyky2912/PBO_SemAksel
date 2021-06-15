import edu.uph.SIAK.model.dosen;
import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.matakuliah;
import edu.uph.SIAK.model.vClass;
import edu.uph.SIAK.model.jadwalkuliah;
public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false);
        mahasiswa mhs2 = new mahasiswa("SriRahayu", "01210121",true);
        mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true);

        
        jadwalkuliah jadwalkuliah = new jadwalkuliah();
        dosen dsn1 = new dosen ("Mr.Kiki","03082180028",false);
        matakuliah matkul = new matakuliah("Leadership & Enterpreneurship");
        vClass vClass = new vClass("18TI2");
        jadwalkuliah.tambahMahasiswa(mhs1);
        jadwalkuliah.tambahMahasiswa(mhs2);
        jadwalkuliah.tambahMahasiswa(mhs3);
        jadwalkuliah.setDosen(dsn1);
        jadwalkuliah.setMatakuliah(matkul);
        jadwalkuliah.setVClass(vClass);

        jadwalkuliah.tampilkanJadwalKuliah();

    }
}
