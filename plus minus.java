static void plusMinus(int[] arr) {
        int n=0,p=0,z=0;
        for(Integer i:arr){
            if(i<0)n++;
            if(i>0)p++;
            if(i==0)z++;
        }
        DecimalFormat df=new DecimalFormat("##.######");
        System.out.println(df.format((double)p/arr.length));
        System.out.println(df.format((double)n/arr.length));
        System.out.println(df.format((double)z/arr.length));
        

    }
