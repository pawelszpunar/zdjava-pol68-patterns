package singleton;

public enum Menu {
    INSTANCE;

    public static Menu getInstance(){
        return INSTANCE;
    }

    public void print(){
        System.out.println("1. Opcja 1");
        System.out.println("2. Opcja 2");
        System.out.println("0. Wyjście");
    }
}
