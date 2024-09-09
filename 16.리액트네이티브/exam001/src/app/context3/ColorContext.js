import React, { createContext } from 'react';

const ColorContext = createContext({ color: 'red' });
console.log(ColorContext);
console.log(ColorContext.Provider);
console.log(ColorContext.Consumer);
//ColorContext.Consumer = 

export default ColorContext;
