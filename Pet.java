/**
 *
 */
public class Pet {
  private int number;
  private String name;
  private String description;
  private String sex;

  public Pet(){};

  public Pet(int number, String name, String description, String sex){

    this.name = name;
    this.number = number;
    this.description = description;
    this.sex = sex;
  }
@Override
public String toString(){
  return String.format("%04d: %16s :: %5s, %7s", number, name, description, sex);
}

  //Pet Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setNumber(int number){
    this.number = number;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public void setSex(String sex){
    this.sex = sex;
  }

  //Pet Getters
  public String getName() {
    return name;
  }
  public int getNumber(){
    return number;
  }
  public String getDescription(){
    return description;
  }
  public String getSex() {
    return sex;
  }

}
