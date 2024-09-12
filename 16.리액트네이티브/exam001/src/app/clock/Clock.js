const  Clock = ({ time }) => {

  let hours = time.getHours();
  console.log(hours);
  
  let className;
  if (hours >= 0 && hours <= 6) {
    className = 'night';
  } else {
    className = 'day';
  }


  return <h1 id="time" className={className}>{time.toLocaleTimeString()}</h1>;
};

export default Clock;
