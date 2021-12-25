 public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
        int tot = 0;
        for(int i =0; i<bill.size(); i++){
          if(i==k)continue;
           tot+=bill.get(i); 
        }
        int anna_actual = tot/2;
        if(b-anna_actual >0 ){
            System.out.print(b-anna_actual);
        }
        else
            System.out.print("Bon Appetit");
    }
