 
public class Courses
  {
    // Attributes of class Courses//
  private String courseID;
  private String coursename;
  public String courseleader;
  private int courseduration;

  // Constructors//
      public Courses ( String courseID, String coursename, int courseduration) 
  {
    this.courseID = courseID;
    this.coursename = coursename;
    this.courseduration = courseduration;
    this.courseleader = ""; // Here, setting course_leader as empty//
  }


  // Getter for courseID//
  public String getcourseID ()
  {
      return this.courseID;
  }

  // Getter for course_name//
  public String getcoursename ()
  {
      return this.coursename;
  }

  // Getter for course_duration//
  public int getcourseduration ()
  {
      return this.courseduration;
  }
  

  // Setter for course_duration//
  public void setcourseleader (String course_leader)
  {
      this.courseleader = courseleader;
  }
  
  //Getter for courseLeader//
  public String getcourseleader()
  {
      return courseleader;
    }

  // Method of displaying data //
  public void display()
  {
     // Displaying the Header//
     System.out.println("\t\t COURSES DETAIL");
     System.out.println( "Course ID=" + courseID);
     System.out.println( "Course name=" + coursename);
     
     // Display course_leader if it's not empty//
     if (this.courseleader!="")
     {
         System.out.println( "Course leader=" + courseleader);
        }

  } 
}
