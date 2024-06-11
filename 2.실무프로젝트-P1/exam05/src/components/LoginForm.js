import styled, { css } from 'styled-components';
import { BigButton } from './commons/ButtonStyle';

const CommonStyle = css`
  width: 100%;
`;

const OuterBox = styled.div`
  ${CommonStyle}
  position: fixed;
  height: 100%;
  left: 0;
  top: 0;
  display: flex;
  align-items: center;
`;
const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;

  h1 {
    text-align: center;
  }
`;

const InputBox = styled.input`
  ${CommonStyle}
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 0 10px;
  & + & {
    margin-top: 5px;
  }
`;
//& + & 첫번째 요소만 빼고 적용, & : 현재선택자를 의미함 + : 바로 인접 요소를 의미함

const LoginForm = () => {
  return (
    <OuterBox>
      <FormBox autoComplete="off">
        <h1>로그인</h1>
        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비번" />
        <BigButton type="submit" selected={true}> 로그인 </BigButton>
      </FormBox>
    </OuterBox>
  );
};
export default LoginForm;
