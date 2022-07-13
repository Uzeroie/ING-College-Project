 
public class Courses
  {
    // Attributes of class Courses//
  private String courseID;
  private String course_name;
  private String course_leader;
  private int course_duration;

  // Constructors//
      public Courses ( String courseID, String course_name, int course_duration) 
  {
    this.courseID = courseID;
    this.course_name = course_name;
    this.course_duration = course_duration;
    this.course_leader = ""; // Here, setting course_leader as empty//
  }


  // Getter for courseID//
  public String getcourseID ()
  {
      return courseID;
  }

  // Getter for course_name//
  public String getcourse_name ()
  {
      return course_name;
  }

  // Getter for course_duration//
  public int getcourse_duration ()
  {
      return course_duration;
  }
  

  // Setter for course_duration//
  public void setcourse_leader (String course_leader)
  {
      this.course_leader = course_leader;
  }

  // Method of displaying data //
  public void display()
  {
     // Displaying the Header//
     System.out.println("\t\t COURSES DETAIL");
     System.out.println( "Course ID=" + courseID);
     System.out.println( "Course name=" + course_name);
     System.out.println( "Course duration=" + course_duration);
     
     // Display course_leader if it's not empty//
     if (this.course_leader!="")
     {
         System.out.println( "Course leader=" + course_leader);
        }

  } 
}
