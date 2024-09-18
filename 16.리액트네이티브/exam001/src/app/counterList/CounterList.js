'use client';
import { useState } from 'react';

const initialCounters = [
  0, 0, 0
];

const CounterList = () => {
  const [counters, setCounters] = useState(initialCounters);
  const handleClick = (index) => {
    setCounters(counters.map((a, i) => {
      
      if(i === index) {
        return a + 1;
      } else {
        return a;
      }
    }) );
  }

  return (
    <>
      <ul>
        {counters.map((c, i) => {
          return <li key={i}>{c} <button onClick={() => handleClick(i)}>+1</button></li>
        })
        }
      </ul>
    </>
  );

}
export default CounterList;