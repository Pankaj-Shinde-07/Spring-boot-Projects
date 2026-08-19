package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.EmpAddress;

public interface AddressRepo extends JpaRepository<EmpAddress, Integer> {

}
