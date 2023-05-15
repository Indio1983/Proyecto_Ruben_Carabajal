/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocportfolio.roc.Security.Controller;

import com.rocportfolio.roc.Security.Entity.Rol;
import com.rocportfolio.roc.Security.Entity.Usuario;
import com.rocportfolio.roc.Security.Enums.RolNombre;
import com.rocportfolio.roc.Security.Service.RolService;
import com.rocportfolio.roc.Security.Service.UsuarioService;
import com.rocportfolio.roc.Security.jwt.JwtProvider;
import java.util.HashSet;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;
    @PostMapping("/nuevo")
    
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevo usuario, BindingResult bindingResult){
        if(bindingResuelt.hasError())
            return new ResposeEntity(new Mensaje("Campos mal puestos o email no valido"), HttpStatus.BAD_REQUEST);
        
        if(usuarioService.existsByNombreUsuario(nombreUsuario.getNombreUsuario()))
            return new ResponseEntity(new Mensaje("Este email ya existe"), HttpStatus.BAD_REQUEST);
        
       if(usuarioService.existsByEmail(nombreUsuario.getEmail()))
           return new ResponseEntity(new Mensaje("Ese mail ya existe"), HttpStatus.BAD_REQUEST);
       
       Usuario usuario= new Usuario (nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(), nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword());
       
       Set<Rol> roles=new HashSet<>();
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
       
       if(nuevoUsuario.getRoles().contains("admin"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
       usuario.setRoles(roles);
       usuarioService.save(usuario);
       
       return new ReponseEntity(new Mensaje("Usuario guardado"), HttpStatus.CREATED);
        
    }
    
            
    
}
