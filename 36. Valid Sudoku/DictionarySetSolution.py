class DictionarySetSolution:

    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        rows = len(board)
        columns = len(board[0])

        #Creating a Dictionary of Sets for each row, column and 3x3 grid
        rowHash = collections.defaultdict(set)
        columnHash = collections.defaultdict(set)
        gridHash = collections.defaultdict(set)

        #Looping through the rows
        for row in range(rows):
	
            #Looping through the columns
            for column in range(columns):

                #If its an empty cell then ignore it
                if board[row][column] == '.':
                    continue

                #Check if this cell value either exists in the row set for its row or it exists in the column set for its column or it exists in the grid set for its grid. If it does then simply return False else add it to its respective row set, column set and grid set.
                if ((board[row][column] in rowHash[row])
                    or 
                    (board[row][column] in columnHash[column])
                    or
                    (board[row][column] in gridHash[(row//3,column//3)])):
                        return False
                else:
                    rowHash[row].add(board[row][column])
                    columnHash[column].add(board[row][column])
                    gridHash[(row//3,column//3)].add(board[row][column])

        return True