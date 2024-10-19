package lai.dev.data.dao;

import java.util.List;

import lai.dev.data.model.Product;

public interface ProductDao {
    public boolean insert(Product product);
    public boolean update(Product product);
    public boolean delete(int id);
    public Product find(int id);
    public List<Product> findAll();
    public List<Product> findByCategory(int categoryId);
    public List<Product> findByName(String name);
    public List<Product> filter(int categoryId, String propertyName, String order);
    public List<Product> hot(int limit);
    public List<Product> news(int limit);
    public List<Product> related(int related, int categoryId);
    public List<Product> getProducts(int from, int amount);
    public List<Product> findAllWithCategory();
    public List<Integer> getAllProductIds();
}
