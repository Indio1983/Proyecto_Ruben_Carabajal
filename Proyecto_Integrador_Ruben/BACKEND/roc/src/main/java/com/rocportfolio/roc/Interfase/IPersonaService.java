/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rocportfolio.roc.Interfase;

import com.rocportfolio.roc.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    public List <Persona> getPersona();
    //guardar un objto de tipo persona
    public void saverPersona(Persona persona);
    
    //eliminar un usuario lo buscamos por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
}
