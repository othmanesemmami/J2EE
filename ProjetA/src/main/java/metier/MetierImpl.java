package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao d;
    public void setDao(DaoImpl d) {
        this.d = d;
    }
    public MetierImpl() {}

    public MetierImpl(IDao d){
    this.d=d;
    }

    @Override
    public double calcule() {
        double t=d.getData();
        return t*43/3;
    }


}
