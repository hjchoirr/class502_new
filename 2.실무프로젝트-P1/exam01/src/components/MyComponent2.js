// 클래스형 컴포넌트
import { Component } from 'react';
import Proptypes from 'prop-types';

class MyComponent extends Component {
  static defaultProps = {
    name: '기본이름',
  };
  static propTypes = {
    name: Proptypes.string,
    num: Proptypes.number.isRequired,
  };
  render() {
    console.log(this.props);

    const { name, num, children } = this.props;
    return (
      <>
        <div>안녕하세요 제이름은 {name} 입니다.</div>
        <div>좋아하는 숫자는 {num} 입니다.</div>
        {children}
      </>
    );
  }
}

//MyComponent.defaultProps = { name: '기본이름' };
//MyComponent.propTypes = {
//    name: Proptypes.string,
//    num: Proptypes.number.isRequired,
//};
export default MyComponent;
