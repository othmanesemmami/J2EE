package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) {
        try{
        Scanner scanner =new Scanner(new File("config.txt"));
  //DaoImpl d=new IDaoImpl()
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao)cDao.getConstructor().newInstance();
//MetierImpl metier=new MetierImpl(d)
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("resultat  : "+metier.calcule()  );
    }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
