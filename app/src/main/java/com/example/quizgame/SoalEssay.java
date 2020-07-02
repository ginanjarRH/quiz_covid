package com.example.quizgame;

public class SoalEssay {
    public String pertanyaan[] = {
            "",
            "",
            "",
            "Covid19 adalah virus yang menginfeksi sistem ?",
            "Nama organisasi penanggulangan covid19 di indonesia ?",
            "Cara mendeteksi Covid 19 adalah ?",
            "",
            "",
            "Vitamin yang dibutuhkan tubuh untuk penangkal covid19",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "covid",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "Covid19",
            "Corona Virus 19",
            "Bersentuhan",
            "Pernafasan",
            "Gugas Covid",
            "Tes PCR",
            "Psbb",
            "Virus",
            "C dan D",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

}
