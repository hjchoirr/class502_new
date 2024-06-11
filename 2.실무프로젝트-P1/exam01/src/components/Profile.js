import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    name: 'hjchoi',
    age: 40,
  });

  console.log(setData);
  const changeProfile = () => {
    //data.name = 'hjchoiA';
    //data.age = 30;
    //setData(data);

    //setData({ name: 'hjchoiA', age: 30 });
    //setData({ ...data, name: 'hjchoiA' });
    setData((state) => {
      console.log('이전상태값: ', state);
      //return { ...data, name: 'hjchoiA' };
      return { ...state, name: 'hjchoiA' };
    });
  };

  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h1>{age}</h1>
      <button type="button" onClick={changeProfile}>
        변경
      </button>
    </>
  );
};

export default Profile;
