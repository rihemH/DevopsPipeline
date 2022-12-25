package com.esprit.examen.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Operateur;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class OperateurServiceImplTest {
	@Autowired
	IOperateurService op;
	
	@Test
	@Order(1)
	public void testRetrieveAllOperateurs() {
	List<Operateur> listOperateurs = op.retrieveAllOperateurs();
	Assertions.assertEquals(0, listOperateurs.size());
	}
}
