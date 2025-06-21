package DependencyInjectionExample;

public class Main {
  public static void main(String[] args) {
    CustomerRepository repo1 = new CustomerRepositoryImpl();
    CustomerService serv = new CustomerService(repo1);
    serv.display("59");
  }  
}
