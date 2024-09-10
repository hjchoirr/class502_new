'use client';
import { useContext } from 'react';
import UserContext3 from './UserContext3';
import Context3Ex01 from './ContextEx01';

const Context3Page = () => {
    let value = useContext(UserContext3);
        value.isAdmin = false;
        value.isLogin = true;
        value.userEmail = "user01@test.com";
        value.userName = "사용자01";
    return (
        <>
        <div>Context3Page</div>
        <Context3Ex01/>
        </>
    );
};
export default Context3Page;