class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr=new int[2];
        int i,j;
        for(i=0;i<mat.length;i++){
           
            for(j=0;j<mat[0].length;j++){ 
                boolean flag=true;
                if(i-1>-1 && mat[i][j]<mat[i-1][j]){
                    flag=false;
                }
                if(i+1<mat.length && mat[i][j]<mat[i+1][j]){
                    flag=false;
                }
                if(j-1>-1 && mat[i][j]<mat[i][j-1]){
                    flag=false;
                }
                if(j+1<mat[0].length && mat[i][j]<mat[i][j+1]){
                    flag=false;
                }
            if(flag){
                arr[0]=i;
                arr[1]=j;
            }
            }
            }
         return arr;
    }
}