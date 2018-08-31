   // Complete the maxDifference function below.
    static int maxDifference(int[] a) {
        int max_diff = a[1] - a[0];
        int min_element = a[0];
        int i, len=a.length;
        int flag=0;
        for (i = 1; i < len; i++) 
        {
            if (a[i] - min_element > max_diff)
            {
                max_diff = a[i] - min_element;
            }
            if (a[i] < min_element)
            {
                min_element = a[i];
            }
            if(flag==0)
            {
                if(a[i-1]<a[i])
                {
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            return -1;
        }
        return max_diff;

    }
