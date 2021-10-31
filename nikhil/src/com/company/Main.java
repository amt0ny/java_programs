class MergeSort
{
    void merge(int Arr[], int lt, int mid, int rt)
    {
        int L1 = mid - lt + 1;
        int L2 = rt - mid;
        int left[] = new int[L1];
        int right[] = new int[L2];
        for (int i = 0; i < L1; i++)
            left[i] = Arr[lt + i];
        for (int j = 0; j < L2; j++)
            right[j] = Arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = j;
        while (i < L1 && j < L2) {
            if (left[i] <= right[j]) {
                Arr[k] = left[i];
                i++;
            }
            else {
                Arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < L1)
            Arr[k++] = left[i++];

        while (j < L2)
            Arr[k++] = right[j++];
    }
    void Merge_sort(int Arr[], int l, int r)
    {
        if (l < r) {
            int mid =l+ (r-l)/2;
            Merge_sort(Arr, l, mid);
            Merge_sort(Arr, mid + 1, r);
            merge(Arr, l, mid, r);
        }
    }
    static void Display_array(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int array[] = {1,6,3,2,7,5,8,4};
        System.out.println("Given array is: ");
        Display_array(array);
        MergeSort ob = new MergeSort();
        ob.Merge_sort(array, 0, array.length - 1);
        System.out.println("\nSorted array is: ");
        Display_array(array);
    }
}
