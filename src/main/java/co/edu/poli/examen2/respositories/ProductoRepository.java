package co.edu.poli.examen2.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.examen2.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
