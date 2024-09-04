import React from 'react';
import { FaCheckSquare } from 'react-icons/fa';
import { FaRegCheckSquare } from 'react-icons/fa';
import { CiSquareRemove } from "react-icons/ci";

const TodoList = ({ items, onToggle, onRemove }) => {
  return (
    <>
      <div>Todo 목록</div>

      <ul>
        {items &&
          items.length > 0 &&
          items.map(({ id, title, done }) => (
            <li key={id} onClick={() => onToggle(id)}>
              {done ? <FaCheckSquare /> : <FaRegCheckSquare />}
              {title}
              <CiSquareRemove onClick={() => onRemove(id)}/>
            </li>
          ))}
      </ul>
    </>
  );
};
export default TodoList;
