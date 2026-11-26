package demo.desk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;
@SpringBootApplication
public class DeskApplication {
 public static void main(String[] args) { SpringApplication.run(DeskApplication.class,args); }
 @Bean CommandLineRunner seed(DeskRepository repo) {
  return args -> { if (repo.all().isEmpty()) {
  repo.insert("1",new DeskRecord.Input("Returned replacement cartridges","Returns accounts","Returned goods","Queued","INV-2E041",LocalDate.now().plusDays(2),"Match all returned cartridges against the warehouse receipt.",2));
  repo.insert("2",new DeskRecord.Input("Agreed installation discount","Pricing desk","Price adjustment","Checking","INV-2E059",LocalDate.now().plusDays(6),"Compare the discount against the signed installation quote.",1));
  repo.insert("3",new DeskRecord.Input("Duplicate transport line","Receivables team","Duplicate charge","Reconciled","INV-2E087",LocalDate.now().plusDays(10),"Invoice line and proof of duplicate billing were matched by a second reviewer.",1));
  repo.insert("4",new DeskRecord.Input("Return of display fixtures","Returns accounts","Returned goods","Queued","INV-2F014",LocalDate.now().plusDays(14),"Wait for the pickup confirmation before completing the review.",3));
  repo.insert("5",new DeskRecord.Input("Contract rate correction","Pricing desk","Price adjustment","Checking","INV-2F022",LocalDate.now().plusDays(18),"Confirm the price on the original order and the date it changed.",4));
  repo.insert("6",new DeskRecord.Input("Duplicate handling fee","Receivables team","Duplicate charge","Reconciled","INV-2F078",LocalDate.now().plusDays(22),"Original invoice line and duplicate fee were checked before reconciliation.",1));
  }};
 }
}
