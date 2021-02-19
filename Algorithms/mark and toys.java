static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int total=0;
        for(Integer i:prices){
            k-=i;total++;
            if(k<0)break;
        }
        return k<0?total-1:total;

    }
