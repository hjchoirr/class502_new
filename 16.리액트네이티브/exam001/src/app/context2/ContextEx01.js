import { createContext } from 'react';
import { ThemContext, AuthContext } from './ThemContext';
import UserContext from '../context/UserContext';

const ContextEx01 = () => {
    const value = UserContext(ThemContext);
    console.log(value);

};

export default ContextEx01;