class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double dia=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            double x=Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));
            int a=dimensions[i][0]*dimensions[i][1];
            if(x==dia){
                if(a>area){
                    area=a;
                }
            }
            else if(x>dia){
                area=a;
                dia=x;
            }
        }
        return area;
    }
}