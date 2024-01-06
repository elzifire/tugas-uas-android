package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import android.content.Context;

import java.util.ArrayList;

public class KaosData {
    public static ArrayList<Katalog> getData(Context context) {
        ArrayList<Katalog> list = new ArrayList<Katalog>();
        list.add(new Katalog("Cotton", "Bahan kaos cotton combed adalah bahan katun yang paling halus dan telah mengalami proses penyisiran (combed) Bahan ini pada umumnya digunakan untuk membuat kaos, baik itu kaos T-Shirt ataupun kaos polo (kaos berkerah) terlebih dahulu sebelum dipintal menjadi gulungan benang.", context.getDrawable(R.drawable.cotton)));
        list.add(new Katalog("Polyester", "PE adalah singkatan dari polyester sedangkan polyester sendiri terbuat dari dua kata poly dan ester.Kain kaos yang menggunakan bahan PE 100% memiliki harga yang paling murah. Biasanya digunakan untuk kaos partai, kaos promosi atau event, kaos suvenir, jilbab instan murah atau kaos-kaos olahraga yang yang dijual murah di pasar.", context.getDrawable(R.drawable.pe)));
        list.add(new Katalog("Lacoste", "Bahan lacoste merupakan jenis kain tipe rajutan pique yang memiliki lubang-lubang dan diperuntukan untuk bahan kaos polo.bahan lacoste ini memang terkenal mempunyai kemampuan untuk menyerap keringat dengan baik. Hal ini bukan tanpa alasan karena bahan ini mempunyai pori-pori di kedua sisinya sehingga membuat sirkulasi udara didalam bisa berjalan dengan baik. ", context.getDrawable(R.drawable.lacoste)));
        list.add(new Katalog("Carded", "Carded adalah jenis kain yang menggunakan benang carded dan komposisi nya pun sama yaitu 100% cotton atau kapas. Berbeda dengan Combed, untuk mendapatkan benang Carded, kapas diolah melalui proses Carding atau digaruk menggunakan mesin carding.", context.getDrawable(R.drawable.carded)));
        list.add(new Katalog("CVC", "Kain Lacoste CVC merupakan kain yang sangat rekomendasi untuk bahan dasar kaos berkerah atau polo terbuat dari campuran antara katun dan polyster menjadikan kain ini sangat nyaman digunakan serta memiliki daya tahan yang kuat. Bahan lacoste ini tergolong dalam bahan kaos yang merupakan jenis kain rajutan yang memiliki ciri khas tekstur berpori.", context.getDrawable(R.drawable.cvc)));
        return list;
    }
}
