public class script {
    private int teacherid;
    private int studentid;
    private int marks;
    private int status;

    public script(int teacherid,int studentid,int  marks)
    {
        this.teacherid=teacherid;
        this.studentid=studentid;
        this.marks=marks;
        this.status=1;
    }
    int getteacher()
    {
        return teacherid;
    }
    int getstudent()
    {
        return studentid;
    }
    int getmarks()
    {
        return marks;
    }
    int getstatus()
    {
        return status;
    }
    void setteacher(int  id)
    {
        teacherid=id;
    }
    void setstudent(int id)
    {
        studentid=id;
    }
    void setstatus(int newstatus)
    {
        status=newstatus;
    }
    void setmarks(int newmarks)
    {
        marks=newmarks;
    }
    public String toString()
    {
        return "Student #"+studentid+" achieved "+marks;
    }
    
}
