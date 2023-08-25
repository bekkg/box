public class Box <T>{
    private  T id ;
    private  T age ;

    public Box(T id, T age) {
        this.id = id;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public  static  < T > void  method (T obj  ) {
        System.out.println(obj);
    }


    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
