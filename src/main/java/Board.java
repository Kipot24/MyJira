public class Board {
    int boardId;
    String boardName;
    String boardDescription;

    public Board(int boardId, String boardName, String boardDescription) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardDescription = boardDescription;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardDescription() {
        return boardDescription;
    }

    public void setBoardDescription(String boardDescription) {
        this.boardDescription = boardDescription;
    }
}
