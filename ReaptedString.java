public static long repeatedString(String s, long n) {
    // Write your code here
        String enough_string = "";
        long count = 0;
        while(enough_string.length() < n)
        {
             enough_string+=s;
        }
        for(int i=0; i<n; i++){
            if(enough_string.charAt(i)=='a')
                count++;
        }
        System.out.print(count);
        return count;
    }

}
