import java.io.IOException;
public abstract class observer {
    private ABCserver abcserver;
    private int state;
    private String name;

    public observer(ABCserver abcserver,String name)
    {
        this.abcserver=abcserver;
        this.abcserver.registerobserver(this);
        this.name=name;
        state=1;
    }
    public void setState(int state) {
        this.state = state;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAbcserver(ABCserver abcserver) {
        this.abcserver = abcserver;
    }
    public ABCserver getAbcserver() {
        return abcserver;
    }
    public String getName() {
        return name;
    }
    public int getState() {
        return state;
    }
    public abstract void update() throws IOException;


}
