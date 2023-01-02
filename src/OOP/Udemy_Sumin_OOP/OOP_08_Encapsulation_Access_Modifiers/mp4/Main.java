package OOP.Udemy_Sumin_OOP.OOP_08_Encapsulation_Access_Modifiers.mp4;

public class Main {
    public static void main(String[] args) {

        // public:     this class   this package   class-heir   anywhere
        // protected:  this class   this package   class-heir
        // default:    this class   this package
        // private:    this class

        Human human = new Human("Tom", 25);
        human.setAge(28);
        human.showInfo();
        System.out.println("-------------------------");
        System.out.println(human.getAge());
    }
}
