class Solution {
    static boolean isSafeToMove(int newX, int newY, int n, int[][] maze, boolean[][] visited){
        if(newX<0 || newX>=n || newY<0 || newY>=n ){
            return false;
        }
        else if(visited[newX][newY]==true){
            return false;
        }
        else if(maze[newX][newY]==0){
            return false;
        }
        else{
            return true;
        }
    }
    static void getPath(int[][] maze, int srcX, int srcY, int destX, int destY, boolean[][] visited, ArrayList<String> ans, String path){
        //base case
        if(srcX==destX && srcY==destY){
            ans.add(path);
            return;
        }
        //phela kaam visited 'true ' mark krna
        visited[srcX][srcY]=true;
        int n=maze.length;
        // UP
        int newX=srcX-1;
        int newY=srcY;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            getPath(maze, newX, newY, destX, destY, visited, ans, path+"U" );
        }
        //Down
        newX=srcX+1;
        newY=srcY;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            getPath(maze, newX, newY, destX, destY, visited, ans, path+"D" );
        }
        //Left
        newX=srcX;
        newY=srcY-1;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            getPath(maze, newX, newY, destX, destY, visited, ans, path+"L" );
        }
        // Right
        newX=srcX;
        newY=srcY+1;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            getPath(maze, newX, newY, destX, destY, visited, ans, path+"R" );
        }
        
        // backTrack 
        visited[srcX][srcY]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        String path="";
        int n=maze.length;
        int srcX=0;
        int srcY=0;
        int destX=n-1;
        int destY=n-1;
        boolean[][] visited=new boolean[n][n];
        
        if(maze[srcX][srcY]==0|| maze[destX][destY]==0){
            return ans;
        }
        
        getPath(maze, srcX, srcY, destX, destY, visited, ans, path);
        Collections.sort(ans);
        return ans;
        
        
        
        
        
        
        
        
        
    }
}