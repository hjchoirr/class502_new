/*
import { useState } from 'react';
import LifeCycle from './Components/LifeCycle';

const App = () => {
  const [visible, setVisible] = useState(true);

  return (
    <>
      {visible && <LifeCycle mode="even" />}
      <button type="button" onClick={() => setVisible(!visible)}>
        클릭
      </button>
    </>
  );
};
*/

import Average from "./Components/Average";
const App = () => {
  return (
    <Average />
  );
};
export default App;
