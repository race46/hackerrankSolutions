static void staircase(int n) {
        String sp=" ",hash="#";
        while(sp.length()<n){
            sp+=sp;
            hash+=hash;
        }
        for(int i=0;i<n;i++){
            System.out.println(sp.substring(0,n-1-i)+hash.substring(0,i+1));
        }

    }
