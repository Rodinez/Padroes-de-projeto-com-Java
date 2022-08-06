package one.digitalinnovation.gof.Singleton
        ;
public class SingletonFast {
    private static SingletonFast instancia = new SingletonFast();
    private SingletonFast() {
        super();
    }
    public static SingletonFast getInstancia() {
        return instancia;
    }
}