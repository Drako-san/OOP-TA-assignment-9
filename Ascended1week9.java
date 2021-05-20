
public class Ascended1week9 {
  public class Animal{
    private String breed;
    private String eye;
    private double weight;
    private double height;


    public Animal(){
      this.breed = "mammal";
      this.eye = "Blue";
      this.weight = 27.5; //In KG 
      this.height = 1.7; //In M 
    }

    public Animal(String a){
      this.breed = a;
      this.eye = "Blue";
      this.weight = 27.5; //In KG 
      this.height = 1.7; //In M 
    }

    public Animal(String a, String b){
      this.breed = a;
      this.eye = b;
      this.weight = 27.5; //In KG 
      this.height = 1.7; //In M 
    }

    public Animal(String a, String b, double c){
      this.breed = a;
      this.eye = b;
      this.weight = c; //In KG 
      this.height = 1.7; //In M 
    }

    public Animal(String a, String b, double c, double d){
      this.breed = a;
      this.eye = b;
      this.weight = c; //In KG 
      this.height = d; //In M 
    }
   public String sound(){
     return "make sound";
   }
  }
  public class cat extends Animal{
      public cat(String a, String b){
        super(a, b, 5.5, 1.3);
      }
      public String sound(){
        return "Meow";
      }
  }
}