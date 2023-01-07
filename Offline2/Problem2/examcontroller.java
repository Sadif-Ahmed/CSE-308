import java.util.ArrayList;
import java.util.List;

public class examcontroller implements mediator{
   private List<student> students;
   private List<teacher> teachers;

   public examcontroller()
   {

   }
   public void setteachers(List<teacher>teachers)
   {
    this.teachers=teachers;
   }
   public void setstudents(List<student>students)
   {
    this.students=students;
   }
   List<teacher> getteachers()
   {
    return teachers;
   }
   List<student> getstudents()
   {
    return students;
   }
   
    @Override
    public void send(participant receiver, exam examitems) {
        // TODO Auto-generated method stub
        if(receiver instanceof student)
        {
            System.out.println("Re-examination Request received from student#"+receiver.getparticipantid());
            System.out.println("Re-examination Request Forwarded to Teacher#"+examitems.getscripts().get(0).getteacher());
            teachers.get(examitems.getscripts().get(0).getteacher()-1).receive(examitems);
        }
        if(receiver instanceof teacher && examitems.getmarksheet()==null)
        {
            System.out.println("Re-examination Response received From Teacher#"+receiver.getparticipantid());
            if(examitems.getscripts().get(0).getstatus()==2)
            {
                System.out.println("Marks Increased");
            }
            else if(examitems.getscripts().get(0).getstatus()==3)
            {
                System.out.println("Marks Decreased");
            }
            else if (examitems.getscripts().get(0).getstatus()==4)
            {
                System.out.println("Marks Unchanged");
            }
            else 
            {

            }
            System.out.println("Re-examination response forwarded to Student#"+examitems.getscripts().get(0).getstudent());
            students.get(examitems.getscripts().get(0).getstudent()-1).receive(examitems);
        }
        if(receiver instanceof teacher && examitems.getmarksheet()!=null)
        {
            System.out.println("Exam Script and marksheets received from Teacher#"+receiver.getparticipantid());
            for(int i=0;i<examitems.getscripts().size();i++)
            {
                System.out.println("Student#"+examitems.getscripts().get(i).getstudent()+" : "+examitems.getscripts().get(i).getmarks());
            }
            System.out.println("Cases of Mistakes : ");
            for(int i=0;i<examitems.getscripts().size();i++)
            {
                if(examitems.getscripts().get(i).getmarks()!=examitems.getmarksheet().get(i))
                {
                    System.out.println("Student#"+examitems.getscripts().get(i).getstudent()+"   previous marks:"+examitems.getmarksheet().get(i)+"   new marks"+examitems.getscripts().get(i).getmarks());

                }
            }
            for(int i=0;i<examitems.getscripts().size();i++)
            {
                exam temp = new exam();
                temp.scripts = new ArrayList<>();
                temp.scripts.add(examitems.getscripts().get(i));
                System.out.println("Result Forwarded To Student#"+examitems.getscripts().get(i).getstudent());
                students.get(examitems.getscripts().get(i).getstudent()-1).receive(temp);

            }

        }
        return;
        
    }
    
}
