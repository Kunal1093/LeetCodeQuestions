/********************
657. Robot Return to Origin

There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
********************/

class Solution {
    public boolean judgeCircle(String moves) {
        
        int x = 0;
        int y = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R')
                x++;
            else if(ch == 'L')
                x--;
            else if(ch == 'U')
                y++;
            else
                y--;
        }
        
        return (x==0 && y == 0);
    }
}

