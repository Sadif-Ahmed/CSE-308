import java.util.ArrayList;
import java.util.List;

public class Manager extends Component{
    String name;
    String role="Project Manager";
    String project_name;
    List<Component> devs= new ArrayList<Component>();
    Manager(String name,String project_name)
    {
        this.name=name;
        this.project_name=project_name;
    }
    public void set_name(String name)
    {
       this.name=name;
    }
    public String get_name()
    {
        return name;
    }
    public void set_role(String role)
    {
        this.role=role;
    }
    public String get_role()
    {
        return role;
    }
    public void set_project_name(String name)
    {
        this.project_name=name;
    }
    public String get_project_name()
    {
        return project_name;
    }
    public int get_dev_number()
    {
        return devs.size();
    }
    public void add(Component component)
    {
        if(component.parent==false)
        {
        devs.add(component);
        component.set_project_name(this.project_name);
        component.parent=true;
        }
        else
        {
            System.out.println("The Developer is already on a Project");
        }
    }
    public Component get_child(int index)
    {
        return devs.get(index);
    }
    public void remove(Component component)
    {
        System.out.println("Removing Developer "+component.get_name());
        devs.remove(component);
        component.parent=false;
    }
    public void delete()
    {
        System.out.println("Deleteing Manager "+name);
        for(int i=0;i<devs.size();i++)
        {
            devs.get(i).delete();
            devs.remove(i);
        }
    }
    public void details()
    {
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
        System.out.println("Current Project: "+project_name);
        System.out.println("Number of Supervisees: "+devs.size());
    }
    public void hierarchy()
    {   System.out.println("\tProject Manager: "+name+"("+project_name+")");
        for(Component component:devs)
        {
            component.details();
        }
    }
}
