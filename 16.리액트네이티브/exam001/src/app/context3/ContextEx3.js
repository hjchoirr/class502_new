import React, {useContext} from 'react';
import ColorContext from './ColorContext';
import ContextEx4 from './ContextEx4';
//console.log(ColorContext);

const Context3 = () => {
  let value = useContext(ColorContext);
  value = {color: 'pink'};

  return (
    <>
      <div>ContextEx3</div>
      <div>{value.color}</div>
      <ContextEx4/>
    </>
  );
};

export default Context3;
