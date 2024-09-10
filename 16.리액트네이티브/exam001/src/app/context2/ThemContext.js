import { createContext } from 'react';

const ThemContext = createContext({ color: 'red' });

const AuthContext = createContext('bbb');

export { ThemContext, AuthContext };
