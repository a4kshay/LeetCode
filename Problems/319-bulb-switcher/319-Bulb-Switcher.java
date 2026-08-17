class Solution {
    public int bulbSwitch(int n) {
        int ONBulb=0;

        int i= 1;

        while(i*i<=n){

            i++;
            ONBulb++;
        }
        return ONBulb;
    }
}