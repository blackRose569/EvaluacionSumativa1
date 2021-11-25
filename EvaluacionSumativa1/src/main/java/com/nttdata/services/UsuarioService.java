package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuarios;
import com.nttdata.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
public void insertarUsuario(@Valid Usuarios usuario) {
		
		usuarioRepository.save(usuario);
	}

//lista registros de la BD
	public List<Usuarios> listarUsuarios(){
		
		return (List<Usuarios>) usuarioRepository.findAll(); 
	}

	public Usuarios buscarUsuarioId(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).get();
	}

	public void eliminarUsuariosObjeto(Usuarios usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.delete(usuario);
	}

	public void updateUsuario(@Valid Usuarios usuario) {
		
		if(usuarioRepository.existsById(usuario.getId())){
			usuarioRepository.save(usuario);
		}
		
	}


}
