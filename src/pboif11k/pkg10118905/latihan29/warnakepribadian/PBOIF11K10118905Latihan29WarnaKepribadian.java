/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan29.warnakepribadian;

import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: 
 */
public class PBOIF11K10118905Latihan29WarnaKepribadian {

    /**
     * 
     */
    //text
    public static final String TXT_MERAH = "\u001B[31m";
    public static final String TXT_HIJAU = "\u001B[32m";
    public static final String TXT_KUNING = "\u001B[33m";
    public static final String TXT_BIRU = "\u001B[34m";
    public static final String TXT_UNGU = "\u001B[35m";
    public static final String TXT_CYAN = "\u001B[46m";
    public static final String TXT_PUTIH = "\u001B[37m";
    public static final String DEFAULT = "\u001B[0m";
    
    //BACKGROUND
    public static final String BG_MERAH = "\u001B[41m";
    public static final String BG_HIJAU = "\u001B[42m";
    public static final String BG_KUNING = "\u001B[43m";
    public static final String BG_BIRU = "\u001B[44m";
    public static final String BG_UNGU = "\u001B[45m";
    public static final String BG_PUTIH = "\u001B[47m";
    
    public static final String pribadi_merah[] = {
        "periang,","pemberani,","berani mengambil resiko dalam setiap langkah,","menyukai tantangan,","kurang sabar,","dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahanya akan sulit dikontrol,","memiliki energi kehangantan dan cinta."
    };
    
    public static final String pribadi_hijau[]= {
        "romantis,","menyukai hal yang berbau alami dan keindahan,","teguh pada prinsip,","mengiginkan kesempurnaan,"," mudah cemburu,","mudah merasairi,","menjunjug tinggi suatu niai toleransi dan kepercayaan."
    };
    
    public static final String pribadi_kuning[]={
        "optimis,","suka bergaul,","periang,","suka menolong,","lincah dan aktif,","tidak suka meremehkan kekurangan orang lain,","loyal,","hangat,","meskipun karakternya optimis dan idealis , seringkali goyah dan tidak stabil,","cenderung penakut."
    };
    
    public static final String pribadi_biru[] = {
      "menyenangkan,","bijaksana,","pembawaan diri tenang saat menghadapi masalah,","dinais,","senang berbagi,","bersahabat,","tidak terlalu suka menjadi sorotan banyak orang,","menyembunyikan perasaan karena karakternya yang cenderung mencari damai."  
    };
    
    public static final String pribadi_ungu[]= {
        "optimis,","tidak pernah ragu,","menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,","memiliki ambisi besar,","memiliki empati besar,","memiliki sisi misterius sebab seringkali menutupi perasaanya,","terkadang bersikap keras kepala dan angkuh."
    };
    
    public static void kepribadian(String[]warna){
        int jml = warna.length;
        for (int i = 0; i < jml; i++){
            System.out.println((i+1)+". "+warna[i]);
        }
    }
    
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(TXT_MERAH+"YUK "+TXT_HIJAU+"CEK "+TXT_KUNING+"KEPRIBADINMU "+"DARI "+TXT_UNGU+"WARNA "+TXT_BIRU+"FAVORITMU");
        System.out.println(DEFAULT+TXT_PUTIH);
        System.out.println(BG_MERAH+"   MERAH   ");
        System.out.println(BG_HIJAU+"   HIJAU   ");
        System.out.println(BG_KUNING+"  KUNING  ");
        System.out.println(BG_BIRU+"    BIRU    ");
        System.out.println(BG_UNGU+"    UNGU    "+DEFAULT);
        System.out.println("PILIH WARNA FAVORITMU :");
        String warna = sc.next();
        warna = warna.toUpperCase();
        System.out.println("NAMA KAMU :");
        String nama = sc.next();
        System.out.println("=======HASIL TES KEPRIBADIAN"+nama+"=======");
        switch (warna.toLowerCase()){
            case "merah":
                System.out.println("Warna favoritmu adalah "+TXT_MERAH+warna+DEFAULT);
                kepribadian(pribadi_merah);
                break;
            case "hijau":
                System.out.println("Warna favoritmu adalah "+TXT_HIJAU+warna+DEFAULT);
                kepribadian(pribadi_hijau);
                break;
            case "kuning":
                System.out.println("Warna favoritmu adalah "+TXT_KUNING+warna+DEFAULT);
                kepribadian(pribadi_kuning);
                break;
            case "biru":
                System.out.println("Warna favoritmu adalah "+TXT_BIRU+warna+DEFAULT);
                kepribadian(pribadi_biru);
                break;
            case "ungu":
                System.out.println("Warna favoritmu adalah "+TXT_UNGU+warna+DEFAULT);
                kepribadian(pribadi_ungu);
                break;   
            default:
                System.out.println(DEFAULT+"Oops... Belum teridentifikasi");
        }
    }
}