import React, { useState, useCallback, useMemo } from 'react';

function getAverage(nums) {
  //합계 나누기 갯수
    console.log("getAverage 함수 호출");
  const total = nums.reduce((acc, num) => {
    acc += num;
    return acc;
  }, 0);

  let avg = total / nums.length;
  avg = Math.round(avg * 10) / 10 ; //소수점 첫째자리 까지 표기하기 위해(반올림)
  return avg;
}

const Average = () => {
  const [nums, setNums] = useState([]);
  const [num, setNum] = useState('');

    //const onChange = useCallback((e) => setNum(e.currentTarget.value || 0), []);
    
    const onChange = useCallback(
        (e) =>
          setNum(
            Number(e.currentTarget.value) !== NaN ? Number(e.currentTarget.value) : 0
          ),
        [],
      );
    
    const onSubmit = useCallback((e) => {
        e.preventDefault();
        setNums((nums) => nums.concat(num));
    }, [num],);

  //const avg = getAverage(nums);  //값 바뀔때만 호출해야 ..
   const avg = useMemo(() => getAverage(nums), [nums]); //nums 바뀔때만 다시 호출됨 메모제이션 : 캐싱

  return (
    <>
      <form autocomplete="off" onSubmit={onSubmit}>
        <input type="number" value={num} onChange={onChange} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {nums.map((num, i) => (
          <li key={i}>{num}</li>
        ))}
      </ul>
      평균 : {avg}
    </>
  );
};
export default React.memo(Average);
