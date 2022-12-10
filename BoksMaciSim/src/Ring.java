public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        int count = 1;
        if (checkWeight()){
            while ((this.f1.health > 0) && (this.f2.health > 0)){
                System.out.println("======== "+ count++ +".ROUND ===========");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                printScore();
            }
        }
    }
    public boolean checkWeight(){
        return ((this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight));
    }
    public boolean isWin(){
        if (f1.health == 0){
            System.out.println(this.f2.name + " maçı kazandı!!!");
            return true;
        }
        if (f2.health == 0){
            System.out.println(this.f1.name + " maçı kazandı!!!");
            return true;
        }
        return false;
    }
    public void printScore(){
        System.out.println("-----------------");
        System.out.println(this.f1.name + " Kalan Can \t: " + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t: " + this.f2.health);
    }
}
