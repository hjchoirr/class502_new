import { useState, useEffect, useRef } from 'react';

const JoinForm = () => {
  const [form, setForm] = useState({});

  let userIdEl = useRef();

  useEffect(() => {
    //userIdEl.focus();
    console.log(userIdEl.current);
    userIdEl.current.focus();
  }, [userIdEl]);

  const onChange = (e) => {
    //방법1
    //form[e.currentTarget.name] = e.currentTarget.value;
    //setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    //console.log(form);

    //방법2
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    //console.log({ [name]: value });
    setForm((prevForm) => ({ ...prevForm, [name]: value }));
  };
  const onSubmit = (e) => {
    e.preventDefault(); // 리액트는 action 페이지로 넘어가지 않도록 해야함
    setForm({}); //화면의 값 비우기
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디{}</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            //ref={(ref) => (userIdEl = ref)}
            ref={userIdEl}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호확인</dt>
        <dd>
          <input
            type="password"
            name="pwConfirm"
            onChange={onChange}
            value={form.pwConfirm ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="name"
            onChange={onChange}
            value={form.name ?? ''}
          />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
