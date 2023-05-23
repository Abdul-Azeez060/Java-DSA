import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
      //  allPath("", maze, 0, 0);
        int[][] nums = new int[maze.length][maze[0].length];
        allPathRet("", maze, 0, 0, 1,nums );

    }


    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r > 0) {
            allPath(p+"U", maze, r-1, c);
        }
        if (c > 0) {
            allPath(p+"L", maze, r, c-1);
        }

        if (r < maze.length-1) {
            allPath(p+"D", maze, r+1, c);
        }
        if (c < maze[0].length-1) {
            allPath(p+"R", maze, r, c+1);
        }
        maze[r][c] = true;

    }
    static void allPathRet(String p, boolean[][] maze, int r, int c, int step, int[][] nums) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            nums[r][c] = step;
            for (int[] arr : nums) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        nums[r][c] = step;
        maze[r][c] = false;
        if (r > 0) {
            allPathRet(p+"U", maze, r-1, c, step+1, nums);
        }
        if (c > 0) {
            allPathRet(p+"L", maze, r, c-1,step+1, nums);
        }

        if (r < maze.length-1) {
            allPathRet(p+"D", maze, r+1, c, step+1, nums);
        }
        if (c < maze[0].length-1) {
            allPathRet(p+"R", maze, r,  c+1, step+1, nums);
        }
        maze[r][c] = true;
        nums[r][c] = 0;

    }
}

