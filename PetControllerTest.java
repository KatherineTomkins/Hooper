import static junit.framework.Assert.assertEquals;

public class PetControllerTest {
  @org.junit.Test
  public void testNewCatteryIsEmpty() throws Exception{
    PetController cattery = new PetController();
    assertEquals(cattery.getOccupancy(), 0);
  }
  @org.junit.Test(expected = CatteryException.class)
  public void testSingleUnitCanOnlyHoldOnePet() throws Exception{
    PetController cattery = new PetController();
    assertEquals(cattery.getCapacity(), 2);
    //TODO: work out how to add a pet
    cattery.addPet(new Pet(1, "Tilly", "tabby", "female"));
    cattery.addPet(new Pet(2, "Martha", "black and white", "female"));
  }
}
