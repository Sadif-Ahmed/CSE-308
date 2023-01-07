import java.io.IOException;
import java.io.BufferedReader;   
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    
    public static void main(String[] args) throws IOException{
        List<student> students = new ArrayList<>();
        List<teacher> teachers = new ArrayList<>();
        examcontroller examcontrolleroffice =  new examcontroller();
        int numteachers,numstudents;
        System.out.println("Enter Number of Teachers : ");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        numteachers=Integer.parseInt(br.readLine());
        System.out.println("Enter Number of Students : ");
        br =new BufferedReader(new InputStreamReader(System.in));
        numstudents=Integer.parseInt(br.readLine());
        for(int i=0;i<numteachers;i++)
        {
            teachers.add(new teacher(examcontrolleroffice, i+1));
        }
        for(int i=0;i<numstudents;i++)
        {
            students.add(new student(examcontrolleroffice, i+1));
        }

        examcontrolleroffice.setstudents(students);
        examcontrolleroffice.setteachers(teachers);

        List<List<script>> teacherscript = new ArrayList<>();
        List <script> temp;

        for(int i=0;i<numteachers;i++)
        {
            temp= new ArrayList<>();
            teacherscript.add(temp);
        }
        Random rand = new Random();
        for(int i=0,teacheridx=0;i<numstudents;i++)
        {
            if(teacheridx==numteachers)
            {
                teacheridx=0;
            }

            teacherscript.get(teacheridx).add(new script(teacheridx+1, i+1, rand.nextInt(78)+33));
            teacheridx++;
        }

        for(int i=0;i<numteachers;i++)
        {
            teachers.get(i).send_examitems(teacherscript.get(i));
        }


        while(true)
        {
            System.out.println("Give ID of the student for reexamination(Enter 0 to exit Reexamination):");
            br =new BufferedReader(new InputStreamReader(System.in));
            int reid=Integer.parseInt(br.readLine());
            if(reid==0)
            {
                break;
            }
            else if(reid<0 && reid>numstudents)
            {
                System.out.println("Invalid ID of Student.Please Try Again.");
            }
            else 
            {
                students.get(reid-1).request_reexamination();
            }

        }

        return ;
    }
    
}
