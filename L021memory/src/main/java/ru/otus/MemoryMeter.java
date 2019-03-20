package ru.otus;

public class MemoryMeter {
    int size;

    public MemoryMeter(int sz){
        this.size = sz;
    }

    public void MeasureMemory(CakeFactory CF) throws InterruptedException {
        System.out.println("Start");

        long mem = getMem();
        System.out.println("Mem: " + mem);

        Object[] array = new Object[size];
        long mem2 = getMem();
        System.out.println("Ref size: " + (mem2 - mem) / array.length);

        for(int i = 1;i<size;i++){
            array[i] = CF.cookRandomCake();
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
