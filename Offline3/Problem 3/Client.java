import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        List<String> credentials = new ArrayList<String>();
        List<Component> companies =  new ArrayList<Component>();
        System.out.println("At First Create a Company:");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give Company Name:");
        String company_name = br.readLine();
        if(credentials.contains(company_name)==false)
        {
            companies.add(new Company(company_name));
            credentials.add(company_name);
        }

        System.out.println("Give Project Manager Name:");
        String manager_name = br.readLine();
        System.out.println("Give Project Name:");
        String project_name = br.readLine();

        if(credentials.contains(manager_name) || credentials.contains(project_name))
        {   
            System.out.println("The Name Already Exists.");
        }
        else
        {
            credentials.add(manager_name);
            credentials.add(project_name);
            companies.get(0).add(new Manager(manager_name, project_name));
        }
        while(0==0)
        {
            String choice,developer_name;
            company_name="";
            manager_name="";
            project_name="";
            System.out.println("1.Add Company");
            System.out.println("2.Add Project Manager");
            System.out.println("3.Add Developer");
            System.out.println("4.Remove Company");
            System.out.println("5.Remove Project Manager");
            System.out.println("6.Remove Developer");
            System.out.println("7.Print Developer Details");
            System.out.println("8.Print Project Manager Details");
            System.out.println("9.Print Project Manager Hierarchy");
            System.out.println("10.Print Company Details");
            System.out.println("11.Print Company Hierarchy");
            System.out.println("Give Choice of Action(0 to exit) : ");
            choice = br.readLine();
            if(choice.equalsIgnoreCase("0"))
            {
                break;
            }
            else if(choice.equalsIgnoreCase("1"))
            {
                System.out.println("Give Company Name :");
                company_name= br.readLine();
                if(credentials.contains(company_name)==false)
        {
            companies.add(new Company(company_name));
            credentials.add(company_name);
        }
        else
        {
            System.out.println("This Name Already Exists");
        }
            }
            else if(choice.equalsIgnoreCase("2"))
            {
                if(companies.size()==0)
                {
                    System.out.println("Create A Company First");
                }
                else
                {
                String company_choice;
                System.out.println("Give Manager Name:");
                manager_name = br.readLine();
                System.out.println("Give Project Name:");
                project_name = br.readLine();
                if(credentials.contains(project_name) || credentials.contains(manager_name))
                {
                    System.out.println("The Name Already Exists");
                }
                else
                {
                System.out.println("Choose Company:");
                for(int i=0;i<companies.size();i++)
                {  
                    System.out.println((i+1)+"  "+companies.get(i).get_name());
                }
                company_choice = br.readLine();
                companies.get(Integer.parseInt(company_choice)-1).add(new Manager(manager_name, project_name));
                credentials.add(manager_name);
                credentials.add(project_name);
            }
        }

            }
            else if (choice.equalsIgnoreCase("3"))
            {
                if(companies.size()==0)
                {
                    System.out.println("At First Create A Company");
                }
                else
                {
                    boolean flag = false;
                    for(int i=0;i<companies.size();i++)
                    {
                        if(companies.get(i).get_project_number()!=0)
                        {
                            flag=true;
                            break;
                        }
                    }
                    if(flag==false)
                    {
                        System.out.println("Create A Manager First.");
                    }
                    else
                    {
                    String company_choice;
                    System.out.println("Give Developer Name: ");
                    developer_name=br.readLine();
                    if(credentials.contains(developer_name))
                    {
                        System.out.println("The Name Already Exists.");
                    }
                    else
                    {
                    System.out.println("Choose Company :");
                    for(int i=0;i<companies.size();i++)
                {  
                    System.out.println((i+1)+"  "+companies.get(i).get_name());
                }
                   company_choice = br.readLine();
                   if(companies.get(Integer.parseInt(company_choice)-1).get_project_number()==0)
                   {
                    System.out.println("The Company has no running Projects");
                   }
                   else
                   {
                    System.out.println("Choose Project Manager");
                    String manager_choice;
                    for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_project_number();i++)
                    {
                        System.out.println((i+1)+"  "+companies.get(Integer.parseInt(company_choice)-1).get_child(i).get_name());
                    }
                    manager_choice=br.readLine();
                    companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).add(new Developer(developer_name));
                    credentials.add(developer_name);
                   }
                    }
                
                }
            }
            }
            else if(choice.equalsIgnoreCase("4"))
            {
                System.out.println("Give Company Name: ");
                company_name= br.readLine();
                boolean company_del_flag=false;
                for(int i=0;i<companies.size();i++)
                {
                    if(companies.get(i).get_name().equalsIgnoreCase(company_name))
                    {
                        company_del_flag= true;
                        if(companies.get(i).get_project_number()!=0)
                        {
                            System.out.println("Company Not Empty.Force Delete?");
                            System.out.println("1.Yes");
                            System.out.println("2.No");
                            String delete_choice= br.readLine();
                            if(delete_choice.equalsIgnoreCase("1"))
                            {
                                companies.get(i).delete();
                                companies.remove(i);
                            }
                            
                        }
                        else
                        {
                            companies.get(i).delete();
                            companies.remove(i);
                        }
                        break;
                    }
                }
                if(company_del_flag==false)
                {
                    System.out.println("Company Does Not Exist.");
                }

                
            }
            else if(choice.equalsIgnoreCase("5"))
            {
                String company_choice;
                System.out.println("Choose Company :");
                for(int i=0;i<companies.size();i++)
            {  
                System.out.println((i+1)+"  "+companies.get(i).get_name());
            }
               company_choice = br.readLine();
               if(companies.get(Integer.parseInt(company_choice)-1).get_project_number()==0)
               {
                System.out.println("The Company has no running Projects");
               }
               else
               {
                System.out.println("Choose Project Manager");
                String manager_choice;
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_project_number();i++)
                {
                    System.out.println((i+1)+"  "+companies.get(Integer.parseInt(company_choice)-1).get_child(i).get_name());
                }
                manager_choice=br.readLine();
                if(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_dev_number()!=0)
                {
                    System.out.println("The Manager Still Has Developers.Force Delete?");
                    System.out.println("1.Yes");
                            System.out.println("2.No");
                            String delete_choice= br.readLine();
                            if(delete_choice.equalsIgnoreCase("1"))
                            {
                                companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).delete();
                                companies.get(Integer.parseInt(company_choice)-1).remove(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1));
                            }

                }
                else
                {
                    companies.get(Integer.parseInt(company_choice)-1).remove(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1));
                    
                }
                

               }
            }
            else if(choice.equalsIgnoreCase("6"))
            {
                String company_choice;
                System.out.println("Choose Company :");
                for(int i=0;i<companies.size();i++)
            {  
                System.out.println((i+1)+"  "+companies.get(i).get_name());
            }
               company_choice = br.readLine();
               if(companies.get(Integer.parseInt(company_choice)-1).get_project_number()==0)
               {
                System.out.println("The Company has no running Projects");
               }
               else
               {
                System.out.println("Choose Project Manager");
                String manager_choice;
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_project_number();i++)
                {
                    System.out.println((i+1)+"  "+companies.get(Integer.parseInt(company_choice)-1).get_child(i).get_name());
                }
                manager_choice=br.readLine();
                if(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_dev_number()==0)
                {
                    System.out.println("The manager has no developer");
                }
                else
                {
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_dev_number();i++)
                {
                    System.out.println((i+1)+" "+companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_child(i).get_name());
                }
                System.out.println("Choose Developer :");
                String developer_choice;
                developer_choice= br.readLine();
                companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).remove(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_child(Integer.parseInt(developer_choice)-1));
                
            }
            }

            }
            else if(choice.equalsIgnoreCase("7"))
            {
                String company_choice;
                System.out.println("Choose Company :");
                for(int i=0;i<companies.size();i++)
            {  
                System.out.println((i+1)+"  "+companies.get(i).get_name());
            }
               company_choice = br.readLine();
               if(companies.get(Integer.parseInt(company_choice)-1).get_project_number()==0)
               {
                System.out.println("The Company has no running Projects");
               }
               else
               {
                System.out.println("Choose Project Manager");
                String manager_choice;
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_project_number();i++)
                {
                    System.out.println((i+1)+"  "+companies.get(Integer.parseInt(company_choice)-1).get_child(i).get_name());
                }
                manager_choice=br.readLine();
                if(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_dev_number()==0)
                {
                    System.out.println("The manager has no developer");
                }
                else
                {
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_dev_number();i++)
                {
                    System.out.println(companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_child(i).get_name());
                }
                System.out.println("Choose Developer :");
                String developer_choice;
                developer_choice= br.readLine();
                companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).get_child(Integer.parseInt(developer_choice)-1).details();
            }
            }
            }
            else if(choice.equalsIgnoreCase("8"))
            {
                String company_choice;
                System.out.println("Choose Company :");
                for(int i=0;i<companies.size();i++)
            {  
                System.out.println((i+1)+"  "+companies.get(i).get_name());
            }
               company_choice = br.readLine();
               if(companies.get(Integer.parseInt(company_choice)-1).get_project_number()==0)
               {
                System.out.println("The Company has no running Projects");
               }
               else
               {
                System.out.println("Choose Project Manager");
                String manager_choice;
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_project_number();i++)
                {
                    System.out.println((i+1)+"  "+companies.get(Integer.parseInt(company_choice)-1).get_child(i).get_name());
                }
                manager_choice=br.readLine();
                companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).details();
               }

            }
            else if(choice.equalsIgnoreCase("9"))
            {
                String company_choice;
                System.out.println("Choose Company :");
                for(int i=0;i<companies.size();i++)
            {  
                System.out.println((i+1)+"  "+companies.get(i).get_name());
            }
               company_choice = br.readLine();
               if(companies.get(Integer.parseInt(company_choice)-1).get_project_number()==0)
               {
                System.out.println("The Company has no running Projects");
               }
               else
               {
                System.out.println("Choose Project Manager");
                String manager_choice;
                for(int i=0;i<companies.get(Integer.parseInt(company_choice)-1).get_project_number();i++)
                {
                    System.out.println((i+1)+"  "+companies.get(Integer.parseInt(company_choice)-1).get_child(i).get_name());
                }
                manager_choice=br.readLine();
                companies.get(Integer.parseInt(company_choice)-1).get_child(Integer.parseInt(manager_choice)-1).hierarchy();
               }
            }
            else if(choice.equalsIgnoreCase("10"))
            {
                System.out.println("Give Company Name: ");
                company_name= br.readLine();
                boolean company_del_flag=false;
                for(int i=0;i<companies.size();i++)
                {
                    if(companies.get(i).get_name().equalsIgnoreCase(company_name))
                    {
                        company_del_flag= true;
                        companies.get(i).details();
                        break;
                    }
                }
                if(company_del_flag==false)
                {
                    System.out.println("Company Does Not Exist.");
                }

                               
            }
            else if(choice.equalsIgnoreCase("11"))
            {
                System.out.println("Give Company Name: ");
                company_name= br.readLine();
                boolean company_del_flag=false;
                for(int i=0;i<companies.size();i++)
                {
                    if(companies.get(i).get_name().equalsIgnoreCase(company_name))
                    {
                        company_del_flag= true;
                        companies.get(i).hierarchy();
                        break;
                    }
                }
                if(company_del_flag==false)
                {
                    System.out.println("Company Does Not Exist.");
                }   
            }

        }

           
    }
    
}
