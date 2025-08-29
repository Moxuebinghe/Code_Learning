package Enum1_Demo;

public enum B {
    B1 {
        @Override
        public void go() {
            System.out.println("B1,抽象枚举");
        }
    };

    B() {
    }

    B(String name) {
        this.name = name;
    }

    public abstract void go();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
