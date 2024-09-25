package it.tcheca.libreria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.tcheca.libreria.model.Book;

//si define l'interfaccia con oggetto del model e il suo tipo
public interface BookRepository extends JpaRepository<Book, Integer>{

	//le queri basiche le fa in automatiche
public List<Book> findByAuthor(String author);
	
	
	public List<Book> findByAuthorOrderByIdDesc(String author);
	
}
