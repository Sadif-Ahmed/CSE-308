import java.util.ArrayList;
import java.util.List;

public class student extends participant {
    private script examscript;

    public student(examcontroller examcontrolleroffice,int id)
    {
        super(examcontrolleroffice, id);
    }
    public void request_reexamination()
    {
        if(examscript==null)
        {
            return;
        }
        exam examitems = new exam();
        List<script> examscripts = new ArrayList<>();

        examscripts.add(examscript);
        examitems.setScripts(examscripts);

        System.out.println("Re-Examination Request Sent From Student#"+getparticipantid());
        getExamcontroller().send(this, examitems);
        return;
    }
    @Override
    public void receive(exam examitems) {
        System.out.println("Exam Script Reviewed By Teacher#"+getparticipantid());
        examscript=examitems.getscripts().get(0);
        System.out.println(examscript);
    }

    
}
