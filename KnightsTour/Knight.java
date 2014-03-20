import java.io.*;
import java.util.*;

public class Knight {
    private int[][] board;
    private boolean solved = false;
    private int size;

    public Knight (int sideLen) {
        board = new int[sideLen][sideLen];
        size = sideLen;
    }

    public void wait(int millis){
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
        }
    }

    public String toString() {
        String s = "";
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                s+=board[i][j]+"\t";
            }
            s+="\n";
        }
        return s;
    }

    public void solve(){
        solve(0,0,1);
    }
   
    public void solve(int x,int y,int n){
        if (n == size * size + 1) {
            solved = true;
        }
        if ((n <= (size * size)) && ((x >= 0) && (y >= 0) && (x < size) && (y < size)) && (board[x][y] == 0)){
            board[x][y] = n;
            if(!solved){
                solve(x+1,y+2,n+1);
            }
            if(!solved){
                solve(x+1,y-2,n+1);
            }
            if(!solved){
                solve(x-1,y+2,n+1);
            }
            if(!solved){
                solve(x-1,y-2,n+1);
            }
            if(!solved){
                solve(x+2,y+1,n+1);
            }
            if(!solved){
                solve(x+2,y-1,n+1);
            }
            if(!solved){
                solve(x-2,y+1,n+1);
            }
            if(!solved){
                solve(x-2,y-1,n+1);
            }
	    if(!solved){
	        board[x][y] = 0;
	    } else {
		System.out.println("Step " + n + "(" + x + "," + y
					       + ")");
	    }
        }
    }
}
