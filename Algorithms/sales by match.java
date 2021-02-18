static int sockMerchant(int n, int[] ar) {
        Set<Integer> set=new HashSet<>();
        int total=0;
        for(Integer i:ar){
            if(set.contains(i)){
                set.remove(i);
                total++;
            }else{
                set.add(i);
            }
        }
        return total;

    }
