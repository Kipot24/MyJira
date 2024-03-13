import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            Board.BoardBuilder board1 = Board.builder()
            .boardId(1)
            .boardName("MyBoard")
            .boardDescription("SomeDescription");

            Project.ProjectBuilder myProject1 = Project.builder()
            .projectId(1)
            .projectName("First Project")
            .projectDescription("Test Description");

            TaskHandler task1 = new TaskHandler();
            task1.createTask(1,1, TaskType.STORY);
            task1.updateTaskStatus(1, TaskStatus.TO_DO);
            task1.addComment(1, "Test comment");
            TaskHandler task2 = new TaskHandler();
            task2.createTask(1,1, TaskType.BUG);
            task2.updateTaskStatus(2, TaskStatus.TO_DO);

    }

}
