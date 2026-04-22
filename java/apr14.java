public class apr14 {

    public static void main(String args[]){
        int[] a={1,2,3,4,4,3,2,2,5,6,3,4,6,7,5,3,4,6,3,2,4,6,4,5,6,4};
        int[] b={1,2,3,4,4,3,2,2,5,6,3,4,6,7,5,3,4,6,3,2,4,6,4,5,6,4};
        int[] c={1,2,3,4,4,3,2,2,5,6,3,4,6,7,5,3,4,6,3,2,4,6,4,5,6,4};
System.out.println("test");
System.out.println("from test1 branch");
System.out.println("from test2 branch");
System.out.println("new chge");
        //selection sort
        // select minimum and place it in correct position

        int i,j,mini,t,ds;

        for(i=0;i<a.length-1;i++){
            mini=i;
            for(j=i+1;j<a.length;j++){
                 
                if(a[j]<a[mini]){
                    mini=j;
                }
            }
            t=a[i];
            a[i]=a[mini];
            a[mini]=t;

        }

        for(int k:a){
            System.out.print(k +",");
        }
         System.out.println();


         //Bobble sort
         // it is opposite to selection sort,we send large item to last for every iteration.
            
         for(i=b.length-1;i>=0;i--){
            ds=0;
            for(j=0;j<i;j++){
                if(b[j]>b[j+1]){
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                    ds=1;
                }
            }
            if(ds==0)
                break;
         }


          for(int k:b){
            System.out.print(k+",");
        }
         System.out.println();



         //insertion sort, take the element and put in correct position

         for(j=0;j<c.length;j++){
            i=j;
            while(i>0 && c[i-1]>c[i]){
                 t=c[i];
                    c[i]=c[i-1];
                    c[i-1]=t;
                    i--;

            }
         }

         
          for(int k:c){
            System.out.print(k+",");
        }
         System.out.println();


         

    }
    
}
