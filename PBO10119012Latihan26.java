package pbo10119012latihan26;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author damai
 * NAMA   : DAMAI SAPUTRA LAOLI
 * KELAS  : IF 1
 * NIM    : 10119012
 * 
 */
public class PBO10119012Latihan26 {

    
    public static void main(String[] args) {
        int hari, tanggal, bulan, tahun, jam, menit, detik;
          GregorianCalendar waktu = new GregorianCalendar();
          String nama_bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
          String nama_hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
          hari = waktu.get(Calendar.DAY_OF_WEEK);
          tanggal = waktu.get(Calendar.DAY_OF_MONTH);
          bulan = waktu.get(Calendar.MONTH);
          tahun = waktu.get(Calendar.YEAR);
          jam =  waktu.get(Calendar.HOUR_OF_DAY);
          menit = waktu.get(Calendar.MINUTE);
          detik = waktu.get(Calendar.SECOND);
          System.out.println("Hari ini adalah hari : "+nama_hari[hari]+", "+tanggal+" "+nama_bulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
        }
    }



