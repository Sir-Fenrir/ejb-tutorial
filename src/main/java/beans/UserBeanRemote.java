package beans;

import model.Animal;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface UserBeanRemote {

    List<Animal> getUsers();
}
