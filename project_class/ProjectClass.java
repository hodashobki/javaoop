public class ProjectClass{
    private String name;
    private String description;
    private double initialCost;

   public String ElevatorPitch(String name, String description){
    return String.format("%s %s", name, description);
   }

    public  ProjectClass(){
        name="Project1";
        description="The First Project";

    }
    public  ProjectClass(String name,String description){
        this.name=name;
        this.description=description;
    }
    // ************
     public String getName(){
     return name;
     }
     public void setName( String name){
      this.name=name;
    }
    // *************
    public double getInitialCost(){
        return initialCost;
        }

    public void setInitialCost(double initialCost){
        this.initialCost= initialCost;
            }

    // **********
     public String getDescription(){
     return description;    
    }

    public void setDescription(String description){
    this.description= description;
}
}