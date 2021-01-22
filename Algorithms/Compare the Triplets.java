static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list=new ArrayList<>();
        int aa=0,bb=0;
        for(int i=0;i<b.size();i++){
            if(a.get(i)>b.get(i))
                aa++;
            if(a.get(i)<b.get(i))
                bb++;
        }
        list.add(aa);
        list.add(bb);
        return list;
    }
   
