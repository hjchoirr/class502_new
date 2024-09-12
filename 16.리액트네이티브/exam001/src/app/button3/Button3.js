

const Button3 = ({ onClick, children, message }) => {

  return (
    <button onClick={()=> onClick(message)}>{children} </button>
  );
};
export default Button3;
