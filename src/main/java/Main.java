public class Main {

        public static void main(String[] args) {
            JavaHandler myProject1 = new JavaHandler();
            myProject1.createProject(1,"First Project", "Test Description",1);
            myProject1.addBoardToProject(11);
            JavaHandler task1 = new JavaHandler();
            task1.createTask(1,11, TaskType.STORY);
            task1.updateTaskStatus(1, TaskStatus.TO_DO);
            task1.addComment(1, "Test comment");
    }
}
