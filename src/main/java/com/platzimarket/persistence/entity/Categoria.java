package com.platzimarket.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

        @Id
        @Column(name = "id_categoria")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String descripcion;

        @Column(name = "estado")
        private Boolean active;

        @OneToMany(mappedBy = "categoria")
        private List<Producto> productos;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getDescription() {
                return descripcion;
        }

        public void setDescription(String description) {
                this.descripcion = description;
        }

        public Boolean getActive() {
                return active;
        }

        public void setActive(Boolean active) {
                this.active = active;
        }

        public List<Producto> getProductos() {
                return productos;
        }

        public void setProductos(List<Producto> productos) {
                this.productos = productos;
        }
}
