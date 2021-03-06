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
    public void rotateLeft(){
        if (direction == 'N') {
            direction = 'W';
            return;
        }
        if (direction == 'W'){
            direction = 'S';
            return;
        }
        if (direction == 'S') {
            direction = 'E';
            return;
        }
        if (direction == 'E') {
            direction = 'N';
            return;
        }
    }
    public void rotateRight(){
        if (direction == 'N'){
            direction = 'E';      //CODE SMELL - Replace Nested Conditional with Guard Clauses
            return;
        }
        if (direction == 'E'){
            direction = 'S';
            return;
        }
        if (direction == 'S'){
            direction = 'W';
            return;
        }
        if (direction == 'W'){
            direction = 'N';
            return;
        }
    }
    public void moveForward(){
        if (direction == 'N') row--;
        if (direction == 'S') row++;
        if (direction == 'W') column--;
        if (direction == 'E') column++;
    }
    public void execute(char command) {

        if (command == 'L') { // ROTATE LEFT    CODE SMELL - If statements must be short
            rotateLeft();
        } else if (command == 'R') { // ROTATE RIGHT
            rotateRight();
        } else if (command == 'F') { // MOVE FORWARD
           moveForward();
        }
    }
}


