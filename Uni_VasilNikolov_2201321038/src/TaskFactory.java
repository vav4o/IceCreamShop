public abstract class TaskFactory {

    public abstract Task createTask(String taskType);

    public Task prepareTask(String taskType) {
        Task task = this.createTask(taskType);
        return task;
    }
}
