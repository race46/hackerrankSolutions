public static int birthdayCakeCandles(List<Integer> candles) {
        int sum=0,height=0;
        for(Integer i:candles){
            if(i>height){
                height=i;
                sum=1;
            }else if(i==height){
                sum++;
                }
        }
        return sum;
    }
