public class Encapsulation
{
    private  String name;
    private int age;
    public String getName()
    {
        return name+" "+age;
    }
    public void setName(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
