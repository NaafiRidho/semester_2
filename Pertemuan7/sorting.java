package Pertemuan7;

public class sorting {
    public static void sequensialSearch(int [] arr,int key){

        int posisi= -1;
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]) {
                System.out.println("Data ditemukan pada index ke-"+i);
                posisi=i;
            }
        }
        if (posisi==-1) {
            System.out.println("Data tidak ditemukan");
            
        }
    }
    public static int binarySearchAsc(int[]arr,int key){
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid =start+(end -start)/2;

            if (arr[mid]==key) {
                return mid;
            }
            if (arr[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]sortedNilai={10,5,20,15,5,45};
        sequensialSearch(sortedNilai, 5);

        // if (index!=-1) {
        //     System.out.println("Data Ditemukan pada index ke- "+index);
        // }
        // else{
        //     System.out.println("Data tidak ditemukan");
        // }
    }
}
