package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;

@Repository
//jpa tem todos os métodos de manipulação, o CRUD
public interface IUserRepository extends JpaRepository<UserModel, Long>{ //mostra quem é o modelo base que vai fazer o jpa 
    //vai fazer a manipulçao e o Long é o tipo da chave primária

    //indica o modelo que o jpa vai ter acesso e o tipo da chave primaria

    



}
