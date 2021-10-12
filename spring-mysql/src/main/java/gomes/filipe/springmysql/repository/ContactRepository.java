package gomes.filipe.springmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gomes.filipe.springmysql.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
}
