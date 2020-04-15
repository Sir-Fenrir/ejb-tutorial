package beans;

import model.Animal;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserBeanLocal {

    List<Animal> getUsers();
}
