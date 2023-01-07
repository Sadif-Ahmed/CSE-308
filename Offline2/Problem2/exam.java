import java.util.List;

public class exam {
    public List<script> scripts;
    public List<Integer> marksheet;
    void setScripts(List<script> script)
    {
        this.scripts=script;
    }
    void setmarksheet(List<Integer> marksheet)
    {
        this.marksheet=marksheet;
    }
    List<script> getscripts()
    {
        return scripts;
    }
    List<Integer> getmarksheet()
    {
        return marksheet;
    }

    
}
