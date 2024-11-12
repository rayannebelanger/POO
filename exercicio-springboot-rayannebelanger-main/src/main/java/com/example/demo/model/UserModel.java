package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //diz que vai ser uma tabela no banco de dados
//TUdo que fizer no modelo reflete no banco de dados
@Table(name = "users") //nome da tabela | mostra que a @entity tem um nome
@NoArgsConstructor //faz o constrtuor (por tras dos panos p vc)que não inicializa os atributos
@AllArgsConstructor //faz o construtor que inicializa todos os atributos
@Getter //faz os getters e setters (abaixo)
@Setter
public class UserModel {
    @Id //essa anotação diz que esse campo abaixo é uma chave primária
    @GeneratedValue
    private Long id; //o tipo é sempre maiusculo, localizar o correspondente dele em Java, ex: int(primitivo) é Interger
    private String name;


}