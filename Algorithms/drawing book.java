static int pageCount(int n, int p) {
        if(n%2==0)
            return p/2<(n-p+1)/2?p/2:(n-p+1)/2;
        return p/2<(n-p)/2?p/2:(n-p)/2;
    }
