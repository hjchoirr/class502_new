//import SassComponent from './components/SassComponent';
//import CSSModule from "./components/CSSModule";
//import LoginForm from "./components/LoginForm";


import { Routes, Route } from 'react-router-dom';
import loadable from '@loadable/component';

const Home = loadable(() => import('./pages/Home'));
const About = loadable(() => import('./pages/About'));
const BoardList = loadable(() => import('./pages/BoardList'));
const MainLayout = loadable(() => import('./Layouts/MainLayout'));
const NotFound = loadable(() => import('./pages/NotFound'));
/*
import Home from './pages/Home';
import About from './pages/About';
import Board from './pages/Board';
import BoardList from './pages/BoardList';
import MainLayout from './Layouts/MainLayout';
import NotFound from './pages/NotFound';
*/
const App = () => {
  return (
    <Routes>
      <Route element={<MainLayout />}>
        <Route index element={<Home />} /> {/* / */}
        <Route path="about" element={<About />} /> {/* /about */}
        <Route path="board" element={<BoardList />} />
        <Route path="*" element={<NotFound />}/>
      </Route>
    </Routes>
  );

  //return <SassComponent />;
  //return <CSSModule />
  //return <LoginForm />
};

export default App;
