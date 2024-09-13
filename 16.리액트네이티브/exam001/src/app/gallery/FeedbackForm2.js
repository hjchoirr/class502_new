'use client';
import { useState } from 'react';

const FeedbackForm2 = () => {

  function handleClick() {
    const name = prompt('What is your name?');
    alert(`Hello, ${name}!`);
  }

  return (
    <button onClick={handleClick}>
      Greet
    </button>
  );
};
export default FeedbackForm2;