// NonAcademicCourse Class is Sub-class of class Course//
public class NonAcademicCourse extends Courses
{
    // Attributes of NonAcademicCourse Class//
    private String Instructor_name;
    private int Duration;
    private String Start_date;
    private String Completion_date;
    private String Exam_date;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    public NonAcademicCourse(String courseID, String course_name, int course_description, String prerequisite)
    {
        super(courseID, course_name, course_description);// Calling parent class constructor//
        //Setting Start_date as empty//
        this.Start_date = "";
        // Setting Completion_date as empty//
        this.Completion_date = "";
        // Setting Exam_date as empty//
        this.Exam_date = "";
        // Setting isRegistered as false// 
        this.isRegistered= false;
        // Setting isRemoved as false//
        this.isRemoved= false;
        Instructor_name = Instructor_name;
        Duration = Duration;
        prerequisite = prerequisite;
    }
    
    //Accessor method//
    // Getter for Instructor_name//
    public String getInstructor_name()
    {
        return Instructor_name;
    }
    
    // Getter for Start_date//
    public String getStart_date()
    {
        return Start_date;
    }
    
    // Getter for Completion_date//
    public String getCompletion_date()
    {
        return Completion_date;
    }
    
    // Getter for Exam_date//
    public String getExam_date()
    {
        return Exam_date;
    }
    
    // Getter for prerequisite//
    public String getprerequisite()
    {
        return prerequisite;
    }
    
    //Getter for Duration//
    public int getDuration()
    {
        return Duration;
    }
    
    //Getter for isRegistered//
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
    //Getter for isRemoved//
    public boolean getisRemoved()
    {
        return isRemoved;
    }
    
    //Setter for Instructor_name//
    public void setInstructor_name(String Instructor_name)
    {
        if(isRegistered == false)
        {
            this.Instructor_name=Instructor_name;
        }
        
        else
        {
            System.out.println("Instructor Name cannot be changed.");
        }
    }
    
    // New method Register//
    public void register(String course_leader, String Instructor_name, String Start_date, String Exam_date, String Completion_date)
    {
        if(isRegistered == false)
        {
            super.setcourse_leader("");
            this.Instructor_name=Instructor_name;
            this.Start_date = Start_date;
            this.Completion_date = Completion_date;
            this.Exam_date = Exam_date;
        }
        
        else
        {
            System.out.println("Course is already Registered.");
        }
    }
    
    // Method for Removal//
    public void remove()
    {
        if(isRemoved == true)
        {
            System.out.println("Course is already Removed.");
        }
        
        else
        {
            super.setcourse_leader ("");
            Instructor_name = "";
            Start_date = "";
            Completion_date = "";
            Exam_date = "";
            //Setting isRegistered false//
            isRegistered = false;
            // Setting idRemoved true//
            isRemoved = true;
        }
    }
    
    // Displaying Method//
    public void display()
    {
        System.out.println("CourseID:" +super.getcourseID());
        System.out.println("Course name:" + super.getcourse_name());
        System.out.println("Course duratiom" +super.getcourse_duration());
        
        // Display if isRegistered is true//
        if(isRegistered == true)
        {
            System.out.println("\n\t\t NON-ACADEMIC COURSE DEATIL");
            System.out.println("Instructor Name:" +Instructor_name);
            System.out.println("Starting Date:" +Start_date);
            System.out.println("Completion Date:" +Completion_date);
            System.out.println("Exam Date:" +Exam_date);         
        }
    }
}

