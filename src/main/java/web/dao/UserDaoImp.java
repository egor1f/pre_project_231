package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public void addUser(User user) {
      entityManager.persist(user);
   }

   @Override
   public List<User> getAllUsers() {
      return entityManager.createQuery("FROM User", User.class).getResultList();
   }

   @Override
   public void removeUserById(Integer userId) {
      User user = entityManager.find(User.class, userId);
      entityManager.remove(user);
   }

   @Override
   public User getUserById(Integer userId) {
      return entityManager.find(User.class, userId);
   }

   @Override
   public void updateUser(User user) {
      entityManager.merge(user);
   }
}
