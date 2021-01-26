static boolean b=true;
    static int arr[]=new int[1000000];
    static int downToZero(int n) {
        if(b){
            for(int i=0;i<999999;i++){
                if(arr[i+1]==0){
                    arr[i+1]=arr[i]+1;
                }else{
                    arr[i+1]=Math.min(arr[i+1],arr[i]+1);
                }
                for(int j=2;j<=i;j++){
                    if(i*j<999999){
                        if(arr[i*j]==0){
                            arr[i*j]=arr[i]+1;
                        }else{
                            arr[i*j]=Math.min(arr[i*j],arr[i]+1);
                        }
                    }
                    else{ break;}
                }
            }
            b=false;
        }
        
        return arr[n];

    }
