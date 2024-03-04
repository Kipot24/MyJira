public class Main {

        public static void main(String[] args) {
            ProjectHandler myProject1 = new ProjectHandler();
            myProject1.createProject(1,"First Project", "Test Description",1);
            myProject1.addBoardToProject(11);
            ProjectHandler task1 = new ProjectHandler();
            task1.createTask(1,11, TaskType.STORY);
            task1.updateTaskStatus(1, TaskStatus.TO_DO);
            task1.addComment(1, "Test comment");
    }
}
