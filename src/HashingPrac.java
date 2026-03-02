import java.lang.Math; import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class HashingPrac {
    public static final int N = 1 << 20;

   public static class key_value {
       String key;
       String value;

       public key_value(String key, String value) {
           this.key = key;
           this.value = value;
       }
   }
    private static void shuffle(String[] array) {
        Random ranIndex = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = ranIndex.nextInt(i + 1);
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }


    public static void main(String[] args){









        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int repetition, repetitions = 30;

        runTime = 0;
        for(repetition = 0; repetition < repetitions; repetition++) {
            start = System.currentTimeMillis();

            // call the procedures to time here:


            finish = System.currentTimeMillis();

            time = (double)(finish - start);
            runTime += time;
            runTime2 += (time*time); }

        double aveRuntime = runTime/repetitions;
        double stdDeviation =
                Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

        System.out.printf("\n\n\fStatistics\n");
        System.out.println("________________________________________________");
        System.out.println("Total time   =           " + runTime/1000 + "s.");
        System.out.println("Total time\u00b2  =           " + runTime2);
        System.out.println("Average time =           " + fiveD.format(aveRuntime/1000)
                + "s. " + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
        System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
        System.out.println("n            =           " + N );
        System.out.println("Average time / run =     " + fiveD.format(aveRuntime/N*1000)
                + '\u00B5' + "s. ");

        System.out.println("Repetitions  =             " + repetitions);
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println();
    }
}

