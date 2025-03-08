public class Maze {
    static void mazePath(int startingRow, int startingCol, int endRow, int endCol, String path) {
        if (startingRow == endRow && startingCol == endCol) {
            System.out.println(path);
            return;
        }

        if (startingRow > endRow || startingCol > endCol) {
            return;
        }
        mazePath(startingRow, startingCol + 1, endRow, endCol, path + "H");
        mazePath(startingRow + 1, startingCol, endRow, endCol, path + "V");
    }

    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "");
    }

}
