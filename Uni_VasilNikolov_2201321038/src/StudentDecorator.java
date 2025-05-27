public abstract class StudentDecorator extends Student {
    protected Student decoratedStudent;

    public StudentDecorator(Student decoratedStudent) {
        //super();
        this.decoratedStudent = decoratedStudent;
    }

    //@Override
    public void createStudent() {
        //this.decoratedStudent.createStudent();
    }
}
