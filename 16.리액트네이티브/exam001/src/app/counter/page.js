'use client'
import React, { useState, useRef } from 'react';

const Counter = () => {
  const [num, setNum] = useState(0);

  let num2 = useRef(1);

  const onIncrease = (e) => {
    console.log(e);
    setNum(num + 1);
    num2.current++;
    console.log("num2", num2.current);
  }
  const onDecrease = () => setNum(num -1); 
/*
  return (
    <>
      <h1>{num}</h1>
      <button onClick={() => {setNum(num - 1)}} type="button">-1</button>
      <button onClick={() => {setNum(num + 1)}} type="button">+1</button>
    </>
  );
*/
return (
  <>
    <h1>{num}</h1>
    <button onClick={onDecrease} type="button">-1</button>
    <button onClick={onIncrease} type="button">+1</button>
  </>
);

};

export default Counter;
