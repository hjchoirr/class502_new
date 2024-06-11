import { Component } from 'react';

class Color extends Component {
  state = {
    color: 'blue',
    subColor: 'black',
  };

  render() {
    // this -> color로 생성된 객체의 주소
    const changeColor = (color) => this.setState({ color });
    const changeSubColor = (color) =>
      this.setState((prevState) => ({ ...prevState, subColor: color }));
    const { color, subColor } = this.state;

    return (
      <>
        <div
          style={{ background: color, width: '100px', height: '100px' }}
        ></div>
        <button
          type="button"
          onClick={() => changeColor('red')}
          onContextMenu={() => changeSubColor('orange')}
        >
          RED
        </button>
        <button
          type="button"
          onClick={() => changeColor('orange')}
          onContextMenu={() => changeSubColor('green')}
        >
          ORANGE
        </button>
        <button
          type="button"
          onClick={() => changeColor('green')}
          onContextMenu={() => changeSubColor('orange')}
        >
          GREEN
        </button>
        <div
          style={{ background: subColor, width: '50px', height: '50px' }}
        ></div>
      </>
    );
  }
}

export default Color;
