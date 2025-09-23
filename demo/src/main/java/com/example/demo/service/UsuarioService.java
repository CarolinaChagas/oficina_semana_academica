package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        usuario.setDataInicio(new Date());
        usuario.setDataFim(null);
        usuario.setPermissao("usuario");
        // usuario: comum   admin: todas as telas
        return usuarioRepository.save(usuario);
    }
}
