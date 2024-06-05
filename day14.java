public class day14 {
    public static int trapper_water(int arr[]){
        int left_MaxArr[]=new int[arr.length];
        int right_MaxArr[]=new int[arr.length];
        left_MaxArr[0]=arr[0];
        right_MaxArr[arr.length-1]=arr[arr.length-1];
        int tw=0;
        for (int i=1;i<arr.length;i++){
            if(left_MaxArr[i-1]>arr[i]){
                left_MaxArr[i]=left_MaxArr[i-1];
            }
            else{
                left_MaxArr[i]=arr[i];
            }
    
        }
        for(int i=arr.length-2;i>=0;i--){
            if(right_MaxArr[i+1]<arr[i]){
                right_MaxArr[i]=arr[i];

            }
            else{
                right_MaxArr[i]=right_MaxArr[i+1];

            }  
        }
        for(int i=0;i<arr.length;i++){
            int wl=Math.min(left_MaxArr[i],right_MaxArr[i]);
            int temp=wl-arr[i];
            if(temp>0){
                tw+=temp;
            }

        }
        return tw;

    }

    public static int buy_sell_stocks(int arr[]){
        int n=arr.length;
        int buy_day=Integer.MAX_VALUE;
        int sell_day=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]<buy_day){
                buy_day=arr[i];
                temp=i;
            }
        }    
        for(int j=temp+1;j<n;j++){

                if(arr[j]>sell_day){
                    sell_day=arr[j];
                }  
            


        }
        if(buy_day<sell_day){
            return sell_day-buy_day;
        }
        else{
            return 0;
        }
    
    }

    public static void three_sum(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(i!=j && i!=k && j!=k){
                        if((arr[i]+arr[j]+arr[k])==0){
                            System.out.print("["+(arr[i])+","+(arr[j])+","+(arr[k])+"]");
                        }

                    }
                        
                }
            }
        }

    }
    public static void main(String args[]){
        int arr[]={-1,0,1,2,-1,-4};
        System.out.print(buy_sell_stocks(arr));
        three_sum(arr);
    }
    
}
