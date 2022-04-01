package instdy;

import dao.IDao;
import metier.IMetier;


import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class instanceDynamic {

    public static void main(String[] arg) throws Exception{

        /**
         * Injection de dependance par
         * instanciation Dynamique
         */

        Scanner scanner   = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class  cDao = Class.forName(daoClassName);
        IDao idao = (IDao)cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class  cMetier = Class.forName(metierClassName);
        IMetier meteir = (IMetier)cMetier.newInstance();

        Method methode = cMetier.getMethod("setDao",IDao.class );
        methode.invoke(meteir, idao);

        System.out.println("*********instanciation Dynamique*******");
        System.out.println("res= "+meteir.calcul());
    }
}
