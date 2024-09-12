'use client';
import Button3 from "./Button3";

const Button3Page = () => {

    const handleClick = (msg) => {
        alert(msg);
    };

    return(
    <>
        <Button3 onClick={handleClick} message="안녕하세요? 첫번째입니다.">버튼 첫번째</Button3>
        <Button3 onClick={handleClick} message="안녕하세요? 두번째입니다.">버튼 두번째</Button3>
    </>
);
};
export default Button3Page;