package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.ImageEntity;

public interface ImageRepo extends JpaRepository<ImageEntity, Long> {

}
