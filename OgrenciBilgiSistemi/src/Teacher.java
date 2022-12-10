public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Öğretmenin adı : " + this.name);
        System.out.println("Öğretmenin telefon numarası : " + this.mpno);
        System.out.println("Öğretmenin branşı : " + this.branch);
    }

}
