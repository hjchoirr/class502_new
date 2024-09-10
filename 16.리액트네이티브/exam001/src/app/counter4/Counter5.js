import { useState } from 'react';
import Button1 from './Button1';

const Counter5 = () => {
  const [num, setNum] = useState(0);

  const onClickPlus = () => {
    setNum(num + 1);
  };
  const onClickMinus = () => {
    setNum(num - 1);
  };
  return <>

    <div>{num}</div>
    <Button1 num={num} mode='plus' onClick={onClickPlus} />    
    <Button1 num={num} mode='minus' onClick={onClickMinus} />    
  </>;
};

export default Counter5;
