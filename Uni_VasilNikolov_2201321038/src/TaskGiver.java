public class TaskGiver extends TaskFactory {

    @Override
    public Task createTask(String taskType) {

        if(taskType.equalsIgnoreCase("Short_task")){
            return new ShortTask();
        }

        if(taskType.equalsIgnoreCase("Known_task")){
            return new KnownTask();
        }

        if(taskType.equalsIgnoreCase("Misleading_task")){
            return new MisleadingTask();
        }

        System.out.println(
                "Unknown task type: " + taskType
        );

        return null;
    }
}
