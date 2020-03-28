package ma.isga.gesimmob.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.isga.gesimmob.entities.Photo;
import ma.isga.gesimmob.repositories.PhotoRepository;

@Service
public class PhotoServer {
	
	@Autowired
	private PhotoRepository photoRepository;
	
	public List<Photo> findByid(String identBien){
		
		 List<Photo> photos=photoRepository.findByIdentbien(identBien);
		
		return photos;
	}

}
