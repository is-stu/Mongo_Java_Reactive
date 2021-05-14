package tewar.mongoReactive.inter;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import tewar.mongoReactive.student.Student;

public interface StudentReactiveRepository extends ReactiveCrudRepository<Student,String> {
}
