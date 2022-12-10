public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    Course q1;
    Course q2;
    Course q3;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3,Course q1,Course q2,Course q3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3, int quizNote1,int quizNote2,int quizNote3){
        if ((note1 >= 0 && note1<=100) && (quizNote1 >= 0 && quizNote1 <= 100) ){
            this.c1.note=note1;
            this.q1.quizNote=quizNote1;
        }
        if ((note2 >= 0 && note2<=100) && (quizNote2 >= 0 && quizNote2 <= 100) ){
            this.c2.note=note2;
            this.q2.quizNote=quizNote2;
        }
        if ((note3 >= 0 && note3<=100) && (quizNote2 >= 0 && quizNote2 <= 100) ){
            this.c3.note=note3;
            this.q3.quizNote=quizNote3;
        }
    }
    void isPass(){
        System.out.println("----------------------------");
        System.out.println("Öğrenci : " + this.name);
        this.average = (((this.c1.note*0.80)+(this.q1.quizNote*0.20))+ ((this.c2.note * 0.80) + (this.q2.quizNote * 0.20)) +
                ((this.c3.note * 0.80) + (this.q3.quizNote * 0.20)))/3;
        if (this.average >= 55){
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz !");
            this.isPass = true;
        }
        else {
            System.out.println("Sınıfı geçemediniz !");
            this.isPass= false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " Notu:"+ this.c1.note);
        System.out.println(this.q1.name + " Sözlü Notu:"+ this.q1.quizNote);
        System.out.println(this.c2.name + " Notu:"+ this.c2.note);
        System.out.println(this.q2.name + " Sözlü Notu:"+ this.q2.quizNote);
        System.out.println(this.c3.name + " Notu:"+ this.c3.note);
        System.out.println(this.q3.name + " Sözlü Notu:"+ this.q3.quizNote);
        System.out.println("Ortalamanız : " + this.average);
    }
}
