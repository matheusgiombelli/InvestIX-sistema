package com.invistaix.sistema.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PROPRIETARIOS")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proprietario_id")
    private Integer id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "telefone", nullable = false, length = 11, unique = true)
    private String telefone;

    @Column(name = "cpf_cnpj", nullable = false, length = 14, unique = true)
    private String cpfCnpj;

    @Column(name = "senha", nullable = true, length = 64)
    private String senha;

    private Long quantidadeImoveis;

    // Construtores
    public Proprietario() {
    }

    public Proprietario(Integer id, String nome, String email, String telefone, String cpfCnpj, Long quantidadeImoveis) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpfCnpj = cpfCnpj;
        this.quantidadeImoveis = quantidadeImoveis;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Long getQuantidadeImoveis() {
        return quantidadeImoveis;
    }

    public void setQuantidadeImoveis(Long quantidadeImoveis) {
        this.quantidadeImoveis = quantidadeImoveis;
    }
}