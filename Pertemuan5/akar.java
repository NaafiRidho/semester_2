package Pertemuan5;

public class akar {
    int akar;
    public akar(int akar){
        this.akar=akar;
    }
    int akarBF(){
        int result;
        for (int i = 0; i < akar; i++) {
            if (i*i==akar) {
                return i;
            }
            if (i * i > akar) {
                result = i - 1;
                return result;
            }
        }
        return 1;
    }
    int akarDC(){
        int left = 1, right = akar, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= akar / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
