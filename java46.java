package Java46;

import java.util.Arrays;
import java.util.Random;

public class java46 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] dizi = new int[8];
        for(int i=0; i<dizi.length; i++){
            dizi[i] = rand.nextInt(1, 15);
        }
        System.out.println(Arrays.toString(dizi));
        System.out.println("Tekrar sayıları: ");
        int count=0;
        Arrays.sort(dizi);
        for(int i=0; i<dizi.length; i++){
            for(int j=0; j<dizi.length; j++){
                if(dizi[i] == dizi[j]) count++;
            }
            if(count > 1 && dizi[i] != dizi[i-1]) System.out.println(dizi[i] + " sayısı " + (count-1) + " kez tekrar edildi.");
            count =0;
        }
    }
}
