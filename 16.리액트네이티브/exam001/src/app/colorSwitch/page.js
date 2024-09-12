'use client';
import styled from 'styled-components';

const StyledDiv = styled.div`
    .black {
        background: black;
    }
    .
`;

export default function LightSwitch() {
    function handleClick() {
      if (bodyStyle.backgroundColor === 'black') {
        bodyStyle.backgroundColor = 'white';
      } else {
        bodyStyle.backgroundColor = 'black';
      }
    }
  
    return (
        <StyledDiv className="b">
            <button onClick={handleClick()}>
                Toggle the lights
            </button>
        </StyledDiv>
    );
  }
  
