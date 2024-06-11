import React, { Suspense, useState } from 'react';
import { Link, Navigate } from 'react-router-dom';
//import MessageBox from '../components/commons/MessageBox';
import styled from 'styled-components'
import loadable from '@loadable/component'

//const MessageBox2 = styled(MessageBox)`
//  background: 'orange';
//`;

//const MessageBox = React.lazy(() => import("../components/commons/MessageBox"));
const MessageBox = loadable(() => import('../components/commons/MessageBox'), {
  fallback: <div>로딩중...</div>
});

const Home = () => {
  //const result = true;

  //if(result) {
  //  return <Navigate to="/about" replace={true} />
  //}
  const[visible, setVisible] = useState(false);

  return (
    <div>
      <h1>HOME</h1>
      <div>메인페이지</div>
      <div>
        <Link to="/about">회사소개</Link>
        {/*
        <Suspense fallback={<div>로딩중....</div>}>
          {visible && <MessageBox>메세지</MessageBox>}
          <button type="button" onClick={() => setVisible(true)}>보이기</button>
        </Suspense>
        */}

        {visible && <MessageBox>메세지</MessageBox>}
          <button type="button" onClick={() => setVisible(true)}>보이기</button>
      </div>
      
    </div>
  );
};
export default React.memo(Home);
