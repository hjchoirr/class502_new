//함수형 컴포넌트
import PropTypes from 'prop-types';

const MyComponent = ({ name, num, children }) => {
  console.log(typeof name, typeof num);
  return (
    <>
      <div>안녕하세요, 제 이름은 {name} 입니다.</div>
      <div>좋아하는 숫자는 {num} 입니다.</div>
      {children}
    </>
  );
};
MyComponent.defaultProps = { name: '기본이름' };

MyComponent.propTypes = {
  name: PropTypes.string, // 타입이 안맞으면 개발자도구의 콘솔에 경고 표시만..
  num: PropTypes.number.isRequired,
};

export default MyComponent;
