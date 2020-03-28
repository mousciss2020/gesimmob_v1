package ma.isga.gesimmob.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ma.isga.gesimmob.entities.Photo;
import ma.isga.gesimmob.repositories.BienRepository;
import ma.isga.gesimmob.repositories.PhotoRepository;

@Controller
public class PhotoController {
	
    private static String UPLOADED_FOLDER = "/Users/mac/Documents/Spring Boot/gesimmob/img/";

	@Autowired
	PhotoRepository photoRepository;
	@Autowired
	BienRepository  bienRepository;
	
		
	@PostMapping("/addPhoto")
	public String addPhoto(Photo photo, @RequestParam(name="fic") MultipartFile file) throws Exception{
		
		/*
		 * if(!(file.isEmpty())) { photo.setUrl(file.getOriginalFilename());
		 * file.transferTo(new
		 * File(System.getProperty("user.home")+"/photo"+file.getOriginalFilename())); }
		 */
		
		try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            String fileName = file.getOriginalFilename();
            photo.setUrl(fileName);

           // redirectAttributes.addFlashAttribute("message",
            //        "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		photoRepository.save(photo);
		return"redirect:/_location";
	}
	
	@GetMapping("/showPhoto")
	public String showPhoto(String idtBienen,Model model) {
		
		List<Photo> ltphotos =photoRepository.findByIdentbien(idtBienen);
		 int t=ltphotos.size();
	    model.addAttribute("photos",ltphotos);
	    model.addAttribute("taille",t);
		return"showPhoto";
	}
	
	
}
