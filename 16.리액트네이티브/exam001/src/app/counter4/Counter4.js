import {useState} from 'react';

const Counter4 = () => {

    const [num, setNum] = useState(0);

    const onClickFunct = () => {
        setNum(num + 1);
    };
    return (
        <>
        <div>{num}</div>
        <button onClick={onClickFunct}>+</button>
        </>
    );
};
export default Counter4;