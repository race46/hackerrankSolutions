static int findDigits(int n) {
        int total=0,temp=n;
        while(temp>0){
            if(temp%10!=0&&n%(temp%10)==0)
                total++;
            temp/=10;
        }
        return total;

    }
