package pl.com.bottega.springtraining;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
class TodoListController {

    private TodoList todoList = new TodoList();

    ModelAndView index() {
        return null;
    }

}
