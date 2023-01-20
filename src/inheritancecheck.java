class animal{
    int i = 4;
    animal()
    {
        i = 10;
        System.out.println(i);
    }
}
class animalChild extends animal{
    animalChild()
    {
        System.out.println(new animal().i);
    }
}
public class inheritancecheck {
    public static void main(String[] args){
        animalChild ac = new animalChild();
    }
}
