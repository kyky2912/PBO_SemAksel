package edu.uph.SIAK.model;

import java.util.ArrayList;
import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.nilaistudi;
import edu.uph.SIAK.model.matakuliah;

public class KartuHasilStudi {
    int Semester;
    mahasiswa mahasiswa;
    ArrayList<nilaistudi> ListNilaistudi;

    public KartuHasilStudi(int Semester, mahasiswa mahasiswa, ArrayList<nilaistudi> ListNilaistudi) {
        this.Semester = Semester;
        this.mahasiswa = mahasiswa;
        this.ListNilaistudi = ListNilaistudi;
    }

    public int getSemester() {
        return this.Semester;
    }

    public mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public double getIPK() {
        double total = 0;
        for(nilaistudi nilaiStudi: ListNilaistudi) total = total + nilaiStudi.getNilaiAngka();
        return total / this.ListNilaistudi.size();
    }

    public void tampilkanKHS() {
        System.out.println("Nama Mahasiswa: " + this.mahasiswa.getNama()+ "\n");
        System.out.println("Semester " + this.Semester+ "\n");
        System.out.println("IPK:" + this.getIPK() + "\n");
        for(nilaistudi nilaiStudi: ListNilaistudi) {
        System.out.println("Kode MataKuliah:" + "\t\t\t"+ nilaiStudi.getMatakuliah().getKodeMatakuliah());
        System.out.println("Nama MataKuliah:" + "\t\t\t" + nilaiStudi.getMatakuliah().getNamaMatakuliah());
        System.out.println("SKS MataKuliah:" + "\t\t\t\t" + nilaiStudi.getNilaiAngka() + "\n");
        }
    }

    public void tambahkanNilai(matakuliah matakuliah, char NilaiHuruf, char NilaiAngka) {
        this.ListNilaistudi.add(new nilaistudi(matakuliah, NilaiHuruf, NilaiAngka));
    }
}
