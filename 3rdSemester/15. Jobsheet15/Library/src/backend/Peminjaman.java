package backend;

import java.util.ArrayList;
import java.sql.*;

public class Peminjaman {

    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalPinjam;
    private String tanggalKembali;

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman pem = new Peminjaman();
        // Uses Joins to get Member Name and Book Title
        String query = "SELECT "
                + "     p.idpeminjaman AS idpeminjaman, "
                + "     p.tanggalpinjam AS tanggalpinjam, "
                + "     p.tanggalkembali AS tanggalkembali, "
                + "     a.idanggota AS idanggota, "
                + "     b.idbuku AS idbuku, "
                + "     a.nama AS nama, "
                + "     b.judul AS judul "
                + "     FROM peminjaman p "
                + "     LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "     LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "     WHERE p.idpeminjaman = '" + id + "'";
        
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pem.getAnggota().setNama(rs.getString("nama"));
                pem.getBuku().setIdbuku(rs.getInt("idbuku"));
                pem.getBuku().setJudul(rs.getString("judul"));
                pem.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pem.setTanggalKembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pem;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        
        String query = "SELECT "
                + "     p.idpeminjaman AS idpeminjaman, "
                + "     p.tanggalpinjam AS tanggalpinjam, "
                + "     p.tanggalkembali AS tanggalkembali, "
                + "     a.idanggota AS idanggota, "
                + "     b.idbuku AS idbuku, "
                + "     a.nama AS nama, "
                + "     b.judul AS judul "
                + "     FROM peminjaman p "
                + "     LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "     LEFT JOIN buku b ON p.idbuku = b.idbuku ";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Peminjaman pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pem.getAnggota().setNama(rs.getString("nama"));
                pem.getBuku().setIdbuku(rs.getInt("idbuku"));
                pem.getBuku().setJudul(rs.getString("judul"));
                pem.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pem.setTanggalKembali(rs.getString("tanggalkembali"));

                ListPeminjaman.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + "     '" + this.getAnggota().getIdanggota() + "', "
                    + "     '" + this.getBuku().getIdbuku() + "', "
                    + "     '" + this.tanggalPinjam + "', "
                    + "     '" + this.tanggalKembali + "' "
                    + "     )";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "     idanggota = '" + this.getAnggota().getIdanggota() + "', "
                    + "     idbuku = '" + this.getBuku().getIdbuku() + "', "
                    + "     tanggalpinjam = '" + this.tanggalPinjam + "', "
                    + "     tanggalkembali = '" + this.tanggalKembali + "' "
                    + "     WHERE idpeminjaman = '" + this.idpeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}