package three.oop;



public class Method {

    int id;
    String name;

    void insert(int id,String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Method method = new Method();
        method.insert(34,"David");
        System.out.println(method.id);
        System.out.println(method.name);


       Constructor obj = new Constructor();
       obj.Constructor(1,"value");
    }

}