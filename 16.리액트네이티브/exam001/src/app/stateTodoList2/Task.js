'use client';
import { useImmer } from 'use-immer';
import AddTodo from './AddTodo.js';
import TaskList from './TaskList.js';

let nextId = 3;
const initialTodos = [
  { id: 0, title: 'Buy milk', done: true },
  { id: 1, title: 'Eat tacos', done: false },
  { id: 2, title: 'Brew tea', done: false },
];

export default function Task() {
  const [todos, updateTodos] = useImmer(initialTodos);

  function handleAddTodo(title) {
    updateTodos(draft => {draft.push({
        id: nextId++,
        title: title,
        done: false
      })});
  }

  function handleChangeTodo(nextTodo) {
    updateTodos(draft  => {
      const todo = draft.find(t => t.id === nextTodo.id);
      todo.title = nextTodo.title;
      todo.done = nextTodo.done;
    })
  }

  function handleDeleteTodo(todoId) {
    const index = todos.findIndex(t =>
      t.id === todoId
    );
    updateTodos(draft  => {
      draft.splice(index, 1);
    })
  }

  return (
    <>
      <AddTodo
        onAddTodo={handleAddTodo}
      />
      <TaskList
        todos={todos}
        onChangeTodo={handleChangeTodo}
        onDeleteTodo={handleDeleteTodo}
      />
    </>
  );
}