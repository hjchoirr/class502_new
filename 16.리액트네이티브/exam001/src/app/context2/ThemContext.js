import { createContext } from "react";


const ThemContext = () => {
    ThemContext = createContext('light');
};

const AuthContext = () => {
    AuthContext = createContext(null);
};

export {ThemContext, AuthContext};