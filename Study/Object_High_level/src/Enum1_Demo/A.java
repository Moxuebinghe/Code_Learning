package Enum1_Demo;

public enum A {
    A1, A2, A3;//默认为public static final，枚举第一行罗列对象的名字，都是常量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
