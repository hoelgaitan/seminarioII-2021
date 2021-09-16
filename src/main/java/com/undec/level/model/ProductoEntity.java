package com.undec.level.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "producto", schema = "menu_electronico", catalog = "")
public class ProductoEntity {
    private int id;
    private String nombre;
    private String descripcion;
    private Integer cantidad;
    private String categoria;
    private double precio;
    private String imgpath;


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "categoria")
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Basic
    @Column(name = "precio")
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "imgpath")
    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoEntity that = (ProductoEntity) o;
        return id == that.id &&
                Double.compare(that.precio, precio) == 0 &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(cantidad, that.cantidad) &&
                Objects.equals(categoria, that.categoria) &&
                Objects.equals(imgpath, that.imgpath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, cantidad, categoria, precio, imgpath);
    }
}
