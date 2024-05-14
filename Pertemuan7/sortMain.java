package Pertemuan7;

public class sortMain {
    public static void main(String[] args) {
        int[] data={10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan Merge Sort");
        mergeSort mSort=new mergeSort();       
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
