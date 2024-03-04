import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            ProjectHandler myProject1 = new ProjectHandler();
            Board board1 = new Board(1, "MyBoard", "SomeDescription");
            myProject1.createProject(1,"First Project", "Test Description", (List<Board>) board1);
            myProject1.addBoardToProject(1);
            TaskHandler task1 = new TaskHandler();
            task1.createTask(1,11, TaskType.STORY);
            task1.updateTaskStatus(1, TaskStatus.TO_DO);
            task1.addComment(1, "Test comment");
    }
}
