package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import android.content.Context;

import java.util.ArrayList;

public class JaketData {
    public static ArrayList<Katalog> getData(Context context) {
        ArrayList<Katalog> list = new ArrayList<Katalog>();
        list.add(new Katalog("Canvas", "Kain kanvas merupakan sejenis kain berserat tebal dan sangat kuat yang biasa digunakan untuk membuat jaket. Bahan kanvas ini dipilih karena sangat cocok untuk dijadikan bahan jaket dengan model kasual dan setengah resmi.", context.getDrawable(R.drawable.canvas)));
        list.add(new Katalog("Denim", "Bahan kain denim adalah jenis kain yang terbuat dari serat katun berwarna biru atau indigo. Kain denim merupakan jenis kain yang cukup kuat karena ditenun menggunakan katun twill weave secara diagonal. Bahan kain denim juga disebut sebagai kain jeans karena memang sering dijadikan bahan baku pembuatan jeans.", context.getDrawable(R.drawable.denim)));
        list.add(new Katalog("Taslan", "Kain Taslan termasuk ke dalam kain modern yang dirancang atau diproduksi dengan menggunakan teknologi yang canggih. Kain ini terbentuk dari jalinan serat polyester. Serat polyester yang satu ini berbeda dengan serat sejenis lainnya, karena kuat dan dapat digunakan dalam jangka waktu yang lama.", context.getDrawable(R.drawable.taslan)));
        list.add(new Katalog("Lotto", "Kain lotto memiliki tekstur kain yang halus, lembut dan juga lentur sehingga nyaman dipakai untuk berolahraga atau aktivitas lain yang banyak mengeluarkan keringat. Bahan lotto ini hampir sama seperti jenis kain brand terkenal seperti diadora dan adidas yang memang di desain khusus untuk membuat pakaian olahraga.", context.getDrawable(R.drawable.lotto)));
        list.add(new Katalog("Parasut", "Kain parasut atau dalam bahasa pabrik dikenal dengan istilah Tafetta merupakan salah satu jenis bahan kain yang tipis dan ringan. Kain ini sangat cocok jika dipakai untuk membuat cover (lapisan pelindung), furing, jaket maupun produk konveksi lainnya", context.getDrawable(R.drawable.parasut)));
        return list;
    }
}
