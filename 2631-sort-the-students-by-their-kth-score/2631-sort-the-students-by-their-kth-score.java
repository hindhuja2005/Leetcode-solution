class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length-1;i++){
            int idx=-1;
            int t=score[i][k];
            for(int j=i+1;j<score.length;j++){
                if(t<score[j][k]){
                    t=score[j][k];
                    idx=j;
                }
            }
            if(idx!=-1){
                int temp[]=score[i];
                score[i]=score[idx];
                score[idx]=temp;
            }
        }
        return score;
    }
}