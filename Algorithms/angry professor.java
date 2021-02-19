static String angryProfessor(int k, int[] a) {
        for(Integer i:a){
            if(i<=0)
                k--;
        }
        return k>0?"YES":"NO";

    }
