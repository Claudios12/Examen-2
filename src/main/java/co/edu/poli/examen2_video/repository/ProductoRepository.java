package co.edu.poli.examen2_video.repository;

import co.edu.poli.examen2_video.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, String> {
   

}
