package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository{
    
  public String findCustomerById(String id){
    return "Customer id = "+id+", name = Sujaya";
  }
}
