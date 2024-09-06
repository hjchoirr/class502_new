import React, {useContext} from 'react';
import ColorContext from './ColorContext';
const ContextEx4 = () => {
    const value = useContext(ColorContext);

    return <>
    <div> ContextEx4 value {value.color}</div>

    </>
}
export default ContextEx4;