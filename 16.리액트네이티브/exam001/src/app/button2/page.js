'use client';

const Button2Page = () => {

    const handleClick = () => {
        alert("눌렀네");
    };

    return <button onClick={handleClick}>눌러주세요</button>
};
export default Button2Page;