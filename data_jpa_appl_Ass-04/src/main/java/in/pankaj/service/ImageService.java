package in.pankaj.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;     
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

import in.pankaj.entity.ImageEntity;
import in.pankaj.repo.ImageRepo;

@Service
public class ImageService {
	
	private final ImageRepo imgRepo;
	
	public ImageService(ImageRepo imageRepository) {
        this.imgRepo = imageRepository;
    }

	public String uploadImage(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        
        byte[] imageData = Files.readAllBytes(path);
        
        String fileName = path.getFileName().toString();
        String contentType = Files.probeContentType(path); 
        
        ImageEntity image = new ImageEntity(fileName, contentType, imageData);
        
        imgRepo.save(image);

        return "Image saved successfully from path: " + filePath;
    }
}
