package pl.com.bottega.springtraining;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TodoListRestController {

    private final TodoList todoList = new TodoList();

}
