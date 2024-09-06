'use client';
import React, { useState } from 'react';
import TodoForm from '../components/TodoForm';
import TodoList from '../components/TodoList';

const TodoContainer = () => {
  const items0 = [
    { id: 1, title: '할일1', done: true },
    { id: 2, title: '할일2', done: false },
    { id: 3, title: '할일3', done: false },
  ];

  const [items, setItems] = useState(items0);

  const onToggle = (id) => {
    const newItem2 = items.map((item) =>
      item.id == id ? { ...item, done: !item.done } : item,
    );

    setItems(newItem2);
  };

  return (
    <>
      <TodoList items={items} ontoggle={onToggle} />
      <TodoForm />
    </>
  );
};
export default TodoContainer;
