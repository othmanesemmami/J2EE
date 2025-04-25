package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    /*  injection des dependances par instanciation statique */
    public static void main(String[] args){
        DaoImpl d=new DaoImpl();
        MetierImpl metier=new MetierImpl(d);
        System.out.println("resultat  : "+metier.calcule()  );
    }
}
