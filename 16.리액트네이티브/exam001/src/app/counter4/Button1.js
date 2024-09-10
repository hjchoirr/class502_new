const Button1 = ({num, mode, onClick}) => {
   
    return (

        <>
        {mode == 'plus' && <button onClick={onClick}>+</button> }
        {mode == 'minus' && <button onClick={onClick}>-</button> }

        </>
    );
};
export default Button1;
