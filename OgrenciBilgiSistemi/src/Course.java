public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int quizNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int quiznote = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("İşlem Başarılı !");
        }
        else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
