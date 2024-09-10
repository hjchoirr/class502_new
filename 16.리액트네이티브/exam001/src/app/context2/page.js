'use client';
import { useContext } from "react";
import ContextEx01 from "./ContextEx01";
import { ThemContext } from "./ThemContext";

const Context2Page = () => {
    let value = useContext(ThemContext);
    value.color = 'blue';
    return <ContextEx01 />;
};
export default Context2Page;