package ma.isga.gesimmob;


import ma.isga.gesimmob.entities.User;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.PhotoRepository;
import ma.isga.gesimmob.services.BienService;
import ma.isga.gesimmob.services.PhotoServer;
import ma.isga.gesimmob.services.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GesimmobApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
	private PhotoServer photoServer;
    
    @Autowired
	private PhotoRepository photoRepository;
    
    @Autowired
    BienService bs;
    
    @Autowired
    BienRepository br;
    
    public static void main(String[] args) {
        SpringApplication.run(GesimmobApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        // 
        {

			/*
			 * List<Bien> abs = br.allBien("IDAO1"); for (Bien bien : abs) {
			 * 
			 * System.out.println(bien.toString());
			 * 
			 * }
			 */
			/*
			 * User newAdmin = new User("admin@mail.com", "Admin", "123456"); User admin =
			 * new User("admin@gmail.com", "admin", "admin1", "Rabat", "Maroc", "123",
			 * "Rabat"); userService.createAdmin(admin); User newUser = new
			 * User("cisse@mail.com", "Admin", "123456"); userService.createUser(newUser);
			 * 
			 * List<Photo> pto = photoServer.findByid("zzz"); List<Photo>
			 * photos=photoRepository.findByIdentbien("zzz");
			 */
        	//System.out.println(photos.size());
			
			/*
			 * for (Photo photo : photos) {
			 * 
			 * System.out.println(photo.getUrl()); }
			 */
			User admin = new User("admin@gmail.com", "admin", "admin1", "Rabat", "Maroc", "123","Rabat"); 
			userService.createAdmin(admin);
		
        	
        }
    }

}
