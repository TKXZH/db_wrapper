package top.xvzonghui;

/**
 * Created by xvzh on 2018/9/20.
 */
public class TestRef {
    public People test(People people) {
        people = new People("changed");
        return people;
    }

    public static void main(String args[]) {
        TestRef testRef = new TestRef();
        People people1 = new People("origin");
        People people2 = testRef.test(people1);
        System.out.println(people1.name);
        System.out.println(people2.name);
    }
}

class People {
    public People(String name) {
        this.name = name;
    }
    public String name;
}
