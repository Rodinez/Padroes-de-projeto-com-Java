package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonFast;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.Strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.Strategy.ComportamentoNormal;
import one.digitalinnovation.gof.Strategy.Robo;

public class teste {

    public static void main(String[] args) {


        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonFast fast = SingletonFast.getInstancia();
        System.out.println(fast);
        fast = SingletonFast.getInstancia();
        System.out.println(fast);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Gabriel", "23891320");
    }
}