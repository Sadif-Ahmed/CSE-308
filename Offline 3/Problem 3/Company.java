import java.util.ArrayList;
import java.util.List;

public class Company extends Component {
    String name;
    List<Component> managers = new ArrayList<Component>();
    List<String> projects = new ArrayList<String>();
    Company(String name)
    {
        this.name = name;
    }
    public void set_name(String name)
    {
        this.name= name;
    }
    public String get_name()
    {
        return name;
    }
    public int get_project_number()
    {
        return managers.size();
    }
    public void add(Component component)
    {
        if(projects.contains(component.get_project_name())==false && component.parent == false)
        {
        projects.add(component.get_project_name());
        managers.add(component);
        component.parent=true;
        }
        else
        {
            System.out.println("The Manager is already on a Project.");
        }
    }
    public Component get_child(int index)
    {
       return  managers.get(index);
    }
    public void remove(Component component)
    {
        System.out.println("Removing Manager "+component.get_name());
        managers.remove(component);
        component.parent=false;    
    }
    public void delete()
    {
        System.out.println("Deleting Company "+name);
        for(int i=0;i<managers.size();i++)
        {
            managers.get(i).delete();
            managers.remove(i);
        }
    }
    public void details()
    {
        System.out.println("Company Name: "+name);
        System.out.println("Number of Project Managers: "+managers.size());
    }
    public void hierarchy()
    {
        System.out.println("Company Name: "+name);
        for(Component component:managers)
        {
            component.hierarchy();
        }
    }


}
