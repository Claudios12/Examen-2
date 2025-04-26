package co.edu.poli.examen2_video.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.examen2_video.model.Producto;
import co.edu.poli.examen2_video.repository.ProductoRepository;


@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto getProductoById(String id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto updateProducto(Producto producto0){
        if (productoRepository.existsById(producto0.getId())) {
            return productoRepository.save(producto0);
        } else {
            return null;
        }
    }

    public Producto deleteProducto(String id) {
        Producto producto = getProductoById(id);
        if (producto != null) {
            productoRepository.delete(producto);
            return producto;
        } else {
            return null;
        }
    }
}
