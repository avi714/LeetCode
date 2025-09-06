import java.util.*;

class HashMapHashSetSolution 
{
    public boolean isValidSudoku(char[][] board) 
	{
        
		//Create HashMap of Integer key and HashSet values for rows and columns
        HashMap<Integer,HashSet<Character>> rowHashMap = new HashMap<>();
        HashMap<Integer,HashSet<Character>> columnHashMap = new HashMap<>();
		
		//Create a HashMap of List key and HashSet values for the Grids
        HashMap<List<Integer>,HashSet<Character>> gridHashMap = new HashMap<>();

        int rows = board.length;
        int columns = board[0].length;

		//Iterate through the row and column HashMaps and initialize them with keys and empty HashSets.
        for (int i = 0 ; i < rows; i++)
        {
            rowHashMap.put(i, new HashSet<Character>());
            columnHashMap.put(i, new HashSet<Character>());
        }

		//Iterate through the grid HashMap and initialize it with keys and empty HashSets.
        for (int i = 0 ; i < rows ; i ++)
        {
            for(int j = 0 ; j < columns ; j ++)
            {
				//Create a List for grid indices
                List<Integer> gridIndices = new ArrayList<>();
				
				//Add the Grid indices to it
                gridIndices.add((int)i/3);
                gridIndices.add((int)j/3);
				
				//Initialize an empty HashSet as value to this grid indices key
                gridHashMap.put(gridIndices, new HashSet<Character>());
            }
        }
		
		//Iterate through the sudoku board
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
				//If its not an empty cell
                if (!(board[i][j] == '.'))
                {
					//Calculate the grid indices for the current cell to check into its respective grid HashSet
                    List<Integer> gridIndices = new ArrayList<>();
                    gridIndices.add((int)i/3);
                    gridIndices.add((int)j/3);
                    char value = board[i][j];
                    
					//Check if the current cell value is already present in its respective row HashSet, column HashSet or grid Hashset, if it is then return false.  
					if ((rowHashMap.get(i).contains(value)) || (columnHashMap.get(j).contains(value)) || (gridHashMap.get(gridIndices).contains(value)))
					{
						return false;
					}

					//Append the current cell value to its respective row HashSet, column HashSet and grid Hashset
                    rowHashMap.get(i).add(value);
                    columnHashMap.get(j).add(value);
                    gridHashMap.get(gridIndices).add(value);
                }
            }
        }

        return true;
    }
}