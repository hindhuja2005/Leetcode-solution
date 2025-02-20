class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> a=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                a.add(matrix[i][j]);
            }
        }
        for(int i=0;i<k-1;i++){
            a.remove();
        }
        return a.peek();
    }
}