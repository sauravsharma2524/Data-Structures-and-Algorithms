class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList list = new ArrayList <Integer> ();
        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol){
            for(int j = startCol; j <= endCol; j++ ){
                list.add(matrix[startRow][j]);
               
            }

            for(int i = startRow+1; i <= endRow; i++){
                list.add(matrix[i][endCol]);
            }

            for (int j = endCol-1; j >= startCol; j--){
                if (startRow == endRow){
                    break;
                }
                list.add(matrix[endRow][j]);
            }

            for (int i = endRow-1 ; i >= startRow+1; i--){
                if(endCol == startCol){
                    break;
                }
                list.add(matrix[i][startCol]);
            }
             startCol++;
                endCol--;
             startRow++;
                endRow--;
        }
        return list;
    }
}