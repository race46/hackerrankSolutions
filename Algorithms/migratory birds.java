static int migratoryBirds(List<Integer> arr) {
        int ar[]=new int[5];
        int max=0;
        for(Integer i:arr){
            ar[i-1]++;
        }
        for(int i=1;i<5;i++){
            if(ar[i]>ar[max])
                max=i;
        }
        return max+1;

    }
