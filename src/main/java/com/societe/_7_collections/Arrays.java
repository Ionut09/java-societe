package com.societe._7_collections;

public class Arrays {

    public static void main(String... args) {
        int[] arr = new int[3]; //{0,0,0}
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;

        arr = new int[]{2, 5, 9, 7}; //int 32, cu 4 elemente --> 128 biti in total
//      arr.length -> 4
        arr[4] = 3;

        //adresa de memorie a lui arr e 2900 stiind indexul (2)
//        2900 + 2 * 32 --> 9
//        2900 + 0 * 32 --> 2

        arr[3] = 100; // adrDeInceputAArrayului + index * memoriaElementului
//      O(1) -> constanta pt access bazat pe index
    }

}
