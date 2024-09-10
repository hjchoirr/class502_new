import React, { createContext } from 'react';

const UserContext3 = createContext(
    {isLogin: false, isAdmin: false, userEmail: null, userName: null}
);

export default UserContext3;

