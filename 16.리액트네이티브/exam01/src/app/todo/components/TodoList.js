import React from 'react';
import { FaCheckSquare } from 'react-icons/fa';
import { FaRegCheckSquare } from 'react-icons/fa';

const TodoList = ({ items, ontoggle }) => {
  console.log(items);

  return (
    <>
      <ul>
        {items.map((item) => (
          <li key={item.id} onClick={() => {ontoggle(item.id)}}>
            {item.title}

            {item.done ? <FaCheckSquare /> : <FaRegCheckSquare />}
          </li>
        ))}
      </ul>
    </>
  );
};
export default TodoList;
