import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';

const TodoContainer = () => {

    const onSubmit = () => {

    };
  return (
    <>
      <AddTodo onSubmit={onSubmit} />
      <TodoList />
    </>
  );
};
export default TodoContainer;
