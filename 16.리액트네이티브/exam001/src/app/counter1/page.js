import React from 'react';
import Greeting from './components/Greeting';

const Counter = () => {
  const num = 10;
  const visible = true;

  const styles = {
    backgroundColor: 'skyblue',
    color: 'blue',
  };

  return (
    <>
      <Greeting name1="김이름" age={40}>문장입니다.</Greeting>
      <h1 style={styles}>{num + 5}</h1>
      <button type="button">-1</button>
      <button type="button">+1</button>
      {visible && <h3>보일까?</h3>}
    </>
  );

};

export default Counter;
