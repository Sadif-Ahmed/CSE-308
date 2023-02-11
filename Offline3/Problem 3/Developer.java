public class Developer extends Component {
    String name;
    String role="Developer";
    String project_name;
    Developer(String name)
    {
        this.name=name;
        
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
    public void delete()
    {
        System.out.println("Deleting Developer "+name);
    }
    public void details()
    {
        System.out.println("\t\t Developer: " + name);
    }
    
}
