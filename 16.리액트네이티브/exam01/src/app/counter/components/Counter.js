import React from 'react';

const Counter = (props) => {

  const { name, age } = props;
  return (
    <>
      <span>
        {name} : {age} 
      </span>
    </>
  );
};
export default Counter;
