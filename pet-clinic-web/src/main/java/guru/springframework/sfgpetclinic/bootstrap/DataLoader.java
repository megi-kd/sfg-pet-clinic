package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframeworkguru.sfgpetclinic.model.Owner;
import guru.springframeworkguru.sfgpetclinic.model.Vet;
import guru.springframeworkguru.sfgpetclinic.services.OwnerService;
import guru.springframeworkguru.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jane");
        owner1.setLastName("Doe");
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Doe");
        ownerService.save(owner2);

        System.out.println("Loaded owners.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vet");
        vet1.setLastName("One");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Vet");
        vet2.setLastName("Two");
        vetService.save(vet2);

        System.out.println("Loaded vets.....");
    }
}
