
class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int rmv = 10;

        while (n >= rmv) {
            n -= rmv;
            rmv--;
        }

        return rmv % 2 == 1;
    }
}
