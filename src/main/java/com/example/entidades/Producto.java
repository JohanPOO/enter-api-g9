package com.example.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "ProductoEntity")
@Table(name = "producto")
//Clase Producto
public class Producto implements Serializable{

    private static final long serialVersionUID = 1L;
    
    //Variable Codigo
    @Id
    @Column(name = "codigo_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    //Variable Nombre
    @Column(name = "nombre_producto")
    private String nombre;
    
    //Variable Precio
    @Column(name = "precio_producto")
    private double precio;    
    
    @Column(name = "stock_producto")
    private int stock;   
    
    //Variable Stock
    @Column(name = "estado_producto")
    private boolean estado; 
    
    //Foreign key proveedor
    @ManyToOne
    @JoinColumn(name = "codigo_proveedor", nullable = false)
    private Proveedor proveedor; 
    
    //Foreign key categoria
    @ManyToOne
    @JoinColumn(name = "codigo_categoria", nullable = false)
    private Categoria categoria; 
}
