package pres;

import metier.MetierImpl;
import dao.Doaimpl;
import ext.daoImpl2;

public class Presentation {
    public static void main(String[] arg)
    {
        /**
         * Injection de dependance par
         * instanciation statique => new
         */
        daoImpl2 dao = new daoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        System.out.println("*********instanciation Statique******");
        System.out.println("res = "+metier.calcul());
    }
}