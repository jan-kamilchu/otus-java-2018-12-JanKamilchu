package ru.otus;

public class memMain {
    public static void main(String[] args)throws InterruptedException{

        int size = 20000000;
        System.out.println("Start");

        SweetCakeFactory scf = new SweetCakeFactory();
        PanCakeFactory pcf = new PanCakeFactory();

        long mem = getMem();
        System.out.println("Mem: " + mem);

        Object[] array = new Object[size];
        long mem2 = getMem();
        System.out.println("Ref size: " + (mem2 - mem) / array.length);

/*        for(int i = 1;i<size;i++){
            array[i] = scf.cookTheCake(i,"Sweet cake "+i);
        }

        long mem3 = getMem();
        System.out.println("Size of full object: " + (mem3 - mem2) / array.length);*/

        for(int i = 1;i<size;i++){
            array[i] = pcf.cookTheCake(i,"");
        }

        long mem4 = getMem();
        System.out.println("Size of null-name object: " + (mem4 - mem2) / array.length);

        System.out.println("Finish");

    }
    private static long getMem() throws InterruptedException {
        System.gc();
        Thread.sleep(10);
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
