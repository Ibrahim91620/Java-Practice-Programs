class Animal{

    String color="Black";
    
}
class Dog extends Animal{
    String color="pink";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
class TestSuper1{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printcolor();
    }
}