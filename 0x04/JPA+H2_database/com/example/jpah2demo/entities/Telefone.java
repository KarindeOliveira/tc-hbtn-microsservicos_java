package com.example.jpah2demo.entities;

import javax.persistence.*;


@Entity
@Table(name = "Telefone")
public class Telefone {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private int DDD;
    @Column(nullable = false)
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    public Telefone(Long id, int DDD, String telefone, Cliente cliente) {
        this.id = id;
        this.DDD = DDD;
        this.telefone = telefone;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", ddd='" + DDD + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }


}
