package Coding;

public class MergeSort {

    void merge(int[] arr, int beg, int mid, int end) {

        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int l[] = new int[n1];
        int r[] = new int[n2];

        for(int i=0; i<n1; i++) {
            l[i] = arr[beg+i];
        }

        for(int j=0; j<n2; j++) {
            r[j] = arr[mid + 1 + j];
        }

        int i=0;
        int j=0;
        int k=beg;
        while(i<n1 && j<n2) {
            if(l[i]<=r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        if(i<n1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        if(j<n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int beg, int end) {
        if(beg<end) {
            int mid = beg + (end - beg)/2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = {23,13,45,38};
        ms.mergeSort(arr, 0, arr.length-1);
        for(int i : arr) {
            System.out.println(i);
        }

    }
}
