static void miniMaxSum(int[] arr) {
        long sum=0, min=arr[0],max=arr[0];
        for(Integer i:arr){
            sum+=i;
            min=min<i?min:i;
            max=max>i?max:i;
        }
            
        System.out.println((sum-max)+" "+(sum-min));
    }
