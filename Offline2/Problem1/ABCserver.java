import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ABCserver implements subject{
    private List<observer> observers;
    private int prev_state;
    private int curr_state;

    public ABCserver()
    {
        observers = new ArrayList<>();
        curr_state=1;
    }
    public void setCurr_state(int curr_state) throws IOException{
        this.prev_state=this.curr_state;
        this.curr_state = curr_state;
        notifyobservers();
    }
    public void setPrev_state(int prev_state) {
        this.prev_state = prev_state;
    }
    public int getCurr_state() {
        return curr_state;
    }
    public int getPrev_state() {
        return prev_state;
    }
    public List<observer> getObservers() {
        return observers;
    }
    public void setObservers(List<observer> observers) {
        this.observers = observers;
    }
    @Override
    public void registerobserver(observer obs) {
        observers.add(obs);
    }
    @Override
    public boolean removeobserver(String name) {
        int flag=-1;
        for(int i=0;i<observers.size();i++)
        {
            if(name.equalsIgnoreCase(observers.get(i).getName()))
            {
                flag=i;
                break;
            }
        }
        if(flag==-1)
        {
            return false;
        }
        else
        {
            observers.remove(observers.get(flag));
            return true;
        }
    }
    @Override
    public void notifyobservers() throws IOException {
        for(observer tempObserver:observers)
        {
            tempObserver.update();
        }
        return;
    }

}
