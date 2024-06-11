import logo from './logo.svg';
import './App.css';
import Common from './Common';
import { add } from './Common';
import { add as plus, person } from './Common';
//import Common, {add as plus, person} from './Common';

console.log(Common);
console.log(add(10, 20));
console.log(plus(10, 20));
console.log(person);

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
