/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocportfolio.roc.Security.Service;

import com.rocportfolio.roc.Security.Entity.Usuario;
import com.rocportfolio.roc.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;  
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
    return iusuarioRepository.findNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
    return iusuarioRepository.existByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
    return iusuarioRepository.existByEmail(email);
    }
    
    public void save(Usuario usuario){
    iusuarioRepository.save(usuario);
    }
}
