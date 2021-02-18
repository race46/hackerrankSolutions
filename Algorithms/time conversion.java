static String timeConversion(String s) {
        boolean isPm=s.charAt(8)=='P';
        int hour=Integer.parseInt(s.substring(0,2))%12;
        if(isPm){
            return (12+hour+s.substring(2,8));
        }else{
            return hour<10?0+""+(hour)+s.substring(2,8):hour+s.substring(2,8);
        }

    }
