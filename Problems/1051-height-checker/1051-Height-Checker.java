class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
    expected[i] = heights[i];
}

     for(int i=0;i<expected.length-1;i++){

        for(int j=0;j<expected.length-1;j++){

            if(expected[j]>expected[j+1]){

                int temp;
                temp=expected[j];

                expected[j]=expected[j+1];

                expected[j+1]=temp;
            }
        }
     } 
     int count = 0;

    for(int x = 0; x < heights.length; x++) {
    if(heights[x] != expected[x]) {
        count++;
    }
}
     return count;
    }
}