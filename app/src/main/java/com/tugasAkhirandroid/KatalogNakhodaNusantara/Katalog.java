package com.tugasAkhirandroid.KatalogNakhodaNusantara;

import android.graphics.drawable.Drawable;

public class Katalog {
    String judul;
    String deskripsi;
    Drawable image;

    Katalog(String judul, String deskripsi, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.image = image;
    }
}
