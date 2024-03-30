package Pertemuan5;
public class faktorial {
    public int nilai;
    public int faktorialBF(int n){
        int fakto=n,i=1;
        while (i<n) {
            fakto=fakto*i;
            System.out.println(fakto);
            i++;
        }
        return fakto;
    }
    public int faktorialDC(int n){
        if (n==1) {
            return 1;
        }
        else{
            int fakto=n*faktorialDC(n-1);
            System.out.println(fakto);
            return fakto;
        }
    }
}
