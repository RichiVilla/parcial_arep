package com.mycompany.parcial;

public class BubbleSort {
    public int[] sort(int[] list){
        int cont;
        boolean flag = true;
        int a;
        int b;

        while (flag) {
            cont = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] < list[i + 1]) {
                    a = list[i];
                    b = list[i+1];

                    list[i] = b;
                    list[i+1] = a;

                    cont += 1;
                }
            }
            if (cont == 0) {
                flag = false;
            }
        }
         return list;
    }
}
