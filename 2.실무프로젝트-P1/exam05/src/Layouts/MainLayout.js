import React from 'react';
import { Outlet, NavLink } from 'react-router-dom';
import classNames from 'classnames';

const MainLayout = () => {
  return (
    <>
      <header>
        <h1>헤더 영역</h1>
        <div>
          <NavLink
            to="/about"
            className={({ isAcvtive }) => classNames('menu', { on: isAcvtive })}
          >
            ABOUT
          </NavLink>
          <NavLink
            to="/board"
            className={({ isAcvtive }) => classNames('menu', { on: isAcvtive })}
          >
            BOARD
          </NavLink>
        </div>
      </header>
      <main>
        <Outlet />
      </main>
      <footer>
        <h1>풋터 영역</h1>
      </footer>
    </>
  );
};
export default React.memo(MainLayout);
