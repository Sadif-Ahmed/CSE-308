import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class teacher extends participant {
    private script examscript;

    public teacher(examcontroller examcontrolleroffice,int id)
    {
        super(examcontrolleroffice, id);
    }
    void send_examitems(List<script>examscripts)
    {
        Random rand=new Random();
        List<Integer> marksheets = new ArrayList<>();

        int indx = rand.nextInt(examscripts.size());
        for(int i=0;i<examscripts.size();i++)
        {
            if(i==indx)
            {
                marksheets.add(examscripts.get(i).getmarks()+8);
                continue;
            }
            int randnum= rand.nextInt(10);
            if(randnum %2 ==0)
            {
                marksheets.add(examscripts.get(i).getmarks()-8);
            }
            else
            {
                marksheets.add(examscripts.get(i).getmarks());
            }
        }
        exam examitem = new exam();
        examitem.setScripts(examscripts);
        examitem.setmarksheet(marksheets);

        System.out.println("ExamScripts and Marksheets sent from teacher#"+getparticipantid());
        getExamcontroller().send(this, examitem);
        return;
        }
        public void reexamine()
        {
            if(examscript==null)
            {
                return;
            }
            exam examitem = new exam();
            List<script> examscripts = new ArrayList<>();
            
            Random rand= new Random();
            int randnum=rand.nextInt(3)+2;
            if(randnum==2)
            {
                examscript.setmarks(examscript.getmarks()+5);
                if(examscript.getmarks()>100)
            {
                examscript.setmarks(100);
            }
            }
            else if(randnum==3){
                examscript.setmarks(examscript.getmarks()-2);
                if(examscript.getmarks()<33)
                {
                    examscript.setmarks(33);
                }
            }
            else
            {

            }
            examscript.setstatus(randnum);
            examscripts.add(examscript);
            examitem.setScripts(examscripts);

            System.out.println("Re-examination Response sent from Teacher#"+getparticipantid());
            getExamcontroller().send(this, examitem);
            return;
        }
        public void receive(exam examitems) {
            // TODO Auto-generated method stub
            System.out.println("Exam Script Received By Teacher#"+getparticipantid());
            examscript=examitems.getscripts().get(0);
            reexamine();
            return;
        }
    
}
