static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max=-1,j=drives.length-1;
        for(int i=0;i<keyboards.length;i++){
            if(keyboards[i]+drives[j]>b){
                i--;j--;
                if(j==-1)break;
            }else{
                max=max>keyboards[i]+drives[j]?max:keyboards[i]+drives[j];
            }
        }
        return max;

    }
