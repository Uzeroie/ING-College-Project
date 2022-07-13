// AcademicCourse Class is sub-class of Class Courses//
public class AcademicCourse extends Courses
 {  
   // Attributes of class AcademicCourse//
   private String Lecturer_name;
   private String Level;
   private String Credit;
   private String Starting_Date;
   private String Completion_Date;
   private int Number_of_Assessments;
   private boolean isRegistered;
  
   //Constructors//
   public AcademicCourse( String courseID, String course_name, int course_duration, String Level, String Credit, int Number_of_Assessments)
    {
      super(courseID, course_name, course_duration); // Calling parent class constructor//
      this.Level = Level;
      this.Credit = Credit;
      this.Number_of_Assessments = Number_of_Assessments;
      // Setting Lecturer_name as empty//
      this.Lecturer_name = "";
      // Setting Starting_Date as empty//
      this.Starting_Date= "";
      // Setting Completion_Date as empty//
      this.Completion_Date= "";
      // Setting isRegistered as false//
      this.isRegistered= false;
   }
    
    //Accessor Methods//
    // Getter for Lecturer_name//
    public String getLecturer_name()
    {
        return Lecturer_name;
    }
    
    //Getter for Level//
     public String getLevel()
    {
        return Level;
    }
    
    //Getter for Credit//
    public String getCredit()
    {
        return Credit;
    }
     
    // Getter for Starting_Date//
   public String getStarting_Date()
   {
       return Starting_Date;
    }
    
    // Getter for Completion_Date//
   public String getCompletion_Date()
    {
        return Completion_Date;
    }
    
    // Getter for Number_of_Assessments//
    public int getNumber_of_Assessments()
    {
        return Number_of_Assessments;
    }
    
    // Getter for isRegisteres//
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
    // Setter for Lecturer_name//
    public void setLectuer_name( String Lecturer_name)
    {
        this.Lecturer_name = Lecturer_name;
    }
    
    // Setter for Number_of_Assessments//
    public void setNumber_of_Assessments(int Number_of_Assessments)
    {
        this.Number_of_Assessments = Number_of_Assessments;
    }
    
    // New method Register//
    public void Register( String Lecturer_name, String course_leader, String Starting_Date, String Completion_Date)
    {
        // Display if AcademicCourse is Registered//
        if (isRegistered == true)
        {
        System.out.println( "Academic Course has been registered.");
        System.out.println("The Course Leader's name is:" +course_leader);
        System.out.println( "The name of Lecturer is:" +Lecturer_name);
        System.out.println( "The Starting date is:" +Starting_Date);
        System.out.println("The Completion date is:" +Completion_Date);
        }
        
        // Updating Vales//
       else
       {
        super.setcourse_leader(course_leader);// Calling course_leader from parent class//
        this.Lecturer_name=Lecturer_name;
        this.Starting_Date=Starting_Date;
        this.Completion_Date=Completion_Date;
        this.isRegistered=true;
       }
    }
    
    // Method of Displaying Data//
    public void display()
    {
        super.display(); // Calling parent class for displaying data//
        if (isRegistered == true)
        {
        // Display Header//
        System.out.println("\n\t\t ACADEMIC COURSE DETAIL");
        // Display Lecturer_name//
        System.out.println("Lecturer:" +Lecturer_name);
        // Display Level//
        System.out.println("Level:" +Level);
        // Display Credit//
        System.out.println("Credit:" +Credit);
        // Display Starting_Date//
        System.out.println("Starting_Date:" +Starting_Date);
        // Display Completion_Date//
        System.out.println("Completion_Date:" +Completion_Date);
        // Display Number_of_Assessments//
        System.out.println("Number_of_Assessments:" +Number_of_Assessments);
        }
    }
    
}
