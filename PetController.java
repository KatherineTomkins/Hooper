import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
/**
 * <p>[Pattern] to provide the following to {@link Object}:</p>
 * <ul>
 * <li></li>
 * </ul>
 * <p>Example:</p>
 * <pre>
 * </pre>
 *
 * @since 0.0.1
 * �
 */

@RestController
@RequestMapping(value = "/pets", produces = {MediaType.APPLICATION_JSON_VALUE})
public class PetController {

  private static final Logger logger = LoggerFactory.getLogger(PetController.class);

  @
  private PetDAO pet;

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public List<Pet>list(){
      List<Pet> pets = pet.findAll();
      Logger.info(pets.toString());
    return pets;

    }


  public void Cattery (int capacity, int occupancy){
    this.capacity = capacity;
    this.occupancy = occupancy;

  }
  //TODO:work out how to add a pet
  *//*public void addPet(){

  }*//*

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
  public void setOccupancy(int occupancy){
    this.occupancy = occupancy;
  }

  public int getCapacity() {
    return capacity;
  }
  public int getOccupancy(){
    return occupancy;
  }

  public void addPet(Pet pet) {
  }
}*/
