package ProiectMomentoPattern;

public class Table {

    private char[][] content;
    private boolean X_turn = true;

    public Table() {
        content = new char[3][3];
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                this.content[i][j] = ' ';
            }
        }
    }

    public TableState createState() {
        return new TableState(content);
    }

    public void restore(TableState state) {
        try {
            content = state.getContent();
            X_turn = !X_turn;
        } catch (Exception e) {
            System.out.println("No more undos!");
        }
    }

    public char[][] getContent() {
        return content;
    }

    public void setContent(char[][] content) {
        this.content = content;
    }

    public void changeTurn(){
        X_turn = !X_turn;
    }

    public boolean getTurn(){
        return X_turn;
    }
}
