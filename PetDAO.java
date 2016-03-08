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
 *  
 */
public interface PetDAO {
  int rowCount();
  List<Pet> findAll();
  List<Pet> findbyId(int Id);
  List<Pet> findbyName(String name);
  void add(Pet pet);
}
