package beans;

import model.Animal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class AnimalBean {

    @PersistenceContext(name = "ejb-test")
    private EntityManager entityManager;

    public List<String> getAnimals() {
        Query namedQuery = entityManager.createNamedQuery("Animal.findAll");
        List<Animal> resultList = namedQuery.getResultList();
        return resultList.stream()
                .map(animal -> animal.getName() + " : " + animal.isCute())
                .collect(Collectors.toList());
    }

}
