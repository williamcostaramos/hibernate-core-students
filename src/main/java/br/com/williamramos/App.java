package br.com.williamramos;

import br.com.williamramos.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Produto produto = new Produto();
        produto.setNome("Iphone 12 pro max");
        produto.setId(3L);
        produto.setDescricao("Iphone 12 pro max 512GB");
        produto.setPreco(new BigDecimal(7890.9));
        entityManager.merge(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
