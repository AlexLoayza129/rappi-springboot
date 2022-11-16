package com.rappi;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;

// import com.rappi.project.entity.Usuario;

@SpringBootApplication
public class App{

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	// TODO Auto-generated method stub
	// 	String query = "SELECT * FROM Usuario";

	// 	List<Usuario> usuarios = jdbcTemplate.query(query, 
	// 		BeanPropertyRowMapper.newInstance(Usuario.class));

	// 	usuarios.forEach(System.out :: println);
	// }

}
