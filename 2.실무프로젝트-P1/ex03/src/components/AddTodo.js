import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({onSubmit}) => {
  return (
    <>
        <form onSubmit={onSubmit} autoComplete="off">
            <input type="text"></input>
            <button type="submit"><MdOutlineAdd /></button>
        </form>
    </>
  );
};
export default AddTodo;
