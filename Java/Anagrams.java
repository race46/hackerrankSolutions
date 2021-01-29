static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
        int arr[]=new int[26];
        for(Character c:a.toLowerCase().toCharArray()){
            arr[(int)c-97]++;
        }
        for(Character c:b.toLowerCase().toCharArray()){
            arr[(int)c-97]--;
            if(arr[(int)c-97]==-1)return false;
        }
        return true;
    }
