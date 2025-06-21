package DependencyInjectionExample;

public class CustomerService {
  private CustomerRepository repo;
  
  public CustomerService(CustomerRepository repo){
    this.repo = repo;
  }

  public void display(String id){
    String dets = repo.findCustomerById(id);
    System.out.println("Customer : "+dets);
  }
}
