import React from 'react';
import { FaCheckSquare } from 'react-icons/fa';
import { FaRegCheckSquare } from 'react-icons/fa';

const TodoList = ({ items, ontoggle }) => {
  console.log(items);
  return (
    <>
      <ul>
        {items &&
          items.length > 0 &&
          items.map(({ id, title, done }) => (
            <li key={id} onClick={() => ontoggle(id)}>
              {title}

              {done ? <FaCheckSquare /> : <FaRegCheckSquare />}
            </li>
          ))}
      </ul>
    </>
  );
};
export default TodoList;
