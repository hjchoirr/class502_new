import styled, { css } from 'styled-components';

export const BigButton = styled.button`
  width: 100%;
  height: 45px;
  border: 0;
  font-size: 2rem;
  font-weight: bold;
  

  ${({selected, bgcolor}) => selected && css`
    border: 1px solid ${bgcolor ?? 'orange'};
    background: #fff;
  `}
`;


//background: ${(props => props.bgcolor)};
//background: ${( {bgcolor}) => bgcolor ?? 'orange'};