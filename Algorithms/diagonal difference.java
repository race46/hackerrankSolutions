public static int diagonalDifference(List<List<Integer>> arr) {
    int difference=0;
    for(int i=0;i<arr.size();i++){
        difference+=arr.get(i).get(i)-arr.get(i).get(arr.size()-i-1);
    }
    return difference<0?-difference:difference;

    }
