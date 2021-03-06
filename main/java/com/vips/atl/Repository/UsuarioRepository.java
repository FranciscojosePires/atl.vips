package com.vips.atl.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vips.atl.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}