package com.beightlyouch.gunma;

public class QuizDataCity {
    private static final String poolcity[][]= new String[][]{
            //画像のファイル名：ほんとは数字でいいのかな
            {"annaka","kawaba","nanmoku","showa","chiyoda","kiryu","numata","takasaki","fujioka",
                    "kusatsu","oizumi","takayama","higashiagatsuma","maebashi","ota","tamamura",
                    "isesaki","meiwa","oura","tatebayashi","itakura","midori","tomioka",
                    "kanna","minakami","shibukawa","tsumagoi","kanra","naganohara","shimonita",
                    "ueno","katashina","nakanojo","shinto","yoshioka"
            },

            {"安中市", "川場村", "南牧村", "昭和村", "千代田町", "桐生市", "沼田市", "高崎市", "藤岡市",
                    "草津町", "大泉町", "高山村", "東吾妻町", "前橋市", "太田市", "玉村町",
                    "伊勢崎市", "明和町", "邑楽町", "館林市", "板倉町", "みどり市", "富岡市",
                    "神流町", "みなかみ町", "渋川市", "嬬恋村", "甘楽町", "長野原町", "下仁田町",
                    "上野村", "片品村", "中之条町", "榛東村", "吉岡町"
            }};
    public static String[][] getPoolcity(){
        return QuizDataCity.poolcity;
    }

    public static int getCityNum(){
        return poolcity.length;
    }
}
