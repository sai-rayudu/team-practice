public class apr15 {


    static void bobble(int[] a,int l){
        if(l==0){
            return;
        }
        else{
            int t;
            for(int j=0;j<l-1;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;

                }
            }
            bobble(a,l-1);
        }

    }
    public static void main(String args[]){
        int[] a={2,4,4,5,7,7,4,5,6,5,3,4,5,5};

        bobble(a,a.length);

        for(int k:a){
            System.out.println(k);
        }

    }
    
}
