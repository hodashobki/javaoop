public class ProjectTest{
    public static void main(String[] args){

        ProjectClass elevat=new ProjectClass();
        String elevator=elevat.ElevatorPitch("project5","Good project");
       
        ProjectClass name1= new ProjectClass();
        // projec.ProjectClass("project number1");
        name1.setName("project number1");
        String names= name1.getName();

        ProjectClass desc1= new ProjectClass();
        desc1.setDescription("The project description :");
        String desc=desc1.getDescription();
        
        ProjectClass cost= new ProjectClass();
        cost.setInitialCost(100.99);
        double inicost=cost.getInitialCost();

        System.out.println("The name of the project is: " +names +" And The Description of it is:" +desc);
        System.out.println("The initialcost is:" + inicost+"$"); 
        System.out.println(elevator);
    }

}