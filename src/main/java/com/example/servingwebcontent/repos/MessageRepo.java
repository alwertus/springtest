package com.example.servingwebcontent.repos;

import com.example.servingwebcontent.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Репозиторий. Позволяет получить полный список полей, либо поле по ID
 */
public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag); // в имени метода зашито то, в какой запрос SQL будет преобразован метод
}
