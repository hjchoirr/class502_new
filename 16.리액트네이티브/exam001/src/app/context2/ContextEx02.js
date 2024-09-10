'use client';
import React, { useContext } from 'react';
import { ThemContext, AuthContext } from './ThemContext';

const ContextEx02 = () => {
  const value = useContext(AuthContext);
  const value1 = useContext(ThemContext);
  return (
  <>
    <div>ContextEx02 </div>
    ContextEx02 - AuthContext = {value} <br/>
    ContextEx02 - ThemContext = {value1.color}
  </>
  );
};
export default ContextEx02;
