'use client';
import { useState } from 'react';
export default function Number3() {
  const [number, setNumber] = useState(0);

  return (
    <>
      <h1>{number}</h1>
      <button
        onClick={() => {
          setNumber((number) => number + 1);
          setNumber(number + 5);
          //setNumber((number) => number + 1);
          //setNumber((number) => number + 1);
          //setNumber(number + 1);
          //setNumber(45);

          //setTimeout(() => {
          //  alert(number);
          //  }, 3000);

          alert(number);
        }}
      >
        +3
      </button>
    </>
  );
}
