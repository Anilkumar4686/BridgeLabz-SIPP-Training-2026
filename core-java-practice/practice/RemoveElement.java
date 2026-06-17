public class RemoveElement {
    public static void main(String[] args){
        int arr[]={1,13,123,1,12,1,9,11,11,0,121,123};
        // for(int i=0;i<arr.length;i++){
        //     boolean duplicate=false;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             duplicate=true;
        //             break;
        //         }
        //     }
        //     if(!duplicate){
        //         System.out.print(arr[i]+" ");
        //     }
        // }

        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<size-1;k++){
                        arr[k]=arr[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}