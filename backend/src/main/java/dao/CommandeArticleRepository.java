package dao;

import entities.CommandeArticle;
import entities.CommandeArticleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeArticleRepository extends JpaRepository<CommandeArticle, CommandeArticleId> {
}
