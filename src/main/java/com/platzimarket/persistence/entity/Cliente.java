package com.platzimarket.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

        @Id
        private String id;

        @Column(name = "nombre")
        private String firstName;

        @Column(name = "apellidos")
        private String lastName;

        @Column(name = "celular")
        private Long cellphone;

        @Column(name = "direccion")
        private String address;

        @Column(name = "correo_electronico")
        private String email;

        @OneToMany(mappedBy = "cliente")
        private List<Compra> compras;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirtsName() {
            return firstName;
        }

        public void setFirtsName(String firtsName) {
            this.firstName = firtsName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Long getCellphone() {
            return cellphone;
        }

        public void setCellphone(Long cellphone) {
            this.cellphone = cellphone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Compra> getCompras() {
            return compras;
        }

        public void setCompras(List<Compra> compras) {
            this.compras = compras;
        }
}
