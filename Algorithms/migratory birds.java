static int migratoryBirds(List<Integer> arr) {
        int ar[]=new int[5];
        int max=0;
        for(Integer i:arr){
            ar[i-1]++;
            if(ar[i-1]==ar[max])
                max=i-1<max?i-1:max;
            if(ar[i-1]>ar[max])
                max=i-1;
        }
        return max+1;

    }
