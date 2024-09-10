import React, { useContext } from 'react';
import UserContext3 from './UserContext3';

const Context3Ex01 = () => {
  const userInfo = useContext(UserContext3);
  console.log("userInfo", userInfo);

  return (
    <>
      <div>ContextEx01</div>

      <div> userInfo : {userInfo.isLogin ? userInfo.userEmail : null}</div>
    </>
  );
};
export default Context3Ex01;
