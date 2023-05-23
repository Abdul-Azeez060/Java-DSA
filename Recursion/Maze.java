import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathcount(3, 3));
        System.out.println(pathRet("", 3, 3));
        System.out.println(pathRetDiagonal("", 3, 3));
    }
    static int pathcount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = pathcount(r-1, c);
        int right = pathcount(r, c-1);
        return left+right;
    }
    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p+"D",r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p+"R", r, c-1));
        }
        return list;

        }
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1 ) {
            list.addAll(pathRetDiagonal(p+"D", r-1, c-1));
        }
        if (r > 1) {
            list.addAll(pathRetDiagonal(p+"D",r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p+"R", r, c-1));
        }
        return list;


    }


}
