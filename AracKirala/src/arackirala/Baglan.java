/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackirala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Baglan {
    public static Statement dbState() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db_galeri", "sa", "as");
            Statement stmt = connection.createStatement();
            return stmt;
        } catch (Exception e) {
            System.out.println("Database Bağlantısı Kurulurken bir hata oluştu...");
            return null;
        }
    }
    public void AracEkle( String aracAd, String marka, String yil, String yakit, int fiyat) {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        try {
            ArrayList liste = new ArrayList();
            String sorgu1 = String.format("select * from tbl_arac");
            ResultSet ekleme1 = dbState().executeQuery(sorgu1);
            while (ekleme1.next()) {
                liste.add(ekleme1.getString("ID"));
            }
            int deger = liste.size();
            String sorgu = String.format("insert into tbl_arac values(%d,'%s','%s','%s','%s',%d, %d)", (deger+ 1), aracAd, marka, yil, yakit,0 ,fiyat);
            int ekleme = dbState().executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void MusteriEkle(String adSoyad, int tc, int dogum) {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        try {
            ArrayList liste = new ArrayList();
            String sorgu1 = String.format("select * from tbl_musteri");
            ResultSet ekleme1 = dbState().executeQuery(sorgu1);
            while (ekleme1.next()) {
                liste.add(ekleme1.getString("ID"));
            }
            int deger = liste.size();
            String sorgu = String.format("insert into tbl_musteri values(%d,'%s',%d,%d)", (deger+ 1), adSoyad, tc, dogum);
            int ekleme = dbState().executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void AracKirala(int arac, int musteri, String baslangic, String bitis, int ucret, int gun, int odeme) {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        try {
            ArrayList liste = new ArrayList();
            String sorgu1 = String.format("select * from tbl_kirala");
            ResultSet ekleme1 = dbState().executeQuery(sorgu1);
            while (ekleme1.next()) {
                liste.add(ekleme1.getString("ID"));
            }
            int deger = liste.size();
            String sorgu = String.format("insert into tbl_kirala values( %d, %d, %d, '%s','%s', %d, %d, %d)", (deger + 1), arac, musteri, baslangic, bitis, ucret, gun, odeme);
            int ekleme = dbState().executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
}
