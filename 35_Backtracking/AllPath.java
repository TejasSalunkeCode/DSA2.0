public class AllPath {
    public static void main(String[] args) {
        boolean [][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        PrintPathFourDire(0, 0, "",board);
    }
    static void PrintPathFourDire(int r, int c, String p,boolean[][]maze) {
        if (r ==maze.length-1 && c ==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if (r < maze.length-1) {
            PrintPathFourDire(r + 1, c, p + "R",maze);
        }
        if (c <maze[0].length-1) {
            PrintPathFourDire(r, c + 1, p + "D",maze);
        }
         if (r > 0) {
            PrintPathFourDire(r-1, c, p + "U",maze);
        }
        if(c>0){
            PrintPathFourDire(r, c -1, p + "L",maze);
        }
        maze[r][c]=true;
    }

}
