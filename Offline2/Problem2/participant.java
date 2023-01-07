public abstract class participant {
    private examcontroller examcontrolleroffice;
    private int participantid;

    public participant(examcontroller exc,int id)
    {
        examcontrolleroffice=exc;
        participantid=id;
    }
    examcontroller getExamcontroller()
    {
        return examcontrolleroffice;
    }
    int getparticipantid()
    {
        return participantid;
    }
    public abstract void receive(exam examitems);
    
}
