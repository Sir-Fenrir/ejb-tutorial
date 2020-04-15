package rest;

import beans.AnimalBean;
import model.Animal;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("testbean")
public class RestEndpoints {

    private AnimalBean animalBean;

    @Inject
    public RestEndpoints(AnimalBean animalBean) {
        this.animalBean = animalBean;
    }

    @GET
    public String get() {
        return String.join(", ", animalBean.getAnimals());
    }

}
