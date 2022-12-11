// package tn.esprit.rh.achat;


// import org.junit.Test;

// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Mockito;
// import org.mockito.junit.MockitoJUnitRunner;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import tn.esprit.spring.entities.Voyageur;
// import tn.esprit.spring.repositories.VoyageurRepository;
// import tn.esprit.spring.services.VoyageurServiceImpl;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.times;

// @SpringBootTest
// @RunWith(MockitoJUnitRunner.class)
// public class VoyageurServiceMockTest {


   

//     @Mock
//     VoyageurRepository voyageurRepository;

//    @InjectMocks
//    VoyageurServiceImpl voyageurService;

//     Voyageur v1 = new Voyageur(1,"zaynab");
//     Voyageur v2 = new Voyageur(2,"farah");


//     List<Voyageur> listVoyageurs = new ArrayList<Voyageur>() {
//         {
//             add(v1);
//             add(new Voyageur(3,"ahmed"));
//             add(new Voyageur(4,"sarrah"));
//         }
//     };



//     @Test
//     public void testRetrieveVoyageur() {

//         Mockito.when(voyageurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(v1));
//         Voyageur voyageur1 = voyageurService.retrieveVoyageur(1);
//         assertNotNull(voyageur1);
//         System.out.println("1");
//         assertEquals(voyageur1.getIdVoyageur(),1);
//    }

//     @Test
//     public void testretrieveAllVoyageurs() {
//         Mockito.when(voyageurRepository.findAll()).thenReturn(listVoyageurs);
//         List<Voyageur> listvoyageur3 = voyageurService.retrieveAllVoyageurs();
//         assertEquals(3, listvoyageur3.size());
//         System.out.println("2555");
//     }

//     @Test
//     public void testaddVoyageur(){
//         Mockito.when(voyageurRepository.save(v1)).thenReturn(v1);
//         Voyageur voyageur1 = voyageurService.addVoyageur(v1);

//         Mockito.verify(voyageurRepository, times(1)).save(Mockito.any(Voyageur.class));
//         System.out.println("3");
//     }

//     @Test
//     public void testdeleteVoyageur(){
//         voyageurService.deleteVoyageur(2);
//         Mockito.verify(voyageurRepository, times(1)).deleteById(2);
//         System.out.println("4");
//     }

//     @Test
//     public void testupdateVoyageur(){
//         Mockito.when(voyageurRepository.save(v1)).thenReturn(v1);
//         Voyageur voyageur1 = voyageurService.updateVoyageur(v1);
//         Mockito.verify(voyageurRepository, times(1)).save(Mockito.any(Voyageur.class));
//         System.out.println("5");
//     }

  



// }
