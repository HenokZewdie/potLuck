package RepoPackage;

import org.springframework.data.repository.CrudRepository;

import PotLuckWeb.Student;


public interface Repo extends CrudRepository<Student, Long>{

}
