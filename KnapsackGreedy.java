/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsackgreedy;

import java.util.Arrays;

/**
 *
 * @author paria
 */
public class KnapsackGreedy {
    static class Item {

            char item;
            double weight;
            double value;
            double percentTaken = 0;

            public Item (char i, double wt, double val)
            {
                this.item = i;
                this.weight = wt;
                this.value = val;

            }
        }


        public static void main(String[] args)
        {
            char[] item = {'A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J'};
            int[] w = { 4,5,20,4,8,9,3,7,5,4 };
            int[] val = { 8,11,10,6,12,20,8,14,9,5};
            int cap = 30;

            Item[] items = new Item[item.length];

            for(int i = 0; i < item.length;i++){
                items[i] = new Item(item[i], w[i], val[i]);
            }

                Arrays.sort(items, (Item i1, Item i2) -> {
                    Double vw1, vw2;
                    vw1 = i1.value/i1.weight;
                    vw2 = i2.value/i2.weight;
                    return vw2.compareTo(vw1);
            });

                double totalVal = 0;
                for(Item i : items){
                    if(cap - i.weight >= 0){
                        cap -= i.weight;
                        totalVal += i.value;
                        i.percentTaken = 1;
                    }
                    else{
                        double frac = cap/i.weight;
                        totalVal += i.value * frac;
                        cap -= i.weight * frac;
                        i.percentTaken = frac;
                    }
                }
                System.out.println("Item  Wt  Val    %");
                for(Item i : items){

                    System.out.printf("%-5c %-4.0f %-4.0f %.3f\n", i.item, i.weight, i.value, i.percentTaken);
                }

                System.out.println("\nTotal value: " + totalVal);
                
      }
}
