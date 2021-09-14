package com.undec.level.model;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "item_pedido", schema = "menu_electronico", catalog = "")
public class ItemPedidoEntity {
    private int id;
    private int idPedido;
    private int idProducto;
    private double precio;
    private int cantidad;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_pedido")
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    @Basic
    @Column(name = "id_producto")
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
    @Column(name = "cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedidoEntity that = (ItemPedidoEntity) o;
        return id == that.id &&
                idPedido == that.idPedido &&
                idProducto == that.idProducto &&
                Double.compare(that.precio, precio) == 0 &&
                cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idPedido, idProducto, precio, cantidad);
    }
}
