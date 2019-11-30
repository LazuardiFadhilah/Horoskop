import java.util.Scanner;
public class horosko{
    public static void main(String[]args){
    Scanner masuk = new Scanner(System.in);
    int tg,bl;
    System.out.println("Masukkan tanggal lahir anda :");
    tg = masuk.nextInt();
    
    System.out.println("Masukkan bulan lahir anda (1-12) :");
    bl = masuk.nextInt();
    
    if(bl==1){
     if(tg<=19){
        System.out.println("Zodiak anda Capricorn");
        System.out.println("UMUM : Manfaatkan IT yang tersedia");
        System.out.println("CINTA : Lagi mesra mesranya");
        }
        else if(tg<=31){
        System.out.println("Zodiak anda Aquarius");
        System.out.println("UMUM : jangan bertindak yang tidak lazim");
        System.out.println("KEUANGANMU : atur keuanganmu");
        System.out.println("CINTA : ada yang naksir kamu");
        }
        else{
        System.out.println("Tanggal yang anda masukan salah");
        }
    }
    else if (bl==2) //seleksi bulan kedua
        {
        if (tg<=18)     //seleksi pd tnggl 1-13 bulan 2
        {
            System.out.println("Zodiak Anda AQUARIUS");
            System.out.println("UMUM : Jangan bertindak yang tak lazim");
                System.out.println("Keuangan : Atur keuangan kamu");
                System.out.println("Cinta : Ada yang naksir kamu");
        }
        else if (tg<=29)    //seleksi pd tanggal 19-29 bulan 2
        {
            System.out.println("Zodiak Anda PISCES");
            System.out.println("UMUM : Luangkan waktu untuk bersantai");
            System.out.println("Keuangan : Keuangan kamu lagi menipis");
            System.out.println("Cinta : Kamu lagi butuh perhatian saat ini");
        }
        else
        {
            System.out.println("Tanggal Yang Anda Masukkan Salah!!");
        }
        }
        else if (bl==3) //seleksi bulan ke-3
        {
        if (tg<=20)     //seleksi pd tanggal 1-20 bulan 3
        {
            System.out.println("Zodiak Anda PISCES");
            System.out.println("UMUM : Luangkan waktu untuk bersantai");
            System.out.println("Keuangan : Keuangan kamu lagi menipis");
            System.out.println("Cinta : Kamu lagi butuh perhatian saat ini");
        }
        else if (tg<=31)    //seleksi pd tanggal 21-31 bulan 3
        {
            System.out.println("Zodiak Anda ARIES");
            System.out.println("UMUM : Ada awal baru di awal pekan ini");
            System.out.println("Keuangan : Jangan boros");
            System.out.println("Cinta : Dia lagi butuh perhatian mu");
        }
        else    //jika memasukkan angka bukan 1-31 maka akan tampil pesan
        {
            System.out.println("Tanggal Yang Anda Masukkan Salah!!");
        }
        }
        else if (bl==4)
        {
        if (tg<=20)
        {
            System.out.println("Zodiak Anda ARIES\n");
            System.out.println("UMUM \t: Ada awal baru di awal pekan ini\n");
            System.out.println("Keuangan \t: Jangan boros\n");
            System.out.println("Cinta \t: Dia lagi butuh perhatian mu");
        }
        else if (tg<=30)
        {
            System.out.println("Zodiak Anda TAURUS\n");
            System.out.println("UMUM \t: Waktunya merubah sikap Mu\n");
            System.out.println("Keuangan \t: Keuangan Lancar\n");
            System.out.println("Cinta \t: Lagi ada masalah");
        }
        else
        {
            System.out.println("Tanggal Yang Anda Masukkan Salah!!");
        }
        }
        else if (bl==5)
        {
        if (tg<=20)
        {
            System.out.println("Zodiak Anda TAURUS\n");
            System.out.println("UMUM \t: Waktunya merubah sikap Mu\n");
            System.out.println("Keuangan \t: Keuangan Lancar\n");
            System.out.println("Cinta \t: Lagi ada masalah");
        }
        else if (tg<=31)
        {
            System.out.println("Zodiak Anda GEMINI\n");
            System.out.println("UMUM \t: Ada persoalan dihidup MU\n");
            System.out.println("Keuangan \t: Keuangan lagi boros\n");
            System.out.println("Cinta \t: Mulailah PDKT dengan dia");
        }
        else
            System.out.println("Tanggal Yang Anda Masukkan Salah!!");
        }
    
       
        else if (bl==6)
        {
        if (tg<=20)
        {
            System.out.println("Zodiak Anda GEMINI\n");
            System.out.println("UMUM \t: Ada persoalan dihidup MU\n");
            System.out.println("Keuangan \t: Keuangan lagi boros\n");
            System.out.println("Cinta \t: Mulailah PDKT dengan dia");
        }
        else if (tg<=30)
        {
            System.out.println("Zodiak Anda CANCER\n");
            System.out.println("UMUM \t: mulailah berpikir dewasa\n");
            System.out.println("Keuangan \t: lagi bokek\n");
            System.out.println("Cinta \t: maafkanlah kesalahan dia");
        }
        else
        {
            System.out.println("Tanggal Yang Anda Masukkan Salah!!");
        }
        }
        else if (bl==7)
        {
        if (tg<=20)
        {
            System.out.println("Zodiak Anda CANCER\n");
            System.out.println("UMUM \t: mulailah berpikir dewasa\n");
            System.out.println("Keuangan \t: lagi bokek\n");
            System.out.println("Cinta \t: maafkanlah kesalahan dia");
        }
        else if (tg<=31)
        {
            System.out.println("Zodiak Anda LEO\n");
            System.out.println("UMUM \t: belajarlah dari pengalaman hidup mu\n");
            System.out.println("Keuangan \t: lagi bokek\n");
            System.out.println("Cinta \t: jangan terlalu kasar dengan nya");
        }
        else
        {
            System.out.println("Tanggal Yang Anda Masukkan Salah!!");
        }
        }
        else if (bl==8)
        {
        if (tg<=21)
        {
            System.out.println("Zodiak Anda LEO\n");
            System.out.println("UMUM \t: belajarlah dari pengalaman hidup mu\n");
            System.out.println("Keuangan \t: lagi bokek\n");
            System.out.println("Cinta \t: jangan terlalu kasar dengan nya");
        }
        else if (tg<=31)
        {
            System.out.println("Zodiak Anda VIRGO\n");
            System.out.println("UMUM \t: hadapi masalah mu dengan semangat\n");
            System.out.println("Keuangan \t: lagi hoki\n");
            System.out.println("Cinta \t: dia butuh bantuan mu");
        }
        else
        {
            System.out.println("tanggal yang anda masukan salah");
        }
        }
        else if (bl==9)
        {
        if (tg<=22)
        {
            System.out.println("Zodiak Anda VIRGO\n");
            System.out.println("UMUM \t: hadapi masalah mu dengan semangat\n");
            System.out.println("Keuangan \t: lagi hoki\n");
            System.out.println("Cinta \t: dia butuh bantuan mu");
        }
        else if (tg<=30)
        {
            System.out.println("Zodiak Anda LIBRA\n");
            System.out.println("UMUM \t: hargailah pendapat orang lain\n");
            System.out.println("Keuangan \t: penuh perhitungan\n");
            System.out.println("Cinta \t: dia lagi cari perhatian mu");
        }
        else
        {
            System.out.println("tanggal yang anda masukan salah");
        }
        }
        else if (bl==10)
        {
        if (tg<=22)
        {
            System.out.println("Zodiak Anda LIBRA\n");
             System.out.println("UMUM \t: hargailah pendapat orang lain\n");
             System.out.println("Keuangan \t: penuh perhitungan\n");
             System.out.println("Cinta \t: dia lagi cari perhatian mu");
        }
                else if (tg<=31)
        {
            System.out.println("Zodiak Anda SCORPION\n");
            System.out.println("UMUM \t: Perhatikan keluarga mu\n");
            System.out.println("Keuangan \t: lagi banyak pengeluaran\n");
            System.out.println("Cinta \t: lagi suka yang muda");
        }
        else
        {
            System.out.println("tanggal yang anda masukan salah");
        }
        }
        else if (bl==11)
        {
        if (tg<=22)
        {
            System.out.println("Zodiak Anda SCORPION\n");
            System.out.println("UMUM \t: Perhatikan keluarga mu\n");
            System.out.println("Keuangan \t: lagi banyak pengeluaran\n");
             System.out.println("Cinta \t: lagi suka yang muda");
            }
        else if (tg<=30)
        {
            System.out.println("Zodiak Anda SAGITARIUS\n");
            System.out.println("UMUM \t: Jadlah diri sendiri \n");
            System.out.println("Keuangan \t: lagi seret\n");
            System.out.println("Cinta \t: dia sedang cemburu sama kamu");
        }
        else
        {
            System.out.println("tanggal yang anda masukan salah");
        }
        }
        else if (bl==12)
        {
        if (tg<=20)
        {
            System.out.println("Zodiak Anda SAGITARIUS\n");
            System.out.println("UMUM \t: Jadlah diri sendiri \n");
            System.out.println("Keuangan \t: lagi seret\n");
            System.out.println("Cinta \t: dia sedang cemburu sama kamu");
        }
        else if (tg<=31)
        {
            System.out.println("Zodiak Anda CAPRICORN\n");
            System.out.println("UMUM \t: manfaatkan IT yang tesedia \n");
            System.out.println("Keuangan \t: Pas-pasan\n");
            System.out.println("Cinta \t: Lagi mesra-mesranya");
        }
        else
        {
            System.out.println("tanggal yang anda masukan salah!!");
        }
        }
        else    //jika memasukkan bulan lebih dari 12 maka akan tampil pesan
        {
            System.out.println("Bulan Yang Anda Masukkan Salah!!");
        }
    
    }
}