package com.gurumalas.ulamakalsel;

import java.util.ArrayList;


class DataUlamaBanjar {
    private static String[] NamaUlamaBanjar = {
            "Syekh Muhammad Arsyad Al Banjari", //1
            "Syekh Muhammad Zaini bin Abdul Ghani", //2
            "Syekh Abdussamad", //3
            "Syekh Muhammad Nafis Al Banjari", //4
            "Syekh Abdul Hamid Abulung", //5
            "Syekh Jamaluddin Surgi Mufti", //6
            "Habib Hamid bin Abbas Bahasyim", //7
            "Syekh Abdurrahman Siddiq", //8
            "Tuan Guru Zainal Ilmi Dalam Pagar", //9
            "Tuan Guru Kasyful Anwar" //10
    };

    private static String[] Detailulama = {
            "ulama banjar.", //1
            "ulama banjar.", //2
            "ulama banjar.", //3
            "ulama banjar.", //4
            "ulama banjar.", //5
            "ulama banjar.", //6
            "ulama banjar.", //7
            "ulama banjar.", //8
            "ulama banjar.", //9
            "ulama banjarr." //10
    };
    private static int[] Gambarulama = {
            R.drawable.syekhmuhammadarsyadalbanjari,
            R.drawable.gurusekumpul,
            R.drawable.syekhabdussamad,
            R.drawable.syekhmuhammadnafisalbanjari,
            R.drawable.syekhabdulhamidabulung,
            R.drawable.syekhjamaluddinsurgimufti,
            R.drawable.habibhamidbinabbasbahasyim,
            R.drawable.syekhabudurahmansiddiq,
            R.drawable.tuanguruzainalilmidalampagar,
            R.drawable.khkasyfulanwar
    };

    static ArrayList<Ulamabanjar> getListData() {
        ArrayList<Ulamabanjar> list = new ArrayList<>();
        for (int position = 0; position < NamaUlamaBanjar.length; position++) {
            Ulamabanjar ulamabanjar = new Ulamabanjar();
            ulamabanjar.setNama(NamaUlamaBanjar[position]);
            ulamabanjar.setDetail(Detailulama[position]);
            ulamabanjar.setPhoto(Gambarulama[position]);
//            Ulamabanjar.setPhoto(Gambarulama[position]);
            list.add(ulamabanjar);
        }
        return list;
    }
}
