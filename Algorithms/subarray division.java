static int birthday(List<Integer> s, int d, int m) {
        int sum=0,total=0;
        for(int i=0;i<m;i++){
            sum+=s.get(i);
        }
        if(sum==d)total++;
        for(int i=m;i<s.size();i++){
            sum+=s.get(i);
            sum-=s.get(i-m);
            if(sum==d)
                total++;
        }
        return total;

    }
