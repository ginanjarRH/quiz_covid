package com.example.quizgame;

public class SoalPilihanGanda {

        //membuat array untuk pertanyaan
        public String pertanyaan[] = {
                "Nama pandemic berasal dari China masuk indonesia akhir Februari 2020 ?",
                "Kepanjangan Covid19 ?",
                "Media Penyebaran Covid19 secara umum melalui ?",
                "Covid19 adalah virus yang menginfeksi sistem ?",
                "Nama organisasi penanggulangan covid19 di indonesia ?",
                "Cara mendeteksi Covid 19 adalah ?",
                "Kebijakan pemerintah dalam menangani Covid19",
                "Covid19 adalah jenis ?",
                "Vitamin yang dibutuhkan tubuh untuk penangkal covid19",
        };

        //membuat array untuk pilihan jawaban
        private String pilihanJawaban[][] = {
                {"Covid19","Sars","Flu Burung"},
                {"Cacar Virus 19","Corona Vaksin 19","Corona Virus 19"},
                {"Udara","Bersentuhan","Tranfusi darah"},
                {"Pencernaan","Pernafasan","Penglihatan"},
                {"Gugas Covid","Gugus Depan","Gugus Darurat"},
                {"Tes PCR","Tes Urine","Tes Jantung"},
                {"Memberikan bantuan tunai","Psbb","Harap Tenang"},
                {"Jamur","Penyakit","Virus"},
                {"A dan B","B dan C","C dan D"},
        };

        //membuat array untuk jawaban benar
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

        //membuat getter untuk mengambil pilihan jawaban 1
        public String getPilihanJawaban1(int x){
            String jawaban1 = pilihanJawaban[x][0];
            return jawaban1;
        }

        //membuat getter untuk mengambil pilihan jawaban 2
        public String getPilihanJawaban2(int x){
            String jawaban2 = pilihanJawaban[x][1];
            return jawaban2;
        }

        //membuat getter untuk mengambil pilihan jawaban 3
        public String getPilihanJawaban3(int x){
            String jawaban3 = pilihanJawaban[x][2];
            return jawaban3;
        }

        //membuat getter untuk mengambil jawaban benar
        public String getJawabanBenar(int x){
            String jawaban = jawabanBenar[x];
            return jawaban;
        }

}
