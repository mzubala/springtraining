package pl.com.bottega.springtraining;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
class TodoList {

    private final List<TodoItem> items = new LinkedList<>();

    void add(String newItem) {
        items.add(new TodoItem(newItem));
    }

}

@Getter
class TodoItem {

    private String title;
    private boolean done;

    TodoItem(String title) {
        this.title = title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void toggle() {
        done = !done;
    }
}
