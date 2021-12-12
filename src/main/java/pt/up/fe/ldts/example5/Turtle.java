package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    private char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void execute(char command) {
        switch (command) {
            case 'L':  //ROTATE LEFT
                if (direction == 'N')
                    direction = 'W';         //CODE SMELL - Replace Nested Conditional with Guard Clauses
                if (direction == 'W')
                    direction = 'S';
                if (direction == 'S')
                    direction = 'E';
                if (direction == 'E')
                    direction = 'N';
                break;
            case 'R':    //ROTATE RIGHT
                if (direction == 'N')
                    direction = 'E';
                if (direction == 'E')
                    direction = 'S';
                if (direction == 'S')
                    direction = 'W';
                if (direction == 'W')
                    direction = 'N';
                break;
            case 'F':      //MOVE FORWARD
                if (direction == 'N')
                    row--;
                if (direction == 'S')
                    row++;
                if (direction == 'W')
                    column--;
                if (direction == 'E')
                    column++;
                break;
        }
    }
}
