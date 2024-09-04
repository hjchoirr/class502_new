'use client'
import React, {useRef, useState} from 'react';
import Counter from './components/Counter';

const CounterPage = () => {
  const [num, setNum] = useState(0);

  const num2 = useRef(0);

  const onIncrease = () => {
    setNum(num + 1);
  };

  const onDecrease = () => {
    setNum(num - 1);

  };  


  const onIncreaseRef = () => {
    console.log(num2.current);
    num2.current++ ;
  };

  const onDecreaseRef = () => {
    num2.current--;
  };  

  return (
    <>
      <h1>num1 : {num}</h1>
      <button type="button" onClick={onIncrease}>+</button>
      <button type="button" onClick={onDecrease}>-</button><br/>
      <h1>num2 : {num2.current}</h1>
      <button type="button" onClick={onIncreaseRef}>+</button>
      <button type="button" onClick={onDecreaseRef}>-</button><br/>

    </>
  );
};
export default CounterPage;
