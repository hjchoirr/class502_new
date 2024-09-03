import React from 'react'; // 윈도우는 안써도 되는데 맥이나 리눈스는 꼭 넣어야하므로 반드시 넣자
const Greeting = (props) => {
  console.log('props', props);
  console.log(Object.getOwnPropertyDescriptor(props));
  //console.log('isExtensible', Object.isExtensible(props));
  //console.log('isFrozen', Object.isFrozen(props));
  //console.log('isExtensible', Object.isExtensible(props));
  //props.name = '최이름';
  return (
    <div>
      <h1>{props.name}님, 안녕하세요?</h1>
    </div>
  );
};

export default Greeting;
