'use client';
import { createContext, useContext } from 'react';
import { ThemContext, AuthContext } from './ThemContext';
import ContextEx02 from './ContextEx02';

const ContextEx01 = () => {
  let value = useContext(AuthContext);
  value = 'aaa';
 
  return (
    <>  <h1>ContextEx01</h1>
        
        <ContextEx02 />
    </>
    );
};

export default ContextEx01;
