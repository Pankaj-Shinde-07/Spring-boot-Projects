package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.TimingEntity;

public interface TimingRepo extends JpaRepository<TimingEntity, Integer>{

}
