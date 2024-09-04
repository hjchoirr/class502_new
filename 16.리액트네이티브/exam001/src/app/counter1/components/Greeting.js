import React from 'react'; // 윈도우는 안써도 되는데 맥이나 리눈스는 꼭 넣어야하므로 반드시 넣자
/*
const Greeting = (props) => {
  console.log(props);
  //console.log('props', props);
  //console.log(Object.getOwnPropertyDescriptors(props));
  //console.log('isExtensible', Object.isExtensible(props));
  //console.log('isFrozen', Object.isFrozen(props));
  //console.log('isExtensible', Object.isExtensible(props));
  //props.name = '최이름';
  return (
    <div>
      <h1>{props.name1}님, 안녕하세요?</h1>
    </div>
  );
};
const Greeting = ({name1, age}) => {
  //age = age ?? 20; 
  age = age || 20;
  console.log(name1);
  return (
    <div>
      <h1>{name1}님, {age } 안녕하세요?</h1>
    </div>
  );
};
const Greeting = (props) => {
  console.log(props);
  return (
    <div>
      <h1>{props.name1}님, {props.age } 안녕하세요?{props.children}</h1>
    </div>
  );
};
*/
const Greeting = (props) => {
  console.log(props);
  return (
    <div>
      <h1>{props.name1}님, {props.age } 안녕하세요?{props.children}</h1>
    </div>
  );
};



/*
const Greeting = (props) => {
  const {name1, age} = props;
  console.log(props);
  return (
    <div>
      <h1>{name1}님{age}, 안녕하세요?</h1>
    </div>
  );
};
*/
export default Greeting;
