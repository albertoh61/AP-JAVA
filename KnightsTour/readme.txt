The constructor makes a 2d array of ints with dimension size*size.

The toString method allows us to print out the solved board at the end.

The first solve calls the first solve with parameters.

The solve with parameters works by doing the normal check according to the parameters of the board and if solved = true or false, and backtracks if all future solutions do not work and returns the move if it can move on.
