package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import android.content.Context;

import java.util.ArrayList;

public class KemejaData {
    public static ArrayList<Katalog> getData(Context context) {
        ArrayList<Katalog> list = new ArrayList<Katalog>();
        list.add(new Katalog("America Drill", "American Drill merupakan kain yang sangat direkomendasikan untuk bahan dasar pembuatan kemeja lapangan(PDL), seragam perusahaan, seragam sekolah, jas almamater dan celana formal. Kain ini bertekstur miring atau diagonal memiliki jalinan benang yang cukup kuat.", context.getDrawable(R.drawable.amdrill)));
        list.add(new Katalog("Japan Drill", "Japan Drill merupakan bahan kain yang berserat tinggi membuat kain ini begitu kuat. Kain ini memiliki karakteristik permukaan lembut, komposisi kain japan drill memiliki serat benang yang tebal namun tetap adem jika digunakan",context.getDrawable(R.drawable.jpndrill)));
        list.add(new Katalog("Oxford", "Bahan kain oxford adalah bahan kain yang terbuat dari katun dengan campuran teteron. Katun oxford memiliki serat yang rapat dan halus.", context.getDrawable(R.drawable.oxford)));
        list.add(new Katalog("Ripstok", "Ribstop merupakan bahan kain yang sangat rekomendasi untuk seragam dan baju safety yang berkegiatan di lapangan. Kain Ribstop memiliki ketahan yang baik untuk penggunaan outdoor. ", context.getDrawable(R.drawable.ribstok)));
        list.add(new Katalog("Taipan Drill", "Kain Taipan Drill ini sangat nyaman, lembut, halus dan merupakan kualitas drill nomor 1 untuk saat ini. Banyak pemakai bahan ini yang tidak ingin pindah ke lain merk Dikarenakan kualitasnya yang memang mumpuni.", context.getDrawable(R.drawable.taipandrill)));
        return list;
    }
}
