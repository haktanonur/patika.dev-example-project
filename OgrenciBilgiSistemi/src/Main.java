public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Onur Hoca","534","TRH");
        Teacher t2 = new Teacher("Mehmet Hoca","321","FZK");
        Teacher t3 = new Teacher("Enes Hoca","3131","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course tarih_sozlu = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course fizik_sozlu = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103","BIO");
        biyo.addTeacher(t3);
        Course biyo_sozlu = new Course("Biyoloji", "103","BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Göksu","123","10.Sınıf",tarih,fizik,biyo,tarih_sozlu,fizik_sozlu,biyo_sozlu);
        s1.addBulkExamNote(100,70,80,100,84,66);
        s1.isPass();

        Student s2 = new Student("Berk", "012", "11.Sınıf", tarih,fizik,biyo,tarih_sozlu,fizik_sozlu,biyo_sozlu);
        s2.addBulkExamNote(25,59,79,59,79,31);
        s2.isPass();

        Student s3 = new Student("Arda", "031", "12.Sınıf",tarih,fizik,biyo,tarih_sozlu,fizik_sozlu,biyo_sozlu);
        s3.addBulkExamNote(13,31,20,55,100,100);
        s3.isPass();
    }
}
