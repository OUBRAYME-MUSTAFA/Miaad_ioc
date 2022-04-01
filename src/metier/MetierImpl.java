package metier;
import dao.IDao;
public class MetierImpl implements IMetier {
    private IDao dao; //Couplage faible
    @Override
    public double calcul() {
        double tmp= dao.getData();
        return tmp *540/Math.cos(tmp*Math.PI);

    }
    /*
    Injecter dans la var dao un objet
    d'une classe qui implemene l'interface IDao
    */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
